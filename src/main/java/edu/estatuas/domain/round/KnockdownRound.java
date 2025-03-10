package edu.estatuas.domain.round;

public class KnockdownRound {

    private byte redBoxerScore;
    private byte blueBoxerScore;
    private final String roundScore;

    KnockdownRound(String scoreInput){
        this.roundScore = scoreInput;
        boxerRoundScore();

    }

    void boxerRoundScore(){
        String[] splittedScore = this.roundScore.split(" - ");
        this.redBoxerScore = Byte.parseByte(splittedScore[0]);
        this.blueBoxerScore = Byte.parseByte(splittedScore[1]);

    }

    byte getRedBoxerScore(){
        return this.redBoxerScore;
    }

    byte getBlueBoxerScore(){
        return this.blueBoxerScore;
    }
}
