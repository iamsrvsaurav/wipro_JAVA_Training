package com.example.classroom_service.service;

import com.example.classroom_service.entity.Classroom;
import com.example.classroom_service.repository.ClassroomRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClassroomService {

    private final ClassroomRepository classroomRepository;

    public ClassroomService(ClassroomRepository classroomRepository) {
        this.classroomRepository = classroomRepository;
    }

    public Classroom createClassroom(Classroom classroom) {
        return classroomRepository.save(classroom);
    }

    public List<Classroom> getAllClassrooms() {
        return classroomRepository.findAll();
    }

    public Classroom getClassroomById(Long id) {
        return classroomRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Classroom not found with id: " + id));
    }

    public Classroom updateClassroom(Long id, Classroom updated) {
        Classroom classroom = getClassroomById(id);
        classroom.setName(updated.getName());
        classroom.setDescription(updated.getDescription());
        classroom.setCapacity(updated.getCapacity());
        classroom.setLocation(updated.getLocation());
        return classroomRepository.save(classroom);
    }

    public void deleteClassroom(Long id) {
        classroomRepository.deleteById(id);
    }
}
