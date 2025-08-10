package com.example.quiz_app.service;

//package com.example.quiz_app.service;

import com.example.quiz_app.entity.Quiz;
import com.example.quiz_app.repository.QuizRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QuizService {
    private final QuizRepository quizRepository = null;

    public Quiz createQuiz(String category, String level, String title) {
        Quiz quiz = new Quiz();
        quiz.setCategory(category);
        quiz.setLevel(level);
        quiz.setTitle(title);
        return quizRepository.save(quiz);
    }

    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }
}
