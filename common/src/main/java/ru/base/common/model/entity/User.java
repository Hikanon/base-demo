package ru.base.common.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serial;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import ru.base.common.enumeration.Role;

/**
 * Модель пользователя
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(schema = "base_demo", name = "user")
public class User extends BaseModel implements Serializable, UserDetails {

    @Serial
    private static final long serialVersionUID = 6302886665566842619L;


    /**
     *  Идентификатор записи
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Логин/Имя пользователя
     */
    @Column(name = "username", unique = true, nullable = false)
    private String username;

    /**
     * Пароль приходит сразу хэшированный
     */
    @Column(name = "password", nullable = false)
    private String password;

    /**
     * Почта пользователя
     */
    @Column(name = "email", nullable = false)
    private String email;

    /**
     * Роль пользователя
     * Если при создании нового пользователя отсутствует роль, то автоматически ставиться ROLE_USER
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role = Role.ROLE_USER;

    public User() {
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
