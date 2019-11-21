import org.joda.time.LocalDate;
import java.util.ArrayList;



public class Student {

    private String name, id, userName;
    private LocalDate dob;
    private int age;
    private ArrayList<Module> modules;

    public Student(String name, String id, LocalDate dob, ArrayList<Module> modules)
    {
        this. name = name;
        this.age = this.getAge();
        this.dob = dob;
        this.id = id;
        this.userName = this.getUsername();
        this.modules = modules;
    }

    public int getAge()
    {
        LocalDate currentYear = new LocalDate();
       int year = currentYear.getYear();
       return this.age = year - dob.getYear();
    }
    public String getUsername()
    {
        String userName;
        userName = name + age;
        return userName;
    }

    public void addModule(Module newModule){
        modules.add(newModule);
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
