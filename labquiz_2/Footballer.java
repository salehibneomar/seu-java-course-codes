
package labquiz_2_sio;

public abstract class Footballer {
    public String name, nationality;
    public int matchPlayed;
    private int age;
    public int rating;

    public Footballer(String name, String nationality, int matchPlayed, int age) {
        this.name = name;
        this.nationality = nationality;
        this.matchPlayed = matchPlayed;
        this.age = age;
    }
    
    public void setRating(double impact){
        this.rating= (int) impact;
    }
    
    protected abstract double impact();
}
