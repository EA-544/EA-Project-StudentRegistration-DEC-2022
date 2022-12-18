package CourseRegistration.project.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Embeddable
@Data
@NoArgsConstructor
public class Address {

    @Column(nullable = false)
    private String street;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false,length = 5)
    private String postalCode;
    @Column(nullable = false)
    private String state;
    @Column(nullable = false)
    private String country;

}
