package hibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.Collection;

public class HibernateMain {
    public static void main(String[] args) {
        {

            Admin a = null;

//            Admin b = new Admin();
//            b.setAid(3);
//            b.setAname("gom");
//            b.setAemail("gom@gom.com");

            Configuration config = new Configuration().configure().addAnnotatedClass(Admin.class);
            ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
            SessionFactory sf = config.buildSessionFactory(reg);
            Session session1 = sf.openSession();
            session1.beginTransaction();

//            session1.save(b);

            a = (Admin) session1.get(Admin.class, 1);
            System.out.println("Value is: " + a);

            session1.getTransaction().commit();
            session1.close();

            Session session2 = sf.openSession();
            session2.beginTransaction();

            a = (Admin) session2.get(Admin.class, 2);
            System.out.println("Value is: " + a);

            session2.getTransaction().commit();
            session2.close();

//            Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Admin.class);
//            SessionFactory sf = config.buildSessionFactory();
//            Session session = sf.openSession();
//
//            session.beginTransaction();
//
//            Admin a1 = session.get(Admin.class, 1);
//
//            System.out.println(a1.getAname());
//            Collection<Laptop> laptops = a1.getLaps();
//
//            for(Laptop l : laptops) {
//                System.out.println(l);
//            }
//
//            session.getTransaction().commit();

//            Laptop laptop = new Laptop();
//            laptop.setLid(101);
//            laptop.setName("Macbook");
//
//            Mentee m = new Mentee();
//            m.setName("Rahul");
//            m.setMenteeId(1);
//            m.setMarks(80);
//            m.getLaptop().add(laptop);
//
//            laptop.getMentee().add(m);
//
//            Configuration config = new Configuration().configure().addAnnotatedClass(Mentee.class).addAnnotatedClass(Laptop.class);
//            ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
//            SessionFactory sf = config.buildSessionFactory(reg);
//            Session session = sf.openSession();
//
//            session.beginTransaction();
//
//            session.save(laptop);
//            session.save(m);
//
//            session.getTransaction().commit();

////            System.out.println("Hello World!");
//            MentorName mn = new MentorName();
//            mn.setFname("Lev");
//            mn.setLname("Tolstoy");
//            mn.setMname("Nikolayevich");
//
//            Mentor mentor = new Mentor();
//            mentor.setUserId(101);
//            mentor.setMentorName(mn);
//            mentor.setUserName("Tolstoy");
//            mentor.setProfession("Author");
//
//            Configuration con = new Configuration().configure().addAnnotatedClass(Mentor.class);
//
//            ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
//
////            ServiceRegistry reg = ServiceRegistryImplementor
//
//            SessionFactory sf = con.buildSessionFactory(reg);
//
//            Session session = sf.openSession();
//
//            Transaction tx = session.beginTransaction();
//
//            session.save(mentor);
//
////            dom = (Mentor) session.get(Mentor.class, 106);
//
//            tx.commit();
//
//            System.out.println(mentor);

        }
    }
}