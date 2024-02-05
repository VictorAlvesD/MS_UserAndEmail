package com.microservices.user.dto;

import com.microservices.user.models.UserCategory;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.util.List;

public record UserDto(
        @NotBlank String name,
        @NotBlank @Email String email,
        @NotBlank @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$", message = "A senha deve conter pelo menos 8 caracteres, incluindo pelo menos uma letra e um número") String password,
        @Valid List<AddressDto> address,
        @Valid List<TelephoneDto> telephones,
        @NotNull @Enumerated(EnumType.STRING) UserCategory userCategory
) {
}