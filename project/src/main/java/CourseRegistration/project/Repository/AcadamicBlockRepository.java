package CourseRegistration.project.Repository;

import CourseRegistration.project.domain.AcademicBlock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AcadamicBlockRepository extends JpaRepository<AcademicBlock,Integer> {
    Optional<Block> findByCode(String code);
}
