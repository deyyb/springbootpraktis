package com.praktis.seiyuuGame.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class SeiyuuTotalRoles {
    @Id
    private int seiyuuId;
    private String seiyuuName;
    private int totalRoles;
}
