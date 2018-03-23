package com.mapper;

import java.util.List;

import com.bean.Pimg;
public interface PimgDao {
	public  List<Pimg> findAll();
	public  Pimg getById(int pid);
	
//	public  void delId(int tid);
//	public  void upId(Ttype ttype);
//	public  void save(Ttype ttype);
}
