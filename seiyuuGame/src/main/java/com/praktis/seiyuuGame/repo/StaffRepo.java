package com.praktis.seiyuuGame.repo;

// import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.praktis.seiyuuGame.entity.Staff;

@Repository
public interface StaffRepo extends JpaRepository<Staff, Integer>{

    // @Query("SELECT s FROM Staff s JOIN StaffAnime a ON s.staffId = a.staffId WHERE a.animeId = :animeId")
    // List<Staff> getStaffByAnime(@Param("animeId") int animeId);
}
