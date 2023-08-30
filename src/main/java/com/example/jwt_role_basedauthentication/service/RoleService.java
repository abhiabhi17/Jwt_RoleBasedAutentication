package com.example.jwt_role_basedauthentication.service;

import com.example.jwt_role_basedauthentication.dao.RoleDao;
import com.example.jwt_role_basedauthentication.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
