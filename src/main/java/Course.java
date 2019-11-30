import org.joda.time.LocalDate;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<Student> enrolledStudents;
    private ArrayList<Module> courseModules;
    private LocalDate startDate;
    private LocalDate endDate;

    public Course(String courseName, LocalDate startDate, LocalDate endDate) {
        this.courseName = courseName;
        this.endDate = endDate;
        this.startDate = startDate;
        enrolledStudents = new ArrayList<>();
        courseModules = new ArrayList<>();
    }

    public void addModule(Module m) {
        if (!courseModules.contains(m)) {
            courseModules.add(m);
            ArrayList<Student> ModuleStudents = m.getStudents();
            for (Student student : ModuleStudents) {
                if (!enrolledStudents.contains(student)) {
                    enrolledStudents.add(student);
                    student.addCourse(this);
                }
            }
        }
    }

    public void addStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);

        }
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
