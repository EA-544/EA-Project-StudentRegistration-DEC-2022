package CourseRegistration.project.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Student extends Person{
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String studentId;
    private Address mailingAddress;
    @Column(nullable = false)
    private Address homeAddress;
    @ManyToOne
    private CourseOffering courseOffering;


}
