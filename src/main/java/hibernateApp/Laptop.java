package hibernateApp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Laptop {

    @Id
    private int lid;
    private String brand;
    private int price;
    @ManyToOne
    private Admin admin;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", admin=" + admin +
                '}';
    }

    //    @Id
//    private int lid;
//    private String name;
//
//    @ManyToMany
//    private List<Mentee> mentee = new ArrayList<>();
//
//    public int getLid() {
//        return lid;
//    }
//
//    public void setLid(int lid) {
//        this.lid = lid;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public List<Mentee> getMentee() {
//        return mentee;
//    }
//
//    public void setMentee(List<Mentee> mentee) {
//        this.mentee = mentee;
//    }
}
