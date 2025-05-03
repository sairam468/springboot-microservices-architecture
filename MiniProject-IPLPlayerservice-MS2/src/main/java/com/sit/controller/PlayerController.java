package com.sit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sit.client.ITeamServiceRestConsumer;
import com.sit.entity.PlayerEntity;
import com.sit.model.TeamData;
import com.sit.service.PlayerService;

@RestController
@RequestMapping("/player-api")
public class PlayerController {

	@Autowired
	private ITeamServiceRestConsumer client;
	
	@Autowired
    private PlayerService playerService;

	
	 @GetMapping("/team/{id}")
	    public ResponseEntity<TeamData> getTeamById(@PathVariable("id") Integer playerId) {
	        TeamData data = client.getTeamInfo(playerId);
	        return new ResponseEntity<TeamData>(data,HttpStatus.OK);
	    }
	 
	// Endpoint to add a player
	    @PostMapping("/addPlayer")
	    public ResponseEntity<PlayerEntity> addPlayer(@RequestBody PlayerEntity playerEntity) {
	        PlayerEntity addedPlayer = playerService.addPlayer(playerEntity);
	        return ResponseEntity.ok(addedPlayer);  // Return the added player as a response
	    }

	    // Endpoint to show all players for a specific team
	    @GetMapping("/showAll/{teamId}")
	    public ResponseEntity<List<PlayerEntity>> showAllPlayers(@PathVariable Integer teamId) {
	        List<PlayerEntity> players = playerService.showAllPlayers(teamId);
	        return ResponseEntity.ok(players);  // Return the list of players for the given team
	    }
	    
	    @GetMapping("/showAll")
	    public ResponseEntity<List<PlayerEntity>> showTotalPlayers() {
	        List<PlayerEntity> players = playerService.showAllPlayersInAllTeams();
	        return ResponseEntity.ok(players);  // Return the list of players for the given team
	    }
	
}
