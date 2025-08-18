package com.example.assessment_service.controller;

import com.example.assessment_service.entity.Assessment;
import com.example.assessment_service.entity.Submission;
import com.example.assessment_service.service.AssessmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assessments")
public class AssessmentController {

    private final AssessmentService assessmentService;

    public AssessmentController(AssessmentService assessmentService) {
        this.assessmentService = assessmentService;
    }

    // Assessment APIs
    @PostMapping
    public Assessment createAssessment(@RequestBody Assessment assessment) {
        return assessmentService.createAssessment(assessment);
    }

    @GetMapping
    public List<Assessment> getAllAssessments() {
        return assessmentService.getAllAssessments();
    }

    @GetMapping("/course/{courseId}")
    public List<Assessment> getAssessmentsByCourse(@PathVariable Long courseId) {
        return assessmentService.getAssessmentsByCourse(courseId);
    }

    @GetMapping("/{id}")
    public Assessment getAssessmentById(@PathVariable Long id) {
        return assessmentService.getAssessmentById(id);
    }

    @PutMapping("/{id}")
    public Assessment updateAssessment(@PathVariable Long id, @RequestBody Assessment assessment) {
        return assessmentService.updateAssessment(id, assessment);
    }

    @DeleteMapping("/{id}")
    public void deleteAssessment(@PathVariable Long id) {
        assessmentService.deleteAssessment(id);
    }

    // Submission APIs
    @PostMapping("/submit")
    public Submission submitAssessment(@RequestBody Submission submission) {
        return assessmentService.submit(submission);
    }

    @GetMapping("/submissions/assessment/{assessmentId}")
    public List<Submission> getSubmissionsByAssessment(@PathVariable Long assessmentId) {
        return assessmentService.getSubmissionsByAssessment(assessmentId);
    }

    @GetMapping("/submissions/student/{studentId}")
    public List<Submission> getSubmissionsByStudent(@PathVariable Long studentId) {
        return assessmentService.getSubmissionsByStudent(studentId);
    }
}
