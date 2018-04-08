package com.mapper;

import java.util.List;

import com.bean.Problem;

public interface ProblemDao {
	
	List<Problem>getAllProblem();
	
	Problem getProblemById(int pid);

}
