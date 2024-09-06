package com.praktis.seiyuuGame.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praktis.seiyuuGame.entity.Seiyuu;
import com.praktis.seiyuuGame.repo.SeiyuuRepo;

@Service
public class SeiyuuService {

    @Autowired
    SeiyuuRepo seiyuuRepo;

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
}
