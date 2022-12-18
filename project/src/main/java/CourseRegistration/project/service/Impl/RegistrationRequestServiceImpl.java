package CourseRegistration.project.service.Impl;

import CourseRegistration.project.Repository.RegistrationRequestRepository;
import CourseRegistration.project.domain.RegistrationRequest;
import CourseRegistration.project.service.RegistrationRequestService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class RegistrationRequestServiceImpl implements RegistrationRequestService {

    @Autowired
    private RegistrationRequestRepository registrationRequestRepository ;

    public RegistrationRequest create(RegistrationRequest registrationRequest) {
        return registrationRequestRepository.save(registrationRequest);
    }
    public Optional<RegistrationRequest> findById(Long registrationRequestId) {
        return registrationRequestRepository.findById(registrationRequestId);
    }

    public RegistrationRequest update(Long registrationRequestId,RegistrationRequest registrationRequest) {
        RegistrationRequest entity = findById(registrationRequestId).orElse(null);
        entity.setCourseCode(registrationRequest.getCourseCode());
        entity.setPriority(registrationRequest.getPriority());
        entity.setRegistration(registrationRequest.getRegistration());
        return registrationRequestRepository.save(entity);
    }
    public void deleteRegistrationRequest (Long registrationRequestId) {
        registrationRequestRepository.deleteById(registrationRequestId);
    }

    public List<RegistrationRequest> findAll() {
        return registrationRequestRepository.findAll();
    }
}
