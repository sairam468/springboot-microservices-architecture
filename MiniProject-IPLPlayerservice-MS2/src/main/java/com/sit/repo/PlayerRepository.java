package com.sit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sit.entity.PlayerEntity;


@Repository
public interface PlayerRepository extends JpaRepository<PlayerEntity, Integer> {

    // Get players by team id
   // List<PlayerEntity> findByTeamTeamId(Integer teamId);

	@Query("FROM PlayerEntity p WHERE p.team.teamId = :teamId")
	List<PlayerEntity> getPlayersByTeamId(@Param("teamId") Integer teamId);

}
