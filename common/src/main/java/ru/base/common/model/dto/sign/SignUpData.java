package ru.base.common.model.dto.sign;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.io.Serial;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Makhanov
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SignUpData implements Serializable {

    @Serial
    private static final long serialVersionUID = 674394339354654923L;

    @NotBlank(message = "Username can't be blank")
    private String username;

    @NotBlank(message = "Email can't be blank")
    @Email(message = "Invalid email address")
    private String email;

    @NotBlank(message = "Password can't be blank")
    private String password;

}
