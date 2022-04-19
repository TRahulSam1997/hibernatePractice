package hibernateApp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mentor {

    @Id
    private int userId;
    private String userName;
    private String profession;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
