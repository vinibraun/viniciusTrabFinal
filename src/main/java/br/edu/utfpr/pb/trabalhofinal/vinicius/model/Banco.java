package br.edu.utfpr.pb.trabalhofinal.vinicius.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Banco {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private String nomeBanco;

    @NotNull
    private long numeroConta;

    @NotNull
    private long agencia;
}
