package CourseRegistration.project.Repository;

import CourseRegistration.project.domain.CourseOffering;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseOfferingRepository extends JpaRepository<CourseOffering,Integer> {
}
