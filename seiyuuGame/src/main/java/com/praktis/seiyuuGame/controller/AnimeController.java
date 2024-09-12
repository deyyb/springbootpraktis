package com.praktis.seiyuuGame.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praktis.seiyuuGame.entity.Anime;
import com.praktis.seiyuuGame.service.AnimeService;


@RestController
@RequestMapping("/anime")
public class AnimeController {

    @Autowired
    AnimeService animeService;

    public static final Logger log = LoggerFactory.getLogger(AnimeController.class);

    @GetMapping("/allAnime")
    public List<Anime> getAllAnime(){
        log.info("All Animes Page Requested!");
        return animeService.getAllAnime();
    }

    @GetMapping("/id/{animeRank}")
    public Optional<Anime> getAnimeById(@PathVariable int animeRank) {
        log.info(animeRank+ "'s Page Requested!");
        return animeService.getAnimeById(animeRank);
    }
    
    @GetMapping("/search/{animeName}")
    public List<Anime> searchAnimeByName(@PathVariable String animeName) {
        log.info(animeName+"'s page Requested!");
        return animeService.searchByAnimeName(animeName);
    }
    
    
}
