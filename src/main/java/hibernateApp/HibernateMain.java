package hibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMain {
    public static void main(String[] args) {
        {
//            System.out.println("Hello World!");
            Mentor dom = new Mentor();
            dom.setUserId(101);
            dom.setUserName("Domenic");
            dom.setProfession("Founder");

            Configuration con = new Configuration().configure().addAnnotatedClass(Mentor.class);

            SessionFactory sf = con.buildSessionFactory();

            Session session = sf.openSession();

            Transaction tx = session.beginTransaction();

            session.save(dom);

            tx.commit();
        }
    }
}