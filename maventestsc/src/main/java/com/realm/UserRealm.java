package com.realm;

import java.util.List;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.User;
import com.service.PermissionService;
import com.service.UserService;



public class UserRealm extends AuthorizingRealm{
	@Autowired
	UserService userService;
	@Autowired
	PermissionService perService;
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String name=(String)principals.getPrimaryPrincipal();
		User user=new User();
		user.setUname(name);
		User users=userService.getUSerById(user);
		SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
		//封装角色集合
		authorizationInfo.setRoles(userService.getUserByName(users));
		//封装角色对应的权限集合
		System.out.println("doGetAuthorizationInfo:"+perService.getOperation(users.getUid()));
		authorizationInfo.setStringPermissions(perService.getOperation(users.getUid()));
		return authorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		System.out.println("22222222222");
		String uname=(String)token.getPrincipal();
		User user=new User();
		user.setUname(uname);
		System.err.println("user.uanme:"+user.getUname());
		User uSerById = userService.getUSerById(user);
		if (uSerById==null) {
            return null;			
		}
		System.out.println(1246454);
		ByteSource slat=new ByteSource.Util().bytes(uname);
		SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(uname,uSerById.getUpassword(),slat,getName());
		return info;
	}



}
