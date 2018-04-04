package com.mapper;

import java.util.List;

import com.bean.Permission;

public interface PermissionDao {
	
	List<Permission> getAllper();
	
	Permission getperById(int pid);
	
	void savePer(Permission per);
	
	void deletePerById(int pid);
	
	void updatePer(Permission per);
	
	List<Permission>getOperationById(int id);
	
	List<Permission> readChildnodesById(int id);

}
