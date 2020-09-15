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

    @Test
    void should_return_correct_score_when_bowling () {
        BowlingGame bowlingGame = new BowlingGame();
        int score = bowlingGame.bowling(new int[] {3, 7, 10, 4, 6, 2, 2, 4, 3, 10, 5, 5, 4, 3, 6, 1, 7, 3, 10});
        assertEquals(131, score);
    }
}
