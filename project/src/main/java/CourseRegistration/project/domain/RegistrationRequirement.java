package CourseRegistration.project.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class RegistrationRequirement {
    @Id
    @GeneratedValue
    private int id;

    private Student student;

    private CourseOffering courseOffering;
    private int coursePriorityNumber;

    public RegistrationRequirement() {
    }

    public RegistrationRequirement(Student student, CourseOffering courseOffering, int coursePriorityNumber) {
        this.student = student;
        this.courseOffering = courseOffering;
        this.coursePriorityNumber = coursePriorityNumber;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public CourseOffering getCourseOffering() {
        return courseOffering;
    }

    public void setCourseOffering(CourseOffering courseOffering) {
        this.courseOffering = courseOffering;
    }

    public int getCoursePriorityNumber() {
        return coursePriorityNumber;
    }

    public void setCoursePriorityNumber(int coursePriorityNumber) {
        this.coursePriorityNumber = coursePriorityNumber;
    }

    @Override
    public String toString() {
        return "RegistrationRequirement{" +
                "student=" + student +
                ", courseOffering=" + courseOffering +
                ", coursePriorityNumber=" + coursePriorityNumber +
                '}';
    }
}
