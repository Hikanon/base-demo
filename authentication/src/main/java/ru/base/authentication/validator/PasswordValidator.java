package ru.base.authentication.validator;

import ru.base.authentication.exception.AuthenticationException;
import ru.base.common.annotation.DataValidator;

@DataValidator("passwordValidator")
public class PasswordValidator implements Validator<String, String> {

    @Override
    public void validate(String correct, String verifiable) {
        if (!correct.equals(verifiable)) {
            throw new AuthenticationException("Uncorrected password");
        }
    }

}
