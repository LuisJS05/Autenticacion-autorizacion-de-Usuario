package com.project_ecommerce.backecom.dao;



import com.project_ecommerce.backecom.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}