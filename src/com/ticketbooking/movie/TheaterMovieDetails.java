package com.ticketbooking.movie;

import java.util.ArrayList;
import java.util.List;

import com.ticketbooking.model.Movies;
import com.ticketbooking.model.Theater;

public class TheaterMovieDetails {

	public static List<Movies> movieList=new ArrayList<>();
	public static List<Theater> theaterList=new ArrayList<>();

	static void setTheaterDetails() {
		Movies movie=new Movies();
		movie.setMovieId(1);
		movie.setTheaterId(1);
		movie.setMovieName("Annathey");
		movie.setScreenId(1);
		movie.setRating("3/5");
		movie.setPrice(300);
		movie.setCast("Rajini , Keerthi Suresh,Nayanthara");
		movie.setGenre("Action");
		movieList.add(movie);
		Movies movie2=new Movies();
		movie2.setMovieId(2);
		movie2.setTheaterId(1);
		movie2.setMovieName("Valimai");
		movie2.setScreenId(2);
		movie2.setRating("4.5/5");
		movie2.setCast("Ajith Kumar");
		movie2.setGenre("Action");
		movie2.setPrice(200);
		movieList.add(movie2);
		Movies movie3=new Movies();
		movie3.setMovieId(3);
		movie3.setTheaterId(2);
		movie3.setMovieName("Beast");
		movie3.setScreenId(3);
		movie3.setRating("4.5/5");
		movie3.setCast("Vijay");
		movie3.setGenre("Action");
		movie3.setPrice(100);
		movieList.add(movie3);
		
		Theater thr1=new Theater(1, "INOX Theater,Coimbatore");
		Theater thr2=new Theater(2, "IMAX,Chennai");
		Theater thr3=new Theater(3, "Arthi Theater,Chennai");
		
		theaterList.add(thr1);
		theaterList.add(thr2);
		theaterList.add(thr3);
		
	}
	public static List<Movies> getMovieList() {
		return movieList;
	}
	public static void setMovieList(List<Movies> movieList) {
		TheaterMovieDetails.movieList = movieList;
	}
	public static List<Theater> getTheaterList() {
		return theaterList;
	}
	public static void setTheaterList(List<Theater> theaterList) {
		TheaterMovieDetails.theaterList = theaterList;
	}
	public static void listAllMoviesAvailable() {
	  setTheaterDetails();
	  String theaterName=null;
		for(Movies movie:movieList) {
			if(movie.getTheaterId()==1) {
				theaterName="INOX Theater,Coimbatore";
			}
			if(movie.getTheaterId()==2) {
				theaterName="IMAX,Chennai";
			}
			if(movie.getTheaterId()==3) {
				theaterName="Aarthi Theater,Chennai";
			}
			System.out.println("Movie title: "+movie.getMovieName()+" Cast:"+movie.getCast()+" Genre:"+movie.getGenre()+" Theater Name:"+theaterName+" Rating:"+movie.getRating()+" Price:"+movie.getPrice());
			
		}
	}
	public void listAllTheatersAvailable() {
		for(Theater th:theaterList) {
			System.out.println("Theater Name : "+th.getTheaterName());
		}
	}
}
