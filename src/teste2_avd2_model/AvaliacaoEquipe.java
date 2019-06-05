package teste2_avd2_model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the avaliacao_equipe database table.
 * 
 */
@Entity
@Table(name="avaliacao_equipe")
@NamedQuery(name="AvaliacaoEquipe.findAll", query="SELECT a FROM AvaliacaoEquipe a")
public class AvaliacaoEquipe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_ava_equipe")
	private Integer idAvaEquipe;

	private Integer p01;

	private Integer p02;

	private Integer p03;

	private Integer p04;

	private Integer p05;

	private Integer p06;

	//bi-directional many-to-one association to Avd
	@ManyToOne
	@JoinColumn(name="id_avd")
	private Avd avd;

	//bi-directional many-to-one association to Servidor
	@ManyToOne
	@JoinColumn(name="id_servidor")
	private Servidor servidor;

	public AvaliacaoEquipe() {
	}

	public Integer getIdAvaEquipe() {
		return this.idAvaEquipe;
	}

	public void setIdAvaEquipe(Integer idAvaEquipe) {
		this.idAvaEquipe = idAvaEquipe;
	}

	public Integer getP01() {
		return this.p01;
	}

	public void setP01(Integer p01) {
		this.p01 = p01;
	}

	public Integer getP02() {
		return this.p02;
	}

	public void setP02(Integer p02) {
		this.p02 = p02;
	}

	public Integer getP03() {
		return this.p03;
	}

	public void setP03(Integer p03) {
		this.p03 = p03;
	}

	public Integer getP04() {
		return this.p04;
	}

	public void setP04(Integer p04) {
		this.p04 = p04;
	}

	public Integer getP05() {
		return this.p05;
	}

	public void setP05(Integer p05) {
		this.p05 = p05;
	}

	public Integer getP06() {
		return this.p06;
	}

	public void setP06(Integer p06) {
		this.p06 = p06;
	}

	public Avd getAvd() {
		return this.avd;
	}

	public void setAvd(Avd avd) {
		this.avd = avd;
	}

	public Servidor getServidor() {
		return this.servidor;
	}

	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}

}