package br.edu.utfpr.pb.trabalhofinal.vinicius.service.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = UniqueUsernameValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueUsername {
    String message() default "{br.edu.utfpr.pb.trabalhofinal.username.Unique}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
