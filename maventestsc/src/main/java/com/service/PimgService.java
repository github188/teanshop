package com.service;

import java.util.List;

import com.bean.Pbra;
import com.bean.Pimg;

public interface PimgService {
	public  List<Pimg> findAll();
	public  Pimg getById(int pimgid);
	public  Pimg getByPbid(int pimgid);
//	public  void delId(int tid);
//	public  void upId(Ttype ttype);
	public  void inpi(Pimg pimg);
   
}
