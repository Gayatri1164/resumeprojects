package com.resume.QuizImprove.service;

import com.resume.QuizImprove.entity.JavaQuiz;
import com.resume.QuizImprove.repo.JavaQueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JavaQueService {

    @Autowired
    private JavaQueRepo javaQueRepo;

    public List<JavaQuiz> getAllQuestions() {
        return javaQueRepo.findAll();
    }

    public JavaQuiz saveQuestion(JavaQuiz question) {
        return javaQueRepo.save(question);
    }
}
