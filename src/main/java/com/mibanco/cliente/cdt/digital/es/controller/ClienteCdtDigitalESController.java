package com.mibanco.cliente.cdt.digital.es.controller;

import com.mibanco.cliente.cdt.digital.es.dao.entity.ClienteCDTDigitalEntity;
import com.mibanco.cliente.cdt.digital.es.gen.contract.V1ClienteCdtDigitalESApi;
import com.mibanco.cliente.cdt.digital.es.gen.type.ClienteCDTDigitalType;
import com.mibanco.cliente.cdt.digital.es.service.impl.ClienteCdtDigitalServiceImpl;
import com.mibanco.cliente.cdt.digital.es.util.ApplicationException;
import com.mibanco.cliente.cdt.digital.es.util.ClienteCdtDigitalMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.Path;
import java.util.List;

@Path("/v1/es/clienteCDT")
public class ClienteCdtDigitalESController implements V1ClienteCdtDigitalESApi {
    private static final Logger LOG = LoggerFactory.getLogger(ClienteCdtDigitalESController.class);
    @Inject
    ClienteCdtDigitalServiceImpl clienteCdtDigitalServiceImpl;
    @Inject
    ClienteCdtDigitalMapper clienteCdtDigitalMapper;

    @Override
    public List<ClienteCDTDigitalType> crearClienteCdtDigital(ClienteCDTDigitalType clienteCDTDigitalType) throws ApplicationException {
        LOG.info("Inicia crearClienteCdtDigital");
        try {
            ClienteCDTDigitalEntity clienteCDTDigitalEntity = clienteCdtDigitalMapper.clienteTypeToEntity(clienteCDTDigitalType);
            clienteCDTDigitalType = clienteCdtDigitalServiceImpl.crearClienteCDTDigital(clienteCDTDigitalEntity);
            LOG.info("Termina crearClienteCdtDigital");
            return List.of(clienteCDTDigitalType);
        } catch (ApplicationException e) {
            LOG.info(e.getMessage());
            throw new ApplicationException(e.getMessage());
        }
    }
}
