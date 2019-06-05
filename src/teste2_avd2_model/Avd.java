package teste2_avd2_model;

import javax.faces.bean.ManagedBean;
import javax.persistence.*;


/**
 * The persistent class for the avd database table.
 * 
 */
@SuppressWarnings("deprecation")
@ManagedBean
@Entity
@NamedQuery(name="Avd.findAll", query="SELECT a FROM Avd a")
public class Avd implements EntidadeBase {


	@Id
	@SequenceGenerator(name = "AVD_IDAVD_GENERATOR", sequenceName="AVD_ID_AVD_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AVD_IDAVD_GENERATOR")
	@Column(name="id_avd")
	private Long id;

	@Column(name="ano_avd")
	private Integer anoAvd;
	
	/*
	//bi-directional many-to-one association to Autoavaliacao
	@OneToMany(mappedBy="avd")
	private List<Autoavaliacao> autoavaliacaos;

	//bi-directional many-to-one association to AvaliacaoChefia
	@OneToMany(mappedBy="avd")
	private List<AvaliacaoChefia> avaliacaoChefias;

	//bi-directional many-to-one association to AvaliacaoEquipe
	@OneToMany(mappedBy="avd")
	private List<AvaliacaoEquipe> avaliacaoEquipes;

	//bi-directional many-to-one association to Servidor
	@OneToMany(mappedBy="avd")
	private List<Servidor> servidors;
	*/
	public Avd() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAnoAvd() {
		return this.anoAvd;
	}

	public void setAnoAvd(Integer anoAvd) {
		this.anoAvd = anoAvd;
	}
	/*
	public List<Autoavaliacao> getAutoavaliacaos() {
		return this.autoavaliacaos;
	}

	public void setAutoavaliacaos(List<Autoavaliacao> autoavaliacaos) {
		this.autoavaliacaos = autoavaliacaos;
	}
	*/
	/*
	public Autoavaliacao addAutoavaliacao(Autoavaliacao autoavaliacao) {
		getAutoavaliacaos().add(autoavaliacao);
		autoavaliacao.setAvd(this);

		return autoavaliacao;
	}
	*/
	/*
	public Autoavaliacao removeAutoavaliacao(Autoavaliacao autoavaliacao) {
		getAutoavaliacaos().remove(autoavaliacao);
		autoavaliacao.setAvd(null);

		return autoavaliacao;
	}

	public List<AvaliacaoChefia> getAvaliacaoChefias() {
		return this.avaliacaoChefias;
	}

	public void setAvaliacaoChefias(List<AvaliacaoChefia> avaliacaoChefias) {
		this.avaliacaoChefias = avaliacaoChefias;
	}
	
	public AvaliacaoChefia addAvaliacaoChefia(AvaliacaoChefia avaliacaoChefia) {
		getAvaliacaoChefias().add(avaliacaoChefia);
		avaliacaoChefia.setAvd(this);

		return avaliacaoChefia;
	}

	public AvaliacaoChefia removeAvaliacaoChefia(AvaliacaoChefia avaliacaoChefia) {
		getAvaliacaoChefias().remove(avaliacaoChefia);
		avaliacaoChefia.setAvd(null);

		return avaliacaoChefia;
	}

	public List<AvaliacaoEquipe> getAvaliacaoEquipes() {
		return this.avaliacaoEquipes;
	}

	public void setAvaliacaoEquipes(List<AvaliacaoEquipe> avaliacaoEquipes) {
		this.avaliacaoEquipes = avaliacaoEquipes;
	}

	public AvaliacaoEquipe addAvaliacaoEquipe(AvaliacaoEquipe avaliacaoEquipe) {
		getAvaliacaoEquipes().add(avaliacaoEquipe);
		avaliacaoEquipe.setAvd(this);

		return avaliacaoEquipe;
	}

	public AvaliacaoEquipe removeAvaliacaoEquipe(AvaliacaoEquipe avaliacaoEquipe) {
		getAvaliacaoEquipes().remove(avaliacaoEquipe);
		avaliacaoEquipe.setAvd(null);

		return avaliacaoEquipe;
	}

	public List<Servidor> getServidors() {
		return this.servidors;
	}

	public void setServidors(List<Servidor> servidors) {
		this.servidors = servidors;
	}

	public Servidor addServidor(Servidor servidor) {
		getServidors().add(servidor);
		servidor.setAvd(this);

		return servidor;
	}

	public Servidor removeServidor(Servidor servidor) {
		getServidors().remove(servidor);
		servidor.setAvd(null);

		return servidor;
	}
*/
}