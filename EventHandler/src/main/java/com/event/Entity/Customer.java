package com.event.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.core.sym.Name;

@Entity
@Table(name = "customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	@Column(name = "Name")
	@NotEmpty(message = "Contomer Name is not null!!.")
	private String cname;
	@Column(name = "City",nullable = false)
	@NotEmpty(message = "City is not null!!.")
	private String ccity;
	@Column(name = "Country",nullable = false)
	@NotEmpty(message = "Coutry is not null!!.")
	private String ccountry;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int cid, String cname, String ccity, String ccountry) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ccity = ccity;
		this.ccountry = ccountry;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCcity() {
		return ccity;
	}

	public void setCcity(String ccity) {
		this.ccity = ccity;
	}

	public String getCcountry() {
		return ccountry;
	}

	public void setCcountry(String ccountry) {
		this.ccountry = ccountry;
	}
	
	
	
	

}
