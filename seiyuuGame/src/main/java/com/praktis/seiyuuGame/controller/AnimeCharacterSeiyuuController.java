package com.praktis.seiyuuGame.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praktis.seiyuuGame.entity.AnimeCharacterSeiyuu;
import com.praktis.seiyuuGame.service.AnimeCharacterSeiyuuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/acs")
public class AnimeCharacterSeiyuuController {

    @Autowired
    AnimeCharacterSeiyuuService animeCharacterSeiyuuService;
    
    public static final Logger log = LoggerFactory.getLogger(AnimeCharacterSeiyuuController.class);

    @GetMapping("/{animeId}")
    public List<AnimeCharacterSeiyuu> getACSById(@PathVariable int animeId) {
        log.info(animeId+ "'s ACS page requested!");
        return animeCharacterSeiyuuService.getACSById(animeId);
    }
    

}
