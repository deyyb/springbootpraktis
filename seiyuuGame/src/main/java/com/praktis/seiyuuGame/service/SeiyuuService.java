package com.praktis.seiyuuGame.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praktis.seiyuuGame.entity.Seiyuu;
import com.praktis.seiyuuGame.entity.Characters;
import com.praktis.seiyuuGame.repo.CharactersRepo;
import com.praktis.seiyuuGame.repo.SeiyuuRepo;

@Service
public class SeiyuuService {

    @Autowired
    SeiyuuRepo seiyuuRepo;

    @Autowired
    CharactersRepo characterRepo;

    public static final Logger log = LoggerFactory.getLogger(SeiyuuService.class);

    public List<Seiyuu> getAllSeiyuu() {
        log.info("All Seiyuus returned!");
        return seiyuuRepo.findAll();
    }

    public Optional<Seiyuu> getSeiyuuById(int seiyuuId) {
        log.info(seiyuuId+"'s page returned!");
        return seiyuuRepo.findById(seiyuuId);
    }
    
    public List<Seiyuu> searchSeiyuuByName(String seiyuuName) {
        log.info(seiyuuName+"'s page returned!");
        return seiyuuRepo.findBySeiyuuName(seiyuuName);
    }

    // TO DO: rework this for frontend
    public String getSeiyuuRolesById(int seiyuuId) {
        List<Characters> ans =  characterRepo.findTheseSeiyuuIds(seiyuuId);
        String chars = ans.toString();
        Optional<Seiyuu> ans2 = getSeiyuuById(seiyuuId);
        String va = ans2.toString();
        log.info(seiyuuId+"'s roles returned!");
        return va+"'s Roles are the following:\n' "+chars;
    }
}
