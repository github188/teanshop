package com.mapper;

import java.util.List;
import java.util.Map;

import com.bean.Product;

public interface ProductDao {
	public  List<Product> findAll(Map map);
	public void save( Product product) ;
	public List<Product> selid(int pid);
	public int findCount(Map map);
	public void  delPro(int pid);
	public  void upPro(Map map);
}
