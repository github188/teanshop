package com.bean;

public class Role_Permission {

	private int roleId;
	
	private int perId;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getPerId() {
		return perId;
	}

	public void setPerId(int perId) {
		this.perId = perId;
	}

	@Override
	public String toString() {
		return "Role_Permission [roleId=" + roleId + ", perId=" + perId + "]";
	}
	
	
	
}
