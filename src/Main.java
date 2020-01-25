public class Main {

    public static void main(String[] args) {

        calculateScore(true, 9900, 13, 100);
        displayHighScorePosition("Matthew", calculateHighScorePosition(1500));
        displayHighScorePosition("Richard", calculateHighScorePosition(900));
        displayHighScorePosition("Nicholas", calculateHighScorePosition(400));
        displayHighScorePosition("Luigi", calculateHighScorePosition(50));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your Final Score Was: " + finalScore);
        }
        return -1;
    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1;
        }
        if (score > 500 && score < 1000 ) {
            return 2;
        }
        if (score > 100 && score < 500 ) {
            return 3;
        }
        return 4;
    }

    public static int displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to secure rank: " + position);
        return 0;
    }
}