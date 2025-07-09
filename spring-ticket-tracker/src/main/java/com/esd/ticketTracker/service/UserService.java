package com.esd.ticketTracker.service;

import com.esd.ticketTracker.dto.RegistrationDto;
import com.esd.ticketTracker.entity.User;

public interface UserService {

	void saveUser(RegistrationDto registrationDto);

	User findByEmail(String email);
}
