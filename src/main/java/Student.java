import org.joda.time.DateTime;

import java.util.List;


public class Student {

    private String name, age, id;
    private DateTime dob;
    private List registeredModules;

    public Student(String name, String age, DateTime dob, List modules)
    {
        this. name = name;
        this.age = age;
        this.dob = dob;
        this.registeredModules = modules;
    }

    public int getAge()
    {

    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAge()
    {
        return this.age;
    }

    public String getUsername(String name, String age)
    {
        String userName;
        userName = name + age;
        return userName;
    }

}
