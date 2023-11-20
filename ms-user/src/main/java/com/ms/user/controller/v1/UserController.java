package com.ms.user.controller.v1;

import com.ms.user.controller.v1.docs.UserDoc;
import com.ms.user.dto.UserDTO;
import com.ms.user.exception.MyHandleException;
import com.ms.user.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/user")
public class UserController implements UserDoc {

    private final IUserService iUserService;
    @Override
    @PostMapping
    public ResponseEntity create(UserDTO userDTO) {
        return this.iUserService.create(userDTO);
    }

    @Override
    @GetMapping
    public ResponseEntity getAll() {
        return null;
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity getById(String id) {
        throw new MyHandleException("Método no construido");
    }
}
