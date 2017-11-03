package org.imobilus.ComentariosPessoa;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.imobilus.Pessoa.PessoaEntity;
import org.imobilus.utils.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_comentarios_pessoa")
@AttributeOverride(name = "id", column = @Column(name = "codigo_comentario"))
public class ComentariosPessoaEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "conteudo_comentario", length = 255, nullable = false)
	private String conteudoComentario;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	@Column(name = "data_comentario", nullable = false)
	private Date dataComentario;

	@ManyToOne
	@JoinColumn(name = "codigo_pessoa")
	private PessoaEntity pessoa;
	
	@ManyToOne
	@JoinColumn(name = "codigo_comentarioPai")
	private ComentariosPessoaEntity comentarioPai;
	
	public ComentariosPessoaEntity() {
		
	}

	public ComentariosPessoaEntity(String conteudoComentario, Date dataComentario, PessoaEntity pessoa, ComentariosPessoaEntity comentarioPai) {
		this.conteudoComentario = conteudoComentario;
		this.dataComentario = dataComentario;
		this.pessoa = pessoa;
		this.comentarioPai = comentarioPai;
	}

	public String getConteudoComentario() {

		return conteudoComentario;
	}

	public void setConteudoComentario(String conteudoComentario) {

	    this.conteudoComentario = conteudoComentario;
	}

	public Date getDataComentario() {

	    return dataComentario;
	}

	public void setDataComentario(Date dataComentario) {

	    this.dataComentario = dataComentario;
	}

	public PessoaEntity getPessoa() {

	    return pessoa;
	}

	public void setPessoa(PessoaEntity pessoa) {

	    this.pessoa = pessoa;
	}

	public ComentariosPessoaEntity getComentarioPai() {

	    return comentarioPai;
	}

	public void setComentarioPai(ComentariosPessoaEntity comentarioPai) {

	    this.comentarioPai = comentarioPai;
	}

}
