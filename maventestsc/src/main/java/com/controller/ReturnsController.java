package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Returns;
import com.bean.State;
import com.service.ReturnServiceImpl;
import com.service.StateServiceImpl;

@Controller
@RequestMapping("/returns")
public class ReturnsController {
	@Autowired
	private ReturnServiceImpl returnServiceImpl;
	@Autowired
	private StateServiceImpl StateServiceImpl;
	@RequestMapping("/list")
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView();
		List<State> lists = StateServiceImpl.listAll();
		mv.addObject("lists", lists);
		List<Returns> list = returnServiceImpl.listAll();
		mv.setViewName("tuihuo");
		mv.addObject("list", list); 
		return mv;
	}
     @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id")int id) {
     returnServiceImpl.delete(id);
		return "redirect:/returns/list" ;	
	}
    @RequestMapping("/init/{id}")
     public String  init(@PathVariable("id")int id,Model model) {
       Returns returns = returnServiceImpl.getById(id);
       model.addAttribute("re", returns);
    	return "returnUpdate";	
	}

    

}
