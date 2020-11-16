package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.entity.Role;

@RepositoryRestResource // si on veut s'affranchir de notre propre controller
public interface RoleRepository extends JpaRepository<Role, Long>{

}
