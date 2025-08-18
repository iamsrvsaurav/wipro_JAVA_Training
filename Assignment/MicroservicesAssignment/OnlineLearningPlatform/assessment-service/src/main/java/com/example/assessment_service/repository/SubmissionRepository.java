package com.example.assessment_service.repository;

import com.example.assessment_service.entity.Submission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubmissionRepository extends JpaRepository<Submission, Long> {
    List<Submission> findByAssessmentId(Long assessmentId);
    List<Submission> findByStudentId(Long studentId);
}
