package com.resume.QuizImprove.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.resume.QuizImprove.entity.JavaQuiz;
import com.resume.QuizImprove.service.JavaQueService;

@CrossOrigin(origins = "http://localhost:8080") // Change this if frontend runs on a different port
@RestController
@RequestMapping("/api")
public class JavaController {

    @Autowired
    private JavaQueService questionService;

    @GetMapping("/get-java")
    public List<JavaQuiz> getQuestions() {
        return questionService.getAllQuestions();
    }

    @PostMapping(value = "/save-java", consumes = "application/json", produces = "application/json")
    public JavaQuiz saveQuestion(@RequestBody JavaQuiz question) {
        return questionService.saveQuestion(question);
    }
}
