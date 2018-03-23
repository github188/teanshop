package com.bean;
public class Pimg {
private  int pimgid;
private  String   purl;
private int pid;
public int getPimgid() {
	return pimgid;
}
public void setPimgid(int pimgid) {
	this.pimgid = pimgid;
}
public String getPurl() {
	return purl;
}
public void setPurl(String purl) {
	this.purl = purl;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
@Override
public String toString() {
	return "Pimg [pimgid=" + pimgid + ", purl=" + purl + ", pid=" + pid + "]";
}
}
