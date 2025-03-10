package edu.estatuas.domain.round;

public class PointsDeducted implements Round {

    private byte redBoxerScore;
    private byte blueBoxerScore;
    private final String roundScore;

    public PointsDeducted(String scoreInput) {
        this.roundScore = scoreInput;
        boxerRoundScore();
    }

    @Override
    public void boxerRoundScore(){

        String removingComma = this.roundScore;
        while (removingComma.contains(",")) {
            if (removingComma.indexOf(",") > removingComma.length()/2) {
                removingComma = removingComma.substring(0, removingComma.indexOf(","));
            } else {
                removingComma = removingComma.substring(removingComma.indexOf(",")+2, removingComma.length());
            }
        }

        String[] splittedScore = removingComma.split(" - ");

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
