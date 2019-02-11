import staff.management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before () {
        manager = new Manager("Frank", "AA12345B", 40000.00, "IT");
    }

    @Test
    public void hasName() {
        assertEquals("Frank", manager.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("AA12345B", manager.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(40000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("IT", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1.05);
        assertEquals(42000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(400.00, manager.payBonus(), 0.01);
    }

    @Test
    public void canChangeName() {
        manager.changeName("Fred");
        assertEquals("Fred", manager.getName());
    }

    @Test
    public void cannotChangeNameIfNullValueEntered() {
        manager.changeName(null);
        assertEquals("Frank", manager.getName());
    }
}
