package com.codecraft.cdlist.services;

import com.codecraft.cdlist.dto.GameListDTO;
import com.codecraft.cdlist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        return gameListRepository.findAll().stream().map(gameList -> new GameListDTO(gameList)).toList();
    }
}
