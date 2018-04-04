package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Role;
import com.mapper.RoleDao;
@Service
public class RoleServiceImp implements RoleService {

	@Autowired
	RoleDao roleDao;
	@Override
	public List<Role> getAllRole() {
		// TODO Auto-generated method stub
		return roleDao.getAllRole();
	}

	@Override
	public Role getRoleById(int rid) {
		// TODO Auto-generated method stub
		return roleDao.getRoleById(rid);
	}

	@Override
	public void updateRole(Role role) {
		// TODO Auto-generated method stub
              roleDao.updateRole(role);
	}

	@Override
	public void deleteRoleById(int rid) {
		// TODO Auto-generated method stub
            roleDao.deleteRoleById(rid);
	}

	@Override
	public int saveRole(Role role) {
		// TODO Auto-generated method stub
		return roleDao.saveRole(role);
	}

}
