package teste2_avd2_controller;

import java.util.List;

import javax.persistence.*;

import teste2_avd2_model.Servidor;

//Controller para tabela Servidor
public class ServidorController {

	EntityManagerFactory emf;
	EntityManager em;
	EntityManager em2;


	public ServidorController() {
		emf = Persistence.createEntityManagerFactory("teste_avaliacao");
		em = emf.createEntityManager();
	}

	//M�todo de cadastro de servidor
	public void addServidor(Servidor servidor) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(servidor);
		em.getTransaction().commit();
		em.close();
	}

	//M�todo de remo��o de servidor
	public void removeServidor(Servidor servidor) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(servidor);
		em.getTransaction().commit();
		em.close();
	}

	//M�todo de listagem de servidores
	@SuppressWarnings("unchecked")
	public List<Servidor> listServidor(){
		em = emf.createEntityManager();
		Query consulta = em.createQuery("SELECT servidor from servidor servidor");
		List<Servidor> servidores = consulta.getResultList();
		em.getTransaction().commit();
		em.close();
		return servidores;
	}

	
	/*
	 * public int findIdservidor(int id_servidor) { em2 = emf.createEntityManager();
	 * Servidor s; em2.getTransaction().begin(); s = em2.find(Servidor.class,
	 * id_servidor); em2.persist(s); em2.flush(); em2.getTransaction().commit();
	 * em2.close(); return s.getId(); }
	 */


}
