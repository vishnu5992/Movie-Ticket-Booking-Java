package com.ticketbooking.login;

import com.ticketbooking.model.UserInfo;
import com.ticketbooking.movie.TicketBooking;
import com.ticketbooking.registeration.Registeration;

public class Login {

	static Registeration reg=new Registeration();
	static TicketBooking ticketBooking=new TicketBooking();
	public static void login(String emailId,String password) {
		
		for(UserInfo user:reg.getUserList()) {
			if(user.getEmailId().equals(emailId)) {
				if(user.getPassword().equals(password)) {
					showProcessBasedOnRole(user);
				}
			}else {
				System.out.println("Credentials are mismatched");
			}
		}
	}


public static void showProcessBasedOnRole(UserInfo user) {
	switch(user.getRoleId())
	{
		case 1:{
			System.out.println("Theater Owner Flow");
			
			break;
		}
		case 2:{
			System.out.println("Audience Flow");
			ticketBooking.audienceFlow();
			break;
		}
		default:{
			System.out.println("Role does not matching");
			break;
		}
	}
}


}



//Book Ticket in Movie
//List Booked Ticket
//Cancel Ticket