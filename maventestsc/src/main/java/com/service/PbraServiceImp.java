package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Pbra;
import com.mapper.PbraDao;
@Service
public class PbraServiceImp implements PbraService{
	@Autowired
	private PbraDao PbraDao;
	@Override
	public List<Pbra> findAll() {
		// TODO Auto-generated method stub
		return PbraDao.findAll();
	}
	@Override
	public Pbra getId(int tid) {
		// TODO Auto-generated method stub
		return PbraDao.getById(tid);
	}
	@Override
	public List<Pbra> getByPtid(int tid) {
		// TODO Auto-generated method stub
		return PbraDao.getByPtid(tid);
	}
	@Override
	public void uPbra(Pbra pbra) {
		PbraDao.upbra(pbra);
	}
	@Override
	public void inpbra(Pbra pbra) {
		PbraDao.inpbra(pbra);
	}
	@Override
	public void delpb(int pbid) {
		PbraDao.delpb(pbid);
		
	}
}
