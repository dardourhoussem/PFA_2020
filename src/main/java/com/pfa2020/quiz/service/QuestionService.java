package com.pfa2020.quiz.service;

import java.util.List;

import com.pfa2020.quiz.exceptions.ResourceUnavailableException;
import com.pfa2020.quiz.exceptions.UnauthorizedActionException;
import com.pfa2020.quiz.model.Answer;
import com.pfa2020.quiz.model.Question;
import com.pfa2020.quiz.model.Quiz;

public interface QuestionService {
	Question save(Question question) throws UnauthorizedActionException;

	Question find(Long id) throws ResourceUnavailableException;

	List<Question> findQuestionsByQuiz(Quiz quiz);

	List<Question> findValidQuestionsByQuiz(Quiz quiz);

	Question update(Question question) throws ResourceUnavailableException, UnauthorizedActionException;

	void delete(Question question) throws ResourceUnavailableException, UnauthorizedActionException;

	Boolean checkIsCorrectAnswer(Question question, Long answer_id);

	void setCorrectAnswer(Question question, Answer answer);

	Answer getCorrectAnswer(Question question);

	Answer addAnswerToQuestion(Answer answer, Question question);

	int countQuestionsInQuiz(Quiz quiz);

	int countValidQuestionsInQuiz(Quiz quiz);
}
