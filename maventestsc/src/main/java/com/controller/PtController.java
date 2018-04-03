package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Pbra;
import com.bean.Product;
import com.bean.Ptype;
import com.service.PbraServiceImp;
import com.service.ProductServiceImp;
import com.service.PtypeServiceImp;

@Controller
@RequestMapping("/pt")
public class PtController {
	@Autowired
	private  PtypeServiceImp ptypeServiceImp;
	@Autowired 
	private PtypeServiceImp ptypeSericeImp;
	@Autowired
	private ProductServiceImp productServiceImp;
	@RequestMapping("/listPt")
	public ModelAndView  list(){
		System.out.println("111");
		ModelAndView md=new ModelAndView();
		List<Ptype>  pt=ptypeSericeImp.findAll();
		md.addObject("pt", pt);
		md.setViewName("ptInfo");
		return md;
	}
	@RequestMapping("/uppt")
	public String  uapbar(Ptype ptype){
		ptypeSericeImp.uppt(ptype);
		return "redirect:listPt";
	}
	@RequestMapping("/getById/{id}")
	public ModelAndView  getById(@PathVariable("id")int tid){
		ModelAndView md=new ModelAndView();
		Ptype p =ptypeSericeImp.getById(tid);
		md.addObject("pt", p);
		md.setViewName("upptInfo");
		return md;
	}

	@RequestMapping("/inpt")
	public String  inpt(Ptype ptype){
		ptypeSericeImp.inpt(ptype);
		System.out.println(ptype);
		return "redirect:/pt/listPt";
	}
	@RequestMapping("/delpt")
	@ResponseBody
	public  String delpt(int tid){
		Map  map= new HashMap<>();
		map.put("ptid", tid);
		System.out.println(tid);
        List<Product> pd = productServiceImp.findAll(map);
        System.out.println(pd);
     if (pd==null||pd.size()==0) {
    		ptypeSericeImp.delpt(tid);
    		System.out.println("========");
    		return "2";
     }else {
    	 System.out.println("====");
    	 return "1";
	}

	}
}
