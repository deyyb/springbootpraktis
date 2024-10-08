package com.praktis.seiyuuGame.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praktis.seiyuuGame.PaginationUtil;
import com.praktis.seiyuuGame.entity.AnimeCharacterSeiyuu;
import com.praktis.seiyuuGame.entity.SeiyuuTotalRoles;
import com.praktis.seiyuuGame.repo.AnimeCharacterSeiyuuRepo;

@Service
public class AnimeCharacterSeiyuuService {

    @Autowired
    AnimeCharacterSeiyuuRepo animeCharacterSeiyuuRepo;

    @Autowired
    PaginationUtil paginationUtil;

    public static final Logger log = LoggerFactory.getLogger(AnimeCharacterSeiyuuService.class);

    public List<AnimeCharacterSeiyuu> getACSById(int animeId) {
        log.info(animeId+ "'s page returned");
        return animeCharacterSeiyuuRepo.findByAnimeId(animeId);
    }

    public int getSeiyuuTotalRoles(int seiyuuId) {
        List<AnimeCharacterSeiyuu> characterList = animeCharacterSeiyuuRepo.findCharactersBySeiyuuId(seiyuuId);
        log.info(seiyuuId+"'s Total roles are"+ characterList.size());
        return characterList.size();
    }

    public List<AnimeCharacterSeiyuu> getThreeRoles(int seiyuuId) {
        List<AnimeCharacterSeiyuu> characterList = animeCharacterSeiyuuRepo.findCharactersBySeiyuuId(seiyuuId);
        Collections.shuffle(characterList);
        if (characterList.size() < 3) {
            return characterList;
        } else {
            characterList = characterList.subList(0, 3);
            return characterList;
        }
    }

    // public List<SeiyuuTotalRoles> getSeiyuuAndTotalRolesPairs() {
    //     List<AnimeCharacterSeiyuu> distinctList = animeCharacterSeiyuuRepo.findDistinctSeiyuu();
    //     List<SeiyuuTotalRoles> newlist = new ArrayList<>();
    //     for (AnimeCharacterSeiyuu i: distinctList) {
    //         int totalRoles = getSeiyuuTotalRoles(i.getSeiyuuId());
    //         SeiyuuTotalRoles s = new SeiyuuTotalRoles();
    //         s.setSeiyuuId(i.getSeiyuuId());
    //         s.setSeiyuuName(i.getSeiyuuName());
    //         s.setTotalRoles(totalRoles);
    //         newlist.add(s);
    //     }
    //     return newlist;
    // }

    public List<SeiyuuTotalRoles> getSeiyuuAndTotalRolesPairs() {
        List<Object[]> results = animeCharacterSeiyuuRepo.findEachSeiyuuTotal();
        List<SeiyuuTotalRoles> newlist = new ArrayList<>();

        for (Object[] result : results) {
        int seiyuuId = ((Number) result[0]).intValue();        
        String seiyuuName = (String) result[1];  
        int totalRoles = ((Number) result[2]).intValue();       
        
        SeiyuuTotalRoles s = new SeiyuuTotalRoles();
        s.setSeiyuuId(seiyuuId);
        s.setSeiyuuName(seiyuuName);
        s.setTotalRoles(totalRoles); 
        newlist.add(s);
    }
    
    return newlist;

    }

    public List<SeiyuuTotalRoles> getSpecificSeiyuuAndTotalRolesPairs(String seiyuuName) {
        List<SeiyuuTotalRoles> list = getSeiyuuAndTotalRolesPairs();
        List<SeiyuuTotalRoles> newlist = new ArrayList<>();
        for (SeiyuuTotalRoles seiyuu: list) {
            if (seiyuu.getSeiyuuName().toLowerCase().contains(seiyuuName.toLowerCase())){
                // log.info(seiyuu.getSeiyuuName());
                newlist.add(seiyuu);
            }
        }
        return newlist;
    }

    public List<SeiyuuTotalRoles> getSeiyuuAndTotalRolesPairsPages(int pageNumber) {
        List<List<SeiyuuTotalRoles>> pagedList = PaginationUtil.getPages(getSeiyuuAndTotalRolesPairs(), 10);
        return pagedList.get(pageNumber);
    }

    public List<SeiyuuTotalRoles> getSpecificSeiyuuAndTotalRolesPairsPages(String seiyuuName, int pageNumber) {
        List<List<SeiyuuTotalRoles>> pagedList = PaginationUtil.getPages(getSpecificSeiyuuAndTotalRolesPairs(seiyuuName), 10);
        return pagedList.get(pageNumber);
    }
    
}
