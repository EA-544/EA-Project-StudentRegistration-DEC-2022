package CourseRegistration.project.service;

import CourseRegistration.project.Exception.NoSuchResourceException;
import CourseRegistration.project.domain.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getAllCourses();

    public void addCourse(Course course);

    public Course getCourse(String courseId) throws NoSuchResourceException;

    public Course updateCourse(String courseId, Course new_Course) throws NoSuchResourceException;
}
