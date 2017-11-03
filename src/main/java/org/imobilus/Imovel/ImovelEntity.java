package org.imobilus.Imovel;


import org.imobilus.Caracteristicas.CaracteristicasEntity;
import org.imobilus.Logradouro.LogradouroEntity;
import org.imobilus.Pessoa.PessoaEntity;
import org.imobilus.TipoImovel.TipoImovelEntity;
import org.imobilus.TipoNegocio.TipoNegocioEntity;
import org.imobilus.utils.BaseEntity;

import javax.persistence.*;


@Entity
@Table(name = "tb_imovel")
@AttributeOverride(name = "id", column = @Column(name = "codigo_imovel"))
public class ImovelEntity extends BaseEntity<Long> {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "area_construida", nullable = false)
	private double areaContruida;
	
	@Column(name = "area_total", nullable = false)
	private double areaTotal;
	
	@Column(name = "descricao_imovel", length = 255, nullable = false)
	private String descricaoImovel;
	
	@Column(name = "quartos_imovel", nullable = false)
	private int quartosImovel;
	
	@Column(name = "suites_imovel", nullable = true)
	private int suitesImovel;

	@Column(name = "banheiros_imovel", nullable = false)
	private int banheirosImovel;
	
	@Column(name = "vagas_imovel", nullable = false)
	private int vagasGaragem;
	
	@Column(name = "valor_imovel", nullable = false)
	private double valor;

	@Column(name="latitude_imovel")
	private String latitude;

	@Column(name="longitude_imovel")
	private String longitude;

	@Column(name = "numeroend_imovel", nullable = false)
	private int numeroImovel;

	@Column(name = "complementoend_imovel", nullable = false)
	private int complementoImovel;

	@OneToOne
	@JoinColumn (name = "codigo_caracteristicas")
	private CaracteristicasEntity caracteristicas;
	
	@ManyToOne
	@JoinColumn(name = "codigo_pessoa")
	private PessoaEntity pessoa;

	@OneToOne
	@JoinColumn(name = "codigo_tipoNegocio")
	private TipoNegocioEntity tipoNegocio;

	@OneToOne
	@JoinColumn(name = "codigo_tipoImovel")
	private TipoImovelEntity tipoImovel;

	@ManyToOne
	@JoinColumn(name = "codigo_logradouro")
	private LogradouroEntity logradouro;
		
	public ImovelEntity(){
		
	}

	public ImovelEntity(double areaContruida, double areaTotal, String descricaoImovel, int quartosImovel, int suitesImovel, int banheirosImovel, int vagasGaragem, double valor, String latitude, String longitude, int numeroImovel, int complementoImovel, CaracteristicasEntity caracteristicas, PessoaEntity pessoa, TipoNegocioEntity tipoNegocio, TipoImovelEntity tipoImovel, LogradouroEntity logradouro) {
		this.areaContruida = areaContruida;
		this.areaTotal = areaTotal;
		this.descricaoImovel = descricaoImovel;
		this.quartosImovel = quartosImovel;
		this.suitesImovel = suitesImovel;
		this.banheirosImovel = banheirosImovel;
		this.vagasGaragem = vagasGaragem;
		this.valor = valor;
		this.latitude = latitude;
		this.longitude = longitude;
		this.numeroImovel = numeroImovel;
		this.complementoImovel = complementoImovel;
		this.caracteristicas = caracteristicas;
		this.pessoa = pessoa;
		this.tipoNegocio = tipoNegocio;
		this.tipoImovel = tipoImovel;
		this.logradouro = logradouro;
	}

	public double getAreaContruida() {
		return areaContruida;
	}

	public void setAreaContruida(double areaContruida) {
		this.areaContruida = areaContruida;
	}

	public double getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}

	public String getDescricaoImovel() {
		return descricaoImovel;
	}

	public void setDescricaoImovel(String descricaoImovel) {
		this.descricaoImovel = descricaoImovel;
	}

	public int getQuartosImovel() {
		return quartosImovel;
	}

	public void setQuartosImovel(int quartosImovel) {
		this.quartosImovel = quartosImovel;
	}

	public int getSuitesImovel() {
		return suitesImovel;
	}

	public void setSuitesImovel(int suitesImovel) {
		this.suitesImovel = suitesImovel;
	}

	public int getBanheirosImovel() {
		return banheirosImovel;
	}

	public void setBanheirosImovel(int banheirosImovel) {
		this.banheirosImovel = banheirosImovel;
	}

	public int getVagasGaragem() {
		return vagasGaragem;
	}

	public void setVagasGaragem(int vagasGaragem) {
		this.vagasGaragem = vagasGaragem;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public int getNumeroImovel() {
		return numeroImovel;
	}

	public void setNumeroImovel(int numeroImovel) {
		this.numeroImovel = numeroImovel;
	}

	public int getComplementoImovel() {
		return complementoImovel;
	}

	public void setComplementoImovel(int complementoImovel) {
		this.complementoImovel = complementoImovel;
	}

	public CaracteristicasEntity getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(CaracteristicasEntity caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public PessoaEntity getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaEntity pessoa) {
		this.pessoa = pessoa;
	}

	public TipoNegocioEntity getTipoNegocio() {
		return tipoNegocio;
	}

	public void setTipoNegocio(TipoNegocioEntity tipoNegocio) {
		this.tipoNegocio = tipoNegocio;
	}

	public TipoImovelEntity getTipoImovel() {
		return tipoImovel;
	}

	public void setTipoImovel(TipoImovelEntity tipoImovel) {
		this.tipoImovel = tipoImovel;
	}

	public LogradouroEntity getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(LogradouroEntity logradouro) {
		this.logradouro = logradouro;
	}
}
