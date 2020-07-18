package com.pfa2020.quiz.service.usermanagement.token;

import org.springframework.scheduling.annotation.Async;

import com.pfa2020.quiz.model.TokenModel;
import com.pfa2020.quiz.model.TokenType;
import com.pfa2020.quiz.model.User;

public interface TokenDeliverySystem {
	@Async
	void sendTokenToUser(TokenModel token, User user, TokenType tokenType);
}
