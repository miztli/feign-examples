package com.example.feign;

import java.util.List;

import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    final String url = "https://jsonplaceholder.typicode.com/todos";

    final IUserClient userClient = Feign
        .builder()
        .client(new OkHttpClient())
        .encoder(new GsonEncoder())
        .decoder(new GsonDecoder())
        .target(IUserClient.class, url);

    public User findById(final long id) {
        return userClient.findById(id);
    }

    public List<User> findAll() {
        return userClient.findAll();
    }
}
