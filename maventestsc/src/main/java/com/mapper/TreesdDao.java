package com.mapper;

import java.util.List;

import com.bean.Treesd;
public interface TreesdDao {
	public List<Treesd> listAll();
	public List<Treesd> getById();
	public List<Treesd> getByPid(String pid);
}
