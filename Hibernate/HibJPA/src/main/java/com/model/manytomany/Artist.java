package com.model.manytomany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Artists")
public class Artist implements Comparable<Artist>{
	
	@Id
	private int aid;
	private String aName;
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name="movieArtists",
	joinColumns= {@JoinColumn(name="aid")}, inverseJoinColumns= {@JoinColumn(name="mid")})
	private Set<Movie> movies;

	public Artist() {
		
	}

	public Artist(int aid, String aName, Set<Movie> movies) {
		super();
		this.aid = aid;
		this.aName = aName;
		this.movies = movies;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public Set<Movie> getMovies() {
		return movies;
	}

	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}

	public int compareTo(Artist o) {
		return (this.aid<o.aid?-1:(this.aid>o.aid?1:0));
	}
		
}
