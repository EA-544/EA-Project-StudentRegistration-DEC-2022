package CourseRegistration.project.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Data

public class Faculty extends Person{
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String tile;


}
