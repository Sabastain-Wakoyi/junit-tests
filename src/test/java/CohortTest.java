import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class CohortTest {
    Cohort empty;
    Cohort one;
    Cohort many;

    @Before
    public void init(){
        empty = new Cohort();
        one = new Cohort();
        many = new Cohort();

        Student ntoi = new Student(15L, "Ntoi");
        Student wanneh = new Student(5L, "Wanneh");

        ntoi.addGrade(80);
        ntoi.addGrade(100);
    }

    @Test
    public void addStudent(){
    assertEquals(1,);
    }

}
