package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.AverageUser;
import com.mapper.AverageUserDao;
@Service
public class AverageUserServiceImpl implements AverageUserService {

	@Autowired
	AverageUserDao averageUserDao;
	@Override
	public List<AverageUser> getAllAverageUser() {
		// TODO Auto-generated method stub
		return averageUserDao.getAllAverageUser();
	}

	@Override
	public AverageUser getAverageUserById(String uname) {
		AverageUser averageUserById = averageUserDao.getAverageUserById(uname);
		
		return averageUserById;
	}

	@Override
	public int save(AverageUser averageUser) {
		// TODO Auto-generated method stub
		return averageUserDao.save(averageUser);
	}

	@Override
	public void updateAverageUser(AverageUser averageUser) {
		// TODO Auto-generated method stub
		averageUserDao.updateAverageUser(averageUser);
	}

	@Override
	public void deleteAverageUser(int uid) {
		// TODO Auto-generated method stub
		averageUserDao.deleteAverageUser(uid);

	}

}
