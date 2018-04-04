package com.mapper;

import java.util.List;

import com.bean.Menu;

public interface MenuDao {
	
	List<Menu> getAllMenu();
	
	Menu getMenuById(int mid);
	
	void updateMenu(Menu menu);
	
	void deleteMenu(int mid);
	
	int save(Menu menu);

}
