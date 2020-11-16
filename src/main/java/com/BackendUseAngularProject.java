package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.entity.Role;
import com.entity.User;
import com.service.RoleService;
import com.service.UserService;


@SpringBootApplication
public class BackendUseAngularProject {

	public static void main(String[] args) {
		SpringApplication.run(BackendUseAngularProject.class, args);
	}

	@Bean
	CommandLineRunner start(UserService userService, RoleService roleService)
	{
		return (args) -> {
			
			Stream.of(new Role(null, "admin", "AllAccess"), 
					new Role(null, "user", "ReadOnly"),
					new Role(null, "fdqdsqfq", "dsfsdqds"),
					new Role(null, "dfdsfdsqsd", "dsfdsqfd"))
					.forEach((role) -> {
						roleService.saveOrUpdateRole(role);
					});
			roleService.findRoles().forEach(System.out::println);
			
			Stream.of(new User(null, "User1", roleService.findRole(1L)), 
					new User(null, "User2", roleService.findRole(2L)),
					new User(null, "User3", roleService.findRole(3L)),
					new User(null, "User4", roleService.findRole(4L)))
					.forEach((user) -> {
						userService.saveOrUpdateUser(user);
					});
			userService.findUsers().forEach(System.out::println);
		};
	}
}
