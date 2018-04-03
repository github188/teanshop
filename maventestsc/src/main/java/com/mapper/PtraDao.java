package com.mapper;

import java.util.List;

import com.bean.Pbra;
public interface PtraDao {
	public  List<Pbra> findAll();
	public Pbra getById(int tid);
	public List<Pbra>  getByPtid(int tid);
	public void upbra(Pbra pbra);
	public void inpbra(Pbra pbra);
}
