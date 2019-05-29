
package prereg;
import java.util.*;

public class PreReg {

    public static void main(String[] args) {
        
        ArrayList<Courses> clist = new ArrayList<Courses>();
        clist.add(new Courses("Java theory","CSE2015", 3));
        clist.add(new Courses("Java lab","CSE2016", 1));
        clist.add(new Courses("Datastructures theory","CSE1013", 3));
        clist.add(new Courses("Datastructures theory lab","CSE1014", 1));
        clist.add(new Courses("Math 2","MATH2011", 3));
        clist.add(new Courses("Math 3","MATH2013", 3));
        clist.add(new Courses("Math 5","MATH2015", 3));
        
        for(Courses l:clist){
            System.out.println(l.getCourseName()+" "+l.getCourseCode()+" "+l.getCreditCount());
        }
        
        ArrayList<Student> slist = new ArrayList<Student>();
        slist.add(new Student("Saleh Ibne Omar", 40));
        System.out.println("Search by course code:");
        Scanner sc = new Scanner(System.in);
        String src;
        int i=0;
        System.out.println(slist.get(0).credits());
        while(slist.get(0).credits()<=15){
            src=sc.next();
            if(clist.get(i).getCourseCode().equals(src)){

                System.out.println("Match!");
                
                slist.get(0).setCourses(clist.get(i));
                System.out.println(slist.get(0).credits());
                i++;
                
            }
            else{
                
                System.out.println("Not match!");
                System.out.println(slist.get(0).credits());
                
            }
            
        }
        
        System.out.println(slist.get(0).getName()+" "+slist.get(0).getId()+" "+slist.get(0).totalCr()+" ");
        for(Courses c:slist.get(0).getCourses()){
            System.out.println(c.getCourseName());
        }
        
    }
    
}
