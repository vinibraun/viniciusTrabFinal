package br.edu.utfpr.pb.trabalhofinal.vinicius.service;

import br.edu.utfpr.pb.trabalhofinal.vinicius.model.Usuario;
import br.edu.utfpr.pb.trabalhofinal.vinicius.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    BCryptPasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository) {

        this.userRepository = userRepository;
        passwordEncoder = new BCryptPasswordEncoder();
    }

    public Usuario save(Usuario user) {
        user.setPassword( passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

}
