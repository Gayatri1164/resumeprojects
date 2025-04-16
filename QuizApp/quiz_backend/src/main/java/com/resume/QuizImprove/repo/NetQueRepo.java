



package com.resume.QuizImprove.repo;

import com.resume.QuizImprove.entity.JavaQuiz;

import com.resume.QuizImprove.entity.NetQuiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NetQueRepo extends JpaRepository<NetQuiz, Long> {
}
