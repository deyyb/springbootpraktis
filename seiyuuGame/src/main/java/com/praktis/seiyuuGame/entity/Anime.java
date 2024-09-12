package com.praktis.seiyuuGame.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Anime {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int animeRank;
    private String animeName;
    private String animeNameJap;
    private String animeType;
    private int animeEps;
    private int studioId;
    private float animeRating;
    private int animeReleaseYr;
}
