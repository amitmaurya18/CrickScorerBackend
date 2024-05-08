package com.example.crickscorerBackend.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "cricket")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;
    private String teamHeading;
    private String matchNumberVenue;

    private String battingTeam;

    private String battingTeamScore;

    private String bowlTeam;
    private String bowlTeamScore;

    private String liveText;

    private String matchLink;

    private String textComplete;

    @Enumerated
    private MatchStatus status;

    private Date date=new Date();

    public void setMatchStatus() {
        if (this.textComplete.trim().isBlank()) {
            this.status = MatchStatus.LIVE;
        } else {
            this.status = MatchStatus.COMPLETED;
        }
    }

    public void setMatchId(String battingTeam) {
        this.matchId= matchId;
    }

    public String getMatchId() {
        return String.valueOf(matchId);
    }

    public void setTeamHeading(String teamHeading) {
        this.teamHeading = teamHeading;
    }

    public String getTeamHeading() {
        return teamHeading;
    }

    public void setMatchNumberVenue(String matchNumberVenue) {
        this.matchNumberVenue = matchNumberVenue;
    }

    public String getMatchNumberVenue() {
        return matchNumberVenue;
    }

    public void setBattingTeam(String battingTeam) {
        this.battingTeam = battingTeam;
    }

    public String getBattingTeam() {
        return battingTeam;
    }

    public void setBattingTeamScore(String battingTeamScore) {
        this.battingTeamScore = battingTeamScore;
    }

    public String getBattingTeamScore() {
        return battingTeamScore;
    }

    public void setBowlTeam(String bowlTeam) {
        this.bowlTeam = bowlTeam;
    }

    public String getBowlTeam() {
        return bowlTeam;
    }

    public void setBowlTeamScore(String bowlTeamScore) {
        this.bowlTeamScore = bowlTeamScore;
    }

    public String getBowlTeamScore() {
        return bowlTeamScore;
    }

    public void setLiveText(String liveText) {
        this.liveText = liveText;
    }

    public String getLiveText() {
        return liveText;
    }

    public void setMatchLink(String matchLink) {
        this.matchLink = matchLink;
    }

    public String getMatchLink() {
        return matchLink;
    }

    public void setTextComplete(String textComplete) {
        this.textComplete = textComplete;
    }

    public String getTextComplete() {
        return textComplete;
    }
}
