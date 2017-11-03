package org.imobilus.Permissao;

import org.imobilus.utils.BaseEntity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_permissao")
@AttributeOverride(name = "id", column = @Column(name = "codigo_permissao"))
public class PermissaoEntity extends BaseEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Column(name="nivel_permissao",nullable = false, length = 45)
    private String nivelPermissao;

    public PermissaoEntity() {

    }

    public PermissaoEntity(String nivelPermissao) {
        this.nivelPermissao = nivelPermissao;
    }

    public String getNivelPermissao() {
        return nivelPermissao;
    }

    public void setNivelPermissao(String nivelPermissao) {
        this.nivelPermissao = nivelPermissao;
    }
}
