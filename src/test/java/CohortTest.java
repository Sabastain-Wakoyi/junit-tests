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

        wanneh.addGrade(100);
        wanneh.addGrade(79);

        one.addStudent(ntoi);
        many.addStudent(ntoi);
        many.addStudent(wanneh);
    }

    @Test
    public void addStudent(){
    assertEquals(1, one.getStudents().size());
    assertEquals(2, many.getStudents().size());
    }

    @Test
    public void getStudent(){
        assertEquals(15,many.getStudents().get(0).getId());
        assertEquals(5,many.getStudents().get(1).getId());

    }

    @Test
    public void cohortAverage(){
        assertEquals(90, one.getCohortAverage(),1);
        assertEquals(89.5, one.getCohortAverage(),1);
    }
}
