package hibernateApp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Mentee {

    @Id
    private int menteeId;
    private String name;
    private int marks;
    @OneToMany(mappedBy = "mentee")
    private List<Laptop> laptop = new ArrayList<>();

    public int getMenteeId() {
        return menteeId;
    }

    public void setMenteeId(int menteeId) {
        this.menteeId = menteeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Mentee{" +
                "menteeId=" + menteeId +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
