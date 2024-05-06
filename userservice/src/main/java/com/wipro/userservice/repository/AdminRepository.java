package com.wipro.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.userservice.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

	Admin findByAdminName(String adminName);

	
}