package com.pfa2020.quiz.service.accesscontrol;

import org.springframework.stereotype.Service;

import com.pfa2020.quiz.exceptions.UnauthorizedActionException;
import com.pfa2020.quiz.model.AuthenticatedUser;
import com.pfa2020.quiz.model.Quiz;

@Service("AccessControlQuiz")
public class AccessControlServiceQuiz extends AccessControlServiceUserOwned<Quiz> {

	/*
	 * As long as the user is authenticated, it can create a Quiz.
	 */
	@Override
	public void canUserCreateObject(AuthenticatedUser user, Quiz object) throws UnauthorizedActionException {
		if (user == null) {
			throw new UnauthorizedActionException();
		}
	}

}
