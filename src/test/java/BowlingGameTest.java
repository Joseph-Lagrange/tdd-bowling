import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    @Test
    void should_return_full_score_when_bowling_all_hit () {
        BowlingGame bowlingGame = new BowlingGame();
        int score = bowlingGame.bowling(new int[] {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10});
        assertEquals(300, score);
    }

    @Test
    void should_return_zero_score_when_bowling_all_miss () {
        BowlingGame bowlingGame = new BowlingGame();
        int score = bowlingGame.bowling(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        assertEquals(0, score);
    }
}
