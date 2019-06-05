package teste2_avd2_connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
		
	 private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("teste2_avd2");;
	 
	 public static EntityManager getEntityManager(){
	 return factory.createEntityManager();
	 }
	
}
