package CourseRegistration.project.Repository;

import CourseRegistration.project.domain.CourseOffering;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseOfferingRepository extends JpaRepository<CourseOffering,Long> {
}
