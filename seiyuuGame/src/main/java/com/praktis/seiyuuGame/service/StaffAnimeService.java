package com.praktis.seiyuuGame.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praktis.seiyuuGame.entity.StaffAnime;
import com.praktis.seiyuuGame.repo.StaffAnimeRepo;

@Service
public class StaffAnimeService {

    @Autowired
    StaffAnimeRepo staffAnimeRepo;

    public static final Logger log = LoggerFactory.getLogger(StaffAnimeService.class);
    
    public List<StaffAnime> getStaffByAnime(int animeId) {
        log.info("Staff for Anime: "+animeId+" has been returned!");
        return staffAnimeRepo.getStaffByAnime(animeId);
    }
}
