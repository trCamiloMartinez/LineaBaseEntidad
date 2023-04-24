package com.mibanco.cliente.cdt.digital.es.util;

import com.mibanco.cliente.cdt.digital.es.dao.entity.ClienteCDTDigitalEntity;
import com.mibanco.cliente.cdt.digital.es.gen.type.ClienteCDTDigitalType;

import org.modelmapper.ModelMapper;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.stream.Collectors;
@ApplicationScoped
public class ClienteCdtDigitalMapper {
    /**
     * Convierte un ClienteEntity a ClienteType que fue generado por OpenApi Generator
     *
     * @param clienteCDTDigitalEntity
     */
    public ClienteCDTDigitalType clienteEntityToType(ClienteCDTDigitalEntity clienteCDTDigitalEntity) {
        return new ModelMapper().map(clienteCDTDigitalEntity, ClienteCDTDigitalType.class);
    }
    /**
     * Convierte listas de typo a entidad
     *
     * @param clienteCDTDigitalTypeList
     */
    public List<ClienteCDTDigitalEntity> clienteTypeListToEntity(List<ClienteCDTDigitalType> clienteCDTDigitalTypeList){
        return clienteCDTDigitalTypeList.stream().map(cliente -> clienteTypeToEntity(cliente))
                .collect(Collectors.toList());
    }
    /**
     * Convierte typo a entidad
     *
     * @param clienteCDTDigitalType
     */
    public ClienteCDTDigitalEntity clienteTypeToEntity(ClienteCDTDigitalType clienteCDTDigitalType) {
        return new ModelMapper().map(clienteCDTDigitalType, ClienteCDTDigitalEntity.class);
    }
}