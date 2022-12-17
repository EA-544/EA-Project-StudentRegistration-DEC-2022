package CourseRegistration.project.DAO;

import CourseRegistration.project.domain.RegistrationRequirement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface RegistrationRequirementDAO extends JpaRepository<RegistrationRequirement, Integer> {
}
