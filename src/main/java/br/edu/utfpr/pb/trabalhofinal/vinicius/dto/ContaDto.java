package br.edu.utfpr.pb.trabalhofinal.vinicius.dto;


import br.edu.utfpr.pb.trabalhofinal.vinicius.model.Banco;
import br.edu.utfpr.pb.trabalhofinal.vinicius.model.Usuario;
import lombok.*;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Builder
public class ContaDto {

    private long id;

    @NotNull
    private Usuario usuario;

    @NotNull
    private Banco banco;

    @NotNull
    private String tipoConta;
}
