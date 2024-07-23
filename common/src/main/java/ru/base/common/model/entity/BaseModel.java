package ru.base.common.model.entity;

import java.io.Serial;
import java.io.Serializable;

public abstract class BaseModel implements Serializable {

    @Serial
    private static final long serialVersionUID = -526542688971487164L;

    public abstract Long getId();

    public String getModelName() {
        return this.getClass().getSimpleName();
    }

}
