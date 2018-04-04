package com.service;

import java.util.List;

import com.bean.State;

public interface StateService {
       List<State> listAll();
       State getById(int id);
}
