package br.edu.utfpr.pb.trabalhofinal.vinicius.dto;

import br.edu.utfpr.pb.trabalhofinal.vinicius.model.Conta;
import br.edu.utfpr.pb.trabalhofinal.vinicius.model.TipoMovimentacao;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Builder
public class MovimentacaoDto {

    private long id;

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
    private TipoMovimentacao tipoMovimentacao;
}
