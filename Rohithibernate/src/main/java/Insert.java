
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		System.out.println("!!HELLO THERE!!");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Employee employee=new Employee();
		employee.setId(1);
		employee.setName("ROHIT MAITY");
		session.save(employee);
		transaction.commit();
		session.close();
		System.out.println("I'M DOING HIBERNATE");
		

	}

}
