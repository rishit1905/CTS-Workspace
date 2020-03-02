package com.cts.jdbc.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		try (	Scanner scan=new Scanner(System.in);
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","welcome");) {
			
			String jobId, jobTitle, minSalary, maxSalary;
			
			System.out.print("Enter job id : ");
			jobId = scan.next();
			System.out.print("Enter job title : ");
			jobTitle = scan.next();
			System.out.print("Enter min. salary : ");
			minSalary = scan.next();
			System.out.print("Enter max. salary : ");
			maxSalary = scan.next();
			
			PreparedStatement ps=con.prepareStatement("insert into jobs values (?,?,?,?)");
			ps.setString(1, jobId);
			ps.setString(2, jobTitle);
			ps.setString(3, minSalary);
			ps.setString(4, maxSalary);
			ps.executeUpdate();
			
			System.out.println("Row inserted");
		} catch (SQLException e) {
			System.err.println("Invalid insertion");
			e.printStackTrace();
		}

	}

}
