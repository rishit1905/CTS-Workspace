package com.cts.mv.model;

import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings("serial")
public class Movies implements Serializable {
	private String id;
	private String title;
	private String hero;
	private double collections;
	private LocalDate releaseDate;
	
	public Movies() {
		/*default*/ 
	}
	
	public Movies(String id, String title, String hero, double collections, LocalDate releaseDate) {
		super();
		this.id = id;
		this.title = title;
		this.hero = hero;
		this.collections = collections;
		this.releaseDate = releaseDate;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getHero() {
		return hero;
	}
	
	public void setHero(String hero) {
		this.hero = hero;
	}
	
	public double getCollections() {
		return collections;
	}
	
	public void setCollections(double collections) {
		this.collections = collections;
	}
	
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	@Override
	public String toString() {
		StringBuilder output=new StringBuilder("Movie ID :");
		output.append(id);
		output.append("\t Movie Title :");
		output.append(title);
		output.append("\t Movie Hero :");
		output.append(hero);
		output.append("\t Box Office Collections :");
		output.append(collections);
		output.append("\t Release Date :");
		output.append(releaseDate);
		return output.toString();
	} 
	
}
