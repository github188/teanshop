package com.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Permission;
import com.bean.User;
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
		return perDao.getOperationById(id);
	}

	@Override
	public List<Permission> readChildnodesById(int id) {
		// TODO Auto-generated method stub
		return perDao.readChildnodesById(id);
	}

	@Override
	public Set<String> getAllPerByName(User user) {
		Set<Permission> allPerByName = perDao.getAllPerByName(user);
		Set<String>strings=new HashSet<>();
		for (Permission permission : allPerByName) {
			strings.add(permission.getAlias());
		}
	 
		return null;
	}

	@Override
	public Set<String> getOperation(int id) {
		List<Permission> operationById = perDao.getOperationById(id);
		Set<String>strings=new HashSet<>();
		for (Permission permission : operationById) {
			if (permission.getAlias()!=null) {
				strings.add(permission.getAlias());
			}
		}
		System.out.println("strings:"+strings);
		return strings;
	}

}
