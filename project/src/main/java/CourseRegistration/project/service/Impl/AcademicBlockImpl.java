package CourseRegistration.project.service.Impl;

import CourseRegistration.project.Exception.NoSuchResourceException;
import CourseRegistration.project.Repository.AcademicBlockRepository;
import CourseRegistration.project.domain.AcademicBlock;
import CourseRegistration.project.service.AcademicBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AcademicBlockImpl implements AcademicBlockService {
    @Autowired
    private AcademicBlockRepository academicBlockRepository;

    @Override
    public List<AcademicBlock> getAllBlocks() {
        return academicBlockRepository.findAll();
    }

    @Override
    public AcademicBlock addBlock(AcademicBlock block) {
        return academicBlockRepository.save(block);
    }

    @Override
    public AcademicBlock getBlock(Long blockId) throws NoSuchResourceException {
        return academicBlockRepository.findById(blockId)
                   .orElseThrow(() -> new NoSuchResourceException("Can't find Block", 1L));
    }

    @Override
    public AcademicBlock updateBlock(Long blockId, AcademicBlock new_Block) throws NoSuchResourceException {
        AcademicBlock block= academicBlockRepository.findById(blockId)
                .orElseThrow(()->new NoSuchResourceException("cant find Block",1l));
        block.setCode(new_Block.getCode());
        block.setName(new_Block.getName());
        block.setSemester(new_Block.getSemester());
        block.getStartDate();
        block.getEndDate();
        block.getCourseOfferings();
        return academicBlockRepository.save(block);
    }



    }

