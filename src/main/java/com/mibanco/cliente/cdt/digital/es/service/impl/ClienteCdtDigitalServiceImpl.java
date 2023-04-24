package com.mibanco.cliente.cdt.digital.es.service.impl;

import com.mibanco.cliente.cdt.digital.es.dao.contract.IClienteCdtDigitalDAO;
import com.mibanco.cliente.cdt.digital.es.dao.entity.ClienteCDTDigitalEntity;
import com.mibanco.cliente.cdt.digital.es.gen.type.ClienteCDTDigitalType;
import com.mibanco.cliente.cdt.digital.es.service.contract.IClienteCdtDigitalService;
import com.mibanco.cliente.cdt.digital.es.util.ClienteCdtDigitalMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
@ApplicationScoped
public class ClienteCdtDigitalServiceImpl implements IClienteCdtDigitalService {
    private static final Logger LOG = LoggerFactory.getLogger(ClienteCdtDigitalServiceImpl.class);
    @Inject
    IClienteCdtDigitalDAO clienteCdtDigitalDAO;
    @Inject
    ClienteCdtDigitalMapper clienteCdtDigitalMapper;
    @Override
    public ClienteCDTDigitalType crearClienteCDTDigital(ClienteCDTDigitalEntity clienteCDTDigitalEntity) {
        LOG.info("Inicia crearClienteCDTDigital Impl");
        ClienteCDTDigitalEntity clienteCDTDigitalEntity1 = clienteCdtDigitalDAO.save(clienteCDTDigitalEntity);
        ClienteCDTDigitalType clienteCDTDigitalType = clienteCdtDigitalMapper.clienteEntityToType(clienteCDTDigitalEntity1);
        LOG.info("Termina crearClienteCDTDigital Impl");
        return clienteCDTDigitalType;
    }
}
