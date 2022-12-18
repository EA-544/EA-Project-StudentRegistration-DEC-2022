package CourseRegistration.project.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;
@NoArgsConstructor
@Data
public class CourseOffering {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String code;
    @Column(nullable = false)
    private int capacity;
    private int numberOfRegisteredStudent;
    private String faculty;

    @OneToOne
    private AcademicBlock academicBlock;

    @OneToOne
    private Course course;

    @ManyToOne(cascade = CascadeType.ALL)
    private RegistrationRequest registrationRequest;
}
