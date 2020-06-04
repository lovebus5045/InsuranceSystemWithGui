package databaseStorage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class db {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	public db() {
		conn = null;
		stmt = null;
		rs = null;
	}
	
	
	public void run() {
		System.out.println("이거 뜨면 이후는 db");
		
		try { // 이 안에서 데이터베이스 다루는 거임.
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/insurance?serverTimezone=UTC&useSSL=false";
			
			conn = DriverManager.getConnection(url, "root", "13902");
			stmt = conn.createStatement();
			
			String sql = "select * from client";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String name = rs.getString(1);
				String address = rs.getString(2);
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null && !conn.isClosed()) {
					conn.close();
				} else if(stmt != null && !stmt.isClosed()) {
					stmt.close();
				} else if(rs != null && !rs.isClosed()) {
					rs.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
