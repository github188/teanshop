package com.mapper;

import java.util.List;
import java.util.Map;

import com.bean.Myshop_order;

public interface OrderDao {
	public void deleteOrder(int did);
	public List<Myshop_order> getOrder(Map map);
	public Myshop_order getById(int id);
	
}
