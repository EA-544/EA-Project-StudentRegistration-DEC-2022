package CourseRegistration.project.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Data
public class AcademicBlock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
   // private String Semester;
    @DateTimeFormat
    private LocalDate StartDate;
    @DateTimeFormat
    private LocalDate EndDate;



    @OneToMany
    private List<CourseOffering> courseOfferings;

    @Enumerated(EnumType.STRING)
    private Semester semester;
}
