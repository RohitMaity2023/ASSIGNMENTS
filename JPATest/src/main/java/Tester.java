import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Tester {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=factory.createEntityManager();
		entityManager.getTransaction().begin();
		Employee employee=new Employee();
		employee.setName("ROHIT");
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();
	

	}

}
