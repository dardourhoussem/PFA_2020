package com.pfa2020.quiz.exceptions;

public class ResourceUnavailableException extends QuizZzException {

	private static final long serialVersionUID = 1L;

	public ResourceUnavailableException() {
		super();
	}

	public ResourceUnavailableException(String message) {
		super(message);
	}
}
