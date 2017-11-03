package org.imobilus.Imagem;


import org.imobilus.Imovel.ImovelEntity;
import org.imobilus.utils.BaseEntity;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Table(name = "tb_imagem")
@AttributeOverride(name = "id", column = @Column(name = "codigo_imagem"))
public class ImagemEntity extends BaseEntity<Long> {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "arquivo_imagem", nullable = false)
	public Blob imagem;

	@ManyToOne
	@JoinColumn(name = "codigo_imovel")
	public ImovelEntity imovel;

	public ImagemEntity() {

	}

	public ImagemEntity(Blob imagem, ImovelEntity imovel) {
		this.imagem = imagem;
		this.imovel = imovel;
	}

	public Blob getImagem() {
		return imagem;
	}

	public void setImagem(Blob imagem) {
		this.imagem = imagem;
	}

	public ImovelEntity getImovel() {
		return imovel;
	}

	public void setImovel(ImovelEntity imovel) {
		this.imovel = imovel;
	}
}
