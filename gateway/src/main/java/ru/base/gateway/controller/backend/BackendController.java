package ru.base.gateway.controller.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/backend")
public class BackendController {

    @GetMapping
    public String getHello() {
        return "<h1>Hello</h1>";
    }

}
