package com.mapper;

import java.util.List;

import com.bean.Role;

public interface RoleDao {
	
	List<Role>getAllRole();
	
	Role getRoleById(int rid);
	
	void updateRole(Role role);
	
	void deleteRoleById(int rid);
	
	int saveRole(Role role);

}
