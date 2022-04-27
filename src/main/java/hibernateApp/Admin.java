package hibernateApp;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Admin {

    @Id
    private int aid;
    private String aname;
    private String aemail;

//    @OneToMany(mappedBy = "admin", fetch = FetchType.EAGER)
//    private Collection<Laptop> laps = new ArrayList<>();

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

//    public Collection<Laptop> getLaps() {
//        return laps;
//    }
//
//    public void setLaps(Collection<Laptop> laps) {
//        this.laps = laps;
//    }

    public String getAemail() {
        return aemail;
    }

    public void setAemail(String aemail) {
        this.aemail = aemail;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", aemail='" + aemail + '\'' +
                '}';
    }
}
