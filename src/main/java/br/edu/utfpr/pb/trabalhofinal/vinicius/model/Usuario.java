package br.edu.utfpr.pb.trabalhofinal.vinicius.model;

import br.edu.utfpr.pb.trabalhofinal.vinicius.validation.UniqueUsername;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Collection;

@Data
@Entity
public class Usuario implements UserDetails {

    @Id
    @GeneratedValue
    private long id;

    @UniqueUsername
    @NotNull(message = "{br.edu.utfpr.pb.trabalhofinal.username}") //?
    @Size(min = 4, max = 255)
    private String username;

    @NotNull
    private String email;

    @NotNull
    private long fone;

    @NotNull
    private String displayName;

    @NotNull
    @Size(min = 6, max = 254)
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$")
    private String password;


    @Override
    @Transient // não grava no banco
    @JsonIgnore // não seraliza esse dado e manda pro cliente
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return AuthorityUtils.createAuthorityList("Role_USER");
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
