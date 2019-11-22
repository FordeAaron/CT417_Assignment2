import java.util.ArrayList;

public class Module {

    private String moduleName, id;
    private ArrayList<Student> studentsInModule;
    private ArrayList<Course> courses;

    public Module(String moduleName, String id) {
        this.moduleName = moduleName;
        this.id = id;
        studentsInModule = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void addStudent(Student student){
        this.studentsInModule.add(student);
    }

    public ArrayList<Student> getStudents() {
        return this.studentsInModule;
    }

    public void addCourse(Course course){
        this.courses.add(course);
    }

    public ArrayList getCourses() {
        return this.courses;
    }
}

