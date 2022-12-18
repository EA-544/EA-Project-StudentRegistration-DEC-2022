package CourseRegistration.project.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class RegistrationRequest {
    @Id
    @GeneratedValue
    private  Long id;
    private int courseCode;
    private String priority;

    @OneToMany
    private List<Registration> registration;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<CourseOffering> courseList;
}
