package lk.example.validation.dto;

import lk.example.validation.validations.EmailValidation;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class UserDto  implements Serializable {

    @EmailValidation
    private String email;
    private String name;

    @NotEmpty(message = "The country is required.")
    @Size(min = 2, max = 100, message = "The length of country must be between 2 and 100 characters.")
    private String country;
}
