package com.praktis.seiyuuGame.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praktis.seiyuuGame.entity.Anime;
import com.praktis.seiyuuGame.repo.AnimeRepo;

@Service
public class AnimeService {

    @Autowired
    AnimeRepo animeRepo;
    
    public static final Logger log = LoggerFactory.getLogger(AnimeService.class);

    public List<Anime> getAllAnime() {
        log.info("All Anime returned!");
        return animeRepo.findAll();

    
    }
    public Optional<Anime> getAnimeById(int animeRank) {
        log.info(animeRank+ "s' page returned!");
        return animeRepo.findById(animeRank);
    }

    public List<Anime> searchByAnimeName(String animeName){
        log.info(animeName+"'s page returned!");
        return animeRepo.findByAnimeName(animeName);
        // return null;
    }
}
