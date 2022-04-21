package hibernateApp;

import javax.persistence.*;

@Entity
@Table(name="mentor_table")
public class Mentor {

    @Id
    private int userId;
    private MentorName mentorName;
//    @Transient
    private String userName;
//    @Column(name="mentor_profession")
    private String profession;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public MentorName getMentorName() {
        return mentorName;
    }

    public void setMentorName(MentorName mentorName) {
        this.mentorName = mentorName;
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

    @Override
    public String toString() {
        return "Mentor{" +
                "userId=" + userId +
                ", mentorName='" + mentorName + '\'' +
                ", userName='" + userName + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}
