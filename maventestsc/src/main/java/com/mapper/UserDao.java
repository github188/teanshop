package com.mapper;

import java.util.List;
import java.util.Set;

import com.bean.User;

public interface UserDao {
	
	List<User>getAllUser();
	
	User getUSerById(User user);
	
	int save(User user);
	
	void updateUser(User user);
	
	void deleteUserById(int pid);
	
	Set<User> getUserByName(User user);
	
}
