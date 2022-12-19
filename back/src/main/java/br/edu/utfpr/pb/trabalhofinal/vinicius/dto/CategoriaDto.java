package br.edu.utfpr.pb.trabalhofinal.vinicius.dto;

import lombok.*;

import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Builder
public class CategoriaDto {

    private long id;

    @NotNull
    private String categoria;

    @NotNull
    private String formaPagamento;
}
