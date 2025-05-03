package com.sit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sit.entity.PlayerEntity;
import com.sit.repo.PlayerRepository;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    // Method to add a player to a team
    public PlayerEntity addPlayer(PlayerEntity playerEntity) {
        return playerRepository.save(playerEntity);  // Saves the player to the database
    }

    // Method to fetch all players for a specific team
    public List<PlayerEntity> showAllPlayers(Integer teamId) {
    	System.out.println("======Players findAll()=============");
//    	System.out.println(playerRepository.findByTeamTeamId(teamId));
//        return playerRepository.findByTeamTeamId(teamId);  // Fetch players for the given team ID
    	
    	List<PlayerEntity> players = playerRepository.getPlayersByTeamId(teamId);
    	
    	System.out.println(players);
    	
    	return players;
    }
    
    public List<PlayerEntity> showAllPlayersInAllTeams(){
    	return playerRepository.findAll();
    }
    
}
