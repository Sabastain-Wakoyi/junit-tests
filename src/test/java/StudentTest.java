import org.junit.Before;
import org.junit.Test;

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

}
