package com.bean;

public class Permission {
	
	private int id;
	
	private String name;
	
	private String url;
	
	private String type;
	
	private int pId;
	
	private int reveal;
    
	private String alias;
	
	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	private String checked;


	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public int getReveal() {
		return reveal;
	}

	public void setReveal(int reveal) {
		this.reveal = reveal;
	}

	@Override
	public String toString() {
		return "Permission [id=" + id + ", name=" + name + ", url=" + url + ", type=" + type + ", pId=" + pId
				+ ", reveal=" + reveal + ", checked=" + checked + "]";
	}


}
