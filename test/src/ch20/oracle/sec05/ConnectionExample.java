package ch20.oracle.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionExample {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","testuser","test1234");
			System.out.println("연결 성공");
			
			String userid="winter3";
			String username = "한겨울";
			String userpassword="12345";
			int userage = 25;
			String useremail = "winter@gmail.com";
			
			//statement
//			Statement stmt =  conn.createStatement();
//			String sql = "INSERT INTO users(userid,username,userpassword,userage,useremail)";
//			sql+=" VALUES('"+userid+"','"+username+"','"+userpassword+"','"+userage+"','"+useremail+"')";
//			System.out.println(sql);
//			int result =  stmt.executeUpdate(sql); //등록한 갯수를 리턴
//			if(result>0) {
//				System.out.println("등록성공");
//			}else {
//				System.out.println("등록실패");
//			}
			
			//preparedStatement
			String sql = "INSERT INTO users(userid,username,userpassword,userage,useremail)";
			sql+=" VALUES(?,?,?,?,?)";
			
		    pstmt =conn.prepareStatement(sql);
			
			pstmt.setString(1,userid);
			pstmt.setString(2,username);
			pstmt.setString(3,userpassword);
			pstmt.setInt(4,userage);
			pstmt.setString(5,useremail);
			int result =  pstmt.executeUpdate();
			System.out.println("result"+result);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
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
