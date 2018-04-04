package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.State;
import com.mapper.StateDao;

@Service
public class StateServiceImpl implements StateService{
	@Autowired
	private StateDao StateDao;
	@Override
	public List<State> listAll() {
		// TODO Auto-generated method stub
		List<State> list = StateDao.listAll();
		return list;
	}

	@Override
	public State getById(int id) {
		// TODO Auto-generated method stub
		State state = StateDao.getById(id);
		return state;
	}

}
