package teste2_avd2_bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;



import teste2_avd2_dao.DaoGenerico;
import teste2_avd2_model.Avd;

@ManagedBean(name="avdBean")

public class AvdBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Avd avd;
	
	public AvdBean() {
		avd = new Avd();
	}

	public Avd getAvd() {
		return avd;
	}

	public void setAvd(Avd avd) {
		this.avd = avd;
	}

	public String add() {
		
		
		DaoGenerico<Avd> daoAvd = new DaoGenerico<Avd>();
		
		daoAvd.saveOrUpdate(avd);
		
		return "index.xhtml";
	}
	public String exibe() {
		return "Valor adicionado";
	}
	
}
