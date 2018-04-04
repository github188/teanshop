package com.service;

import java.util.List;

import com.bean.User;

public interface UserService {

	List<User>getAllUser();
	
	User getUSerById(int uid);
	
	int save(User user);
	
	void updateUser(User user);
	
	void deleteUserById(int pid);
	
}
