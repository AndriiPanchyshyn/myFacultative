package com.example.facultative.repo;

import com.example.facultative.entity.Course;
import com.example.facultative.entity.enums.CourseStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
    Page<Course> findAllByStatus(CourseStatus courseStatus, Pageable pageable);
}
