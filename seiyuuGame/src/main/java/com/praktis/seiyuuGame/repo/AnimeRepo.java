package com.praktis.seiyuuGame.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.praktis.seiyuuGame.entity.Anime;

@Repository
public interface AnimeRepo extends JpaRepository<Anime, Integer>{

    @Query("SELECT a FROM Anime a WHERE a.animeName LIKE %:animeName% OR a.animeNameJap LIKE %:animeName%")
    List<Anime> findByAnimeName(@Param("animeName") String animeName);
    
}
