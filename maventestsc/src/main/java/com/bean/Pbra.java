package com.bean;
public class Pbra {
private  int pbid;
private String pbraname;
private  int ptid;
public int getPbid() {
	return pbid;
}
public void setPbid(int pbid) {
	this.pbid = pbid;
}
public String getPbraname() {
	return pbraname;
}
public void setPbraname(String pbraname) {
	this.pbraname = pbraname;
}
public int getPtid() {
	return ptid;
}
public void setPtid(int ptid) {
	this.ptid = ptid;
}
@Override
public String toString() {
	return "Pbra [pbid=" + pbid + ", pbraname=" + pbraname + ", ptid=" + ptid + "]";
}

}
