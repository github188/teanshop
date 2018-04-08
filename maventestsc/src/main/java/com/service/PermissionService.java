package com.service;

import java.util.List;
import java.util.Set;

import com.bean.Permission;
import com.bean.User;

public interface PermissionService {
	
	List<Permission> getAllper();
	
	Permission getperById(int pid);
	
	void savePer(Permission per);
	
	void deletePerById(int pid);
	
	void updatePer(Permission per);
	
	List<Permission>getOperationById(int id);

	List<Permission> readChildnodesById(int id);
	
	Set<String>getAllPerByName(User user);
	
	Set<String>getOperation(int id);
}
