/**
 * 
 */
package com.srk.apps.model;

/**
 * @author shaishab
 *
 */
public class Review {
	private String userName;
	private int rating;
	private boolean approved;

	protected Review() {
		// no-opp
	}

	public Review(String userName, int rating, boolean approved) {
		super();
		this.userName = userName;
		this.rating = rating;
		this.approved = approved;
	}

	public String getUserName() {
		return userName;
	}

	public int getRating() {
		return rating;
	}

	public boolean isApproved() {
		return approved;
	}

}
