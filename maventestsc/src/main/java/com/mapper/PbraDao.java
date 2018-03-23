package com.mapper;

import java.util.List;

import com.bean.Pbra;
public interface PbraDao {
	public  List<Pbra> findAll();
	public Pbra getId(int tid);
	public List<Pbra>  getByPtid(int tid);
}
