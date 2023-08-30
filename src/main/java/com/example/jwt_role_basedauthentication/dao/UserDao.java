package com.example.jwt_role_basedauthentication.dao;

import com.example.jwt_role_basedauthentication.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
