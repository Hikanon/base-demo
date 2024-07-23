package ru.base.database.service;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import ru.base.common.model.entity.BaseModel;
import ru.base.database.repository.BaseRepository;
import ru.base.database.service.api.CrudService;

public class CrudServiceImpl<T extends BaseModel> implements CrudService<T> {

    private static final String SAVE_ERROR = "Can't create entity with not null id. Entity id: %s, EntityName: %s";
    private static final String NOT_FOUND_BY_ID = "Not found entity by id = %d";

    private final BaseRepository<T> repository;

    protected CrudServiceImpl(BaseRepository<T> repository) {
        this.repository = repository;
    }

    @Override
    public T create(T model) {
        if (model.getId() == null) {
            return repository.save(model);
        }
        throw new EntityExistsException(String.format(SAVE_ERROR, model.getId(), model.getModelName()));
    }

    @Override
    public T update(T model) {
        if (model.getId() != null) {
            return repository.save(model);
        }
        String message = String.format("%s does not exist", model.getModelName());
        throw new EntityNotFoundException(message);
    }

    @Override
    public T getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException(String.format(NOT_FOUND_BY_ID, id)));
    }

    @Override
    public void delete(T model) {
        deleteById(model.getId());
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
