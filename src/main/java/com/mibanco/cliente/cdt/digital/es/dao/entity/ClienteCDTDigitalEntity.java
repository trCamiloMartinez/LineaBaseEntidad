package com.mibanco.cliente.cdt.digital.es.dao.entity;

import com.mibanco.cliente.cdt.digital.es.gen.type.ClienteBaseType;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "cliente_cdt_digital")
public class ClienteCDTDigitalEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String tipoTelefonoPrincipal;
    private Integer telefonoPrincipal;
    private String tipoCorreoElectronico;
    private String genero;
    private Integer fechaNacimientoDia;
    private Integer fechaNacimientoMes;
    private Integer fechaNacimientoAno;
    private String lugarNacimientoPais;
    private String lugarNacimientoDpto;
    private String lugarNacimientoCiudad;
    private String nacionalidad;
    private Integer nivelConsulta;
    private Integer fechaExpedicionDocumentoDia;
    private Integer fechaExpedicionDocumentoMes;
    private Integer fechaExpedicionDocumentoAno;
    private String expedicionDocumentoPais;
    private String expedicionDocumentoDpto;
    private String expedicionDocumentoCiudad;
    private String paisResidencia;
    private String subActividadEconomica;
    private String ocupacion;
    private String actividadEconomicaCIIU;
    private String sectorEconomico;
    private Boolean registroBiometria;
    private Integer causalNoBiometria;
    private String direccionPersonal;
    private String direccionPersonalPais;
    private String direccionPersonalDpto;
    private String direccionPersonalCiudad;
    private String barrioDireccionPersonal;
    private String usoDireccionPersonal;
    private String tipoDireccionPersonal;
    private String categoriaDireccionPersonal;
    private String envioCorrespondencia;
    private Float ingresosMensuales;
    private Float patrimonio;
    private String declaracionOrigenFondos;
    private Boolean reconocimientoPublicoExtranjero;
    private Boolean reconocimientoPublicoNacional;
    private String segmento;
    private String nicho;
    private String canalContactoPreferido;
    private Integer asesorComercial;
    private String tipoVinculacion;
    private String porqueMedioSeEnteroDeNosotros;
    private Integer agenciaVinculacion;
    private Integer fechaDiligenciamientoFormularioDia;
    private Integer fechaDiligenciamientoFormularioMes;
    private Integer fechaDiligenciamientoFormularioAno;
    private Integer fechaVinculacionDia;
    private Integer fechaVinculacionMes;
    private Integer fechaVinculacionAno;
    private String lugarDiligenciamientoFormularioPais;
    private String lugarDiligenciamientoFormularioDpto;
    private String lugarDiligenciamientoFormularioCiudad;
    private Boolean residenteFiscalEnOtroPais;
    private Integer identificacionFiscal1;
    private Boolean direccionExtranjero;
    private Integer tin1;
    private String residenciaFiscalPais;
    private String clasificacionFatca;
    private LocalDate fechaClasificacionFatca;
    private String clasificacionCRS;
    private LocalDate fechaClasificacionCRS;
    private Boolean autorizacionEnvioCelularCorreo;
    private String canalEnvioCelularYCorreo;
    private String productoSolicitado;
    private String codigoNovedadListas;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "clienteBaseId")
    private ClienteBaseEntity clienteBase;

    public ClienteCDTDigitalEntity() {
    }

    public ClienteCDTDigitalEntity(Long id, String tipoTelefonoPrincipal, Integer telefonoPrincipal, String tipoCorreoElectronico, String genero, Integer fechaNacimientoDia, Integer fechaNacimientoMes, Integer fechaNacimientoAno, String lugarNacimientoPais, String lugarNacimientoDpto, String lugarNacimientoCiudad, String nacionalidad, Integer nivelConsulta, Integer fechaExpedicionDocumentoDia, Integer fechaExpedicionDocumentoMes, Integer fechaExpedicionDocumentoAno, String expedicionDocumentoPais, String expedicionDocumentoDpto, String expedicionDocumentoCiudad, String paisResidencia, String subActividadEconomica, String ocupacion, String actividadEconomicaCIIU, String sectorEconomico, Boolean registroBiometria, Integer causalNoBiometria, String direccionPersonal, String direccionPersonalPais, String direccionPersonalDpto, String direccionPersonalCiudad, String barrioDireccionPersonal, String usoDireccionPersonal, String tipoDireccionPersonal, String categoriaDireccionPersonal, String envioCorrespondencia, Float ingresosMensuales, Float patrimonio, String declaracionOrigenFondos, Boolean reconocimientoPublicoExtranjero, Boolean reconocimientoPublicoNacional, String segmento, String nicho, String canalContactoPreferido, Integer asesorComercial, String tipoVinculacion, String porqueMedioSeEnteroDeNosotros, Integer agenciaVinculacion, Integer fechaDiligenciamientoFormularioDia, Integer fechaDiligenciamientoFormularioMes, Integer fechaDiligenciamientoFormularioAno, Integer fechaVinculacionDia, Integer fechaVinculacionMes, Integer fechaVinculacionAno, String lugarDiligenciamientoFormularioPais, String lugarDiligenciamientoFormularioDpto, String lugarDiligenciamientoFormularioCiudad, Boolean residenteFiscalEnOtroPais, Integer identificacionFiscal1, Boolean direccionExtranjero, Integer tin1, String residenciaFiscalPais, String clasificacionFatca, LocalDate fechaClasificacionFatca, String clasificacionCRS, LocalDate fechaClasificacionCRS, Boolean autorizacionEnvioCelularCorreo, String canalEnvioCelularYCorreo, String productoSolicitado, String codigoNovedadListas, ClienteBaseEntity clienteBase) {
        this.id = id;
        this.tipoTelefonoPrincipal = tipoTelefonoPrincipal;
        this.telefonoPrincipal = telefonoPrincipal;
        this.tipoCorreoElectronico = tipoCorreoElectronico;
        this.genero = genero;
        this.fechaNacimientoDia = fechaNacimientoDia;
        this.fechaNacimientoMes = fechaNacimientoMes;
        this.fechaNacimientoAno = fechaNacimientoAno;
        this.lugarNacimientoPais = lugarNacimientoPais;
        this.lugarNacimientoDpto = lugarNacimientoDpto;
        this.lugarNacimientoCiudad = lugarNacimientoCiudad;
        this.nacionalidad = nacionalidad;
        this.nivelConsulta = nivelConsulta;
        this.fechaExpedicionDocumentoDia = fechaExpedicionDocumentoDia;
        this.fechaExpedicionDocumentoMes = fechaExpedicionDocumentoMes;
        this.fechaExpedicionDocumentoAno = fechaExpedicionDocumentoAno;
        this.expedicionDocumentoPais = expedicionDocumentoPais;
        this.expedicionDocumentoDpto = expedicionDocumentoDpto;
        this.expedicionDocumentoCiudad = expedicionDocumentoCiudad;
        this.paisResidencia = paisResidencia;
        this.subActividadEconomica = subActividadEconomica;
        this.ocupacion = ocupacion;
        this.actividadEconomicaCIIU = actividadEconomicaCIIU;
        this.sectorEconomico = sectorEconomico;
        this.registroBiometria = registroBiometria;
        this.causalNoBiometria = causalNoBiometria;
        this.direccionPersonal = direccionPersonal;
        this.direccionPersonalPais = direccionPersonalPais;
        this.direccionPersonalDpto = direccionPersonalDpto;
        this.direccionPersonalCiudad = direccionPersonalCiudad;
        this.barrioDireccionPersonal = barrioDireccionPersonal;
        this.usoDireccionPersonal = usoDireccionPersonal;
        this.tipoDireccionPersonal = tipoDireccionPersonal;
        this.categoriaDireccionPersonal = categoriaDireccionPersonal;
        this.envioCorrespondencia = envioCorrespondencia;
        this.ingresosMensuales = ingresosMensuales;
        this.patrimonio = patrimonio;
        this.declaracionOrigenFondos = declaracionOrigenFondos;
        this.reconocimientoPublicoExtranjero = reconocimientoPublicoExtranjero;
        this.reconocimientoPublicoNacional = reconocimientoPublicoNacional;
        this.segmento = segmento;
        this.nicho = nicho;
        this.canalContactoPreferido = canalContactoPreferido;
        this.asesorComercial = asesorComercial;
        this.tipoVinculacion = tipoVinculacion;
        this.porqueMedioSeEnteroDeNosotros = porqueMedioSeEnteroDeNosotros;
        this.agenciaVinculacion = agenciaVinculacion;
        this.fechaDiligenciamientoFormularioDia = fechaDiligenciamientoFormularioDia;
        this.fechaDiligenciamientoFormularioMes = fechaDiligenciamientoFormularioMes;
        this.fechaDiligenciamientoFormularioAno = fechaDiligenciamientoFormularioAno;
        this.fechaVinculacionDia = fechaVinculacionDia;
        this.fechaVinculacionMes = fechaVinculacionMes;
        this.fechaVinculacionAno = fechaVinculacionAno;
        this.lugarDiligenciamientoFormularioPais = lugarDiligenciamientoFormularioPais;
        this.lugarDiligenciamientoFormularioDpto = lugarDiligenciamientoFormularioDpto;
        this.lugarDiligenciamientoFormularioCiudad = lugarDiligenciamientoFormularioCiudad;
        this.residenteFiscalEnOtroPais = residenteFiscalEnOtroPais;
        this.identificacionFiscal1 = identificacionFiscal1;
        this.direccionExtranjero = direccionExtranjero;
        this.tin1 = tin1;
        this.residenciaFiscalPais = residenciaFiscalPais;
        this.clasificacionFatca = clasificacionFatca;
        this.fechaClasificacionFatca = fechaClasificacionFatca;
        this.clasificacionCRS = clasificacionCRS;
        this.fechaClasificacionCRS = fechaClasificacionCRS;
        this.autorizacionEnvioCelularCorreo = autorizacionEnvioCelularCorreo;
        this.canalEnvioCelularYCorreo = canalEnvioCelularYCorreo;
        this.productoSolicitado = productoSolicitado;
        this.codigoNovedadListas = codigoNovedadListas;
        this.clienteBase = clienteBase;
    }
    public void setClienteBase(ClienteBaseEntity clienteBase) {
        this.clienteBase = clienteBase;
    }
    public ClienteBaseEntity getClienteBase() {
        return clienteBase;
    }

    //private List<CustomParamType> customParams = null;

    /*@Id
    @SequenceGenerator(name = "clienteCdtDigitalSeq", sequenceName = "cliente_cdt_digital_id_seq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "clienteCdtDigitalSeq")*/
    //@Id
    //@GeneratedValue(strategy= GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoTelefonoPrincipal() {
        return tipoTelefonoPrincipal;
    }

    public void setTipoTelefonoPrincipal(String tipoTelefonoPrincipal) {
        this.tipoTelefonoPrincipal = tipoTelefonoPrincipal;
    }

    public Integer getTelefonoPrincipal() {
        return telefonoPrincipal;
    }

    public void setTelefonoPrincipal(Integer telefonoPrincipal) {
        this.telefonoPrincipal = telefonoPrincipal;
    }

    public String getTipoCorreoElectronico() {
        return tipoCorreoElectronico;
    }

    public void setTipoCorreoElectronico(String tipoCorreoElectronico) {
        this.tipoCorreoElectronico = tipoCorreoElectronico;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getFechaNacimientoDia() {
        return fechaNacimientoDia;
    }

    public void setFechaNacimientoDia(Integer fechaNacimientoDia) {
        this.fechaNacimientoDia = fechaNacimientoDia;
    }

    public Integer getFechaNacimientoMes() {
        return fechaNacimientoMes;
    }

    public void setFechaNacimientoMes(Integer fechaNacimientoMes) {
        this.fechaNacimientoMes = fechaNacimientoMes;
    }

    public Integer getFechaNacimientoAno() {
        return fechaNacimientoAno;
    }

    public void setFechaNacimientoAno(Integer fechaNacimientoAno) {
        this.fechaNacimientoAno = fechaNacimientoAno;
    }

    public String getLugarNacimientoPais() {
        return lugarNacimientoPais;
    }

    public void setLugarNacimientoPais(String lugarNacimientoPais) {
        this.lugarNacimientoPais = lugarNacimientoPais;
    }

    public String getLugarNacimientoDpto() {
        return lugarNacimientoDpto;
    }

    public void setLugarNacimientoDpto(String lugarNacimientoDpto) {
        this.lugarNacimientoDpto = lugarNacimientoDpto;
    }

    public String getLugarNacimientoCiudad() {
        return lugarNacimientoCiudad;
    }

    public void setLugarNacimientoCiudad(String lugarNacimientoCiudad) {
        this.lugarNacimientoCiudad = lugarNacimientoCiudad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Integer getNivelConsulta() {
        return nivelConsulta;
    }

    public void setNivelConsulta(Integer nivelConsulta) {
        this.nivelConsulta = nivelConsulta;
    }

    public Integer getFechaExpedicionDocumentoDia() {
        return fechaExpedicionDocumentoDia;
    }

    public void setFechaExpedicionDocumentoDia(Integer fechaExpedicionDocumentoDia) {
        this.fechaExpedicionDocumentoDia = fechaExpedicionDocumentoDia;
    }

    public Integer getFechaExpedicionDocumentoMes() {
        return fechaExpedicionDocumentoMes;
    }

    public void setFechaExpedicionDocumentoMes(Integer fechaExpedicionDocumentoMes) {
        this.fechaExpedicionDocumentoMes = fechaExpedicionDocumentoMes;
    }

    public Integer getFechaExpedicionDocumentoAno() {
        return fechaExpedicionDocumentoAno;
    }

    public void setFechaExpedicionDocumentoAno(Integer fechaExpedicionDocumentoAno) {
        this.fechaExpedicionDocumentoAno = fechaExpedicionDocumentoAno;
    }

    public String getExpedicionDocumentoPais() {
        return expedicionDocumentoPais;
    }

    public void setExpedicionDocumentoPais(String expedicionDocumentoPais) {
        this.expedicionDocumentoPais = expedicionDocumentoPais;
    }

    public String getExpedicionDocumentoDpto() {
        return expedicionDocumentoDpto;
    }

    public void setExpedicionDocumentoDpto(String expedicionDocumentoDpto) {
        this.expedicionDocumentoDpto = expedicionDocumentoDpto;
    }

    public String getExpedicionDocumentoCiudad() {
        return expedicionDocumentoCiudad;
    }

    public void setExpedicionDocumentoCiudad(String expedicionDocumentoCiudad) {
        this.expedicionDocumentoCiudad = expedicionDocumentoCiudad;
    }

    public String getPaisResidencia() {
        return paisResidencia;
    }

    public void setPaisResidencia(String paisResidencia) {
        this.paisResidencia = paisResidencia;
    }

    public String getSubActividadEconomica() {
        return subActividadEconomica;
    }

    public void setSubActividadEconomica(String subActividadEconomica) {
        this.subActividadEconomica = subActividadEconomica;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getActividadEconomicaCIIU() {
        return actividadEconomicaCIIU;
    }

    public void setActividadEconomicaCIIU(String actividadEconomicaCIIU) {
        this.actividadEconomicaCIIU = actividadEconomicaCIIU;
    }

    public String getSectorEconomico() {
        return sectorEconomico;
    }

    public void setSectorEconomico(String sectorEconomico) {
        this.sectorEconomico = sectorEconomico;
    }

    public Boolean getRegistroBiometria() {
        return registroBiometria;
    }

    public void setRegistroBiometria(Boolean registroBiometria) {
        this.registroBiometria = registroBiometria;
    }

    public Integer getCausalNoBiometria() {
        return causalNoBiometria;
    }

    public void setCausalNoBiometria(Integer causalNoBiometria) {
        this.causalNoBiometria = causalNoBiometria;
    }

    public String getDireccionPersonal() {
        return direccionPersonal;
    }

    public void setDireccionPersonal(String direccionPersonal) {
        this.direccionPersonal = direccionPersonal;
    }

    public String getDireccionPersonalPais() {
        return direccionPersonalPais;
    }

    public void setDireccionPersonalPais(String direccionPersonalPais) {
        this.direccionPersonalPais = direccionPersonalPais;
    }

    public String getDireccionPersonalDpto() {
        return direccionPersonalDpto;
    }

    public void setDireccionPersonalDpto(String direccionPersonalDpto) {
        this.direccionPersonalDpto = direccionPersonalDpto;
    }

    public String getDireccionPersonalCiudad() {
        return direccionPersonalCiudad;
    }

    public void setDireccionPersonalCiudad(String direccionPersonalCiudad) {
        this.direccionPersonalCiudad = direccionPersonalCiudad;
    }

    public String getBarrioDireccionPersonal() {
        return barrioDireccionPersonal;
    }

    public void setBarrioDireccionPersonal(String barrioDireccionPersonal) {
        this.barrioDireccionPersonal = barrioDireccionPersonal;
    }

    public String getUsoDireccionPersonal() {
        return usoDireccionPersonal;
    }

    public void setUsoDireccionPersonal(String usoDireccionPersonal) {
        this.usoDireccionPersonal = usoDireccionPersonal;
    }

    public String getTipoDireccionPersonal() {
        return tipoDireccionPersonal;
    }

    public void setTipoDireccionPersonal(String tipoDireccionPersonal) {
        this.tipoDireccionPersonal = tipoDireccionPersonal;
    }

    public String getCategoriaDireccionPersonal() {
        return categoriaDireccionPersonal;
    }

    public void setCategoriaDireccionPersonal(String categoriaDireccionPersonal) {
        this.categoriaDireccionPersonal = categoriaDireccionPersonal;
    }

    public String getEnvioCorrespondencia() {
        return envioCorrespondencia;
    }

    public void setEnvioCorrespondencia(String envioCorrespondencia) {
        this.envioCorrespondencia = envioCorrespondencia;
    }

    public Float getIngresosMensuales() {
        return ingresosMensuales;
    }

    public void setIngresosMensuales(Float ingresosMensuales) {
        this.ingresosMensuales = ingresosMensuales;
    }

    public Float getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(Float patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getDeclaracionOrigenFondos() {
        return declaracionOrigenFondos;
    }

    public void setDeclaracionOrigenFondos(String declaracionOrigenFondos) {
        this.declaracionOrigenFondos = declaracionOrigenFondos;
    }

    public Boolean getReconocimientoPublicoExtranjero() {
        return reconocimientoPublicoExtranjero;
    }

    public void setReconocimientoPublicoExtranjero(Boolean reconocimientoPublicoExtranjero) {
        this.reconocimientoPublicoExtranjero = reconocimientoPublicoExtranjero;
    }

    public Boolean getReconocimientoPublicoNacional() {
        return reconocimientoPublicoNacional;
    }

    public void setReconocimientoPublicoNacional(Boolean reconocimientoPublicoNacional) {
        this.reconocimientoPublicoNacional = reconocimientoPublicoNacional;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public String getNicho() {
        return nicho;
    }

    public void setNicho(String nicho) {
        this.nicho = nicho;
    }

    public String getCanalContactoPreferido() {
        return canalContactoPreferido;
    }

    public void setCanalContactoPreferido(String canalContactoPreferido) {
        this.canalContactoPreferido = canalContactoPreferido;
    }

    public Integer getAsesorComercial() {
        return asesorComercial;
    }

    public void setAsesorComercial(Integer asesorComercial) {
        this.asesorComercial = asesorComercial;
    }

    public String getTipoVinculacion() {
        return tipoVinculacion;
    }

    public void setTipoVinculacion(String tipoVinculacion) {
        this.tipoVinculacion = tipoVinculacion;
    }

    public String getPorqueMedioSeEnteroDeNosotros() {
        return porqueMedioSeEnteroDeNosotros;
    }

    public void setPorqueMedioSeEnteroDeNosotros(String porqueMedioSeEnteroDeNosotros) {
        this.porqueMedioSeEnteroDeNosotros = porqueMedioSeEnteroDeNosotros;
    }

    public Integer getAgenciaVinculacion() {
        return agenciaVinculacion;
    }

    public void setAgenciaVinculacion(Integer agenciaVinculacion) {
        this.agenciaVinculacion = agenciaVinculacion;
    }

    public Integer getFechaDiligenciamientoFormularioDia() {
        return fechaDiligenciamientoFormularioDia;
    }

    public void setFechaDiligenciamientoFormularioDia(Integer fechaDiligenciamientoFormularioDia) {
        this.fechaDiligenciamientoFormularioDia = fechaDiligenciamientoFormularioDia;
    }

    public Integer getFechaDiligenciamientoFormularioMes() {
        return fechaDiligenciamientoFormularioMes;
    }

    public void setFechaDiligenciamientoFormularioMes(Integer fechaDiligenciamientoFormularioMes) {
        this.fechaDiligenciamientoFormularioMes = fechaDiligenciamientoFormularioMes;
    }

    public Integer getFechaDiligenciamientoFormularioAno() {
        return fechaDiligenciamientoFormularioAno;
    }

    public void setFechaDiligenciamientoFormularioAno(Integer fechaDiligenciamientoFormularioAno) {
        this.fechaDiligenciamientoFormularioAno = fechaDiligenciamientoFormularioAno;
    }

    public Integer getFechaVinculacionDia() {
        return fechaVinculacionDia;
    }

    public void setFechaVinculacionDia(Integer fechaVinculacionDia) {
        this.fechaVinculacionDia = fechaVinculacionDia;
    }

    public Integer getFechaVinculacionMes() {
        return fechaVinculacionMes;
    }

    public void setFechaVinculacionMes(Integer fechaVinculacionMes) {
        this.fechaVinculacionMes = fechaVinculacionMes;
    }

    public Integer getFechaVinculacionAno() {
        return fechaVinculacionAno;
    }

    public void setFechaVinculacionAno(Integer fechaVinculacionAno) {
        this.fechaVinculacionAno = fechaVinculacionAno;
    }

    public String getLugarDiligenciamientoFormularioPais() {
        return lugarDiligenciamientoFormularioPais;
    }

    public void setLugarDiligenciamientoFormularioPais(String lugarDiligenciamientoFormularioPais) {
        this.lugarDiligenciamientoFormularioPais = lugarDiligenciamientoFormularioPais;
    }

    public String getLugarDiligenciamientoFormularioDpto() {
        return lugarDiligenciamientoFormularioDpto;
    }

    public void setLugarDiligenciamientoFormularioDpto(String lugarDiligenciamientoFormularioDpto) {
        this.lugarDiligenciamientoFormularioDpto = lugarDiligenciamientoFormularioDpto;
    }

    public String getLugarDiligenciamientoFormularioCiudad() {
        return lugarDiligenciamientoFormularioCiudad;
    }

    public void setLugarDiligenciamientoFormularioCiudad(String lugarDiligenciamientoFormularioCiudad) {
        this.lugarDiligenciamientoFormularioCiudad = lugarDiligenciamientoFormularioCiudad;
    }

    public Boolean getResidenteFiscalEnOtroPais() {
        return residenteFiscalEnOtroPais;
    }

    public void setResidenteFiscalEnOtroPais(Boolean residenteFiscalEnOtroPais) {
        this.residenteFiscalEnOtroPais = residenteFiscalEnOtroPais;
    }

    public Integer getIdentificacionFiscal1() {
        return identificacionFiscal1;
    }

    public void setIdentificacionFiscal1(Integer identificacionFiscal1) {
        this.identificacionFiscal1 = identificacionFiscal1;
    }

    public Boolean getDireccionExtranjero() {
        return direccionExtranjero;
    }

    public void setDireccionExtranjero(Boolean direccionExtranjero) {
        this.direccionExtranjero = direccionExtranjero;
    }

    public Integer getTin1() {
        return tin1;
    }

    public void setTin1(Integer tin1) {
        this.tin1 = tin1;
    }

    public String getResidenciaFiscalPais() {
        return residenciaFiscalPais;
    }

    public void setResidenciaFiscalPais(String residenciaFiscalPais) {
        this.residenciaFiscalPais = residenciaFiscalPais;
    }

    public String getClasificacionFatca() {
        return clasificacionFatca;
    }

    public void setClasificacionFatca(String clasificacionFatca) {
        this.clasificacionFatca = clasificacionFatca;
    }

    public LocalDate getFechaClasificacionFatca() {
        return fechaClasificacionFatca;
    }

    public void setFechaClasificacionFatca(LocalDate fechaClasificacionFatca) {
        this.fechaClasificacionFatca = fechaClasificacionFatca;
    }

    public String getClasificacionCRS() {
        return clasificacionCRS;
    }

    public void setClasificacionCRS(String clasificacionCRS) {
        this.clasificacionCRS = clasificacionCRS;
    }

    public LocalDate getFechaClasificacionCRS() {
        return fechaClasificacionCRS;
    }

    public void setFechaClasificacionCRS(LocalDate fechaClasificacionCRS) {
        this.fechaClasificacionCRS = fechaClasificacionCRS;
    }

    public Boolean getAutorizacionEnvioCelularCorreo() {
        return autorizacionEnvioCelularCorreo;
    }

    public void setAutorizacionEnvioCelularCorreo(Boolean autorizacionEnvioCelularCorreo) {
        this.autorizacionEnvioCelularCorreo = autorizacionEnvioCelularCorreo;
    }

    public String getCanalEnvioCelularYCorreo() {
        return canalEnvioCelularYCorreo;
    }

    public void setCanalEnvioCelularYCorreo(String canalEnvioCelularYCorreo) {
        this.canalEnvioCelularYCorreo = canalEnvioCelularYCorreo;
    }

    public String getProductoSolicitado() {
        return productoSolicitado;
    }

    public void setProductoSolicitado(String productoSolicitado) {
        this.productoSolicitado = productoSolicitado;
    }


    public String getCodigoNovedadListas() {
        return codigoNovedadListas;
    }

    public void setCodigoNovedadListas(String codigoNovedadListas) {
        this.codigoNovedadListas = codigoNovedadListas;
    }
}
