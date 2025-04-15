import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DisplayData {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("ENTER ID:-");
//		
//		Employee employee=session.get(Employee.class,scanner.nextInt());
//		System.out.println(employee.getName());
		Query query= session.createQuery("from Employee");//WHERE EMPLOYEE IS THE NAME OF THE MODEL CLASS
		List<Employee> list=query.list();
		System.out.println(list);//ALL DATA ARE IN OBJECT FORMAT
		for(Employee e:list)
		{
			System.out.println(e.getName());
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
//		Query query=session.createQuery("from Employee");
//		@SuppressWarnings("deprecation")
//		List<Employee> list= query.list();
//		System.out.println(list);
//		for(Employee e:list)
//		{
//			System.out.println(e.getName());
//		}
		
		
			
			
		factory.close();


	}

}
