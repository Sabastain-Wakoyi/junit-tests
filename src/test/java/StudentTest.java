import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
 Student Wakoyi;
 Student Emaka;

 @Before
    public void init(){
     Wakoyi = new Student(1L, "Wakoyi");
     Emaka = new Student(2L, "Emaka");

    }

 @Test
    public void IdWoorks(){
     assertEquals(1L, Wakoyi.getId());
     assertEquals(2L, Emaka.getId());
    }

    @Test
    public void NameWorks(){
     assertEquals("Wakoyi",Wakoyi.getName());
     assertEquals("Emaka",Emaka.getName());
     assertNotEquals("Wakoyi",Emaka.getName());
    }

    @Test
    public void gradesWorks(){
     assertEquals(0, Wakoyi.getGrades().size());
    }

    @Test
    public void addGradesWorks(){
     Wakoyi.addGrades(90);
     assertTrue(90 == Wakoyi.getGrades().get(0));
     Wakoyi.addGrades(100);
     assertEquals(100, Wakoyi.getGrades().get(1),0);
    }

    @Test
    public void AvgWorks(){
     assertEquals(0, Wakoyi.getAverage(),0);
     Wakoyi.addGrades(100);
     Wakoyi.addGrades(70);
     Wakoyi.addGrades(80);
     //250/3=83.3
        assertEquals(83.3, Wakoyi.getAverage(),0.1);
        Wakoyi.addGrades(70);
        //85
        assertEquals(85,Wakoyi.getAverage(),0);
    }
}
