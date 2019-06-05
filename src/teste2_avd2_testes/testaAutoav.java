package teste2_avd2_testes;


import teste2_avd2_dao.DaoGenerico;
import teste2_avd2_model.Avd;


public class testaAutoav {

	public static void main(String[] args) {
		
		Avd avd = new Avd();
		
		 DaoGenerico<Avd> daoAvd = new DaoGenerico<Avd>();
		 
		 avd.setAno(2000);
		 
		 daoAvd.saveOrUpdate(avd);
		 
		 
		 /* DaoGenerico<Autoavaliacao> daoAutoavaliacao = new DaoGenerico<Autoavaliacao>();
		 
		 Avd avd = daoAvd.findById(Avd.class, 3L);
		  Autoavaliacao autoavaliacao = daoAutoavaliacao.findById(Autoavaliacao.class, 3L);
		 
		 System.out.println("### Entidade Avaliacao encontrada ###");
		 System.out.println("ID: " + avd.getId());
		 System.out.println("ANO: " + avd.getAnoAvd());
		 
		 System.out.println("");
		 
		 System.out.println("### Entidade Autoavaliacao encontrada ###");
		 System.out.println("ID: " + autoavaliacao.getId());
		 System.out.println("Resposta:" + autoavaliacao.getP12());	
		
		*/
		 
		 /*
		Autoavaliacao autoav = new Autoavaliacao();
		Servidor server1 = new Servidor();
		server1.setId(14);

		Avd aval1 = new Avd();
		aval1.setId(8);
		
		AvdController avdcont = new AvdController();
		aval1 = avdcont.find(aval1);

		//autoav.setIdAutoav(11);
		autoav.setAvd(aval1);
		autoav.setServidor(server1);
		autoav.setP01(555);
		autoav.setP02(45);
		autoav.setP03(55);
		autoav.setP04(55);
		autoav.setP05(45);
		autoav.setP06(45);
		autoav.setP07(54);
		autoav.setP08(55);
		autoav.setP09(5);
		autoav.setP10(5);
		autoav.setP11(5);
		autoav.setP12(5);
		//autoav.setComentario("");
		
		AutoavController autoavcon = new AutoavController();
		autoavcon.addAutoav(autoav);

	*/
	}

}
