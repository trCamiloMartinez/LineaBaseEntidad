package com.mibanco.cliente.cdt.digital.es.dao.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Entity
@Table(name = "cliente_base")
public class ClienteBaseEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Integer numeroCliente;
    private String tipoPersona;
    private String tipoDocumento;
    private Integer numeroDocumento;
    private LocalDate fechaExpedicionDocumento;
    private String primerNombre;
    private Integer numeroCelular;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String correoElectronico;
    @OneToMany(mappedBy = "clienteBase", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ElementCollection
    private List<ClienteCDTDigitalEntity> clienteCDTDigitalEntityList;

    public ClienteBaseEntity() {

    }
    public ClienteBaseEntity(Long id, Integer numeroCliente, String tipoPersona, String tipoDocumento, Integer numeroDocumento, LocalDate fechaExpedicionDocumento, String primerNombre, Integer numeroCelular, String segundoNombre, String primerApellido, String segundoApellido, String correoElectronico, List<ClienteCDTDigitalEntity> clienteCDTDigitalEntityList) {
        this.id = id;
        this.numeroCliente = numeroCliente;
        this.tipoPersona = tipoPersona;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.fechaExpedicionDocumento = fechaExpedicionDocumento;
        this.primerNombre = primerNombre;
        this.numeroCelular = numeroCelular;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.correoElectronico = correoElectronico;
        this.clienteCDTDigitalEntityList = clienteCDTDigitalEntityList;
    }

    /*@Id
        @SequenceGenerator(name = "clienteBaseSeq", sequenceName = "cliente_base_id_seq", allocationSize = 1, initialValue = 1)
        @GeneratedValue(generator = "clienteBaseSeq")*/

    //@Id
    //@GeneratedValue(strategy= GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public List<ClienteCDTDigitalEntity> getClienteCDTDigitalEntityList() {
        return clienteCDTDigitalEntityList;
    }

    public void setClienteCDTDigitalEntityList(List<ClienteCDTDigitalEntity> clienteCDTDigitalEntityList) {
        this.clienteCDTDigitalEntityList = clienteCDTDigitalEntityList;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Integer getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Integer numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public LocalDate getFechaExpedicionDocumento() {
        return fechaExpedicionDocumento;
    }

    public void setFechaExpedicionDocumento(LocalDate fechaExpedicionDocumento) {
        this.fechaExpedicionDocumento = fechaExpedicionDocumento;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public Integer getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(Integer numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
