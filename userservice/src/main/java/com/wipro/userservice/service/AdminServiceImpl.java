package com.wipro.userservice.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.userservice.entity.Admin;
import com.wipro.userservice.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin signIn(String adminName, String password) {
        Admin admin = adminRepository.findByAdminName(adminName);
        if (admin != null && admin.getPassword().equals(password)) {
            // Valid credentials
            return admin;
        } else {
            // Invalid credentials
            return null;
        }
    }

    @Override
    public void signOut(Admin admin) {
        // Implementation for sign-out (if needed)
    }
}
