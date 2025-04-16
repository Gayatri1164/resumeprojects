
package com.resume.QuizImprove.service;

import com.resume.QuizImprove.entity.PythonQuiz;
import com.resume.QuizImprove.repo.PythonQueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PythonQueService {

    @Autowired
    private PythonQueRepo pythonQueRepo;

    public List<PythonQuiz> getAllQuestions() {
        return pythonQueRepo.findAll();
    }

    public PythonQuiz saveQuestion(PythonQuiz question) {
        return pythonQueRepo.save(question);
    }
}
