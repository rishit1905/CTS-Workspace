package com.d2h.model;

public class Channel {
	private int channelId;
	private String name;
	private double rate;
	private ChannelCategory category;

	public int getChannelId() {
		return channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
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

	public ChannelCategory getCategory() {
		return category;
	}

	public void setCategory(ChannelCategory category) {
		this.category = category;
	}

}
