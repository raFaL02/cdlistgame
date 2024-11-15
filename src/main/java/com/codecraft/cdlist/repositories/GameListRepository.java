package com.codecraft.cdlist.repositories;

import com.codecraft.cdlist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
