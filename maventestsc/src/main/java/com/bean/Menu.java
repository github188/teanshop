package com.bean;

public class Menu {
	
	private int mid;
	
	private String manem;
	
	private String url;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getManem() {
		return manem;
	}

	public void setManem(String manem) {
		this.manem = manem;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Menu [mid=" + mid + ", manem=" + manem + ", url=" + url + "]";
	}
	
	

}
