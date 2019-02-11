import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Sarah", "ZZ12345Y", 50000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Sarah", developer.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("ZZ12345Y", developer.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1.10);
        assertEquals(55000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(500.00, developer.payBonus(), 0.01);
    }
}
