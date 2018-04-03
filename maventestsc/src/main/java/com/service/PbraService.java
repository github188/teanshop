package com.service;

import java.util.List;

import com.bean.Pbra;

public interface PbraService {
	public  List<Pbra> findAll();
	public Pbra getId(int tid);
	public List<Pbra>  getByPtid(int tid);
	public void uPbra(Pbra pbra);
	public void inpbra(Pbra pbra);
	public void delpb(int pbid);

}
