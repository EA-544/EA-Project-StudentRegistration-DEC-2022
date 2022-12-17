package CourseRegistration.project.Repository;

import CourseRegistration.project.domain.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaculityRepository extends JpaRepository<Faculty,Integer> {
}
