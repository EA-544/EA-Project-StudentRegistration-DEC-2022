package CourseRegistration.project.service;

import CourseRegistration.project.domain.CourseOffering;



public interface CourseOfferingService {
    public CourseOffering Create(CourseOffering courseOffering);
    public CourseOffering findById(Long courseOfferingId);
    public void update(Long courseId, CourseOffering courseOffering);
    public void deleteCourseOffering(Long courseOfferingId);

}
