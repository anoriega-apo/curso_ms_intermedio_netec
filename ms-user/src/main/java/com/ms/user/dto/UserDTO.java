package com.ms.user.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    @NotEmpty
    @NotBlank
    @NotNull
    private String document;

    @NotEmpty
    @NotBlank
    @NotNull
    private String name;

    @Email
    private String email;

    private String information;
}
