package com.microservices.user.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AddressDto(
        @NotBlank String cep,

        @NotNull Integer number,

        @NotBlank String complemet
) {
}
