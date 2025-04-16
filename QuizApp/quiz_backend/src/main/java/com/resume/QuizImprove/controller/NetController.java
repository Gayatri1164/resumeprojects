package com.resume.QuizImprove.controller;

import com.resume.QuizImprove.entity.JavaScriptQuiz;
import com.resume.QuizImprove.entity.NetQuiz;
import com.resume.QuizImprove.service.NetQueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class NetController {

    @Autowired
    private NetQueService netQueService;

    @GetMapping("/get-net")
    public List<NetQuiz> getQuestions() {
        return netQueService.getAllQuestions();
    }

    @PostMapping(value = "/save-net", consumes = "application/json", produces = "application/json")
    public NetQuiz saveQuestion(@RequestBody NetQuiz question) {
        return netQueService.saveQuestion(question);
    }
}
