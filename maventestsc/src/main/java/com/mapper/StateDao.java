package com.mapper;

import java.util.List;

import com.bean.State;

public interface StateDao {
      List<State> listAll();
      State getById(int id);
}
