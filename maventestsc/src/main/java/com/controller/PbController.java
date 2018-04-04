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
@RequestMapping("/pb")
public class PbController {
	@Autowired
	private  PbraServiceImp pbraServiceImp;
	@Autowired 
	private PtypeServiceImp ptypeSericeImp;
	
	@Autowired
	private ProductServiceImp productServiceImp;
	@RequestMapping("/listPb")
	public ModelAndView  list(){
		ModelAndView md=new ModelAndView();
		List<Pbra>  pb=pbraServiceImp.findAll();
		
		md.addObject("pb", pb);
		md.setViewName("pbInfo");
		return md;
	}
	 @RequestMapping("/getById/{id}")
	 public ModelAndView getById(@PathVariable("id")int pbid){
	   Pbra	pb=  pbraServiceImp.getId(pbid);
		List<Ptype> pt= ptypeSericeImp.findAll();
		ModelAndView md=new ModelAndView();
		md.addObject("pt", pt);
		md.addObject("pb", pb);
		md.setViewName("uppbInfo");
		return md;
	}
	 @RequestMapping("/upbra")
	 public String  uapbar(Pbra pbra){
		 pbraServiceImp.uPbra(pbra);
		 return "redirect:/pb/listPb";
	 }
	 @RequestMapping("/selpt")
	 public ModelAndView  selpt(){
		 ModelAndView md=new ModelAndView();
		List<Ptype> pt=ptypeSericeImp.findAll();
		 md.addObject("pt", pt);
		  md.setViewName("inpbInfo");
		 return md;
	 }
	 @RequestMapping("/inpbra")
	 public String  inpbar(Pbra pbra){
		 pbraServiceImp.inpbra(pbra);
		 return "redirect:/pb/listPb";
	 }
	 
	    @RequestMapping("/delpb/{id}")
	    @ResponseBody
		public  String delpt( @PathVariable("id") int pbid){
	    	
			Map  map= new HashMap<>();
			map.put("pbid", pbid);
		
	        List<Product> pd = productServiceImp.findAll(map);
	       
	     if (pd==null||pd.size()==0) {
	    		pbraServiceImp.delpb(pbid);
	    		
	    		return "2";
	     }else {
	    
	    	 return "1";
		}

		}
}
