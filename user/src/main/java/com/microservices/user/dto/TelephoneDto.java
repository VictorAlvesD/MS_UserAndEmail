package com.microservices.user.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TelephoneDto(
        @NotBlank String number,
        @NotBlank String ddd
) {
}
