package ru.base.database.service.api;

import ru.base.common.model.entity.BaseModel;

public interface CrudService<T extends BaseModel>  {

    T create(T model);

    T update(T model);

    T getById(Long id);

    void delete(T model);

    void deleteById(Long id);

}
