package org.imobilus.TipoImovel;


import org.imobilus.utils.BaseEntity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tipo_imovel")
@AttributeOverride(name = "id", column = @Column(name = "codigo_tipoImovel"))
public class TipoImovelEntity extends BaseEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Column(name = "nome_tipoImovel", length = 30, nullable = false)
    private String tipoImovel;

    public TipoImovelEntity() {

    }

    public TipoImovelEntity(String tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public String getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(String tipoImovel) {
        this.tipoImovel = tipoImovel;
    }
}
