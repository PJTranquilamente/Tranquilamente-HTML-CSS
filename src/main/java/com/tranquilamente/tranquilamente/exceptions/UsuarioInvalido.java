package com.tranquilamente.tranquilamente.exceptions;

import java.io.Serial;

public class UsuarioInvalido extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public UsuarioInvalido(String msg) {
        super(msg);
    }
}
