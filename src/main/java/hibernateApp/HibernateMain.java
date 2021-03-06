package hibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Collection;

public class HibernateMain {
    public static void main(String[] args) {
        {
            Laptop lp1 = new Laptop();
            lp1.setLid(212);
            lp1.setPrice(2332);
            lp1.setBrand("dee");

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
            EntityManager em = emf.createEntityManager();

//            Laptop lp = em.find(Laptop.class, 4);
            em.getTransaction().begin();

            em.persist(lp1);
            em.getTransaction().commit();

            System.out.println(lp1);

//            Laptop lp = new Laptop();

//
//            lp.setLid(22);
//            lp.setBrand("brand" + 25);
//            lp.setPrice(10 * 25);

//            Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class);
//            ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
//            SessionFactory sf = config.buildSessionFactory(reg);
//            Session session = sf.openSession();
//
//            session.beginTransaction();
//
//            lp = session.get(Laptop.class, 3);
//            System.out.println(lp);
//
//            session.getTransaction().commit();


//            Admin a = null;
//
////            Admin b = new Admin();
////            b.setAid(3);
////            b.setAname("gom");
////            b.setAemail("gom@gom.com");
//
//            Configuration config = new Configuration().configure().addAnnotatedClass(Admin.class);
//            ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
//            SessionFactory sf = config.buildSessionFactory(reg);
//
//            /* Session 1 */
//
//            Session session1 = sf.openSession();
//            session1.beginTransaction();
//
//            Query q1 = session1.createQuery("from Admin where aid=1");
//            q1.setCacheable(true);
//            a = (Admin) q1.uniqueResult();
//            System.out.println("Value is: " + a);
//
//            session1.getTransaction().commit();
//            session1.close();
//
//            /* Session 2 */
//
//            Session session2 = sf.openSession();
//            session2.beginTransaction();
//
//            Query q2 = session2.createQuery("from Admin where aid=1");
//            q2.setCacheable(true);
//            a = (Admin) q2.uniqueResult();
//            System.out.println("Value is: " + a);
//
//            session2.getTransaction().commit();
//            session2.close();

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