package com.service;

import java.util.List;
import java.util.Set;

import com.bean.User;

public interface UserService {

	List<User>getAllUser();
	
	User getUSerById(User user);
	
	int save(User user);
	
	void updateUser(User user);
	
	void deleteUserById(int pid);
	
	Set<String> getUserByName(User user);
	
}
