package lk.example.validation.controllers;

import lk.example.validation.dto.UserDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController()
@RequestMapping(value = "/user")
public class UserController {

    @PostMapping("/register-user")
    public String registerUser(@Valid @RequestBody UserDto userDto) {
        return "success";
    }
}
