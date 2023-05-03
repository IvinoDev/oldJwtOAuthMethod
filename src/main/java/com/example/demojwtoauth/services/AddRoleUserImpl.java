package com.example.demojwtoauth.services;

import com.example.demojwtoauth.models.Role;
import com.example.demojwtoauth.models.User;

public interface AddRoleUserImpl {
    void addRole(String username,String roleName);
    void ajoutrol(Role role);
    void ajouterUser(User user);
}
