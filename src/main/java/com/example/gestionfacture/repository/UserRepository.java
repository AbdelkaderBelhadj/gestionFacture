package com.example.gestionfacture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestionfacture.entites.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
