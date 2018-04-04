package com.mapper;

import java.util.List;

import com.bean.Shipper;

public interface ShipperDao {
     Shipper getById(int id);
     void save(Shipper shipper);
     void update(Shipper shipper);
     void delete(int id);
     List<Shipper> listAll();
     
}
