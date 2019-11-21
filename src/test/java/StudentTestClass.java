import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTestClass {

    Student student1 = new Student("Tom",21,"1538754",new LocalDate(1997, 12,29));

    public StudentTestClass(){}

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




}
