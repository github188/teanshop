package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Shipper;

import com.service.ShipperServiceImp;

@Controller
@RequestMapping("/shipper")
public class ShipperController {
  
	@Autowired
	private ShipperServiceImp serviceImp;
	   @RequestMapping("/list")
    public ModelAndView list() {
    	ModelAndView mv = new ModelAndView();
    	List<Shipper> list = serviceImp.listAll();
    	mv.setViewName("OrderInformation");
    	mv.addObject("list",list);
		return mv;
	} 

	   @RequestMapping("/delete/{id}")
	   public String delete(@PathVariable("id")int id) {
		  serviceImp.delete(id);
		return "redirect:/shipper/list";
	}
	   @RequestMapping("/save")
	 public String save(Shipper shipper) {

		 serviceImp.save(shipper);
		return "redirect:/shipper/list";
		
	}
	
	   @RequestMapping("/init/{id}")
	   public String init(@PathVariable("id") int id,Model model) {
		   Shipper shipper = serviceImp.getById(id);
		   model.addAttribute("shipper", shipper);
		return "orderInformeUpdate";
			
		}
	   @RequestMapping("/update")
	   public String update(Shipper shipper) {
		   System.out.println(shipper);
		   serviceImp.update(shipper);
		return "redirect:/shipper/list";
		
	}
}
