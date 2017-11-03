package org.imobilus.Bairros;

import org.imobilus.Cidade.CidadeEntity;
import org.imobilus.utils.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "tb_bairros")
@AttributeOverride(name = "id", column = @Column(name = "codigo_bairro"))
public class BairrosEntity extends BaseEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Column(name = "nome_bairro", length = 45, nullable = false)
    private String nomeBairro;

    @ManyToOne
    @JoinColumn(name = "codigo_cidade", nullable = false)
    private CidadeEntity cidade;

    public BairrosEntity() {

    }

    public BairrosEntity(String nomeBairro, CidadeEntity cidade) {
        this.nomeBairro = nomeBairro;
        this.cidade = cidade;
    }

    public String getNomeBairro() {
        return nomeBairro;
    }

    public void setNomeBairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }

    public CidadeEntity getCidade() {
        return cidade;
    }

    public void setNomeCidade(CidadeEntity cidade) {
        this.cidade = cidade;
    }

}