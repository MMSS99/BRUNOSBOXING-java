package edu.estatuas.domain.scorecard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScorecardTest {


    @Test
    void loadJudgeScoreCard() {
        Scorecard testscorecard = new Scorecard("TEST");

        testscorecard.loadJudgeScoreCard(new String[]{"9 - 10",
                              "9 - 10",
                              "9 - 10",
                              "1, 8 - 10",
                            "10 - 8",
                             "10 - 8, 1",
                            "10 - 9",
                            "9 - 10",
                            "10 - 9",
                           "10 - 8"});

        assertEquals(9, testscorecard.rounds[0].getRedBoxerScore());
        assertEquals(8, testscorecard.rounds[3].getRedBoxerScore());
        assertEquals(8, testscorecard.rounds[4].getBlueBoxerScore());
        assertEquals(8, testscorecard.rounds[9].getBlueBoxerScore());
    }
}