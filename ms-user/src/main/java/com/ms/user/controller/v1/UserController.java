package com.ms.user.controller.v1;

import com.ms.user.controller.v1.docs.UserDoc;
import com.ms.user.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController implements UserDoc {

    @Override
    @PostMapping
    public ResponseEntity create(UserDTO userDTO) {
        return ResponseEntity.ok(userDTO);
    }
}
