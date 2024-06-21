package com.sds.cmssetting.model.role;

import java.util.List;

import com.sds.cmssetting.domain.Role;

public interface RoleService {

	public void insert(Role role);
	public void insertRole(Role role);
	public int getMaxRoleCode();
	public Role selectByRoleIdx(int roleIdx);
	public Role selectByRoleCode(int roleCode);
	public List selectAll();
	
}
