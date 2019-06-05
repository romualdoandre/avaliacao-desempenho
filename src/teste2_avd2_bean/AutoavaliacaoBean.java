package teste2_avd2_bean;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;

import teste2_avd2_dao.DaoGenerico;
import teste2_avd2_model.Avd;

@ManagedBean
@ViewScoped
public class AutoavaliacaoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	
	
	DaoGenerico<Avd> daoAvd = new DaoGenerico<Avd>();
	 
	//Avd avd = new Avd();
	
	//avd = daoAvd.findById(Avd.class, 3L);
	
	
	
	
	
	
}
