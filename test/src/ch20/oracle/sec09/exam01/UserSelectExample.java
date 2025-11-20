package ch20.oracle.sec09.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSelectExample {
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
			String sql = "Select userid, username, userpassword,userage,useremail "; 
			sql+= "from users where userid=?";
			
		    pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, "winter1");
		    
			 rs = pstmt.executeQuery();
			
			if(rs.next()) {
				User user = new User();
				user.setUserId(rs.getString("userid"));
				user.setUserName(rs.getString("username"));
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserAge(rs.getInt(4));
				user.setUserEmail(rs.getString(5));
				System.out.println(user);
			}else {
				System.out.println("사용자 존재 x");
			}
			rs.close();
			
			
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
