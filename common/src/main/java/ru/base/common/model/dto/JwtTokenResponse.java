package ru.base.common.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JwtTokenResponse {

    private String token;

}
