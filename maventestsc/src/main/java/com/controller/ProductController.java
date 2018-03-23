package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Product;
import com.service.ProductServiceImp;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductServiceImp productServiceImp;
	
	@RequestMapping("/index")
	public  ModelAndView  listAll(Product product){
		
		Map map=new HashMap<>();
		
		if (product.getPid()<=0) {
			map.put("pname", product.getPname());
		}
	     List<Product>	list=productServiceImp.findAll(map);
	     ModelAndView  mv=new ModelAndView();
	     mv.addObject("list", list);
	     mv.setViewName("myloginfo");
		return mv;
	}
}
