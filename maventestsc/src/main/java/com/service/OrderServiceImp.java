package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Myshop_order;
import com.mapper.OrderDao;

@Service
public class OrderServiceImp implements OrderService{

	@Autowired
	private OrderDao orderDao;
	

	@Override
	public void deleteOrder(int did) {
		orderDao.deleteOrder(did);
	}



	@Override
	public Myshop_order getById(int id) {
		return orderDao.getById(id);
	}






	@Override
	public List<Myshop_order> getOrder(Map map) {
		return orderDao.getOrder(map);
	}

}
