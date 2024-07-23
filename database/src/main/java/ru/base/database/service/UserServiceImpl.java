package ru.base.database.service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import ru.base.common.exception.EntityDataExistsException;
import ru.base.common.model.entity.User;
import ru.base.database.repository.UserRepository;
import ru.base.database.service.api.UserService;
import ru.base.grpc.error.ErrorMessage;

@Service
public class UserServiceImpl extends CrudServiceImpl<User> implements UserService {

    private static final String USER_BY_USERNAME_NOT_FOUND = "User with username: %s not found";

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        super(repository);
        this.repository = repository;
    }

    @Override
    public User create(User model) {
        existsData(model.getUsername(), model.getUsername());
        return super.create(model);
    }

    @Override
    public User getByUsername(String username) {
        return repository.findByUsername(username)
                         .orElseThrow(() -> new EntityNotFoundException(String.format(USER_BY_USERNAME_NOT_FOUND, username)));
    }

    @Override
    public User getByEmail(String email) {
        return repository.findByEmail(email)
                         .orElseThrow(() -> new EntityNotFoundException(String.format(USER_BY_USERNAME_NOT_FOUND, email)));
    }

    @Override
    public void existsData(String username, String email) throws EntityDataExistsException {
        if (repository.existsByUsername(username)) {
            throw new EntityDataExistsException(ErrorMessage.ErrorCode.USERNAME_EXISTS);
        }
        if (repository.existsByEmail(email)) {
            throw new EntityDataExistsException(ErrorMessage.ErrorCode.EMAIL_EXISTS);
        }
    }

}
