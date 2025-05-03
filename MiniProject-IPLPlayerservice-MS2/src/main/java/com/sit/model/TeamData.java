package com.sit.model;

import java.util.List;

import lombok.Data;

@Data
public class TeamData {
    private Integer teamId;
    private String teamName;
    private String teamCaptain;
    private String teamLocation;
    private List<PlayerData> players;
}
