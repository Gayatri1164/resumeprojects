package com.resume.QuizImprove.service;

import com.resume.QuizImprove.entity.JavaScriptQuiz;
import com.resume.QuizImprove.entity.PythonQuiz;
import com.resume.QuizImprove.repo.JavaScriptQueRepo;
import com.resume.QuizImprove.repo.PythonQueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JavaScriptQueService {

    @Autowired
    private JavaScriptQueRepo javascriptQueRepo;

    public List<JavaScriptQuiz> getAllQuestions() {
        return javascriptQueRepo.findAll();
    }

    public JavaScriptQuiz saveQuestion(JavaScriptQuiz question) {
        return javascriptQueRepo.save(question);
    }



}

