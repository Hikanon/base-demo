package ru.base.common.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "authority", schema = "base_demo")
public class Authority extends BaseModel implements Serializable {

    @Serial
    private static final long serialVersionUID = -648380546238475552L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 50)
    @NotNull
    @Column(name = "authority_code", nullable = false, length = 50)
    private String authorityCode;

    @OneToMany(mappedBy = "authority")
    @ToString.Exclude
    private Set<UserAuthority> userAuthorities = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Authority authority = (Authority) o;
        return Objects.equals(id, authority.id) && Objects.equals(authorityCode, authority.authorityCode) && Objects.equals(userAuthorities, authority.userAuthorities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, authorityCode, userAuthorities);
    }
}