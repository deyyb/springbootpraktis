package com.praktis.seiyuuGame.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.praktis.seiyuuGame.entity.StaffAnime;

@Repository
public interface StaffAnimeRepo extends JpaRepository<StaffAnime, Integer> {
    
    @Query("SELECT s FROM StaffAnime s WHERE s.animeId = :animeId")
    List<StaffAnime> getStaffByAnime(@Param("animeId") int animeId);
}
