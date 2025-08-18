package com.example.assessment_service.service;

import com.example.assessment_service.entity.Assessment;
import com.example.assessment_service.entity.Submission;
import com.example.assessment_service.repository.AssessmentRepository;
import com.example.assessment_service.repository.SubmissionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssessmentService {

    private final AssessmentRepository assessmentRepository;
    private final SubmissionRepository submissionRepository;

    public AssessmentService(AssessmentRepository assessmentRepo, SubmissionRepository submissionRepo) {
        this.assessmentRepository = assessmentRepo;
        this.submissionRepository = submissionRepo;
    }

    public Assessment createAssessment(Assessment assessment) {
        return assessmentRepository.save(assessment);
    }

    public List<Assessment> getAllAssessments() {
        return assessmentRepository.findAll();
    }

    public List<Assessment> getAssessmentsByCourse(Long courseId) {
        return assessmentRepository.findByCourseId(courseId);
    }

    public Assessment getAssessmentById(Long id) {
        return assessmentRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Assessment not found"));
    }

    public Assessment updateAssessment(Long id, Assessment updated) {
        Assessment a = getAssessmentById(id);
        a.setTitle(updated.getTitle());
        a.setDescription(updated.getDescription());
        a.setType(updated.getType());
        a.setDueDate(updated.getDueDate());
        return assessmentRepository.save(a);
    }

    public void deleteAssessment(Long id) {
        assessmentRepository.deleteById(id);
    }

    // Submissions
    public Submission submit(Submission submission) {
        // TODO: Add automated grading logic here!
        submission.setGrade(autoGrade(submission.getAnswer()));
        return submissionRepository.save(submission);
    }

    public List<Submission> getSubmissionsByAssessment(Long assessmentId) {
        return submissionRepository.findByAssessmentId(assessmentId);
    }

    public List<Submission> getSubmissionsByStudent(Long studentId) {
        return submissionRepository.findByStudentId(studentId);
    }

    private Double autoGrade(String answer) {
        // Simple stub: you can implement real grading logic here.
        if (answer != null && !answer.trim().isEmpty()) return 100.0;
        return 0.0;
    }
}
