package com.codecraft.cdlist.repositories;

import com.codecraft.cdlist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
