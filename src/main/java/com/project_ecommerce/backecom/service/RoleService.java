package com.project_ecommerce.backecom.service;

import com.project_ecommerce.backecom.dao.RoleDao;
import com.project_ecommerce.backecom.entity.Role;
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
