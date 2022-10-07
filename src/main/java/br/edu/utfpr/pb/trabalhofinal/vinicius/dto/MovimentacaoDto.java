package br.edu.utfpr.pb.trabalhofinal.vinicius.dto;

import br.edu.utfpr.pb.trabalhofinal.vinicius.model.Conta;
import br.edu.utfpr.pb.trabalhofinal.vinicius.model.TipoMovimentacao;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
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
    private TipoMovimentacao tipoMovimentacao;
}
