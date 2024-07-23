package ru.base.backend.service;

import org.springframework.stereotype.Service;

@Service
public class PingService {

    public boolean ping() {
        System.out.println("In PingService");
        return true;
    }

}
