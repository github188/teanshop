package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Shipper;
import com.mapper.ShipperDao;
@Service
public class ShipperServiceImp implements ShipperService{
   @Autowired
	private ShipperDao shipperDao;
	@Override
	public List<Shipper> listAll() {
		List<Shipper> list = shipperDao.listAll();
		return list;
	}

	@Override
	public void update(Shipper shipper) {
		// TODO Auto-generated method stub
		shipperDao.update(shipper);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		shipperDao.delete(id);
	}

	@Override
	public void save(Shipper shipper) {
		// TODO Auto-generated method stub
		shipperDao.save(shipper);
	}

	@Override
	public Shipper getById(int id) {
		// TODO Auto-generated method stub
		
		return shipperDao.getById(id);
	}

}
