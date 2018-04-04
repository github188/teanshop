package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Pimg;
import com.mapper.PimgDao;
@Service
public class PimgServiceImp implements PimgService{

	
	@Autowired
	private PimgDao pimgDao;
	@Override
	public List<Pimg> findAll() {
		// TODO Auto-generated method stub
		return pimgDao.findAll();
	}

	@Override
	public Pimg getById(int pimgid) {
		// TODO Auto-generated method stub
		return pimgDao.getById(pimgid);
	}

	@Override
	public void inpi(Pimg pimg) {
		pimgDao.inpi(pimg);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pimg getByPbid(int pimgid) {
		// TODO Auto-generated method stub
		return pimgDao.getByPbid(pimgid);
	}
	
}
