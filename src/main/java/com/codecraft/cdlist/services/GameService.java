package com.codecraft.cdlist.services;

import com.codecraft.cdlist.dto.GameMinDTO;
import com.codecraft.cdlist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAllGames() {
        return gameRepository.findAll().stream().map(game -> new GameMinDTO(game)).toList();
    }
}
