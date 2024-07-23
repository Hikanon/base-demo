package ru.base.database.service.api;

import ru.base.common.exception.EntityDataExistsException;
import ru.base.common.model.entity.User;

public interface UserService extends CrudService<User> {

    User getByUsername(String username);
    User getByEmail(String email);
    void existsData(String username, String email) throws EntityDataExistsException;

}
