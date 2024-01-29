package com.example.crickscorerBackend.repositories;

import com.example.crickscorerBackend.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Integer>{
    Optional<Match> findByTeamHeading(String teamHeading);
}
