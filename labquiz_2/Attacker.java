
package labquiz_2_sio;

public class Attacker extends Footballer{
    private int goals, assists;

    public Attacker(int goals, int assists, String name, String nationality, int matchPlayed, int age) {
        super(name, nationality, matchPlayed, age);
        this.goals = goals;
        this.assists = assists;
    }
    
    public double impact(){
        double avgGoals = (double)this.goals/(double)super.matchPlayed;
        double avgAssists = (double)this.assists/(double)super.matchPlayed;
        double imp = ((avgGoals+avgAssists)*100)/2;
        return imp;
    }
    
      
}
