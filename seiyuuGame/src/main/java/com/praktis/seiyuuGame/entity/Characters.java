package com.praktis.seiyuuGame.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Characters {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int characterId;
    private String characterName;
    private int seiyuuId;
}
