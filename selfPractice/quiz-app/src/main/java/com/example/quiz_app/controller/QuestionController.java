package com.example.quiz_app.controller;

//package com.example.quizapp.controller;

import com.example.quiz_app.entity.Question;
import com.example.quiz_app.enums.Category;
import com.example.quiz_app.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/question")
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService = new QuestionService();

    @GetMapping("/category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable Category category) {
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("/add")
    public Question addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }
}
