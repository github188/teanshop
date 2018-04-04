package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;

import com.bean.Returns;

public interface ReturnDao {
     void delete(int id);
  void update(Returns returns);
    List<Returns> listAll();
   Returns getById(int id);
}
