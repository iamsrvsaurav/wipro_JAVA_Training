package com.example.course_service.service;
//package com.example.course_service.service;

import com.example.course_service.entity.Course;
import com.example.course_service.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseById(Long id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found with id: " + id));
    }

    public Course updateCourse(Long id, Course updated) {
        Course course = getCourseById(id);
        course.setTitle(updated.getTitle());
        course.setDescription(updated.getDescription());
        course.setSyllabus(updated.getSyllabus());
        return courseRepository.save(course);
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}
