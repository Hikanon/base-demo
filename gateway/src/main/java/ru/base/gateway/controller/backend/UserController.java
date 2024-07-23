package ru.base.gateway.controller.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.base.gateway.model.dto.UserOutData;

@RestController
@RequestMapping("/user")
public class UserController {


    @GetMapping("")
    public UserOutData getUserOutData() {
        return null;
    }

}
