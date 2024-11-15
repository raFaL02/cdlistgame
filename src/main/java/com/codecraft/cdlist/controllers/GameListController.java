package com.codecraft.cdlist.controllers;

import com.codecraft.cdlist.dto.GameListDTO;
import com.codecraft.cdlist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> getAllGameList() {
        return gameListService.findAll();
    }
}
