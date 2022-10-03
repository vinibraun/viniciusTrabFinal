package br.edu.utfpr.pb.trabalhofinal.vinicius.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Entity
public class Movimentacao {

    @Id
    @GeneratedValue
    private long id; //diferença de long e Long?

    @ManyToOne
    @NotNull
    private Conta conta;

    @NotNull
    private Double valor;

    @NotNull
    private LocalDateTime dataVencimento;

    @NotNull
    private Double valorPago;

    @NotNull
    private LocalDateTime dataPagamento;

    @NotNull
    private String categoria;

    @NotNull
    private String descricao;

    @NotNull
    @ManyToOne
    private TipoMovimentacao tipoMovimentacao;
}
