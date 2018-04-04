package com.mapper;

import java.util.List;

import com.bean.Picture;

public interface PictureDao {
   List<Picture> listAll();
   Picture getById(int id);
}
