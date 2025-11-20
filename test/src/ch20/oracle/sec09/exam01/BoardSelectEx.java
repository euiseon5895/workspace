package ch20.oracle.sec09.exam01;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardSelectEx {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//1. 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			
			//2. 커넥션 객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","testuser","test1234");
			System.out.println("연결 성공");

			
			//3. Statement,preparedStatement 객체 생성
			 
			//preparedStatement
			String sql = "Select bno,btitle,bcontent,bwriter,bdate,bfilename,bfiledata "; 
			sql+= "from boards where bwriter=?";
			
		    pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, "winter");
		    
			 rs = pstmt.executeQuery();
			List<Board>list = new ArrayList<>();
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBfilename(rs.getString("bfilename"));
				board.setBfiledata(rs.getBlob("bfiledata"));
				System.out.println(board);
				list.add(board);
				
				Blob blob = board.getBfiledata();
				if(blob !=null) {
					InputStream is = blob.getBinaryStream();
					OutputStream os = new FileOutputStream("C:/Temp/"+ board.getBfiledata());
					is.transferTo(os);
					os.flush();
					os.close();
					is.close();
				}
			}
			rs.close();
			
			System.out.println(list);
			pstmt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			//5. 자원해제
			try {pstmt.close();}catch(Exception e) {};
			if(conn!=null) {
				try {
					conn.close();
					System.out.println("연결 끊기");
				}catch(SQLException e) {}
				
				
				
			}
		}
	}
}
