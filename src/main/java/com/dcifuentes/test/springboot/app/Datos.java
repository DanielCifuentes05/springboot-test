package com.dcifuentes.test.springboot.app;

import com.dcifuentes.test.springboot.app.models.Banco;
import com.dcifuentes.test.springboot.app.models.Cuenta;

import java.math.BigDecimal;

public class Datos {
    //public static final Cuenta CUENTA_001 = new Cuenta(1L, new BigDecimal("1000"), "Daniel");
    //public static final Cuenta CUENTA_002 = new Cuenta(2L, new BigDecimal("2000"), "Jhon");
    //public static final Banco BANCO = new Banco(1L, 0, "El banco financiero");

    public static Cuenta crearCuenta001(){
        return new Cuenta(1L, new BigDecimal("1000"), "Daniel");
    }

    public static Cuenta crearCuenta002(){
        return new Cuenta(2L, new BigDecimal("2000"), "Jhon");
    }

    public static Banco crearBanco(){
        return new Banco(1L, 0, "El banco financiero");
    }
}
