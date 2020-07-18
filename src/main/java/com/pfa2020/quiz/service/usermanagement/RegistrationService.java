package com.pfa2020.quiz.service.usermanagement;

import com.pfa2020.quiz.model.User;

public interface RegistrationService {
	User startRegistration(User user);

	User continueRegistration(User user, String token);

	boolean isRegistrationCompleted(User user);
}
