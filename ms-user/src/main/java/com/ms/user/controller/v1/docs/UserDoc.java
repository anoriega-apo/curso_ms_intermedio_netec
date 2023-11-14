package com.ms.user.controller.v1.docs;

import com.ms.user.dto.UserDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Tag(name = "User Controller", description = "API que expones las operaciones CRUD de usuarios")
public interface UserDoc {

    @Operation(summary = "Crear usuario", description = "Esta operacion es para crear usuario")
    @ApiResponses (value = {
            @ApiResponse(responseCode = "201",
                    description = "Usuario creado",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
            @ApiResponse(responseCode = "400",
                    description = "bad request",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE))
    })
    ResponseEntity create(@RequestBody UserDTO userDTO);

}
