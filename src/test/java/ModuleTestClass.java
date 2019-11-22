import org.joda.time.LocalDate;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ModuleTestClass {

    Student student = new Student("John", 20,"3677654", new LocalDate(12/2/1999));
    Module module = new Module("Software Engineering", "ct417");
    Student student1 = new Student("Philip", 18,"3677654", new LocalDate(12/2/1999));
    Student student2 = new Student("Algernon", 12,"3677654", new LocalDate(12/2/1999));
    Student student3 = new Student("Augusta", 90,"3677654", new LocalDate(12/2/1999));

    Module module1 = new Module("Programming 1", "CT101");
    Module module2 = new Module("Computer Systems", "CS102");

    public ModuleTestClass(){}

    @Test
    public void testModuleName(){
        String expectedName = "Software Engineering";
        String name = module.getModuleName();
        try {
            assertEquals(expectedName, name);
            System.out.println("GetModuleName test passed");
        }
        catch (AssertionError e){
            System.out.println("GetModuleName test failed");
        }
    }

    @Test
    public void testModuleID(){
        String expectedID = "ct417";
        String actualID = module.getId();
        try {
            assertEquals(expectedID, actualID);
            System.out.println("testModuleID test passed");
        }
        catch (AssertionError e){
            System.out.println("testModuleID test failed");
        }

    }

    @Test
    public void addStudent(){

    }

}
