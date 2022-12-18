package CourseRegistration.project.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Course {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false,length = 5)
    private String code;
    private String description;
//    @ManyToOne
//    private List<CourseOffering> courseOfferings;

}
