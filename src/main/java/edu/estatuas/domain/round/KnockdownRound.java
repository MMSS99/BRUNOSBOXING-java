package edu.estatuas.domain.round;

public class KnockdownRound implements Round {

    private byte redBoxerScore;
    private byte blueBoxerScore;
    private final String roundScore;

    public KnockdownRound(String scoreInput){
        this.roundScore = scoreInput;
        boxerRoundScore();

    }

    @Override
    public void boxerRoundScore(){
        String[] splittedScore = this.roundScore.split(" - ");
        this.redBoxerScore = Byte.parseByte(splittedScore[0]);
        this.blueBoxerScore = Byte.parseByte(splittedScore[1]);

    }

    @Override
    public byte getRedBoxerScore(){
        return this.redBoxerScore;
    }

    @Override
    public byte getBlueBoxerScore(){
        return this.blueBoxerScore;
    }
}
