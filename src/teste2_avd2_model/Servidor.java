package teste2_avd2_model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the servidor database table.
 * 
 */
@Entity
@NamedQuery(name="Servidor.findAll", query="SELECT s FROM Servidor s")
public class Servidor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SERVIDOR_ID_GENERATOR", sequenceName="SERVIDOR_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SERVIDOR_ID_GENERATOR")
	private Integer id;

	@Column(name="id_chefe")
	private Integer idChefe;

	@Column(name="id_servidor")
	private Integer idServidor;

	//bi-directional many-to-one association to Autoavaliacao
	@OneToMany(mappedBy="servidor")
	private List<Autoavaliacao> autoavaliacaos;

	//bi-directional many-to-one association to AvaliacaoChefia
	@OneToMany(mappedBy="servidor")
	private List<AvaliacaoChefia> avaliacaoChefias;

	//bi-directional many-to-one association to AvaliacaoEquipe
	@OneToMany(mappedBy="servidor")
	private List<AvaliacaoEquipe> avaliacaoEquipes;

	//bi-directional many-to-one association to Avd
	@ManyToOne
	@JoinColumn(name="id_avd")
	private Avd avd;

	public Servidor() {
	
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdChefe() {
		return this.idChefe;
	}

	public void setIdChefe(Integer idChefe) {
		this.idChefe = idChefe;
	}

	public Integer getIdServidor() {
		return this.idServidor;
	}

	public void setIdServidor(Integer idServidor) {
		this.idServidor = idServidor;
	}

	public List<Autoavaliacao> getAutoavaliacaos() {
		return this.autoavaliacaos;
	}

	public void setAutoavaliacaos(List<Autoavaliacao> autoavaliacaos) {
		this.autoavaliacaos = autoavaliacaos;
	}

	public Autoavaliacao addAutoavaliacao(Autoavaliacao autoavaliacao) {
		getAutoavaliacaos().add(autoavaliacao);
		autoavaliacao.setServidor(this);

		return autoavaliacao;
	}

	public Autoavaliacao removeAutoavaliacao(Autoavaliacao autoavaliacao) {
		getAutoavaliacaos().remove(autoavaliacao);
		autoavaliacao.setServidor(null);

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
		avaliacaoChefia.setServidor(this);

		return avaliacaoChefia;
	}

	public AvaliacaoChefia removeAvaliacaoChefia(AvaliacaoChefia avaliacaoChefia) {
		getAvaliacaoChefias().remove(avaliacaoChefia);
		avaliacaoChefia.setServidor(null);

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
		avaliacaoEquipe.setServidor(this);

		return avaliacaoEquipe;
	}

	public AvaliacaoEquipe removeAvaliacaoEquipe(AvaliacaoEquipe avaliacaoEquipe) {
		getAvaliacaoEquipes().remove(avaliacaoEquipe);
		avaliacaoEquipe.setServidor(null);

		return avaliacaoEquipe;
	}

	public Avd getAvd() {
		return this.avd;
	}

	public void setAvd(Avd avd) {
		this.avd = avd;
	}

}