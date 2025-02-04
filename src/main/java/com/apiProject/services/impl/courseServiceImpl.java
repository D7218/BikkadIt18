package com.apiProject.services.impl;

import com.apiProject.entity.Course;
import com.apiProject.services.CourseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class courseServiceImpl implements CourseService {
    List<Course> list;
    public courseServiceImpl(){
        list = new ArrayList<>();
        list.add(new Course(124, "java core course"," this course create by this java "));
        list.add(new Course(234, "spring boot course", "creating spring boot course"));

    }
    @Override
    public List<Course> getCourses() {

        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c = null;
        for(Course course: list){
            if(course.getId()==courseId){
                c=course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course deleteCourse(long courseId) {

        return null;
    }

}
