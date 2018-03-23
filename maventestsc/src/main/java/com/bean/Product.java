package com.bean;

import java.util.List;
import java.util.function.ObjIntConsumer;

public class Product {
	private  int  pid;
	
	private  String pname;
	private  int pprize;
	private String pdes;
	private int  pcount;
	private  String  pscre;
	private Pbra pbid;
    private  Pimg pimg;
    private  Ptype ptid;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPprize() {
		return pprize;
	}
	public void setPprize(int pprize) {
		this.pprize = pprize;
	}
	public String getPdes() {
		return pdes;
	}
	public void setPdes(String pdes) {
		this.pdes = pdes;
	}
	public int getPcount() {
		return pcount;
	}
	public void setPcount(int pcount) {
		this.pcount = pcount;
	}
	public String getPscre() {
		return pscre;
	}
	public void setPscre(String pscre) {
		this.pscre = pscre;
	}
	public Pbra getPbid() {
		return pbid;
	}
	public void setPbid(Pbra pbid) {
		this.pbid = pbid;
	}
	public Ptype getPtid() {
		return ptid;
	}
	public void setPtid(Ptype ptid) {
		this.ptid = ptid;
	}
	public Pimg getPimg() {
		return pimg;
	}
	public void setPimg(Pimg pimg) {
		this.pimg = pimg;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprize=" + pprize + ", pdes=" + pdes + ", pcount="
				+ pcount + ", pscre=" + pscre + ", pbid=" + pbid + ", ptid=" + ptid + ", pimg=" + pimg + "]";
	}
}
