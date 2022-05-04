package br.com.lucasladeira.banklineapi.entities;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Movimentacao {

    private Integer id;
    private LocalDateTime dataHora;
    private String descricao;
    private BigDecimal valor;

    private MovimentacaoTipo tipo;
}
