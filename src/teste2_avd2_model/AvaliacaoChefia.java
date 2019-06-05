package teste2_avd2_model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the avaliacao_chefia database table.
 * 
 */
@Entity
@Table(name="avaliacao_chefia")
@NamedQuery(name="AvaliacaoChefia.findAll", query="SELECT a FROM AvaliacaoChefia a")
public class AvaliacaoChefia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_avaliacao_chefia")
	private Integer idAvaliacaoChefia;

	//private String comentario;

	@Column(name="id_chefe")
	private Integer idChefe;

	private Integer p01;

	private Integer p02;

	private Integer p03;

	private Integer p04;

	private Integer p05;

	private Integer p06;

	private Integer p07;

	private Integer p08;

	private Integer p09;

	private Integer p10;

	private Integer p11;

	private Integer p12;

	//bi-directional many-to-one association to Avd
	@ManyToOne
	@JoinColumn(name="id_avd")
	private Avd avd;

	//bi-directional many-to-one association to Servidor
	@ManyToOne
	@JoinColumn(name="id_avaliado")
	private Servidor servidor;

	public AvaliacaoChefia() {
	}

	public Integer getIdAvaliacaoChefia() {
		return this.idAvaliacaoChefia;
	}

	public void setIdAvaliacaoChefia(Integer idAvaliacaoChefia) {
		this.idAvaliacaoChefia = idAvaliacaoChefia;
	}

	/*public String getComentario() {
		return this.comentario;
	}*/

	/*public void setComentario(String comentario) {
		this.comentario = comentario;
	}*/

	public Integer getIdChefe() {
		return this.idChefe;
	}

	public void setIdChefe(Integer idChefe) {
		this.idChefe = idChefe;
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

	public Integer getP07() {
		return this.p07;
	}

	public void setP07(Integer p07) {
		this.p07 = p07;
	}

	public Integer getP08() {
		return this.p08;
	}

	public void setP08(Integer p08) {
		this.p08 = p08;
	}

	public Integer getP09() {
		return this.p09;
	}

	public void setP09(Integer p09) {
		this.p09 = p09;
	}

	public Integer getP10() {
		return this.p10;
	}

	public void setP10(Integer p10) {
		this.p10 = p10;
	}

	public Integer getP11() {
		return this.p11;
	}

	public void setP11(Integer p11) {
		this.p11 = p11;
	}

	public Integer getP12() {
		return this.p12;
	}

	public void setP12(Integer p12) {
		this.p12 = p12;
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