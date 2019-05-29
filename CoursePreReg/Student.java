
package prereg;
import java.util.*;
public class Student {
    
    private String name;
    private int id;
    private ArrayList<Courses> courses = new ArrayList<Courses>();
    private final int maxCredits = 15;
    private int creditsTaken=0;
    int i=0;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setCourses(Courses courses) {
        this.courses.add(courses);
    }
    
    public String getName() {
        return name;
    }

    public ArrayList<Courses> getCourses() {
        return courses;
    }


    public int getId() {
        return id;
    }
    
    public int credits(){
        for(;i<courses.size(); i++){
            creditsTaken=creditsTaken+courses.get(i).getCreditCount();
        }
        
        return creditsTaken;
    }
    
    public int totalCr(){
        if(credits()>15){
           creditsTaken=creditsTaken-courses.get(i-1).getCreditCount();
        }
        return creditsTaken;
    }
}
