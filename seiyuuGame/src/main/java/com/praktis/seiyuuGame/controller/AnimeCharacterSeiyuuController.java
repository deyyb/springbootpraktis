package com.praktis.seiyuuGame.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praktis.seiyuuGame.entity.AnimeCharacterSeiyuu;
import com.praktis.seiyuuGame.entity.SeiyuuTotalRoles;
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
    
    @GetMapping("/seiyuuTotalRoles/{seiyuuId}")
    public int getTotalRolesBySeiyuuId(@PathVariable int seiyuuId) {
        return animeCharacterSeiyuuService.getSeiyuuTotalRoles(seiyuuId);
    }
    
    @GetMapping("/rand/{seiyuuId}")
    public List<AnimeCharacterSeiyuu> getThreeRandomRoles(@PathVariable int seiyuuId) {
        return animeCharacterSeiyuuService.getThreeRoles(seiyuuId);
    }

    @GetMapping("/seiyuu_total/")
    public List<SeiyuuTotalRoles> getSeiyuuAndTotal() {
        return animeCharacterSeiyuuService.getSeiyuuAndTotalRolesPairs();
    }
    
    @GetMapping("/tseiyuu_total/{seiyuuName}")
    public List<SeiyuuTotalRoles> getSeiyuuAndTotalByName(@PathVariable String seiyuuName) {
        // log.info(seiyuuName);
        return animeCharacterSeiyuuService.getSpecificSeiyuuAndTotalRolesPairs(seiyuuName);
    }

    @GetMapping("/seiyuu_total/{pageNumber}")
    public List<SeiyuuTotalRoles> getSeiyuuAndTotalPages(@PathVariable int pageNumber) {
        return animeCharacterSeiyuuService.getSeiyuuAndTotalRolesPairsPages(pageNumber);
    }

    @GetMapping("/tseiyuu_total/{seiyuuName}/{pageNumber}")
    public List<SeiyuuTotalRoles> getSeiyuuAndTotalByNamePages(@PathVariable String seiyuuName, @PathVariable int pageNumber) {
        // log.info(seiyuuName);
        return animeCharacterSeiyuuService.getSpecificSeiyuuAndTotalRolesPairsPages(seiyuuName, pageNumber);
    }
}
