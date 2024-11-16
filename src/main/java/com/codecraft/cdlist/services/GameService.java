package com.codecraft.cdlist.services;

import com.codecraft.cdlist.dto.GameDTO;
import com.codecraft.cdlist.dto.GameMinDTO;
import com.codecraft.cdlist.entities.Game;
import com.codecraft.cdlist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAllGames() {
        return gameRepository.findAll().stream().map(game -> new GameMinDTO(game)).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long gameListId) {
        return gameRepository.searchByList(gameListId).stream().map(game -> new GameMinDTO(game)).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).orElse(null);
        return new GameDTO(result);
    }
}
