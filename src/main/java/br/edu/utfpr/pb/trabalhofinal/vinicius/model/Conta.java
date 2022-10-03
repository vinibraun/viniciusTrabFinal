package br.edu.utfpr.pb.trabalhofinal.vinicius.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Conta {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @NotNull
    private Usuario usuario;

    @ManyToOne
    @NotNull
    private Banco banco;

    @NotNull
    private String tipoConta;
}
