package com.bean;
import java.util.List;
public class Ptype {
private int ptid;
private String  ptname;
public int getPtid() {
	return ptid;
}
public void setPtid(int ptid) {
	this.ptid = ptid;
}
public String getPtname() {
	return ptname;
}
public void setPtname(String ptname) {
	this.ptname = ptname;
}
@Override
public String toString() {
	return "Ptype [ptid=" + ptid + ", ptname=" + ptname + "]";
}

}
