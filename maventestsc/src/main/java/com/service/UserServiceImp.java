package com.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.User;
import com.mapper.UserDao;
@Service
public class UserServiceImp implements UserService {
    @Autowired
	UserDao userDao;
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userDao.getAllUser();
	}

	@Override
	public User getUSerById(User user) {
		// TODO Auto-generated method stub
		return userDao.getUSerById(user);
	}

	@Override
	public int save(User user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
          userDao.updateUser(user);    
	}

	@Override
	public void deleteUserById(int pid) {
		// TODO Auto-generated method stub
          userDao.deleteUserById(pid);
	}

	@Override
	public Set<String> getUserByName(User user) {
	       Set<User> userByName = userDao.getUserByName(user);
	       Set<String> str=new HashSet<>();
	       for (User user2 : userByName) {
			str.add(user2.getUname());
		}
		return str;
	}

}
