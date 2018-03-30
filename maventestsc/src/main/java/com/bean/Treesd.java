package com.bean;

import java.util.List;

public class Treesd {
	private int id;
	private String name;
	private String turl;
	private int pid;
	private List<Treesd> did;

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
	public String getTurl() {
		return turl;
	}
	public void setTurl(String turl) {
		this.turl = turl;
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public List<Treesd> getDid() {
		return did;
	}
	public void setDid(List<Treesd> did) {
		this.did = did;
	}
	@Override
	public String toString() {
		return "Treesd [id=" + id + ", name=" + name + ", turl=" + turl + ", pid=" + pid + ", did=" + did + "]";
	}
}
