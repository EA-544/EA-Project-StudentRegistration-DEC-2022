package CourseRegistration.project.domain;

import javax.persistence.*;
@Entity
public class Registration {
    @Id
    @GeneratedValue
    private int id;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn
    private Student student;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn
    private CourseOffering courseOffering;

    public Registration() {
    }

    public Registration(Student student, CourseOffering courseOffering) {
        this.student = student;
        this.courseOffering = courseOffering;
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

    @Override
    public String toString() {
        return "Registration{" +
                "student=" + student +
                ", courseOffering=" + courseOffering +
                '}';
    }
}
