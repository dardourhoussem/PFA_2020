package com.pfa2020.quiz.service;

import java.util.List;

import com.pfa2020.quiz.exceptions.ResourceUnavailableException;
import com.pfa2020.quiz.exceptions.UnauthorizedActionException;
import com.pfa2020.quiz.model.Answer;
import com.pfa2020.quiz.model.Question;

public interface AnswerService {
	Answer save(Answer answer) throws UnauthorizedActionException;

	Answer find(Long id) throws ResourceUnavailableException;

	Answer update(Answer newAnswer) throws UnauthorizedActionException, ResourceUnavailableException;

	void delete(Answer answer) throws UnauthorizedActionException, ResourceUnavailableException;

	List<Answer> findAnswersByQuestion(Question question);

	int countAnswersInQuestion(Question question);
}
