package ru.base.common.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "user", schema = "base_demo")
public class User extends BaseModel implements Serializable {

    @Serial
    private static final long serialVersionUID = -7435184469110412735L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 50)
    @NotNull
    @Column(name = "username", nullable = false, length = 50)
    private String username;

    @Size(max = 150)
    @NotNull
    @Column(name = "email", nullable = false, length = 150)
    private String email;

    @OneToMany(mappedBy = "user")
    private Set<UserAuthority> userAuthorities = new LinkedHashSet<>();

    @OneToOne(mappedBy = "user")
    private UserPassword password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(username, user.username) && Objects.equals(email, user.email) && Objects.equals(userAuthorities, user.userAuthorities) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, email, userAuthorities, password);
    }

}