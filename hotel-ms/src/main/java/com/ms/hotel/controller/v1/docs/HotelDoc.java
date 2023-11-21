package com.ms.hotel.controller.v1.docs;

import com.ms.hotel.dto.HotelDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.UUID;

@Tag(name = "Hotel Controller", description = "API que expones las operaciones CRUD de hoteles")
public interface HotelDoc {

    @Operation(summary = "Crear hotel", description = "Esta operacion es para crear hotel")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201",
                    description = "Hotel creado",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
            @ApiResponse(responseCode = "400",
                    description = "bad request",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE))
    })
    ResponseEntity create(@Valid @RequestBody HotelDTO hotelDTO);

    @Operation(summary = "Listar hoteles", description = "Esta operacion permite obtener todos los hoteles")
    @ApiResponses (value = {
            @ApiResponse(responseCode = "201",
                    description = "Lista de hoteles ok",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
            @ApiResponse(responseCode = "400",
                    description = "bad request",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE))
    })
    ResponseEntity getAll();

    @Operation(summary = "Obtiene un hotel", description = "Esta operacion permite obtener el hotel de acuerdo al id")
    @ApiResponses (value = {
            @ApiResponse(responseCode = "201",
                    description = "Hotel obtenido ok",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
            @ApiResponse(responseCode = "400",
                    description = "bad request",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE))
    })
    ResponseEntity getById(UUID id);

}
