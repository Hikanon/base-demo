package ru.base.common.model.dto;

import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

@Data
public class TokenData implements Serializable {

    @Serial
    private static final long serialVersionUID = -8837503666705753539L;

    private String token;
    private String username;

}
