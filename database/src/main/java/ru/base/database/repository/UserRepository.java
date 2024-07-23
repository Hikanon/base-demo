package ru.base.database.repository;

import java.util.Optional;
import org.springframework.stereotype.Repository;
import ru.base.common.model.entity.User;

@Repository
public interface UserRepository extends BaseRepository<User> {

    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);

}
