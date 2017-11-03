package org.imobilus.Pessoa;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.imobilus.Logradouro.LogradouroEntity;
import org.imobilus.utils.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_pessoa")
@AttributeOverride(name = "id", column = @Column(name = "codigo_pessoa"))
public class PessoaEntity extends BaseEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Column(name = "nome_pessoa", length = 120, nullable = false)
    private String nome;

    @Column(name = "telefone_pessoa", length = 14, nullable = false)
    private String telefone;

    @Column(name = "celular_pessoa", length = 14, nullable = true)
    private String celular;

    @Column(name = "email_pessoa", length = 50, nullable = false)
    private String email;

    @JsonFormat(pattern = "dd-MM-yyyy")
    @Column(name = "nascimento_pessoa", nullable = false)
    private Date nascimento;

    @Column(name = "cpf_pessoa", length = 11, nullable = true)
    private String cpf;

    @Column(name = "rg_pessoa", length = 20, nullable = true)
    private String rg;

    @Column(name = "numeroend_pessoa", nullable = false)
    private Long numeroCasa;

    @Column(name = "complementoend_pessoa", length = 50, nullable = false)
    private String complementoCasa;

    @ManyToOne
    @JoinColumn(name = "codigo_logradouro")
    private LogradouroEntity logradouro;

    public PessoaEntity() {

    }

    public PessoaEntity(String nome, String telefone, String celular, String email, Date nascimento, String cpf, String rg, Long numeroCasa, String complementoCasa, LogradouroEntity logradouro) {
        this.nome = nome;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.numeroCasa = numeroCasa;
        this.complementoCasa = complementoCasa;
        this.logradouro = logradouro;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getTelefone() {

        return telefone;
    }

    public void setTelefone(String telefone) {

        this.telefone = telefone;
    }

    public String getCelular() {

        return celular;
    }

    public void setCelular(String celular) {

        this.celular = celular;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public Date getNascimento() {

        return nascimento;
    }

    public void setNascimento(Date nascimento) {

        this.nascimento = nascimento;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public String getRg() {

        return rg;
    }

    public void setRg(String rg) {

        this.rg = rg;
    }

    public Long getNumeroCasa() {

        return numeroCasa;
    }

    public void setNumeroCasa(Long numeroCasa) {

        this.numeroCasa = numeroCasa;
    }

    public String getComplementoCasa() {

        return complementoCasa;
    }

    public void setComplementoCasa(String complementoCasa) {

        this.complementoCasa = complementoCasa;
    }

    public LogradouroEntity getLogradouro() {

        return logradouro;
    }

    public void setLogradouro(LogradouroEntity logradouro) {

        this.logradouro = logradouro;
    }
}
