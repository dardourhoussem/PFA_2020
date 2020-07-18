package com.pfa2020.quiz.service.usermanagement.token;

import java.util.Date;

import com.pfa2020.quiz.exceptions.InvalidTokenException;
import com.pfa2020.quiz.model.TokenModel;
import com.pfa2020.quiz.model.User;

public interface TokenService<T extends TokenModel> {
	T generateTokenForUser(User user);

	void validateTokenForUser(User user, String token) throws InvalidTokenException;

	void invalidateToken(String token);

	void invalidateExpiredTokensPreviousTo(Date date);
}
