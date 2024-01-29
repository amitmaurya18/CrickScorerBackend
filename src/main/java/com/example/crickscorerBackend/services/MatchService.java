package com.example.crickscorerBackend.services;

import com.example.crickscorerBackend.entities.Match;

import java.util.List;
import java.util.Map;
public interface MatchService {
    List<Match> getAllMatches();
    List<Match> getLiveMatchScores();
    List<List<String>> getCWC2023PointTable();

}
