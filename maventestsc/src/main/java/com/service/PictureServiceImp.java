package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Picture;
import com.mapper.PictureDao;
@Service
public class PictureServiceImp implements PictureService{
	@Autowired
   private PictureDao pictureDao;
	@Override
	public List<Picture> listAll() {
		// TODO Auto-generated method stub
		List<Picture> list = pictureDao.listAll();
		return list;
	}

	@Override
	public Picture getById(int id) {
		// TODO Auto-generated method stub
		Picture picture = pictureDao.getById(id);
		return picture;
	}

}
