package com.sit.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TEAM_INFO")
public class TeamEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer teamId;

    private String teamName;

    private String teamCaptain;

    private String teamLocation;

    @OneToMany(mappedBy = "team",fetch = FetchType.EAGER)  // refers to 'team' property in PlayerEntity 
    @JsonManagedReference
    private List<PlayerEntity> players;
    
    @Override
    public String toString() {
        return "TeamEntity [team_id=" + teamId + ", team_name=" + teamName + "]";
    }

}
