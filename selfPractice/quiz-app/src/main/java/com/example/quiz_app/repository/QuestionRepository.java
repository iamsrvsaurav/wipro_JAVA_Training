package com.example.quiz_app.repository;

//package com.example.quizapp.repository;

import com.example.quiz_app.entity.Question;
import com.example.quiz_app.enums.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByCategory(Category category);
}
