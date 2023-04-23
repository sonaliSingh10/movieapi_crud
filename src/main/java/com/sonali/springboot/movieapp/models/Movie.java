package com.sonali.springboot.movieapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "Movie_name")
	private String movieName; // movie_name ==> Movie_name

	@Column(name = "release_date")
	private String releaseDate;

	@Column(name = "Ticket_price")
	private float price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Going to set it " + id);
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		System.out.println("Setting movie name  : " + movieName);
		this.movieName = movieName;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Movie(int id, String movieName, String releaseDate, float price) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.releaseDate = releaseDate;
		this.price = price;
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", movieName=" + movieName + ", releaseDate=" + releaseDate + ", price=" + price
				+ "]";
	}

}
