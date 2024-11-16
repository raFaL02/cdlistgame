package com.codecraft.cdlist.controllers;

import com.codecraft.cdlist.dto.GameListDTO;
import com.codecraft.cdlist.dto.GameMinDTO;
import com.codecraft.cdlist.services.GameListService;
import com.codecraft.cdlist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> getAllGameList() {
        return gameListService.findAll();
    }

    @GetMapping("/{gameListId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long gameListId) {
        return gameService.findByList(gameListId);
    }
}
