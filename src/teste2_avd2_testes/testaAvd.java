package teste2_avd2_testes;

import teste2_avd2_controller.AvdController;
import teste2_avd2_model.Avd;

public class testaAvd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Avd aval = new Avd();
		
		aval.setAnoAvd(2090);
		
		AvdController avdcon = new AvdController();
		avdcon.addAvd(aval);
			
	}

}
