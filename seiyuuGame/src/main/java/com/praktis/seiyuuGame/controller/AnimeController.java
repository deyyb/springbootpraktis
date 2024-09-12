package com.praktis.seiyuuGame.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/anime")
public class AnimeController {

    public static final Logger log = LoggerFactory.getLogger(AnimeController.class);

    @GetMapping("/allAnime")
    public String getAllAnime(){
        log.info("All Animes Page Requested!");
        return "allAnime";
    }
    
}
