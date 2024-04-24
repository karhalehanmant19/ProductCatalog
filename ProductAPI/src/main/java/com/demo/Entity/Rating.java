package com.demo.Entity;

public class Rating {
	private String userId;
	private int rating;
	private String comment;
	@Override
	public String toString() {
		return "Rating [userId=" + userId + ", rating=" + rating + ", comment=" + comment + "]";
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	

}
