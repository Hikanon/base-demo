package ru.base.authentication.validator;

public interface Validator<Correct, Verifiable> {

    void validate(Correct correct, Verifiable verifiable);

}
