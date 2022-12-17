package CourseRegistration.project.domain;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
//    @NotBlank
//    @Size(max=45)
    @Column(nullable = false,length=45)
    private String name;
   // @FutureOrPresent
    @DateTimeFormat
    private LocalDate startDate;
   // @FutureOrPresent
    private LocalDate enrolStartDate;
   // @Future
    @DateTimeFormat
    private LocalDate enrolEndDate;
   // @OneToMany(cascade = CascadeType.PERSIST)
    // private List<Student> studentList = new ArrayList<Student>();
    private Boolean hasWriteAccess;

    public Entry(String name, LocalDate startDate, LocalDate enrolStartDate,LocalDate enrolEndDate) {
        super();
        this.name = name;
        this.startDate = startDate;
        this.enrolStartDate = enrolStartDate;
        this.enrolEndDate = enrolEndDate;
        this.hasWriteAccess = true;
    }

    public Entry() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEnrolStartDate() {
        return enrolStartDate;
    }

    public void setEnrolStartDate(LocalDate enrolStartDate) {
        this.enrolStartDate = enrolStartDate;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudents() {
        return studentList;
    }

    public void setStudents(List<Student> students) {
        this.studentList = students;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void setHasWriteAccess(Boolean hasWriteAccess) {
        this.hasWriteAccess = hasWriteAccess;
    }

    public Boolean getHasWriteAccess() {
        return hasWriteAccess;
    }

    public LocalDate getEnrolEndDate() {
        return enrolEndDate;
    }

    public void setEnrolEndDate(LocalDate enrolEndDate) {
        this.enrolEndDate = enrolEndDate;
    }
}

