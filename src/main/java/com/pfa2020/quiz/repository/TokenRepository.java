package com.pfa2020.quiz.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.pfa2020.quiz.model.TokenModel;

@NoRepositoryBean
public interface TokenRepository<T extends TokenModel> extends CrudRepository<T, Long> {
	T findByToken(String token);

	@Modifying
	void deletePreviousTo(Date date);
}