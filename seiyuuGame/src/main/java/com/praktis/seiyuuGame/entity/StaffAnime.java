package com.praktis.seiyuuGame.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class StaffAnime {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int staffAnime;
    private int staffId;
    private String staffName;
    private String staffPosition;
    private int animeId;
    private String animeName;
}
