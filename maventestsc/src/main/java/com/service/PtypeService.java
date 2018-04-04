package com.service;

import java.util.List;

import com.bean.Ptype;

public interface PtypeService {
	public  List<Ptype> findAll();
	public  Ptype getById(int tid);
	public  void delpt(int tid);
	public  void uppt(Ptype ptype);
	public  void inpt(Ptype ptype);
}
