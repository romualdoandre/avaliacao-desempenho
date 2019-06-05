package teste2_avd2_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import teste2_avd2_connection.ConnectionFactory;
import teste2_avd2_model.Avd;
import teste2_avd2_model.EntidadeBase;

public class DaoGenerico<T extends EntidadeBase> {

	private static EntityManager manager = ConnectionFactory.getEntityManager();

	public T findById(Class<T> clazz, Long id){
		return manager.find(clazz, id);
	}

	public void saveOrUpdate(T obj){
		try{
			manager.getTransaction().begin();
			if(obj.getId() == null){
				manager.persist(obj);
			}else{
				manager.merge(obj);
			}
			manager.getTransaction().commit();
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
	}

	public void remove(Class<T> clazz, Long id){
		T t = findById(clazz, id);
		try{
			manager.getTransaction().begin();
			manager.remove(t);
			manager.getTransaction().commit();
		}catch (Exception e) {
			manager.getTransaction().rollback();
		}
	}
	
	/*
	public void removeAvd(Avd avaliacao) {
		
		manager.getTransaction().begin();
		Query q = manager.createNativeQuery("DELETE FROM avd WHERE id_avd =" + avaliacao.getId());
		q.executeUpdate();
		manager.getTransaction().commit();
		manager.close();
	}
	*/
	
	public List<T> listAll(Class<T> clazz) {

		CriteriaBuilder cb = manager.getCriteriaBuilder();
		CriteriaQuery<T> query = cb.createQuery(clazz);
		Root<T> root = query.from(clazz);
		query = query.select(root);

		return manager.createQuery(query).getResultList();
	}

}
