package com.praktis.seiyuuGame.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class AnimeCharacterSeiyuu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int acsId;
    private int animeId;
    private String animeName;
    private int characterId;
    private String characterName;
    private int seiyuuId;
    private String seiyuuName;
}
