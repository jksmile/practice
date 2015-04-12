package com.xjk.practice.designmodel.compositemodel;

import java.util.ArrayList;
import java.util.List;

/**
 * Intro:
 * Project: practice
 * Date:    4/12/15
 * Author:  xujinkai
 */


public class MoviePlayer extends Movie{


	private final List<Movie> movieList = new ArrayList<Movie>();


	@Override
	protected void play() {

		for(Movie movie: movieList){

			movie.play();
		}

	}


	public void addMovie(Movie movie){

		movieList.add(movie);

	}


	public void removeMovie(Movie movie){

		movieList.remove(movie);

	}
}
