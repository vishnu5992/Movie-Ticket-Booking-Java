package com.ticketbooking.movie;

import java.util.Scanner;

import com.ticketbooking.model.Movies;
import com.ticketbooking.model.UserInfo;

public class TicketBooking {
	static TheaterMovieDetails theaterMovies=new TheaterMovieDetails();
	public static void showProcessBasedOnRole(UserInfo user) {
		switch(user.getRoleId())
		{
			case 1:{
				System.out.println("Theater Owner Flow");
				
				break;
			}
			case 2:{
				System.out.println("Audience Flow");
				audienceFlow();
				break;
			}
			default:{
				System.out.println("Role does not matching");
				break;
			}
		}
	}
	
	public static void audienceFlow() {
		System.out.println("Enter your choices!");
		System.out.println("1 - For Book Ticket.");
		Scanner scan=new Scanner(System.in);
		int choice=scan.nextInt();
		if(choice==1) {
			System.out.println("Movies Available");
			theaterMovies.listAllMoviesAvailable();
			System.out.print("Enter Movie Number to book your tickets");
			int movieNo=scan.nextInt();
			for(Movies movie:theaterMovies.getMovieList()) {
				if(movieNo==movie.getMovieId()) {
					System.out.println("How many tickets you want?");
					int noOfTickets=scan.nextInt();
					System.out.println("Total Price:"+noOfTickets*movie.getPrice());
				}
			}
			System.out.println("Press 1 to Confirm your Tickets");
			int confirmation=scan.nextInt();
			if(confirmation==1) {
				System.out.println("---------------------------------------------------");
				System.out.println("Thanks for Confirmation, Your Tickets are booked");
				System.out.println("---------------------------------------------------");
			}
		}
	}
}
