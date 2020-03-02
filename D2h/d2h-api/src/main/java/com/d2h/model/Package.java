package com.d2h.model;

import java.util.Set;

public class Package {
	private int packageId;
	private String name;
	private double rate;
	private Set<Channel> channels;
	
	public int getPackageId() {
		return packageId;
	}
	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public Set<Channel> getChannels() {
		return channels;
	}
	public void setChannels(Set<Channel> channels) {
		this.channels = channels;
	}
	
	

}
