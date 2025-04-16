package com.resume.QuizImprove.controller;

import com.resume.QuizImprove.entity.JavaScriptQuiz;
import com.resume.QuizImprove.entity.PythonQuiz;
import com.resume.QuizImprove.service.JavaScriptQueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class JavaScriptController {

    @Autowired
    private JavaScriptQueService javascriptQueService;

    @GetMapping("/get-javascript")
    public List<JavaScriptQuiz> getQuestions() {
        return javascriptQueService.getAllQuestions();
    }

    @PostMapping(value = "/save-javascript", consumes = "application/json", produces = "application/json")
    public JavaScriptQuiz saveQuestion(@RequestBody JavaScriptQuiz question) {
        return javascriptQueService.saveQuestion(question);
    }
}

