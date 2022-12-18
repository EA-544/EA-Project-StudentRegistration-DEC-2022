package CourseRegistration.project.service;

import CourseRegistration.project.domain.Student;

import java.util.List;

public interface StudentService {
    public void addStudent(Student student);
    public List<Student> getAllStudents();
}
