package org.imobilus.TipoNegocio;


import org.imobilus.utils.BaseEntity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tipo_negocio")
@AttributeOverride(name = "id", column = @Column(name = "codigo_tipoNegocio"))
public class TipoNegocioEntity extends BaseEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Column(name = "nome_tipoNegocio", length = 30, nullable = false)
    private String tipoNegocio;


    public TipoNegocioEntity(){

    }

    public TipoNegocioEntity(String tipoNegocio) {

        this.tipoNegocio = tipoNegocio;
    }

    public String getTipoNegocio() {

        return tipoNegocio;
    }

    public void setTipoNegocio(String tipoNegocio) {

        this.tipoNegocio = tipoNegocio;
    }
}
