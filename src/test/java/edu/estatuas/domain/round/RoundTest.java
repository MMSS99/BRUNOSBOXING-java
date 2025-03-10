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
    public void pointsDeductedTest(){
        PointsDeducted testround = new PointsDeducted("1, 8 - 10");

        assertEquals(8, testround.getRedBoxerScore());
        assertEquals(10, testround.getBlueBoxerScore());

        PointsDeducted testround2 = new PointsDeducted("10 - 8, 1");

        assertEquals(10, testround2.getRedBoxerScore());
        assertEquals(8, testround2.getBlueBoxerScore());

        PointsDeducted testround3 = new PointsDeducted("1, 9 - 8, 1");

        assertEquals(9, testround3.getRedBoxerScore());
        assertEquals(8, testround3.getBlueBoxerScore());


    }

    @Test
    public void roundTest(){
        Round testround = new RegularRound("9 - 10");

        assertEquals(9, testround.getRedBoxerScore());
        assertEquals(10, testround.getBlueBoxerScore());
    }
}