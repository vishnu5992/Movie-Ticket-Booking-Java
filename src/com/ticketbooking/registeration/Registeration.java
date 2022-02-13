package com.ticketbooking.registeration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ticketbooking.login.Login;
import com.ticketbooking.model.UserInfo;

public class Registeration {

	public static List<UserInfo> userList=new ArrayList<>();
	public Login login;
	public void registeration() {
		int choice=getInputs();
		switch(choice)
		{
			case 1:{
				System.out.println("Registeration/Login Process");
				registerationProcess();
				break;
			}
			default:{
				System.out.println("Please enter the valid key!");
				registeration();
				break;
			}
		}
	}
	public  int getInputs() {
		System.out.println("Press 1 to Register and  Login");
		Scanner scan=new Scanner(System.in);
		int choice=scan.nextInt();
        return choice;
	}
	public static void registerationProcess() {
		UserInfo userInfo=new UserInfo();	
		System.out.println("Please enter the details to register!");
		Scanner scan=new Scanner(System.in);
		System.out.println("Name:");
		String name=scan.next();
		System.out.println("Phone no:");
		String phNo=scan.next();
		System.out.println("Email:");
		String email=scan.next();
		System.out.println("Password:");
		String pass=scan.next();
		System.out.println("Press 1 for Theater Owner");
		System.out.println("Press 2 for Audience");
		System.out.println("RoleId");
		int roleId=scan.nextInt();
		userInfo.setName(name);
		userInfo.setEmailId(email);
		userInfo.setPassword(pass);
		userInfo.setPhoneNo(phNo);
		userInfo.setRoleId(roleId);
		userList.add(userInfo);
		loginProcess();
	}
	public static void loginProcess() {
		System.out.println("Login Process");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter EmailId:");
		String email=scan.next();
		System.out.println("Enter Password:");
		String pass=scan.next();
		Login.login(email, pass);
	}
	
	public void getAllRegisteredUser() {
		System.out.println("Registered Users List");
		for(UserInfo user: userList) {
			String roleName=(user.getRoleId()==1)?"Theater Owner":"Audience";
			System.out.println("Name:"+user.getName()+" Email:"+user.getEmailId()+" Password:"+user.getPassword()+"Phone No:"+user.getPhoneNo()+" Role:"+roleName  );
		}
	}
	
	public static List<UserInfo> getUserList() {
		return userList;
	}
//	public  void setUserList(List<UserInfo> userList) {
//		userList = userList;
//	}
	
}
