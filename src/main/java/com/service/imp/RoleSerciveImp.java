package com.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Role;
import com.repository.RoleRepository;
import com.service.RoleService;

@Service
public class RoleSerciveImp implements RoleService{

	@Autowired 
	RoleRepository roleRepository;
	
	@Override
	public Role saveOrUpdateRole(Role role) {
		// TODO Auto-generated method stub
		return roleRepository.save(role);
	}

	@Override
	public void deleteRole(Long id) {
		// TODO Auto-generated method stub
		roleRepository.deleteById(id);
		
	}

	@Override
	public Role findRole(Long id) {
		// TODO Auto-generated method stub
		return roleRepository.findById(id).get();
	}

	@Override
	public List<Role> findRoles() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

}
