import techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Casey Jones", "CC975310B", 30000);
    }

    @Test
    public void hasName(){
        assertEquals("Casey Jones", developer.getName() );
    }

    @Test
    public void hasNINumber(){
        assertEquals("CC975310B", developer.getNiNumber() );
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, developer.getSalary(), 0);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(500);
        assertEquals(30500, developer.getSalary(),0);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(300, developer.payBonus(), 0);
    }
}