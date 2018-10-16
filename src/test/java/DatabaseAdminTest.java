import techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Tracey Jones", "SS246810C", 35000);
    }

    @Test
    public void hasName(){
        assertEquals("Tracey Jones", databaseAdmin.getName() );
    }

    @Test
    public void hasNINumber(){
        assertEquals("SS246810C", databaseAdmin.getNiNumber() );
    }

    @Test
    public void hasSalary(){
        assertEquals(35000, databaseAdmin.getSalary(), 0);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1000);
        assertEquals(36000, databaseAdmin.getSalary(),0);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(350, databaseAdmin.payBonus(), 0);
    }
}