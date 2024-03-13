package com.jsp.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.crud.dao.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
