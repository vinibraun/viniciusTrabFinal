package br.edu.utfpr.pb.trabalhofinal.vinicius.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Conta {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @NotNull
    private Banco banco;

    @NotNull
    private String tipoConta; //{"tipoConta":"aa", "banco" : {"id":1}}
}
