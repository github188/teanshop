package com.service;

import java.util.List;

import com.bean.Picture;

public interface PictureService {
	List<Picture> listAll();
    Picture  getById(int id);
}
