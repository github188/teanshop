package com.service;

import java.util.List;

import com.bean.Problem;

public interface ProblemService {
	
	List<Problem>getAllProblem();
	
	Problem getProblemById(int pid);


}
