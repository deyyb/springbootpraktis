package com.praktis.seiyuuGame.service;

// import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import com.praktis.seiyuuGame.entity.Staff;
import com.praktis.seiyuuGame.repo.StaffRepo;

@Service
public class StaffService {

    @Autowired
    StaffRepo staffRepo;

    public static final Logger log = LoggerFactory.getLogger(StaffService.class);

    // public List<Staff> getStaffByAnime(int animeId) {
    //     log.info("Staff for Anime: "+animeId+" has been returned!");
    //     return staffRepo.getStaffByAnime(animeId);
    // }
    
}
