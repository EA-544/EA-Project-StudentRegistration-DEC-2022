package CourseRegistration.project.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Admin extends Person{

    private int id;

    public Admin(String name, String email, int id) {
        super(name, email);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                '}';
    }
}
