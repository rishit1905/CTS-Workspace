package com.cts.jdbc.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementDemo {
	
	public static void main(String[] args) {
		
		try(Scanner scan=new Scanner(System.in); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","welcome");)
			{
				Statement st=con.createStatement();
			
				String jobId, jobTitle, minSalary, maxSalary;
			
				System.out.print("Enter id: ");
				jobId=scan.next();
				System.out.print("Enter title: ");
				jobTitle=scan.next();
				System.out.print("Enter minimum salary: ");
				minSalary=scan.next();
				System.out.print("Enter maximum salary: ");
				maxSalary=scan.next();
				
				String sql="insert into jobs values ("+"'"+jobId+"'"+","+"'"+jobTitle+"'"+","+minSalary+","+maxSalary+")";
				
				st.executeUpdate(sql);
				
				System.out.println("Row updated");
		} catch (SQLException e) {
			System.err.println("Row not updated");
		} 

	}
}
