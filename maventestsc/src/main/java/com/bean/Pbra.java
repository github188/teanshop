package com.bean;

import java.util.List;

public class Pbra {
private  int pbid;
private String pbraname;
private  int tid;
private   Ptype listp;


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
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public Ptype getListp() {
	return listp;
}
public void setListp(Ptype listp) {
	this.listp = listp;
}
@Override
public String toString() {
	return "Pbra [pbid=" + pbid + ", pbraname=" + pbraname + ", tid=" + tid + ", listp=" + listp + "]";
}
}
