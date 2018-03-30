package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Treesd;
import com.mapper.TreesdDao;

@Service
public class TreesdServiceImp  implements TreesdService{
	@Autowired
	private TreesdDao treesdDao;
	@Override
	public List<Treesd> getById() {
	List<Treesd>  tree=  treesdDao.getById();
		return tree;
	}
	@Override
	public List<Treesd> listAll() {
		  
		return treesdDao.listAll();
	}
}
