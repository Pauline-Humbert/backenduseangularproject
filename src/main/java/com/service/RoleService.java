package com.service;

import java.util.List;

import com.entity.Role;

public interface RoleService {
	
	public Role saveOrUpdateRole(Role role);
	public void deleteRole(Long id);
	public Role findRole(Long id);
	public List<Role> findRoles();


}
