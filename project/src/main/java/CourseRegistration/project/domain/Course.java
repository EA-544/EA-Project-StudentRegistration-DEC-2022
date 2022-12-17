package CourseRegistration.project.domain;

public class Course {
    private int id;
    private String code;
    private String name;
    private String description;
    private Course prerequisite;

    public Course(int id, String code, String name, String description, Course prerequisite) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.prerequisite = prerequisite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Course getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(Course prerequisite) {
        this.prerequisite = prerequisite;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", prerequisite=" + prerequisite +
                '}';
    }
}
