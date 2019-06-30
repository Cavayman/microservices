package com.mycompany.user.controller;

import com.mycompany.user.dto.UserDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @GetMapping("getUser")
    public UserDTO getUser(){
        return new UserDTO(1L,"Yurii","123123qwerty");
    }


}
