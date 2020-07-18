package com.pfa2020.quiz.service.usermanagement.token;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.pfa2020.quiz.model.RegistrationToken;
import com.pfa2020.quiz.repository.RegistrationTokenRepository;
import com.pfa2020.quiz.service.usermanagement.utils.TokenGenerator;

@Service
public class TokenServiceRegistration extends TokenServiceAbs<RegistrationToken> {

	@Value("${quizzz.tokens.registration_mail.timeout}")
	private Integer expirationTimeInMinutes = 86400;

	@Autowired
	public TokenServiceRegistration(RegistrationTokenRepository mailTokenRepository, TokenGenerator tokenGenerator) {
		super(tokenGenerator, mailTokenRepository);
	}

	@Override
	protected RegistrationToken create() {
		return new RegistrationToken();
	}

	@Override
	protected int getExpirationTimeInMinutes() {
		return expirationTimeInMinutes;
	}

	public void setExpirationTimeInMinutes(Integer expirationTimeInMinutes) {
		this.expirationTimeInMinutes = expirationTimeInMinutes;
	}
}
