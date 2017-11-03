package org.imobilus.Estados;

import org.imobilus.utils.BaseEntity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_uf")
@AttributeOverride(name = "id", column = @Column(name = "codigo_uf"))
public class EstadosEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "sigla_uf", length = 2, nullable = false)
	private String siglaEstado;
	
	@Column(name = "nome_uf", length = 45, nullable = false)
	private String nomeEstado;

	public EstadosEntity() {
		
	}

	public EstadosEntity(String siglaEstado, String nomeEstado) {
		this.siglaEstado = siglaEstado;
		this.nomeEstado = nomeEstado;
	}

	public String getSiglaEstado() {

		return siglaEstado;
	}

	public void setSiglaEstado(String siglaEstado) {

		this.siglaEstado = siglaEstado;
	}

	public String getNomeEstado() {

		return nomeEstado;
	}

	public void setNomeEstado(String nomeEstado) {

		this.nomeEstado = nomeEstado;
	}
		
}
