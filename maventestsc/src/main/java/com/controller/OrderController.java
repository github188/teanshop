package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Myshop_order;
import com.bean.OrderBy;
import com.service.OrderServiceImp;

@Controller
@RequestMapping("/Order")
public class OrderController {

	@Autowired
	private OrderServiceImp orderServiceImp;

	@RequestMapping("/listorder")
	public ModelAndView getOrderList(Map map){
		System.out.print(map);
		List<Myshop_order> list = orderServiceImp.getOrder(map);
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("Order");
		
		return mv;
	}

	@RequestMapping("/deleteOrder/{did}")
	public String deleteOrder(@PathVariable("did")int did){
		orderServiceImp.deleteOrder(did);
		

		return "redirect:/Order/listorder";
	}
	
	
	@RequestMapping("/selectOrder")
	public ModelAndView getOrder(Map map){
		List<Myshop_order> list = orderServiceImp.getOrder(map);
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("Order");
		return mv;
	}

}
