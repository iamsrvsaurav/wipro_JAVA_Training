package com.example.quiz_app.controller;

import com.example.quiz_app.entity.Quiz;
import com.example.quiz_app.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quiz")
@RequiredArgsConstructor
public class QuizController {

    private final QuizService quizService = new QuizService();

    @PostMapping("/create")
    public Quiz createQuiz(@RequestParam String category,
                           @RequestParam String level,
                           @RequestParam String title) {
        return quizService.createQuiz(category, level, title);
    }

    @GetMapping("/all")
    public List<Quiz> getAllQuizzes() {
        return quizService.getAllQuizzes();
    }
}
