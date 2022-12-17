package CourseRegistration.project.domain;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class AcademicBlock {
    @Id
    @GeneratedValue
    private int id;
    private String code;
    private String name;
    private String semester;
    private Date startDate;
    private Date endDate;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable
    private CourseOffering courseOffering;

    public AcademicBlock(int id, String code, String name, String semester,
                         Date startDate, Date endDate, CourseOffering courseOffering) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.semester = semester;
        this.startDate = startDate;
        this.endDate = endDate;
        this.courseOffering = courseOffering;
    }

    public AcademicBlock() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public CourseOffering getCourseOffering() {
        return courseOffering;
    }

    public void setCourseOffering(CourseOffering courseOffering) {
        this.courseOffering = courseOffering;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "AcademicBlock{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", semester='" + semester + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", courseOffering=" + courseOffering +
                '}';
    }
}
