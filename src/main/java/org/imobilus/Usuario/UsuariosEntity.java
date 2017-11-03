package org.imobilus.Usuario;

import org.imobilus.Pessoa.PessoaEntity;
import org.imobilus.utils.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "tb_usuarios")
@AttributeOverride(name = "id", column = @Column(name = "codigo_usuario"))
public class UsuariosEntity extends BaseEntity<Long> {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nome_usuario", length = 50, nullable = false)
	private String nome;
	
	@Column(name = "senha_usuario", length = 45, nullable = false)
	private String senha;
	
	@Column(name = "acesso_usuario", nullable = false)
	private int nivelAcesso;

	@OneToOne
	@JoinColumn (name = "codigo_pessoa")
	private PessoaEntity pessoa;
		
	public UsuariosEntity() {
		
	}

	public UsuariosEntity(String nome, String senha, int nivelAcesso) {
		this.nome = nome;
		this.senha = senha;
		this.nivelAcesso = nivelAcesso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(int nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

	
}
