package com.onlineshopping;

import java.util.Scanner;

public class TestUserLogIn {

	public static void getUserLogInInput() {

		System.out.println("Please Enter your First Name >> ");
		Scanner input = new Scanner(System.in);
		String FirstName = input.next();

		System.out.println("Please Enter your Last Name >> ");
		String LastName = input.next();

		System.out.println("Please Enter your UserName >> ");
		String UserName = input.next();

		System.out.println("Please Enter your Password >> ");
		String Password = input.next();

		System.out.println("Please Enter your City >> ");
		String City = input.next();

		System.out.println("Please Enter your EmailID >> ");
		String EmailID = input.next();

		System.out.println("Please Enter your MobileNumber >> ");
		long MobileNumber = input.nextLong();

		UserLogIn userlogin = new UserLogIn();

		userlogin.setFirstName(FirstName);
		userlogin.setLastName(LastName);
		userlogin.setUserName(UserName);
		userlogin.setPassword(Password);
		userlogin.setCity(City);
		userlogin.setEmailID(EmailID);
		userlogin.setMobileNumber(MobileNumber);

		System.out.println("First Name : " + userlogin.getFirstName());
		System.out.println("Last Name : " + userlogin.getLastName());
		System.out.println("UserName : " + userlogin.getUserName());
		System.out.println("Password : " + userlogin.getPassword());
		System.out.println("City : " + userlogin.getCity());
		System.out.println("EmailID : " + userlogin.getEmailID());
		System.out.println("Mobile Number : " + userlogin.getMobileNumber());

	}

	public static void main(String[] args) {

		getUserLogInInput();

	}

}