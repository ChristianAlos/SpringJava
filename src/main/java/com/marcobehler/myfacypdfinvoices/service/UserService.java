package com.marcobehler.myfacypdfinvoices.service;

import com.marcobehler.myfacypdfinvoices.model.User;

import java.util.UUID;

public class UserService {

    public User findById(String id) {
        String randomName = UUID.randomUUID().toString();
        // siempre "encuentra" al usuario, cada usuario tiene un nombre aleatorio
        return new User(id, randomName);
    }
}
