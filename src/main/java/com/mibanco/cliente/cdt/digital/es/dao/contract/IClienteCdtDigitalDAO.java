package com.mibanco.cliente.cdt.digital.es.dao.contract;


import com.mibanco.cliente.cdt.digital.es.dao.entity.ClienteCDTDigitalEntity;
import com.mibanco.cliente.cdt.digital.es.gen.type.TipoDocumentoEnum;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteCdtDigitalDAO extends JpaRepository<ClienteCDTDigitalEntity, Long> {

    //ClienteCDTDigitalEntity consultarClientePorIdentificacion(TipoDocumentoEnum tipoDocumento, String numeroDocumento);
}
