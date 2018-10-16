import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Quincy Jones", "AA235689A", 60000, "Operations", 100000);
    }

    @Test
    public void hasName(){
        assertEquals("Quincy Jones", director.getName() );
    }

    @Test
    public void hasNINumber(){
        assertEquals("AA235689A", director.getNiNumber() );
    }

    @Test
    public void hasSalary(){
        assertEquals(60000, director.getSalary(), 0);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Operations", director.getDeptName() );
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5000);
        assertEquals(65000, director.getSalary(),0);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(1200, director.payBonus(), 0);
    }

    @Test
    public void canGetBudget(){
        assertEquals(100000, director.getBudget(), 0);
    }

    @Test
    public void cannotChangeSalaryNegative(){
        director.raiseSalary(-100);
        assertEquals(60000, director.getSalary(),0);
    }

    @Test
    public void canChangeName(){
        director.changeName("Charlie Jones");
        assertEquals("Charlie Jones", director.getName() );
    }

    @Test
    public void cannotNullName(){
        director.changeName(null);
        assertEquals("Quincy Jones", director.getName());
    }
}
