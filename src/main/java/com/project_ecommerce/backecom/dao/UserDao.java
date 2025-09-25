package com.project_ecommerce.backecom.dao;


import com.project_ecommerce.backecom.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}