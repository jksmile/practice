package com.xjk.practice.designmodel.compositemodel;

/**
 * Intro:
 * Project: practice
 * Date:    4/12/15
 * Author:  xujinkai
 */


public class Query {

	public static void main(String[] args) {

		MoviePlayer moviePlayer = new MoviePlayer();

		moviePlayer.addMovie(new LoveMovie());

		moviePlayer.addMovie(new ActionMovie());

		Movie horrorMovie = new HorrorMovie();

		moviePlayer.addMovie(horrorMovie);

		moviePlayer.play();

		moviePlayer.removeMovie(horrorMovie);

		moviePlayer.play();
	}
}
