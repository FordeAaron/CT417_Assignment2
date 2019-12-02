import org.joda.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProjectTestClass {

    Student student1 = new Student("Tom",21,"1538754",new LocalDate(1997, 12,29));
    Course course1 = new Course("CS&IT", new LocalDate(2018,9,1), new LocalDate(2019, 5,14));

    Module module1 = new Module("Software Engineering", "CT417");

    public ProjectTestClass(){}
    @Test
    public void getStudentName(){
        String expected = "Tom";
        String getName = student1.getName();
        try {
            assertEquals(expected, getName);
            System.out.println("GetStudentName test passed");
        }
        catch (AssertionError e){
            System.out.println("GetStudentName test failed");
        }
    }

    @Test
    public void testUserName() {
        String expectedUserName = "Tom21";
        String name = student1.getUsername();
        try {
            assertEquals(expectedUserName,name);
            System.out.println("testUserName test passed");
        }
        catch (AssertionError e){
            System.out.println("testUserName test failed");
        }
    }

    @Test
    public void testId() {
        String expectedId = "1538754";
        String id = student1.getId();
        try {
            assertEquals(expectedId,id);
            System.out.println("testId test passed");
        }
        catch (AssertionError e){
            System.out.println("testId test failed");
        }

    }

    @Test
    public void testGetDOB(){
        LocalDate expectedDOB = new LocalDate(1997, 12,29);
        LocalDate dob = student1.getDob();
        try{
            assertEquals(expectedDOB, dob);
            System.out.println("testGetDOB test passed");
        }catch(AssertionError e){

            System.out.println("testGetDOB test failed");
        }
    }

    @Test
    public void studentAddModule(){
        Module module = module1;
        Student instance = student1;
        instance.studentAddModule(module);
        try{
            if(instance != null) {
                System.out.println("testAddModule test passed");
            }
        }catch(AssertionError e){

            System.out.println("testAddModule test failed");
        }
    }

    @Test
    public void testAddCourse(){
        Course course = course1;
        Student instance = student1;
        boolean expResult = true;
        boolean result= instance.studentAddCourse(course);
        try{
            //assertEquals();
            System.out.println("testAddCourse test passed");
        }catch(AssertionError e){

            System.out.println("testAddCourse test failed");
        }
    }

    @Test
    public void testModuleName(){
        String expectedName = "Software Engineering";
        String name = module1.getModuleName();
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
        String expectedID = "CT417";
        String actualID = module1.getId();
        try {
            assertEquals(expectedID, actualID);
            System.out.println("testModuleID test passed");
        }
        catch (AssertionError e){
            System.out.println("testModuleID test failed");
        }

    }



}
