package com.praktis.seiyuuGame.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SeiyuuService {

    public static final Logger log = LoggerFactory.getLogger(SeiyuuService.class);

    public String getAllSeiyuu() {
        log.info("All Seiyuus returned!");
        return "Here are all the seiyuus!";
    }

    public String getSeiyuu(String seiyuuName) {
        log.info(seiyuuName+"'s page returned!");
        return "You are looking at "+seiyuuName+"'s page!";
    }
    
    
}
