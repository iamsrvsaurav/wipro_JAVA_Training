package com.example.classroom_service.controller;

import com.example.classroom_service.entity.Classroom;
import com.example.classroom_service.service.ClassroomService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/classrooms")
public class ClassroomController {

    private final ClassroomService classroomService;

    public ClassroomController(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    @PostMapping
    public Classroom createClassroom(@RequestBody Classroom classroom) {
        return classroomService.createClassroom(classroom);
    }

    @GetMapping
    public List<Classroom> getAllClassrooms() {
        return classroomService.getAllClassrooms();
    }

    @GetMapping("/{id}")
    public Classroom getClassroomById(@PathVariable Long id) {
        return classroomService.getClassroomById(id);
    }

    @PutMapping("/{id}")
    public Classroom updateClassroom(@PathVariable Long id, @RequestBody Classroom classroom) {
        return classroomService.updateClassroom(id, classroom);
    }

    @DeleteMapping("/{id}")
    public void deleteClassroom(@PathVariable Long id) {
        classroomService.deleteClassroom(id);
    }
}
