package org.imobilus.Cidade;



import org.imobilus.Estados.EstadosEntity;
import org.imobilus.utils.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "tb_cidade")
@AttributeOverride(name = "id", column = @Column(name = "codigo_cidade"))
public class CidadeEntity extends BaseEntity<Long> {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nome_cidade", length = 50, nullable = false)
	private String nomeCidade;
	
	@ManyToOne
	@JoinColumn (name = "codigo_uf", nullable = false)
	private EstadosEntity estado;
	
	public CidadeEntity() {

	}

	public CidadeEntity(String nomeCidade, EstadosEntity estado) {
		this.nomeCidade = nomeCidade;
		this.estado = estado;
	}

	public String getNomecidade() {

		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {

		this.nomeCidade = nomeCidade;
	}

	public EstadosEntity getEstado() {

		return estado;
	}

	public void setEstado(EstadosEntity estado) {

		this.estado = estado;
	}
	
}
