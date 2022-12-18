package CourseRegistration.project.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
@Entity
public class Admin extends Person{

    @Id
    @GeneratedValue
    private Long id;

    public Admin() {
    }

    public Admin(String name, String email, Long id) {
        super();
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                '}';
    }
}
