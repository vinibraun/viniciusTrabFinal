package br.edu.utfpr.pb.trabalhofinal.vinicius.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
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
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataVencimento;

    @NotNull
    private Double valorPago;

    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataPagamento;

    @NotNull
    private String categoria;

    @NotNull
    private String descricao;

    @NotNull
    @ManyToOne
    private TipoMovimentacao tipoMovimentacao;
}
