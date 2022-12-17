package CourseRegistration.project.service.Impl;

import CourseRegistration.project.Exception.NoSuchResourceException;
import CourseRegistration.project.Repository.CourseOfferingRepository;
import CourseRegistration.project.Repository.CourseRepository;
import CourseRegistration.project.Repository.StudentRepository;
import CourseRegistration.project.domain.Registration;
import CourseRegistration.project.domain.RegistrationEvent;
import CourseRegistration.project.domain.Student;
import CourseRegistration.project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    CourseOfferingRepository courseOfferingRepository;


    @Override
    public void addStudent(Student student) {

    }

    public void addEnrollment(Long studentId, List<RegistrationEvent> registrationEventList) throws
            NoSuchResourceException{
        if(registrationEventList.size()>courseOfferingRepository.size()){
            throw new NoSuchResourceException();
        }else if{registrationEventList.size()<courseOfferingRepository.findAll().size(){
            return
        }

    }
}

