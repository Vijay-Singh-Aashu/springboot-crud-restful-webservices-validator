package com.excellence.springboot_crud_restful_webservices_validator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excellence.springboot_crud_restful_webservices_validator.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
