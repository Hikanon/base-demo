package ru.base.common.model.dto.sign;

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
public class SignInData implements Serializable {

    @Serial
    private static final long serialVersionUID = 6997303043608984421L;

    @NotBlank(message = "Username can't be blank")
    private String username;
    @NotBlank(message = "Password can't be blank")
    private String password;

}
