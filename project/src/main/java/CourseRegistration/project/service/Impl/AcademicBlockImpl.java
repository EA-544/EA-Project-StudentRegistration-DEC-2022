package CourseRegistration.project.service.Impl;

import CourseRegistration.project.Exception.NoSuchResourceException;
import CourseRegistration.project.Repository.AcadamicBlockRepository;
import CourseRegistration.project.domain.AcademicBlock;
import CourseRegistration.project.service.AcadamicBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class AcademicBlockImpl implements AcadamicBlockService {
    @Autowired
    private AcadamicBlockRepository acadamicBlockRepository
    @Override
    public List<AcademicBlock> getAllBlocks() {
        return acadamicBlockRepository.findAll();
    }

    @Override
    public AcademicBlock addBlock(AcademicBlock block) {
        return acadamicBlockRepository.save(block);
    }

    @Override
    public AcademicBlock getBlock(String blockId) throws NoSuchResourceException {

            return acadamicBlockRepository.findByCode(blockId)
                    .orElseThrow(() -> new NoSuchResourceException("Can't find Block", 1L));
    }

    @Override
    public AcademicBlock updateBlock(String blockId, AcademicBlock new_Block) throws NoSuchResourceException {
        AcademicBlock block= acadamicBlockRepository.findByCode(blockId)
                .orElseThrow(()->new NoSuchResourceException("cant find Block",1l));
        block.setCode(new_Block.getCode());
        block.setName(new_Block.getName());
        block.setSemester(new_Block.getSemester());
       // block.getStartDate(new_Block.getStartDate(Date.));
        //block.getEndDate(new_Block.getEndDate());
        //block.getCourseOffering(new_Block.getCourseOffering());
        return acadamicBlockRepository.save(block);
    }


    }

