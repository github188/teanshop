package com.mapper;

import java.util.List;

import com.bean.AverageUser;

public interface AverageUserDao {
	
	List<AverageUser> getAllAverageUser();
	
	AverageUser getAverageUserById(String uname);
	
	int save(AverageUser averageUser);
	
	void updateAverageUser(AverageUser averageUser);
	
	void deleteAverageUser(int uid);

}
