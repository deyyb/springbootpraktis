package com.praktis.seiyuuGame.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praktis.seiyuuGame.entity.StaffAnime;
import com.praktis.seiyuuGame.service.StaffAnimeService;

@RestController
@RequestMapping("/sa")
public class StaffAnimeController {

    @Autowired
    StaffAnimeService staffAnimeService;
    
    public static final Logger log = LoggerFactory.getLogger(StaffAnimeController.class);

    @GetMapping("/{animeId}")
    public List<StaffAnime> getStaffByAnime(@PathVariable int animeId) {
        log.info("Staff for Anime: "+animeId+" has been requested!");
        return staffAnimeService.getStaffByAnime(animeId);
    }
}
