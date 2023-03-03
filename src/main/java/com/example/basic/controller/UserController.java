package com.example.basic.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{userId}")
    public ResponseEntity<String> getUser(@PathVariable("userId") int userId) {
        return new ResponseEntity<>("입력받은 사용자 userId는 " + userId + " 입니다.", HttpStatus.OK);
    }
}
