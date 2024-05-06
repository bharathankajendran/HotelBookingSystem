package com.wipro.userservice.service;

import com.wipro.userservice.entity.Admin;

public interface AdminService {
    Admin signIn(String adminName, String password);
    void signOut(Admin admin);
}