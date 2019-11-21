import java.util.ArrayList;

public class Module {

    private String moduleName, id;
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Course> courses = new ArrayList<Course>();

    public Module(String moduleName, String id) {
        this.moduleName = moduleName;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getModuleName() {
        return getModuleName();
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
}

