package org.imobilus.Mensagens;

import org.imobilus.Pessoa.PessoaEntity;
import org.imobilus.utils.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "tb_mensagens")
@AttributeOverride(name = "id", column = @Column(name = "codigo_mensagem"))
public class MensagensEntity extends BaseEntity<Long> {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "assunto_mensagem", length = 30, nullable = false)
	private String assunto;
	
	@Column(name = "corpo_mensagem", length = 2000, nullable = false)
	private String corpo;
	
	@Column(name = "status_mensagem")
	private boolean status;

	@ManyToOne
	@JoinColumn (name = "codigo_mensagemPai")
	private MensagensEntity mensagemPai;
	
	@ManyToOne
	@JoinColumn(name = "codigo_pRemetente")
	private PessoaEntity remetente;

	@ManyToOne
	@JoinColumn(name = "codigo_pDestinatario")
	private PessoaEntity destinatario;
	
	public MensagensEntity() {
	
	}

	public MensagensEntity(String assunto, String corpo, boolean status, MensagensEntity mensagemPai, PessoaEntity remetente, PessoaEntity destinatario) {
		this.assunto = assunto;
		this.corpo = corpo;
		this.status = status;
		this.mensagemPai = mensagemPai;
		this.remetente = remetente;
		this.destinatario = destinatario;
	}

	public String getAssunto() {

		return assunto;
	}

	public void setAssunto(String assunto) {

		this.assunto = assunto;
	}

	public String getCorpo() {

		return corpo;
	}

	public void setCorpo(String corpo) {

		this.corpo = corpo;
	}

	public boolean isStatus() {

		return status;
	}

	public void setStatus(boolean status) {

		this.status = status;
	}

	public MensagensEntity getMensagemPai() {

		return mensagemPai;
	}

	public void setMensagemPai(MensagensEntity mensagemPai) {

		this.mensagemPai = mensagemPai;
	}

	public PessoaEntity getRemetente() {

		return remetente;
	}

	public void setRemetente(PessoaEntity remetente) {

		this.remetente = remetente;
	}

	public PessoaEntity getDestinatario() {

		return destinatario;
	}

	public void setDestinatario(PessoaEntity destinatario) {

		this.destinatario = destinatario;
	}	
	
}
