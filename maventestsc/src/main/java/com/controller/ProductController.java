package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
	public  ModelAndView  listAll(HttpServletRequest request){
	     Map  map=inerMap(request);
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
	   mc.addObject("td", td);
        mc.setViewName("index");   
		return mc;
	}
	private Map inerMap(HttpServletRequest request){
	Map map=new HashMap<>();
 String pname=request.getParameter("qname");
 String ptype=request.getParameter("qtype");
 String  pscre=request.getParameter("pscre");
	request.setAttribute("qtype", ptype);
	map.put("pscre", pscre);
	map.put("qtype", ptype);
	request.setAttribute("qname", pname);
	map.put("qname", pname);
	return map;
}
	@RequestMapping("/listAll")
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
	   mc.setViewName("test");
		return mc;
	}
	@RequestMapping("/delPro/{id}")
	public  String   delPro(@PathVariable("id")int pid){
		System.out.println("123");
		System.out.println(pid);
		productServiceImp.delPro(pid);
		return "redirect:/product/index";
	}
	
	
}
