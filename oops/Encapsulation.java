package oops;

class CricketScorer{
    private int score;
    public int four(){
         return score +=4;

    }
}
public class Encapsulation {
    public static void main(String[] args) {
        CricketScorer scorer = new CricketScorer();
        System.out.println(scorer.four());
    }
}
