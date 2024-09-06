package com.praktis.seiyuuGame.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Seiyuu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int seiyuuId;
    private String seiyuuName;
}
