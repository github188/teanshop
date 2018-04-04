package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Returns;
import com.mapper.ReturnDao;
@Service
public class ReturnServiceImpl implements ReturnService {
	@Autowired
	private ReturnDao ReturnDao;

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		 ReturnDao.delete(id);
	}

	@Override
	public void update(Returns returns) {
		// TODO Auto-generated method stub
		ReturnDao.update(returns);
	}

	@Override
	public List<Returns> listAll() {
		// TODO Auto-generated method stub
		List<Returns> list = ReturnDao.listAll();
		return list;
	}

	@Override
	public Returns getById(int id) {
		// TODO Auto-generated method stub
		Returns returns = ReturnDao.getById(id);
		return returns;
	}



}
