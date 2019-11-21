import org.joda.time.LocalDate;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<Student> enrolledStudents = new ArrayList<Student>();
    private ArrayList<Module> courseModules = new ArrayList<Module>();
    private LocalDate startDate;
    private LocalDate endDate;

    public Course(String courseName, LocalDate startDate, LocalDate endDate) {
        this.courseName = courseName;
        this.endDate = endDate;
        this.startDate = startDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Module> getCourseModules() {
        return courseModules;
    }

    public void setCourseModules(ArrayList<Module> courseModules) {
        this.courseModules = courseModules;
    }

    public void addCourseModule(Module m)
    {
        courseModules.add(m);
    }

    public void addStudent(Student student){
        if(!enrolledStudents.contains(student)){
            enrolledStudents.add(student);

        }
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
