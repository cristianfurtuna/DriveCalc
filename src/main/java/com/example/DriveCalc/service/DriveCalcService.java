package com.example.DriveCalc.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DriveCalc.entities.User;
import com.example.DriveCalc.repository.UserRepo;

@Service
public class DriveCalcService {
	@Autowired
	private UserRepo repo;
		


}
