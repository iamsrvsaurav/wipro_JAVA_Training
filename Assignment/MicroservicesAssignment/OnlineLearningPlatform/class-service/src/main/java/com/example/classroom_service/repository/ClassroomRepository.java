package com.example.classroom_service.repository;

//package com.example.classroom_service.repository;

import com.example.classroom_service.entity.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
    // You can add custom queries here if needed
}
