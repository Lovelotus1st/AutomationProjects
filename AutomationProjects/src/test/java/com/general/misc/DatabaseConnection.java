package com.general.misc;

import java.sql.*;


public class DatabaseConnection {

	static public void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//String url1="jdbc:mysql://"+host+":"+port+"/database";
		String url="jdbc:mysql://localhost:3306/world";
		Connection con=DriverManager.getConnection(url, "root", "admin");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from city where CountryCode='IND' order by name");
		while(rs.next()){
			System.out.println(rs.getString("Name") + " - " + rs.getString("Population"));
		}
	}

}
