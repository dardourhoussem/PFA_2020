package com.pfa2020.quiz.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.pfa2020.quiz.exceptions.ResourceUnavailableException;
import com.pfa2020.quiz.exceptions.UnauthorizedActionException;
import com.pfa2020.quiz.exceptions.UserAlreadyExistsException;
import com.pfa2020.quiz.model.User;

public interface UserService extends UserDetailsService {
	User saveUser(User user) throws UserAlreadyExistsException;

	User find(Long id) throws ResourceUnavailableException;;

	User findByEmail(String email) throws ResourceUnavailableException;

	User findByUsername(String username) throws ResourceUnavailableException;

	User updatePassword(User user, String password) throws ResourceUnavailableException;

	void delete(Long user_id) throws UnauthorizedActionException, ResourceUnavailableException;

	User setRegistrationCompleted(User user) throws ResourceUnavailableException;

	boolean isRegistrationCompleted(User user) throws ResourceUnavailableException;

}