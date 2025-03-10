package edu.estatuas.domain.scorecard;

import edu.estatuas.domain.round.KnockdownRound;
import edu.estatuas.domain.round.PointsDeducted;
import edu.estatuas.domain.round.RegularRound;
import edu.estatuas.domain.round.Round;

public class Scorecard {
    String color;
    String redCorner;
    String blueCorner;
    String[] judgeScoreCard;
    Round[] rounds = new Round[10];

    public Scorecard(String color){
        this.color = color;
    }

    public void setRedCorner(String boxername){
        this.redCorner = boxername;
    }

    public void setBlueCorner(String boxername){
        this.blueCorner = boxername;
    }

    public void loadJudgeScoreCard(String[] rawScorecard){
        this.judgeScoreCard = rawScorecard;
        loadRounds();
    }

    private void loadRounds(){
        for (int roundNumber = 0; roundNumber < rounds.length; roundNumber++){
            if (judgeScoreCard[roundNumber].contains(",")){
                rounds[roundNumber] = new PointsDeducted(judgeScoreCard[roundNumber]);
            } else if (judgeScoreCard[roundNumber].contains("10") && judgeScoreCard[roundNumber].contains("9")) {
                rounds[roundNumber] = new RegularRound(judgeScoreCard[roundNumber]);
            } else {
                rounds[roundNumber] = new KnockdownRound(judgeScoreCard[roundNumber]);
            }
        }
    }

    public Round[] getRounds(){return rounds;}

    public int getRedBoxerFinalScore(){
        int finalScore = 0;
        for (Round round : rounds){
            finalScore = finalScore + round.getRedBoxerScore();
        }
        return finalScore;
    }

    public int getBlueBoxerFinalScore(){
        int finalScore = 0;
        for (Round round : rounds){
            finalScore = finalScore + round.getBlueBoxerScore();
        }
        return finalScore;
    }

}
