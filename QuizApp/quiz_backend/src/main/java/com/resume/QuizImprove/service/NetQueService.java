package com.resume.QuizImprove.service;

import com.resume.QuizImprove.entity.NetQuiz;
import com.resume.QuizImprove.repo.NetQueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NetQueService {

    @Autowired
    private NetQueRepo netQueRepo;

    public List<NetQuiz> getAllQuestions() {
        return netQueRepo.findAll();
    }

    public NetQuiz saveQuestion(NetQuiz question) {
        return netQueRepo.save(question);
    }
}
