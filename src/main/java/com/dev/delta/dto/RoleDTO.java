package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.RoleRepository;

@Service
public class RoleDTO implements DTO {

	@Autowired
	RoleRepository roleRepository;

	@Override
	public void populate() {
		role.setName("ADMIN");
		roleRepository.save(role);

		role2.setName("CLIENT");
		roleRepository.save(role2);

		role3.setName("RECEPTION");
		roleRepository.save(role3);

	}

}
