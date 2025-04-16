package com.resume.QuizImprove.controller;



import com.resume.QuizImprove.entity.PythonQuiz;
import com.resume.QuizImprove.service.PythonQueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class PythonController {

    @Autowired
    private PythonQueService pythonQueService;

    @GetMapping("/get-python")
    public List<PythonQuiz> getQuestions() {
        return pythonQueService.getAllQuestions();
    }

    @PostMapping(value = "/save-python", consumes = "application/json", produces = "application/json")
    public PythonQuiz saveQuestion(@RequestBody PythonQuiz question) {
        return pythonQueService.saveQuestion(question);
    }
}
