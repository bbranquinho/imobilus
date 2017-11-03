package org.imobilus.Caracteristicas;


import org.imobilus.utils.BaseEntity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_caracteristicas")
@AttributeOverride(name = "id", column = @Column(name = "codigo_caracteristica"))
public class CaracteristicasEntity extends BaseEntity<Long> {
	
	private static final long serialVersionUID = 1L;

	@Column(name = "pPiscina", nullable = true)
	private boolean piscina;
	
	@Column(name = "pChurrasqueira", nullable = true)
	private boolean churrasqueira;
	
	@Column(name = "pSalao", nullable = true)
	private boolean salao;
	
	@Column(name = "pQuadra", nullable = true)
	private boolean quadra;
	
	@Column(name = "pQuadraTenis", nullable = true)
	private boolean quadraTenis;

	public CaracteristicasEntity() {

	}

	public CaracteristicasEntity(boolean piscina, boolean churrasqueira, boolean salao, boolean quadra, boolean quadraTenis) {
		this.piscina = piscina;
		this.churrasqueira = churrasqueira;
		this.salao = salao;
		this.quadra = quadra;
		this.quadraTenis = quadraTenis;
	}

	public boolean isPiscina() {
		return piscina;
	}

	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}

	public boolean isChurrasqueira() {
		return churrasqueira;
	}

	public void setChurrasqueira(boolean churrasqueira) {
		this.churrasqueira = churrasqueira;
	}

	public boolean isSalao() {
		return salao;
	}

	public void setSalao(boolean salao) {
		this.salao = salao;
	}

	public boolean isQuadra() {
		return quadra;
	}

	public void setQuadra(boolean quadra) {
		this.quadra = quadra;
	}

	public boolean isQuadraTenis() {
		return quadraTenis;
	}

	public void setQuadraTenis(boolean quadraTenis) {
		this.quadraTenis = quadraTenis;
	}
	
}
