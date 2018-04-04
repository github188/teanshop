package com.service;

import java.util.List;

import com.bean.Shipper;

public interface ShipperService {
      List<Shipper> listAll();
      void update(Shipper shipper);
      void delete(int id);
      void save(Shipper shipper);
      Shipper getById(int id);
}
