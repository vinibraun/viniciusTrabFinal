package br.edu.utfpr.pb.trabalhofinal.vinicius.dto;

import br.edu.utfpr.pb.trabalhofinal.vinicius.model.Conta;
import br.edu.utfpr.pb.trabalhofinal.vinicius.model.Categoria;
import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Builder
public class MovimentacaoDto {

    @Id
    @GeneratedValue
    private long id;

    @OneToOne
    @NotNull
    private Conta conta;

    @NotNull
    private Double valor;

    @NotNull
    private LocalDate dataVencimento;

    @NotNull
    private Double valorPago;

    @NotNull
    private LocalDate dataPagamento;

    @NotNull
    private String tipoMovimentacao;

    @NotNull
    private String descricao;

    @NotNull
    @OneToOne(cascade = {CascadeType.ALL})
    private Categoria categoria;
}
