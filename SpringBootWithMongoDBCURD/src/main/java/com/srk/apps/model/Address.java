/**
 * 
 */
package com.srk.apps.model;

/**
 * @author shaishab
 *
 */
public class Address {
	private String city;
	private String country;

	protected Address() {
		// no-opp
	}

	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

}
