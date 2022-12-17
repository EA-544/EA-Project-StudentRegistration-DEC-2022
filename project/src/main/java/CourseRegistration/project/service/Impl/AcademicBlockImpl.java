package CourseRegistration.project.service.Impl;

import CourseRegistration.project.Exception.NoSuchResourceException;
import CourseRegistration.project.domain.AcademicBlock;
import CourseRegistration.project.service.AcadamicBlockService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AcademicBlockImpl implements AcadamicBlockService {
    @Override
    public List<AcademicBlock> getAllBlocks() {
        return null;
    }

    @Override
    public AcademicBlock addBlock(AcademicBlock block) {
        return null;
    }

    @Override
    public AcademicBlock getBlock(String courseId) throws NoSuchResourceException {
        return null;
    }

    @Override
    public AcademicBlock updateBlock(String blockId, AcademicBlock new_Block) throws NoSuchResourceException {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteBlock(String blockId) throws NoSuchResourceException {
        return null;
    }
}
