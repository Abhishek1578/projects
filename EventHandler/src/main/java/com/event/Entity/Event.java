package com.event.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Events")
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "Title",nullable = false )
	@Size(min = 4,max = 15, message = "Title must be between 4 to 15 character")
	private String title;
	@Column(name = "City",nullable = false)
	@NotEmpty(message = "City should not be null!!..")
	private String city;
	@Column(name = "Country",nullable = false)
	@NotEmpty(message = "Country should not be null!!..")
	private String country;
	@Column(name = "StartDate",nullable = false)
	@NotEmpty(message = "EventStartDate is not null!!.")
	private String eventstartdate;
	@Column(name = "EndDate",nullable = false)
	@NotEmpty(message = "EventEndDate is not null!!..")
	private String eventenddate;
	
	public Event() {
		//super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEventstartdate() {
		return eventstartdate;
	}
	public void setEventstartdate(String eventstartdate) {
		this.eventstartdate = eventstartdate;
	}
	public String getEventenddate() {
		return eventenddate;
	}
	public void setEventenddate(String eventenddate) {
		this.eventenddate = eventenddate;
	}
	public Event(int id, String title, String city, String country, String eventstartdate, String eventenddate) {
		super();
		this.id = id;
		this.title = title;
		this.city = city;
		this.country = country;
		this.eventstartdate = eventstartdate;
		this.eventenddate = eventenddate;
	}
	
	
	

}
