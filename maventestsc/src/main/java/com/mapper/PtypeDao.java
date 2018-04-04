package com.mapper;

import java.util.List;

import com.bean.Ptype;

public interface PtypeDao {
	public  List<Ptype> findAll();
	public  Ptype getById(int tid);
	public void delpt(int tid);
	public void uppt(Ptype ptype);
	public  void inpt(Ptype ptype);
	
//	public  void delId(int tid);
//	public  void upId(Ttype ttype);
//	public  void save(Ttype ttype);
}
