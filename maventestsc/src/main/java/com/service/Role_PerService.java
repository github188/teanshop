package com.service;

import java.util.List;
import java.util.Map;

import com.bean.Role_Permission;

public interface Role_PerService {
	
	List<Role_Permission> getAllRole_PerById(int id);
	
	void save(String str,int id);
	
	void  deleteRolr_Per(int id);

}
