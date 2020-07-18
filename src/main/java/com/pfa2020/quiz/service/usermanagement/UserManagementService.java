package com.pfa2020.quiz.service.usermanagement;

import com.pfa2020.quiz.model.User;

public interface UserManagementService {

	void resendPassword(User user);

	void verifyResetPasswordToken(User user, String token);

	void updatePassword(User user, String password);

}
