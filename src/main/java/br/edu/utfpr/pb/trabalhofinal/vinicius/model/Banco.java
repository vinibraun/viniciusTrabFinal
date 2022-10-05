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
    private boolean guardaEmBanco;

    //os valores abaixo podem ficar em branco, já que o usuário também pode ter o dinheiro guardado em casa
    private String nomeBanco;

    private long numeroConta;

    private long agencia;
}
