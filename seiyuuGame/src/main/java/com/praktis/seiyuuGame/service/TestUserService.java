package com.praktis.seiyuuGame.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praktis.seiyuuGame.entity.TestUser;
import com.praktis.seiyuuGame.repo.TestUserRepo;

@Service
public class TestUserService {

    @Autowired
    TestUserRepo testUserRepo;
    
    public List<TestUser> fetchAllUser(){
        return testUserRepo.findAll();
    }

    public void handleSubmit(TestUser body) {
        testUserRepo.save(body);
    }
}
