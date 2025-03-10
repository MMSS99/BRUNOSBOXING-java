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
}