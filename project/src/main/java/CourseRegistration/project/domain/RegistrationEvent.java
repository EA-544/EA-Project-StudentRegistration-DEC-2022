package CourseRegistration.project.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class RegistrationEvent {
    @Id
    @GeneratedValue
    private  int id;
    private String name;
    @DateTimeFormat
    private LocalDate startDate;
    @DateTimeFormat
    private LocalDate endDate;

    @OneToMany(cascade = CascadeType.ALL)
    private Collection<RegistrationGroup> registrationGroups;


}
