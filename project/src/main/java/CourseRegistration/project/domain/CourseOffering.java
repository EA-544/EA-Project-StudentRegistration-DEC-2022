package CourseRegistration.project.domain;


import javax.persistence.*;

@Entity
public class CourseOffering {
    @Id
    @GeneratedValue
    private int id;
    private String code;
    private String facultyInitials;
    private int availableSeats;
    private int capacity;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn
    private Faculty faculty;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn
    private AcademicBlock academicBlock;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn
    private Course course;

    public CourseOffering(int id, String code, String facultyInitials, int availableSeats,
                          int capacity, Faculty faculty, AcademicBlock academicBlock, Course course) {
        this.id = id;
        this.code = code;
        this.facultyInitials = facultyInitials;
        this.availableSeats = availableSeats;
        this.capacity = capacity;
        this.faculty = faculty;
        this.academicBlock = academicBlock;
        this.course = course;
    }

    public CourseOffering() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFacultyInitials() {
        return facultyInitials;
    }

    public void setFacultyInitials(String facultyInitials) {
        this.facultyInitials = facultyInitials;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public AcademicBlock getAcademicBlock() {
        return academicBlock;
    }

    public void setAcademicBlock(AcademicBlock academicBlock) {
        this.academicBlock = academicBlock;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "CourseOffering{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", facultyInitials='" + facultyInitials + '\'' +
                ", availableSeats=" + availableSeats +
                ", capacity=" + capacity +
                ", faculty=" + faculty +
                ", academicBlock=" + academicBlock +
                ", course=" + course +
                '}';
    }
}
