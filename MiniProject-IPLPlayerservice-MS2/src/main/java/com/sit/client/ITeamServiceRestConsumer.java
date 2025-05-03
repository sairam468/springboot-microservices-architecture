package com.sit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sit.model.TeamData;

@FeignClient(name = "TEAM-SERVICE", url = "http://localhost:8081/team-api")
public interface ITeamServiceRestConsumer {

    @GetMapping("/getTeamInfo/{playerId}")
    public TeamData getTeamInfo(@PathVariable("playerId") Integer playerId); 
}

