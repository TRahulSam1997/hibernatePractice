package hibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateMain {
    public static void main(String[] args) {
        {
//            System.out.println("Hello World!");
            Mentor dom = new Mentor();
            dom.setUserId(104);
            dom.setUserName("Tolstoy");
            dom.setProfession("Author");

            Configuration con = new Configuration().configure().addAnnotatedClass(Mentor.class);

            ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();

//            ServiceRegistry reg = ServiceRegistryImplementor

            SessionFactory sf = con.buildSessionFactory(reg);

            Session session = sf.openSession();

            Transaction tx = session.beginTransaction();

            session.save(dom);

            tx.commit();
        }
    }
}