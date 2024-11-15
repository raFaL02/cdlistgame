package com.codecraft.cdlist.controllers;

import com.codecraft.cdlist.dto.GameDTO;
import com.codecraft.cdlist.dto.GameMinDTO;
import com.codecraft.cdlist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> getAllGames() {
        return gameService.findAllGames();
    }

    @GetMapping("/{id}")
    public GameDTO getGameById(@PathVariable Long id) {
        return gameService.findById(id);
    }
}