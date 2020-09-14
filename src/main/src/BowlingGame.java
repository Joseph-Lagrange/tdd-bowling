
public class BowlingGame {

    public int bowling (int[] scoreArr) {
        int score = 0;
        int round = 1;
        for (int i = 0; i < scoreArr.length; i++) {
            if (round == 10) {
                if (scoreArr[i] + scoreArr[i+1] < 10) {
                    score += scoreArr[i] + scoreArr[i+1];
                    break;
                } else if (scoreArr[i] == 10) {
                    score += 10 + scoreArr[i+1] + scoreArr[i+2];
                    break;
                } else {
                    score += 10 + scoreArr[i+2];
                    break;
                }
            }
            if (scoreArr[i] + scoreArr[i+1] < 10) {
                score += scoreArr[i] + scoreArr[i+1];
                i++;
            } else if (scoreArr[i] + scoreArr[i+1] == 10) {
                score += 10 + scoreArr[i+2];
                i++;
            } else {
                score += 10 + scoreArr[i+1] + scoreArr[i+2];
            }
            round++;
        }
        return score;
    }
}
