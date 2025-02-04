package com.apiProject.services;

import com.apiProject.entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();
    public Course getCourse(long courseId);
    public Course addCourse(Course course);
     public Course deleteCourse(long courseId);
}
