
import org.joda.time.LocalDate;
import java.util.ArrayList;

public class Student {

    private String name, id, userName;
    private int age;
    private LocalDate dob;
    private ArrayList<Module> modules;
    private ArrayList<Course> courses;

    public Student(String name, int age, String id, LocalDate dob)
    {
        this. name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.userName = this.getUsername();
        modules = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public String getUsername()
    {
        String userName = name + String.valueOf(getAge());
        return userName;
    }


    public void studentAddModule(Module newModule){
        this.modules.add(newModule);
    }

    public ArrayList getModules() {
        return this.modules;
    }

    public boolean studentAddCourse(Course course) {
        this.courses.add(course);
        return false;
    }

    public ArrayList getCourses() {
        return this.courses;
    }
    public void setAge() {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId() {
        this.id = id;
    }
}
