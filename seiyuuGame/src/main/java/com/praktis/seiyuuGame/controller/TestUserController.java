package com.praktis.seiyuuGame.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praktis.seiyuuGame.entity.TestUser;
import com.praktis.seiyuuGame.service.TestUserService;

@RestController
@RequestMapping("/test")
public class TestUserController {

    @Autowired
    TestUserService testUserService;

    @GetMapping("/all")
    public List<TestUser> getAllTestUsers() {
        return testUserService.fetchAllUser();
    }

    @PostMapping("/submit")
    public TestUser handleSubmit(@RequestBody TestUser body) {
        // handle the POST request
        testUserService.handleSubmit(body);
        return body;
    }
}
