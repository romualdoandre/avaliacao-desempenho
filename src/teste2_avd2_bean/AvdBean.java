package teste2_avd2_bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import teste2_avd2_dao.DaoGenerico;
import teste2_avd2_model.Avd;

@ManagedBean(name="avdBean")
public class AvdBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Avd avd;
	private DaoGenerico<Avd> daoAvd;
	private Long Id;

	public AvdBean() {
		avd = new Avd();
		daoAvd = new DaoGenerico<Avd>();
	}

	public Avd getAvd() {
		return avd;
	}

	public void setAvd(Avd avd) {
		this.avd = avd;
	}

	public String add() {

		daoAvd.saveOrUpdate(avd);

		return "index.xhtml";
	}

	public String lista() {

		List<Avd> avdList = daoAvd.listAll(Avd.class);

		for(Avd item: avdList) {
			System.out.println(item);
		}

		return null;
	}

	public List<Avd> getListAll(){
		List<Avd> avdList = daoAvd.listAll(Avd.class);

		return avdList;
	}

	public String remove() {

		String string = FacesContext.getCurrentInstance()
				.getExternalContext().getRequestParameterMap().get("id");

		Long id = Long.valueOf(string);


		if(id>0) {

			daoAvd.remove(Avd.class,id);

		}

		return null;
	}

}
