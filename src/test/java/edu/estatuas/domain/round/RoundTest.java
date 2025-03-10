package edu.estatuas.domain.round;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoundTest {

    @Test
    public void regularRoundTest(){
        RegularRound testround = new RegularRound("9 - 10");

        assertEquals(9, testround.getRedBoxerScore());
        assertEquals(10, testround.getBlueBoxerScore());

    }

    @Test
    public void knockdownRoundTest(){
        KnockdownRound testround = new KnockdownRound("8 - 10");

        assertEquals(8, testround.getRedBoxerScore());
        assertEquals(10, testround.getBlueBoxerScore());

    }

    @Test
    public void roundTest(){
        Round testround = new RegularRound("9 - 10");

        assertEquals(9, testround.redBoxerScore);
        assertEquals(10, testround.blueBoxerScore);
    }
}