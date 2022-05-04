package br.com.lucasladeira.banklineapi.entities;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Conta {

    private Long numero;
    private BigDecimal saldo;

}
