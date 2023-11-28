package com.ms.user.service.impl;

import com.ms.user.config.RestTemplate;
import com.ms.user.dto.UserDTO;
import com.ms.user.exception.MyHandleException;
import com.ms.user.mapper.UserMapper;
import com.ms.user.model.UserEntity;
import com.ms.user.repository.UserRepository;
import com.ms.user.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@AllArgsConstructor
@Service
public class UserServiceImpl implements IUserService {

    private final RestTemplate restTemplate;
    private final UserRepository userRepository;
    public ResponseEntity create(UserDTO userDTO){
        String uuid = UUID.randomUUID().toString();

        UserEntity newUser = UserMapper.getUserDtoToUserEntity(userDTO);
        newUser.setId(uuid);
        var user = this.userRepository.save(newUser);

        return ResponseEntity.status(HttpStatus.CREATED).body(user);

    }

    @Override
    public ResponseEntity getAll() {
        var user=  this.userRepository.findAll();
        return ResponseEntity.ok(user);
    }

    @Override
    public ResponseEntity getById(String id) {
        var user = this.userRepository.findById(id)
                .orElseThrow( () -> new MyHandleException("Usuario no existe"));
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}
