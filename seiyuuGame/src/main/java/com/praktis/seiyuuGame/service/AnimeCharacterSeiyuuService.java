package com.praktis.seiyuuGame.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praktis.seiyuuGame.entity.AnimeCharacterSeiyuu;
import com.praktis.seiyuuGame.repo.AnimeCharacterSeiyuuRepo;

@Service
public class AnimeCharacterSeiyuuService {

    @Autowired
    AnimeCharacterSeiyuuRepo animeCharacterSeiyuuRepo;

    public static final Logger log = LoggerFactory.getLogger(AnimeCharacterSeiyuuService.class);

    public List<AnimeCharacterSeiyuu> getACSById(int animeId) {
        log.info(animeId+ "'s page returned");
        return animeCharacterSeiyuuRepo.findByAnimeId(animeId);
    }
    
}
