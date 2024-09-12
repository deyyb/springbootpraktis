package com.praktis.seiyuuGame.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.praktis.seiyuuGame.entity.Anime;

@Repository
public interface AnimeRepo extends JpaRepository<Anime, Integer>{
    
}
