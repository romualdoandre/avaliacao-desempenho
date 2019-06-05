package teste2_avd2_controller;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Controller;

import teste2_avd2_model.Autoavaliacao;

//Controller - autoavaliacao
@Controller
public class AutoavController {

	EntityManagerFactory emf;
	EntityManager em;
	
	public AutoavController() {
		emf = Persistence.createEntityManagerFactory("teste2_avd2");
		em = emf.createEntityManager();
	}
	
	public void addAutoav(Autoavaliacao autoavaliacao) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(autoavaliacao);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void updateAutoav(Autoavaliacao autoavaliacao) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(autoavaliacao);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void removeAutoav(Autoavaliacao autoavaliacao) {
		em.getTransaction().begin();
		em.remove(autoavaliacao);
		em.getTransaction().commit();
		emf.close();
	}
	//Implementar remover
	
	//Avalia��o pode ser editada (implementar update)
	
}
