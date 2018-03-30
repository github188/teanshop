package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Product;
import com.bean.Treesd;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.ProductServiceImp;
import com.service.TreesdServiceImp;
@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private TreesdServiceImp treesdServiceImp;
	@Autowired
	private ProductServiceImp productServiceImp;
	@RequestMapping("/index")
	public  ModelAndView  listAll(HttpServletRequest request,String qname){
    String name=request.getParameter("qname");
    System.out.println(name);
    Map map=new HashMap<>();
//		  Map map=inerMap(request,product,ptype);
	     List<Product>	list=productServiceImp.findAll(map);
	     ModelAndView  mv=new ModelAndView();
	     mv.addObject("list", list);
	     mv.setViewName("myloginfo");
		return mv;
	}
	@RequestMapping("/listAlla")
	public  ModelAndView listAlltwo(){
		ModelAndView mc=new ModelAndView();
	   List<Treesd>  td=treesdServiceImp.listAll();
//	   System.out.println(td);
	   mc.addObject("td", td);
        mc.setViewName("index");   
		return mc;
	}
//	private Map inerMap(HttpServletRequest request,Product product,String qtype){
//	Map map=new HashMap<>();
//	System.out.println(qtype);
//	String qname=product.getPname();
//	System.out.println(qname);
//	if (qname!=null||qtype!=null) {
//		try {
//			qtype =new String(qtype.getBytes("ISO-8859-1"), "UTF-8");
//			qname= new String(qname.getBytes("ISO-8859-1"), "UTF-8");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	request.setAttribute("qtype", qtype);
//	map.put("qtype", qtype);
//	request.setAttribute("qname", qname);
//	map.put("qname", qname);
//	return map;
//}
	
	
	
	
	
	
	
	
	@RequestMapping("listAll")
	public  ModelAndView listAll(){
		System.out.println("123");
		ObjectMapper obj=new ObjectMapper();
		System.out.println("123");
		ModelAndView mc=new ModelAndView();
	   List<Treesd>  td=treesdServiceImp.getById();
	   String json;
	try {
		json = obj.writeValueAsString(td);
		System.out.println(json);
		mc.addObject("td", json);
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   System.out.println();
	   mc.setViewName("test");
		return mc;
	}
}
