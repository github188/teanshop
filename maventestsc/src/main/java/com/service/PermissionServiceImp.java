package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Permission;
import com.mapper.PermissionDao;
@Service
public class PermissionServiceImp implements PermissionService {

	@Autowired
	PermissionDao perDao;
	@Override
	public List<Permission> getAllper() {
		// TODO Auto-generated method stub
		return perDao.getAllper();
	}

	@Override
	public Permission getperById(int pid) {
		// TODO Auto-generated method stub
		return perDao.getperById(pid);
	}

	@Override
	public void savePer(Permission per) {
		// TODO Auto-generated method stub
		 perDao.savePer(per);
	}

	@Override
	public void deletePerById(int pid) {
		// TODO Auto-generated method stub
         perDao.deletePerById(pid);
	}

	@Override
	public void updatePer(Permission per) {
		// TODO Auto-generated method stub
           perDao.updatePer(per);
	}

	@Override
	public List<Permission> getOperationById(int id) {
		// TODO Auto-generated method stub
		return perDao.getOperationById(id);
	}

	@Override
	public List<Permission> readChildnodesById(int id) {
		// TODO Auto-generated method stub
		return perDao.readChildnodesById(id);
	}

}
