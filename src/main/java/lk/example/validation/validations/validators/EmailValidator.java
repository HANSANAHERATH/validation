package lk.example.validation.validations.validators;

import lk.example.validation.validations.EmailValidation;
import org.apache.tomcat.util.bcel.Const;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class EmailValidator implements ConstraintValidator<EmailValidation, String> {

    private static final String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        if(Pattern.matches(EMAIL_REGEX, email.toLowerCase()))
            return true;
        else
            return false;
    }
}
