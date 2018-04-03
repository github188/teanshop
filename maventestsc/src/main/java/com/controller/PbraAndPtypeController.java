package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Pbra;
import com.bean.Ptype;
import com.service.PbraServiceImp;
import com.service.PtypeServiceImp;
@Controller
@RequestMapping("/pbrandtype")
public class PbraAndPtypeController {
	@Autowired
	private  PbraServiceImp pbraServiceImp;
	@Autowired 
	private PtypeServiceImp ptypeServiceImp;
	@RequestMapping("/listpt")
	public ModelAndView listPt(HttpServletRequest request){
	ModelAndView md=new ModelAndView();
     List<Ptype> pt= findAll();
	md.addObject("pt", pt);
	md.setViewName("personInfo");
		return md;
	}
	@RequestMapping("/listpb")
	@ResponseBody 
	public List<Pbra> listPb(int tid){
		List<Pbra> pb=pbraServiceImp.getByPtid(tid);
		return pb;
	}
	public  List<Ptype> findAll(){
		List<Ptype> pt=ptypeServiceImp.findAll();
		return pt;
	}
}
