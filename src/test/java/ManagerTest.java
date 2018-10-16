import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Davey Jones", "JK123456A", 45000, "Sales");
    }

    @Test
    public void hasName(){
        assertEquals("Davey Jones", manager.getName() );
    }

    @Test
    public void hasNINumber(){
        assertEquals("JK123456A", manager.getNiNumber() );
    }

    @Test
    public void hasSalary(){
        assertEquals(45000, manager.getSalary(), 0);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Sales", manager.getDeptName() );
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000);
        assertEquals(46000, manager.getSalary(),0);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(450, manager.payBonus(), 0);
    }
}
