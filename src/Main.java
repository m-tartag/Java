public class Main {

    public static void main(String[] args) {

        Account Matt = new Account();

        Matt.setBalance(10000);
        Matt.setCustomerName("Matthew Tartaglia");
        Matt.setCustomerEmail("mattbrs51@gmail.com");
        Matt.setCustomerPhoneNumber("(401) 888-8888");
        Matt.setNumber("0001");
        Matt.deposit(3000);
        Matt.withdrawalAmount(3001);




    }
}



















//        Car porsche = new Car();
//        porsche.setModel("Ayy");
//        System.out.println("Model: " + porsche.getModel());

//        calculateScore(true, 9900, 13, 100);
//        displayHighScorePosition("Matthew", calculateHighScorePosition(1500));
//        displayHighScorePosition("Richard", calculateHighScorePosition(900));
//        displayHighScorePosition("Nicholas", calculateHighScorePosition(400));
//        displayHighScorePosition("Luigi", calculateHighScorePosition(50));
//
//        ArrayList<String> al=new ArrayList<String>();
//        al.add("John");
//        al.add("George");
//        al.add("Ringo");
//        al.add("Paul");
//        al.add("Pete");
//        al.add("Michael");
//        for (String names : al) {
//            System.out.println(names);
//        }
//    }
//
//    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
//            System.out.println("Your Final Score Was: " + finalScore);
//        }
//
//    }
//
//    public static int calculateHighScorePosition(int score) {
//        if (score > 1000) {
//            return 1;
//        }
//        else if (score > 500 && score < 1000 ) {
//            return 2;
//        }
//        else if (score > 100 && score < 500 ) {
//            return 3;
//        }
//        return 4;
//    }
//
//    public static int displayHighScorePosition(String name, int position) {
//        System.out.println(name + " managed to secure rank: " + position);
//        return 0;
//    }
////    public static int sortHighScores(int[] ARRAY) {
////
