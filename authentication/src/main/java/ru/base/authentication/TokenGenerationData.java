package ru.base.authentication;

import lombok.Builder;
import lombok.Data;
import ru.base.common.enumeration.Role;

@Data
@Builder
public class TokenGenerationData {

    private Long id;
    private String username;
    private String email;
    private Role role;

}
