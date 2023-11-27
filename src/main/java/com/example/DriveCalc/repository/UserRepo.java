package com.example.DriveCalc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DriveCalc.entities.User;

public interface UserRepo extends JpaRepository<User, Long> {


}
