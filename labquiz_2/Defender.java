
package labquiz_2_sio;

public class Defender extends Footballer{
    private int tackleAttempt, tackleSuccess, card;

    public Defender(int tackleAttempt, int tackleSuccess, int card, String name, String nationality, int matchPlayed, int age) {
        super(name, nationality, matchPlayed, age);
        this.tackleAttempt = tackleAttempt;
        this.tackleSuccess = tackleSuccess;
        this.card = card;
    }
    
    @Override
    public double impact(){
        double tSuccess = ((double)tackleAttempt/(double)tackleSuccess)*100;
        double cRate = 100-(((double)this.card/(double)super.matchPlayed)*100);
        double imp = (tSuccess+cRate)/2;
        return imp;
    }   
}
