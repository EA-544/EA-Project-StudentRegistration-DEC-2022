package CourseRegistration.project.service.Impl;

import CourseRegistration.project.Exception.NoSuchResourceException;
import CourseRegistration.project.Repository.CourseOfferingRepository;
import CourseRegistration.project.domain.Course;
import CourseRegistration.project.domain.CourseOffering;
import CourseRegistration.project.service.CourseOfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CourseOfferingServiceImpl implements CourseOfferingService {
    @Autowired
    private CourseOfferingRepository courseOfferingRepository ;

    public CourseOffering create(CourseOffering courseOffering) {
        return courseOfferingRepository.save(courseOffering);
    }
    public CourseOffering findById(Long courseOfferingId) {
        return courseOfferingRepository.findById(courseOfferingId).orElseThrow(()->new NoSuchResourceException("No course offering",1l));
    }

    public void update(Long courseOfferingId, CourseOffering new_courseOffering) throws NoSuchResourceException {
        CourseOffering offering = courseOfferingRepository.findById(courseOfferingId).orElseThrow(()-> new NoSuchResourceException("No courseOffering",1l));
        //offering.setCode(offering.getCode());

        offering.setCode(new_courseOffering.getCode());
        offering.setFaculty(new_courseOffering.getFaculty());
        offering.setCapacity(new_courseOffering.getCapacity());
        offering.setNumberOfRegisteredStudent(new_courseOffering.getNumberOfRegisteredStudent());

        courseOfferingRepository.save(offering);
    }
    public void deleteCourseOffering(Long courseOfferingId) {
        courseOfferingRepository.deleteById(courseOfferingId);
    }

    public List<CourseOffering> findAll() {
        return courseOfferingRepository.findAll();
    }

    @Override
    public CourseOffering Create(CourseOffering courseOffering) {
        return courseOfferingRepository.save(courseOffering);
    }



}
