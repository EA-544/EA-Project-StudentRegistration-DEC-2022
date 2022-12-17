package CourseRegistration.project.Repository;

import CourseRegistration.project.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {

    Optional<Course> findByCode(String string);
}
