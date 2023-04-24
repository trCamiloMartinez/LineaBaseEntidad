package com.mibanco.cliente.cdt.digital.es.gen.contract;

import com.mibanco.cliente.cdt.digital.es.gen.type.ClienteCDTDigitalType;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/v1/es/clienteCDT")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-04-21T12:11:48.598182600-05:00[America/Bogota]")
public interface V1ClienteCdtDigitalESApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    List<ClienteCDTDigitalType> crearClienteCdtDigital(@Valid ClienteCDTDigitalType clienteCDTDigitalType);
}
