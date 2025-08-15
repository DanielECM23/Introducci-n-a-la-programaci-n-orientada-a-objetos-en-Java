package com.nn.interfaces;

public class PlayeraPersonalizada extends Ropa{
	
	public PlayeraPersonalizada(int id, double precio, String talla, String color, String twitter) {
		super(id, precio, talla, color);
		
		this.Twitter = twitter;
		
	}
	private String Twitter;
	
	public String getTwitter() {
		return Twitter;
	}
	public void setTwitter(String twitter) {
		Twitter = twitter;
	}
	
}
