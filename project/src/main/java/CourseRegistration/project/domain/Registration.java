package CourseRegistration.project.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Registration {

    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String studentId;
    @Column(nullable = false)
    private String courseId;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<CourseOffering> courseOfferingList;



}
