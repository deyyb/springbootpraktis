package com.praktis.seiyuuGame.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praktis.seiyuuGame.entity.Characters;
import com.praktis.seiyuuGame.service.CharactersService;


@RestController
@RequestMapping("/character")
public class CharactersController {

    @Autowired
    CharactersService characterService;

    public static final Logger log = LoggerFactory.getLogger(CharactersController.class);

    @GetMapping("/allChar")
    public List<Characters> getAllCharacter(){
        log.info("All Characters page requested!");
        return characterService.getAllCharacter();
    }
}
