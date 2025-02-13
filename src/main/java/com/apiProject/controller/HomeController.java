package com.apiProject.controller;

import com.apiProject.entity.Course;
import com.apiProject.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home(){
        return "this is home page";
    }
    
    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseService.getCourses();
    }
    
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }
    
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }
    
    @DeleteMapping("/courses/{courseId}")
    public Course deleteCourse(@PathVariable String courseId){
        return this.courseService.deleteCourse(Long.parseLong(courseId));
    }
    
    @PutMapping("/courses/{courseId}")
    public Course updateCourse(@PathVariable String courseId, @RequestBody Course course) {
        return this.courseService.updateCourse(Long.parseLong(courseId), course);
    }
}
