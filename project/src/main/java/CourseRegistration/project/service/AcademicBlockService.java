package CourseRegistration.project.service;

import CourseRegistration.project.Exception.NoSuchResourceException;
import CourseRegistration.project.domain.AcademicBlock;

import java.util.List;
public interface AcademicBlockService {
    public List<AcademicBlock> getAllBlocks();

    public AcademicBlock addBlock(AcademicBlock block);

    public AcademicBlock getBlock(Long blockId) throws NoSuchResourceException;

    public AcademicBlock updateBlock(Long blockId, AcademicBlock new_Block) throws NoSuchResourceException;

}

