package org.imobilus.Logradouro;

import org.imobilus.Bairros.BairrosEntity;
import org.imobilus.utils.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "tb_logradouro")
@AttributeOverride(name = "id", column = @Column(name = "codigo_logradouro"))
public class LogradouroEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = 1L;

	@Column(name = "nome_logradouro", length = 50, nullable = false)
	private String nomeLogradouro;
	
	@Column(name = "cep_logradouro", length = 8, nullable = false)
	private String cepLogradouro;

	@ManyToOne
	@JoinColumn(name = "codigo_bairro", nullable = false)
	private BairrosEntity bairro;
	
	public LogradouroEntity() {
	
	}

	public LogradouroEntity(String nomeLogradouro, String cepLogradouro, BairrosEntity bairro) {
		this.nomeLogradouro = nomeLogradouro;
		this.cepLogradouro = cepLogradouro;
		this.bairro = bairro;
	}

	public String getNomeLogradouro() {

		return nomeLogradouro;
	}

	public void setNomeLogradouro(String nomeLogradouro) {

	    this.nomeLogradouro = nomeLogradouro;
	}

	public String getCepLogradouro() {

	    return cepLogradouro;
	}

	public void setCepLogradouro(String cepLogradouro) {

	    this.cepLogradouro = cepLogradouro;
	}

	public BairrosEntity getBairro() {

	    return bairro;
	}

	public void setBairro(BairrosEntity bairro) {

	    this.bairro = bairro;
	}
}
