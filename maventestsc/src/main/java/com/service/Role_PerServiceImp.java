package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Role_Permission;
import com.mapper.Role_PerDao;
@Service
public class Role_PerServiceImp implements Role_PerService {

	@Autowired
	Role_PerDao role_PerDao;
	@Override
	public List<Role_Permission> getAllRole_PerById(int id) {
		// TODO Auto-generated method stub
		return role_PerDao.getAllRole_PerById(id);
	}
	@Override
	public void save(String str,int id) {
		// TODO Auto-generated method stub
		role_PerDao.deleteRolr_Per(id);
		String[] split = str.split(",");
		int [] ids=new int[split.length];
		for (int i = 0; i < split.length; i++) {
			int pid=Integer.parseInt(split[i]);
			role_PerDao.save(id,pid);
		}
		
		
	}
	@Override
	public void deleteRolr_Per(int id) {
		// TODO Auto-generated method stub
		 role_PerDao.deleteRolr_Per(id);
	}

}
