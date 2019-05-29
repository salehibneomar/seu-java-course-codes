
package prereg;

public class Courses {
    private String courseName, courseCode;
    private int creditCount;

    public Courses(String courseName, String courseCode, int creditCount) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditCount = creditCount;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getCreditCount() {
        return creditCount;
    }

    
    
}
