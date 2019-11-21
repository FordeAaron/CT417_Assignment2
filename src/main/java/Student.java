import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.Years;

import java.util.ArrayList;

public class Student {

    private String name, id, userName;
    private int age;
    private LocalDate dob;
    private ArrayList<Module> modules;

    public Student(String name, int age, String id, LocalDate dob)
    {
        this. name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.userName = this.getUsername();
    }

    public String getUsername()
    {
        String userName = name + String.valueOf(getAge());
        return userName;
    }

    public void setAge() {
        this.age = age;
    }

    public int getAge() {
        return age;
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
