package br.edu.utfpr.pb.trabalhofinal.vinicius.controller;

import br.edu.utfpr.pb.trabalhofinal.vinicius.service.utils.GenericResponse;
import br.edu.utfpr.pb.trabalhofinal.vinicius.model.Usuario;
import br.edu.utfpr.pb.trabalhofinal.vinicius.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    GenericResponse createUser(@RequestBody @Valid Usuario user) {
        userService.save(user);
        return new GenericResponse("Registro salvo");
    }

    @GetMapping
    String getString() {
        return "O usuário está autenticado!";
    }

}
