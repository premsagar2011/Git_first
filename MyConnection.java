package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnection {

	public static void main(String[] args) 
	{
		ConnectionJdbc cj=new ConnectionJdbc();
		//cj.create();
		//cj.createTable();
		//cj.insert(3, "Kgf 3");
		System.out.println("MyConnection.main()");
		System.err.println();
	}

}
class ConnectionJdbc
{
	String url="jdbc:mysql://localhost:3306/bunny";
	String username="root";
	String pass="BUNNYprem@1610";
	public void create() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bunny","root","BUNNYprem@1610");
			Statement s=con.createStatement();
			s.executeUpdate("create database bunny");
			s.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void createTable()
	{
		String table="create table movie(movieId int,moviname varchar(20))";
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, username, pass);
			Statement s=con.createStatement();
			s.executeUpdate(table);
			s.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void insert(int movieId,String moviname)
	{
		String query="insert into movie(movieId,moviname)values(?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, username, pass);
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, movieId);
			ps.setString(2, moviname);
			ps.executeUpdate();
			ps.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
