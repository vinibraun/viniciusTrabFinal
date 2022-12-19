package br.edu.utfpr.pb.trabalhofinal.vinicius.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Entity
public class Movimentacao {

    @Id
    @GeneratedValue
    private long id; //diferença de long e Long?

    @OneToOne
    //@NotNull
    private Conta conta;

    //@NotNull
    private Double valor;

    //@NotNull
    private LocalDate dataVencimento;

    //@NotNull
    private Double valorPago;

    //@NotNull
    private LocalDate dataPagamento;

    private String tipoMovimentacao;

    @NotNull
    private String descricao;

    //@NotNull
    @OneToOne
    private Categoria categoria;
}
