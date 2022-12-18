package CourseRegistration.project.Repository;

import CourseRegistration.project.domain.AcademicBlock;
import CourseRegistration.project.domain.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration,Long> {
    Optional<AcademicBlock> findByCode(String code);
}
