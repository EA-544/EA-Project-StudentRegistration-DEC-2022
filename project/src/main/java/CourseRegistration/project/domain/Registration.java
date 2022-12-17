package CourseRegistration.project.domain;

public class Registration {

    private Student student;
    private CourseOffering courseOffering;

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
