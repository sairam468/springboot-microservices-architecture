package com.sit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sit.entity.TeamEntity;
import com.sit.model.TeamData;
import com.sit.service.TeamService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/team-api")
public class TeamController {

	@Autowired
	private TeamService teamService;

	@GetMapping("/getTeamInfo/{playerId}")
	public TeamData getTeamInfo(@PathVariable Integer playerId) {
		TeamEntity entity = teamService.getTeamByPlayer(playerId);

		if (entity == null) {
			return null;
		}

		TeamData data = new TeamData();
		data.setTeamId(entity.getTeamId());
		data.setTeamName(entity.getTeamName());
		data.setTeamCaptain(entity.getTeamCaptain());
		data.setTeamLocation(entity.getTeamLocation());

		return data;
	}

	@PostMapping("/register")
	public String registerTeam(@RequestBody TeamData tData) {
		TeamEntity e = new TeamEntity();
		e.setTeamName(tData.getTeamName());
		e.setTeamCaptain(tData.getTeamCaptain());
		e.setTeamLocation(tData.getTeamLocation());

		teamService.registerTeam(e);

		return "Team registered successfully with ID: " + e.getTeamId();
	}

	@GetMapping("/showAll")
	public List<TeamData> showAllTeams() {
		List<TeamEntity> entities = teamService.getAllTeams();
		List<TeamData> teams = new ArrayList<>();

		for (TeamEntity e : entities) {
			TeamData data = new TeamData();
			data.setTeamId(e.getTeamId());
			data.setTeamName(e.getTeamName());
			data.setTeamCaptain(e.getTeamCaptain());
			data.setTeamLocation(e.getTeamLocation());
			teams.add(data);
		}
		System.out.println("======Show All()=======");
		System.out.println(entities);
		System.out.println(teams);
		return teams;
	}
}
