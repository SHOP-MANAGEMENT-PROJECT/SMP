package com.smp.controller;

import static com.smp.constants.ApiUrls.*;

import com.smp.dto.request.NewCreateUserRequestDto;
import com.smp.dto.request.UpdateUserRequestDto;
import com.smp.repository.entity.User;
import com.smp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.smp.constants.ApiUrls.*;
import static com.smp.constants.ApiUrls.FINDALL;

@RestController
@RequiredArgsConstructor
@RequestMapping(USER)
public class UserController {
    private final UserService userService;

    @PostMapping(CREATE)
    public ResponseEntity<Boolean> createContent(@RequestBody NewCreateUserRequestDto dto){
        return ResponseEntity.ok(userService.createUser(dto));
    }
    @PutMapping(UPDATE)
    public ResponseEntity<Boolean> updateContent(@RequestBody UpdateUserRequestDto dto){
        return ResponseEntity.ok(userService.updateUser(dto));
    }
    @DeleteMapping(DELETEBYID)
    public ResponseEntity<Boolean> deleteContent(@RequestBody Long id){
        return ResponseEntity.ok(userService.deleteUser(id));
    }

    @GetMapping(FINDALL)
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }
}
