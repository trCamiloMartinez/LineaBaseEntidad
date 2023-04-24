package com.mibanco.cliente.cdt.digital.es.util;

import java.io.Serializable;

public class ApplicationException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 1L;

    public ApplicationException() {
        super();
    }
    public ApplicationException(String msg) {
        super(msg);
    }
    public ApplicationException(String msg, Exception e)  {
        super(msg, e);
    }
}
