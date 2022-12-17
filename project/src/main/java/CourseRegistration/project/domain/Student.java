package CourseRegistration.project.domain;

public class Student extends Person{
    private int id;
    private String studentId;
    private Address mailingAddress;
    private Address homeAddress;

    public Student(String name, String email, int id, String studentId, Address mailingAddress, Address homeAddress) {
        super(name, email);
        this.id = id;
        this.studentId = studentId;
        this.mailingAddress = mailingAddress;
        this.homeAddress = homeAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Address getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(Address mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentId='" + studentId + '\'' +
                ", mailingAddress=" + mailingAddress +
                ", homeAddress=" + homeAddress +
                '}';
    }
}
