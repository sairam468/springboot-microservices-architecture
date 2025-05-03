package com.sit.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "PLAYER_INFO")
public class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer playerId;

    private String playerName;

    private Integer playerAge;

    private String playerCity;

    @ManyToOne
    @JoinColumn(name = " TEAM_ID ")  // foreign key column in PLAYER_INFO table
    @JsonBackReference 
    private TeamEntity team;
    
    @Override
    public String toString() {
        return "PlayerEntity [player_id=" + playerId + ", player_name=" + playerName + ", team_id=" + team.getTeamId() + "]";
    }

}
