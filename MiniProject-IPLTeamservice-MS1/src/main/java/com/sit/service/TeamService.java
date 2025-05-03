package com.sit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sit.entity.TeamEntity;
import com.sit.repo.TeamRepository;

@Service
public class TeamService {

	@Autowired
	private TeamRepository teamRepo;

	// Method to register a team
	public TeamEntity registerTeam(TeamEntity team) {
		return teamRepo.save(team);
	}

	// Method to fetch all teams
	public List<TeamEntity> getAllTeams() {
		System.out.println("===Team Repo findAll()===");
		System.out.println(teamRepo.findAll());
		return teamRepo.findAll();
	}

	// Get team by playerId using repo
	public TeamEntity getTeamByPlayer(Integer playerId) {
		return teamRepo.findTeamByPlayer(playerId);
	}

}
