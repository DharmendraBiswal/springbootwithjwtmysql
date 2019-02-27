package com.boot.Springbootwithjwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.Springbootwithjwt.model.Role;
import com.boot.Springbootwithjwt.model.RoleName;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	
	Optional<Role> findByName(RoleName roleName);

}
