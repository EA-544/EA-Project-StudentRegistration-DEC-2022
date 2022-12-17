package CourseRegistration.project.service;

import CourseRegistration.project.Exception.NoSuchResourceException;
import CourseRegistration.project.domain.AcademicBlock;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AcadamicBlockService {
    public List<AcademicBlock> getAllBlocks();

    public AcademicBlock addBlock(AcademicBlock block);

    public AcademicBlock getBlock(String courseId) throws NoSuchResourceException;

    public AcademicBlock updateBlock(String blockId, AcademicBlock new_Block) throws NoSuchResourceException;

    public ResponseEntity<Void> deleteBlock(String blockId) throws NoSuchResourceException;

}
