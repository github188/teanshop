package com.service;

import java.util.List;

import com.bean.Returns;

public interface ReturnService {
      void delete(int id);
      void update(Returns returns);
      List<Returns> listAll();
      Returns getById(int id);
}
