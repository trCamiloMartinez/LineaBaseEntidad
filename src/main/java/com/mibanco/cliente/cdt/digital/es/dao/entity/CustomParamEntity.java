package com.mibanco.cliente.cdt.digital.es.dao.entity;

import javax.persistence.*;
@Entity
@Table(name = "custom_param")
public class CustomParamEntity {
    private Long id;
    private String nombreCustomParam;

    /*@Id
    @SequenceGenerator(name = "customParamSeq", sequenceName = "custom_param_id_seq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "customParamSeq")*/
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCustomParam() {
        return nombreCustomParam;
    }

    public void setNombreCustomParam(String nombreCustomParam) {
        this.nombreCustomParam = nombreCustomParam;
    }
}
