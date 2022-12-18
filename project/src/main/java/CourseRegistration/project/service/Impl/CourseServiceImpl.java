package CourseRegistration.project.service.Impl;

import CourseRegistration.project.Exception.NoSuchResourceException;
import CourseRegistration.project.Repository.CourseRepository;
import CourseRegistration.project.domain.Course;
import CourseRegistration.project.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
    @Override
    public void addCourse(Course course) {
        courseRepository.save(course);
    }
    @Override
    public Course getCourse(String courseId) throws NoSuchResourceException {
        return courseRepository.findByCode(courseId)
                .orElseThrow(() -> new NoSuchResourceException("Can't find Course", 1L));
    }
    @Override
    public void updateCourse(String courseId, Course new_Course) throws NoSuchResourceException {
        Course course = courseRepository.findByCode(courseId)
                .orElseThrow(() -> new NoSuchResourceException("Can't find course", 1L));
        course.setCode(new_Course.getCode());
        course.setName(new_Course.getName());
        course.setDescription(new_Course.getDescription());

        courseRepository.save(course);
    }
}
