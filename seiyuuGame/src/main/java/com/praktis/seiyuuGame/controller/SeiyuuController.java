package com.praktis.seiyuuGame.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.praktis.seiyuuGame.entity.Seiyuu;
import com.praktis.seiyuuGame.service.SeiyuuService;

@RestController
@RequestMapping("/seiyuu")
public class SeiyuuController {
    
    @Autowired
    SeiyuuService seiyuuService;

    public static final Logger log = LoggerFactory.getLogger(SeiyuuController.class);
    
    @GetMapping("/allSeiyuu/{pageNumber}")
    public List<Seiyuu> getAllSeiyuu( @PathVariable int pageNumber ){
        log.info("All Seiyuus page requested!");
        return seiyuuService.getAllSeiyuu(pageNumber);
    }

    @GetMapping("/id/{seiyuuId}")
    public Optional<Seiyuu> getSeiyuuById(@PathVariable int seiyuuId){
        log.info(seiyuuId+ "'s page requested!");
        return seiyuuService.getSeiyuuById(seiyuuId);
    }

    @GetMapping("/search/{seiyuuName}")
    public List<Seiyuu> getSeiyuuByName(@PathVariable String seiyuuName){
        log.info(seiyuuName+ "'s page requested!");
        return seiyuuService.searchSeiyuuByName(seiyuuName);
    }

    @GetMapping("/roles/{seiyuuId}")
    public String getSeiyuuRolesById(@PathVariable int seiyuuId){
        log.info(seiyuuId+ "'s roles page requested!");
        return seiyuuService.getSeiyuuRolesById(seiyuuId);
    }
}
