package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.Permission;
import com.bean.Role;
import com.bean.Role_Permission;
import com.service.PermissionService;
import com.service.RoleService;
import com.service.Role_PerService;
import com.util.JsonUtils;

@Controller
@RequestMapping("Permission")
public class UserRightsManagementController {
	@Autowired
	PermissionService perService;
	@Autowired
	Role_PerService role_PerService;
	@Autowired
	RoleService roleService;
	@RequestMapping("list")
	public String list(HttpServletRequest request) {
		List<Permission> allper = perService.getAllper();
//		 List<Role_Permission> allRole_PerById = role_PerService.getAllRole_PerById(4);
//		 List<Permission> operationById = perService.getOperationById(4);
		 System.out.println("1231546");
//		 for (Permission permission : operationById) {
//			System.out.println("22permission:"+permission);
//		}
//		 request.setAttribute("operationBy", operationById);
		 
//		 for (Permission permission : allper) {
//				for (Role_Permission role_Permission : allRole_PerById) {
//					if (role_Permission.getPerId()==permission.getId()) {
//						permission.setChecked("true");
//					}
//				}
//			}
		String json=JsonUtils.objectToJson(allper);
		request.setAttribute("allper",json);
		return "UserRightsManagement";
	}
	
	@RequestMapping("listAll")
	public String listAll(Integer id, HttpServletRequest request) {
		System.out.println("listAll");
		List<Permission> allper = perService.getAllper();
		List<Role> allRole = roleService.getAllRole();
		request.setAttribute("allRole", allRole);
		if (id==null||id==0) {
			id=1;
		}
		
		 List<Role_Permission> allRole_PerById = role_PerService.getAllRole_PerById(id);
		 System.out.println("allRole_PerById:"+allRole_PerById);
		 for (Permission permission : allper) {
				for (Role_Permission role_Permission : allRole_PerById) {
					if (role_Permission.getPerId()==permission.getId()) {
						permission.setChecked("true");
					}
				}
			}
		 System.out.println("allper:"+allper);
		request.setAttribute("id", id);
		String json=JsonUtils.objectToJson(allper);
		request.setAttribute("allper",json);
		return "RightsManagement";
	}
	
	@RequestMapping("/endi")
	public String endi(int id,String name) {
		try{
			name=new String(name.getBytes("ISO-8859-1"),"utf-8");
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("name:"+name+"  id:"+id);
		Permission per=new Permission();
		per.setId(id);
		per.setName(name);
		perService.updatePer(per);
		
		return "redirect:/Permission/list";
	}
	@RequestMapping("/add")
	public String add(Permission permission) {
   System.out.println(12346);
		perService.savePer(permission);
		return "redirect:/Permission/list";
	}
	@RequestMapping("/dele")
	@ResponseBody
	public List<Permission> dele(int id,HttpServletResponse response) {
   System.out.println(12346+",id:"+id);
		List<Permission> readChildnodesById = perService.readChildnodesById(id);
		if (readChildnodesById.size()==0) {
			perService.deletePerById(id);
		}
		return readChildnodesById;
	}
	@RequestMapping("/addRolePer")
	public String addRolePer(String str,HttpServletRequest request,int id) {
		
		role_PerService.save(str,id);
		return "redirect:/Permission/listAll?id="+id;
	}
	
	

}
