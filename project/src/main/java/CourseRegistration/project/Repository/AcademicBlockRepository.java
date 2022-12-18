package CourseRegistration.project.Repository;

import CourseRegistration.project.domain.AcademicBlock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicBlockRepository extends JpaRepository<AcademicBlock,Integer> {
}
