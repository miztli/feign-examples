package com.example.feign;

import java.util.List;

import feign.Param;
import feign.RequestLine;

public interface IUserClient
{
    @RequestLine("GET /{id}")
    User findById(@Param(value = "id") long id);

    @RequestLine("GET")
    List<User> findAll();
}
