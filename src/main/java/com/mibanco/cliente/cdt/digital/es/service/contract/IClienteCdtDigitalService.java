package com.mibanco.cliente.cdt.digital.es.service.contract;

import com.mibanco.cliente.cdt.digital.es.dao.entity.ClienteCDTDigitalEntity;
import com.mibanco.cliente.cdt.digital.es.gen.type.ClienteCDTDigitalType;
public interface IClienteCdtDigitalService   {
    ClienteCDTDigitalType crearClienteCDTDigital(ClienteCDTDigitalEntity clienteCDTDigitalEntity);
}
