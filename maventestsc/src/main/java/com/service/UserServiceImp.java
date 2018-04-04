package com.service;

import java.util.List;

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
	public User getUSerById(int uid) {
		// TODO Auto-generated method stub
		return userDao.getUSerById(uid);
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

}
