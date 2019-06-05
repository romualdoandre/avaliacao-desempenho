package teste2_avd2_controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;

import teste2_avd2_model.Avd;

//Controller para a tabela AVD (Avalia��o de Desempenho)
@SuppressWarnings("deprecation")
@ManagedBean
@Controller
public class AvdController {
	
		EntityManagerFactory emf;
		EntityManager em2;
		
		public AvdController() {
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			emf = Persistence.createEntityManagerFactory("teste2_avd2");
			em2 = emf.createEntityManager();
		}
		
		public void addAvd(Avd avaliacao) {
			em2 = emf.createEntityManager();
			em2.getTransaction().begin();
			em2.persist(avaliacao);
			em2.getTransaction().commit();
			em2.close();
		}
		
		public void removeAvd(Avd avaliacao) {
			em2 = emf.createEntityManager();
			em2.getTransaction().begin();
			Query q = em2.createNativeQuery("DELETE FROM avd WHERE id_avd =" + avaliacao.getId());
			q.executeUpdate();
			em2.getTransaction().commit();
			em2.close();
		}
		
		public Avd find(Avd avaliacao) {
			em2 = emf.createEntityManager();
			Avd a;
			em2.getTransaction().begin();
			a = em2.find(Avd.class, avaliacao.getId());
			em2.getTransaction().commit();
			em2.close();
			return a;
		}
		
		@SuppressWarnings("unchecked")
		public List<Avd> listAll_avd(){
			em2.getTransaction().begin();
			Query consulta = em2.createQuery("select avd from Avd avd");
			List<Avd> avaliacoes = consulta.getResultList();
			em2.getTransaction().commit();
			em2.close();
			return avaliacoes;
		}
		
}
