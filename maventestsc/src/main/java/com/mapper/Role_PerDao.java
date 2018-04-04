package com.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.bean.Role_Permission;

public interface Role_PerDao {
	
	List<Role_Permission> getAllRole_PerById(int id);
	
	void save(@Param("id")int id,@Param("pid")int pid);
	
	void  deleteRolr_Per(int id);

}
