package com.praktis.seiyuuGame.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.praktis.seiyuuGame.entity.AnimeCharacterSeiyuu;
import java.util.List;


@Repository
public interface AnimeCharacterSeiyuuRepo extends JpaRepository<AnimeCharacterSeiyuu, Integer> {

    @Query("SELECT a FROM AnimeCharacterSeiyuu a WHERE a.animeId = :animeId")
    List<AnimeCharacterSeiyuu> findByAnimeId(@Param("animeId") int animeId);
    
    @Query("SELECT a FROM AnimeCharacterSeiyuu a WHERE a.seiyuuId = :seiyuuId")
    List<AnimeCharacterSeiyuu> findCharactersBySeiyuuId(@Param("seiyuuId") int seiyuuId);
}
