package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Problem;
import com.mapper.ProblemDao;
@Service
public class ProblemServiceImpl implements ProblemService {

	@Autowired
	ProblemDao problemDao;
	@Override
	public List<Problem> getAllProblem() {
		// TODO Auto-generated method stub
		return problemDao.getAllProblem();
	}

	@Override
	public Problem getProblemById(int pid) {
		// TODO Auto-generated method stub
		return problemDao.getProblemById(pid);
	}

}
