package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Menu;
import com.mapper.MenuDao;
@Service
public class MenuServiceImp implements MenuService {
	
   @Autowired
	MenuDao menuDao;
	@Override
	public List<Menu> getAllMenu() {
		// TODO Auto-generated method stub
		return menuDao.getAllMenu();
	}

	@Override
	public Menu getMenuById(int mid) {
		// TODO Auto-generated method stub
		return menuDao.getMenuById(mid);
	}

	@Override
	public void updateMenu(Menu menu) {
		// TODO Auto-generated method stub
          menuDao.updateMenu(menu);
	}

	@Override
	public void deleteMenu(int mid) {
		// TODO Auto-generated method stub
          menuDao.deleteMenu(mid);
	}

	@Override
	public int save(Menu menu) {
		// TODO Auto-generated method stub
		return menuDao.save(menu);
	}

}
