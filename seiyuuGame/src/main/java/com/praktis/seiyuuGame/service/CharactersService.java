package com.praktis.seiyuuGame.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praktis.seiyuuGame.entity.Characters;
import com.praktis.seiyuuGame.repo.CharactersRepo;

@Service
public class CharactersService {

    @Autowired
    CharactersRepo characterRepo;

    public static final Logger log = LoggerFactory.getLogger(CharactersService.class);

    public List<Characters> getAllCharacter() {
        log.info("All Characters returned!");
        return characterRepo.findAll();
    }
}
