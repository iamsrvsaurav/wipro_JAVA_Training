package com.example.assessment_service.repository;

//package com.example.assessment_service.repository;

import com.example.assessment_service.entity.Assessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssessmentRepository extends JpaRepository<Assessment, Long> {
    List<Assessment> findByCourseId(Long courseId);
}
