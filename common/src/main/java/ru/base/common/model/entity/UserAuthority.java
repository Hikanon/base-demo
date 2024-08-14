package ru.base.common.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(schema = "base_demo", name = "user_authority")
public class UserAuthority extends BaseModel implements Serializable {

    @Serial
    private static final long serialVersionUID = -5267561729725544400L;

    /**
     *  Идентификатор записи
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
