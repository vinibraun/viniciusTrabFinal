package br.edu.utfpr.pb.trabalhofinal.vinicius.dto;

import lombok.*;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Builder
public class BancoDto {

    private long id;

    @NotNull
    private String nomeBanco;

    @NotNull
    private long numeroConta;

    @NotNull
    private long agencia;
}
