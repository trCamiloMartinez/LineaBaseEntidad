package com.mibanco.cliente.cdt.digital.es.util;

import com.mibanco.cliente.cdt.digital.es.gen.type.TipoDocumentoEnum;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Response;

@ApplicationScoped
public class ClienteCdtDigitalValidator {

    /**
     * Verifica los parametros enviados por el controller
     */
    public Response verificarTipoDocYNumDoc(TipoDocumentoEnum tipoDocumento, String numeroDocumento) throws ApplicationException {

        if (tipoDocumento == null) {
            throw new ApplicationException("El tipo de documento es obligatorio");
        }
        if (numeroDocumento == null) {
            throw new ApplicationException("El numero de documento es obligatorio");
        }
        return Response.ok().build();

    }

}
