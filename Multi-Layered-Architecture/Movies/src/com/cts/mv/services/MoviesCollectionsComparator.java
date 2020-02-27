package com.cts.mv.services;

import java.util.Comparator;

import com.cts.mv.model.Movies;

public class MoviesCollectionsComparator implements Comparator<Movies> {

	@Override
	public int compare(Movies m1, Movies m2) {
		//int a=Integer.parseInt(m1);
//		int a=(int) Math.round(m1);
//		int b=Integer.parseInt(m2);
		return m1.getCollections().compareTo(m2.getCollections());
	}

}
