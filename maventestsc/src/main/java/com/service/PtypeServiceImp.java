package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Ptype;
import com.mapper.PtypeDao;
@Service
public class PtypeServiceImp implements PtypeService {

	@Autowired
	private PtypeDao ptypeDao;
	
	@Override
	public List<Ptype> findAll() {
		// TODO Auto-generated method stub
		return ptypeDao.findAll();
	}
	@Override
	public Ptype getById(int tid) {
		// TODO Auto-generated method stub
		return ptypeDao.getById(tid);
	}
	@Override
	public void delpt(int tid) {
		ptypeDao.delpt(tid);
		
	}
	@Override
	public void uppt(Ptype ptype) {
		ptypeDao.uppt(ptype);
		
	}
	@Override
	public void inpt(Ptype ptype) {
		ptypeDao.uppt(ptype);
		
	}

}
