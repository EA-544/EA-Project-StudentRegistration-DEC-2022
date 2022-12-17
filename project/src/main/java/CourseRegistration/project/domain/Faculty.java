package CourseRegistration.project.domain;


import javax.persistence.*;

@Entity
public class Faculty {
    @Id
    @GeneratedValue
    private int id;
    private String tile;

    public Faculty() {
    }

    public Faculty(String name, String email, int id, String tile) {

        this.id = id;
        this.tile = tile;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "id=" + id +
                ", tile='" + tile + '\'' +
                '}';
    }
}
