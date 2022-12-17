package CourseRegistration.project.domain;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class RegistrationRequirement {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name= "student_id")
    private Student student;

    @OneToMany(cascade = CascadeType.PERSIST)
    @OrderColumn(name = "sequence")
    private List<CourseOffering> courseOffering = new ArrayList<>();
    private int coursePriorityNumber;

    public RegistrationRequirement() {
    }

    public RegistrationRequirement(Student student, List<CourseOffering> courseOffering, int coursePriorityNumber) {
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

    public List<CourseOffering> getCourseOffering() {
        return courseOffering;
    }

    public void setCourseOffering(List<CourseOffering> courseOffering) {
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
