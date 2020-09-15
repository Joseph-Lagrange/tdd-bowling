
class BowlingGame {

    int bowling(int[] scoreArr) {
        int score = 0;
        int round = 1;
        for (int i = 0; i < scoreArr.length; i++) {
            if (round == 10) {
                score = getTenthScore(scoreArr, score, i);
                break;
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

    private int getTenthScore(int[] scoreArr, int score, int index) {
        if (scoreArr[index] + scoreArr[index +1] < 10) {
            score += scoreArr[index] + scoreArr[index +1];
        } else if (scoreArr[index] == 10) {
            score += 10 + scoreArr[index +1] + scoreArr[index +2];
        } else {
            score += 10 + scoreArr[index +2];
        }
        return score;
    }
}
