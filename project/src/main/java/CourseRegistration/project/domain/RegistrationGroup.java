package CourseRegistration.project.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data

public class RegistrationGroup {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

//    @OneToMany
//    private Collection<AcademicBlock> academicBlockList;
    @ManyToMany
    private Collection<CourseOffering>courseOfferings;

    @ManyToMany(cascade = CascadeType.ALL)
    private  Collection<Student> students;
}
