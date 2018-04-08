package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.aspectj.weaver.patterns.PerSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.Permission;
import com.bean.User;
import com.service.PermissionService;
import com.service.UserService;

@Controller
@RequestMapping("/validation")
public class LoginController {

	@Autowired
	UserService userService;
	@Autowired
	PermissionService permissionService;
	@RequestMapping("/login")
	public String login(User user,HttpSession session) {
		UsernamePasswordToken token=new UsernamePasswordToken(user.getUname(),user.getUpassword());
		Subject subject=SecurityUtils.getSubject();
		User uSerById = userService.getUSerById(user);
		session.setAttribute("uid", uSerById.getUid());
		if (!subject.isAuthenticated()) {
			try {
				subject.login(token);
				subject.hasRole("");
			} catch (Exception e) {
				return "login";
			}
			
		}
		return "redirect:/validation/menu";
	}
	@RequestMapping("/menu")
	public String menu(HttpSession session,HttpServletRequest request) {
		List<Permission> operationById = permissionService.getOperationById((int) session.getAttribute("uid"));
		System.out.println(operationById);
		request.setAttribute("operationById", operationById);
		return "index";
		
	}
	
}
