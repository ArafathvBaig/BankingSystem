package com.BankingSystem;

import java.util.Scanner;

public class BankingSystem 
{
		static String bankName="State Bank of India";
		long accNum;
		String custName;
		int custAge;
		
		public void details() 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Customer Name: ");
			custName=sc.nextLine();
			System.out.println("Enter the Customer Age: ");
			custAge=sc.nextInt();
			System.out.println("Enter the Customer Account Number: ");
			accNum=sc.nextLong();
			
		}
		public void display()
		{
			
			System.out.println("Bank Name: "+bankName);
			System.out.println("Name: "+custName);
			System.out.println("Age: "+custAge);
			System.out.println("Account Number: "+accNum);
		}
		
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("*************WELCOME TO SBI*************");
			System.out.println("\n==============================================\n");
			BankingSystem obj = new BankingSystem();
			obj.details();
			obj.display();

		}
}
