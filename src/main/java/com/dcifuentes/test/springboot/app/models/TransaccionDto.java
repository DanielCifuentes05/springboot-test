package com.dcifuentes.test.springboot.app.models;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TransaccionDto {
    private Long cuentaOrigenId;
    private Long cuentaDestinoId;
    private BigDecimal monto;
    private Long bancoId;
}
