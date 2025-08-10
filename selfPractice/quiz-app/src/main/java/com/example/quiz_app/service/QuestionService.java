package com.example.quiz_app.service;

//package com.example.quizapp.service;

import com.example.quiz_app.entity.Question;
import com.example.quiz_app.enums.Category;
import com.example.quiz_app.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository = null;

    public List<Question> getQuestionsByCategory(Category category) {
        return questionRepository.findByCategory(category);
    }

    public Question addQuestion(Question question) {
        return questionRepository.save(question);
    }
}
