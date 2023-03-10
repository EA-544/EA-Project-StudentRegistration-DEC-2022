package CourseRegistration.project.DAO;

import CourseRegistration.project.domain.RegistrationRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRequirementDAO extends JpaRepository<RegistrationRequest, Integer> {
}
