package teste2_avd2_testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import teste2_avd2_controller.AutoavController;
import teste2_avd2_controller.AvdController;
import teste2_avd2_model.Autoavaliacao;
import teste2_avd2_model.Avd;
import teste2_avd2_model.Servidor;

public class testaAutoav1 {

	public static void main(String[] args) {
		
		Autoavaliacao autoav = new Autoavaliacao();
		Servidor server1 = new Servidor();
		

		Avd aval1 = new Avd();
		aval1.setAnoAvd(2060);
		
		
		AvdController avdcont = new AvdController();
		aval1 = avdcont.find(aval1);
			
		//autoav.setIdAutoav(11);
		autoav.setAvd(aval1);
		autoav.setServidor(server1);
		autoav.setP01(55);
		autoav.setP02(4);
		autoav.setP03(5);
		autoav.setP04(5);
		autoav.setP05(4);
		autoav.setP06(4);
		autoav.setP07(4);
		autoav.setP08(5);
		autoav.setP09(5);
		autoav.setP10(5);
		autoav.setP11(5);
		autoav.setP12(5);
		
		System.out.println("vc conseguiu inserir dados no banco. ");
		
		AutoavController autoavcon = new AutoavController();
		autoavcon.addAutoav(autoav);
		
	}

}
