package com.example.facultative.service;

import com.example.facultative.entity.Course;
import com.example.facultative.entity.dto.CourseDto;
import com.example.facultative.entity.enums.CourseStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CourseService {
    void saveCourse(CourseDto courseDto);

    List<Course> findAll();

    void deleteById(Long id);

    Course findCourseById(Long id);

    void changeCourseStatus(Long id, CourseStatus courseStatus);

    Page<Course> findAllNotStartedCourse(Pageable pageable);
}