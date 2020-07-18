package com.pfa2020.quiz.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.pfa2020.quiz.exceptions.ResourceUnavailableException;
import com.pfa2020.quiz.exceptions.UnauthorizedActionException;
import com.pfa2020.quiz.model.Quiz;
import com.pfa2020.quiz.model.User;
import com.pfa2020.quiz.model.support.Response;
import com.pfa2020.quiz.model.support.Result;

public interface QuizService {
	Quiz save(Quiz quiz, User user);

	Page<Quiz> findAll(Pageable pageable);

	Page<Quiz> findAllPublished(Pageable pageable);

	Page<Quiz> findQuizzesByUser(User user, Pageable pageable);

	Quiz find(Long id) throws ResourceUnavailableException;

	Quiz update(Quiz quiz) throws ResourceUnavailableException, UnauthorizedActionException;

	void delete(Quiz quiz) throws ResourceUnavailableException, UnauthorizedActionException;

	Page<Quiz> search(String query, Pageable pageable);

	Result checkAnswers(Quiz quiz, List<Response> answersBundle);

	void publishQuiz(Quiz quiz);
}
