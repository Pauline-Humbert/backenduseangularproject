package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.entity.User;

@RepositoryRestResource // si on veut s'affranchir de notre propre controller
public interface UserRepository extends JpaRepository<User, Long>{

}
