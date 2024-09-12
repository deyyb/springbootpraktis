package com.praktis.seiyuuGame.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praktis.seiyuuGame.entity.Staff;
import com.praktis.seiyuuGame.service.StaffService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    StaffService staffService;

    public static final Logger log = LoggerFactory.getLogger(StaffController.class);

    @GetMapping("/allStaff")
    public List<Staff> getAllStaff() {
        log.info("All Staff Returned");
        return null;
    }

    // @GetMapping("/anime/{animeId}")
    // public List<Staff> getStaffByAnime(@PathVariable int animeId) {
    //     log.info("Staff for Anime: "+animeId+" has been requested!");
    //     return staffService.getStaffByAnime(animeId);
    // }
    
    
}
