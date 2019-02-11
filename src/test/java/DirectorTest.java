import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Ally", "WW12345B", 70000.00, "Boss", 1000000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Ally", director.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("WW12345B", director.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(70000.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Boss", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals(1000000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1.15);
        assertEquals(80500.00, director.getSalary(), 0.01);
    }

    @Test
    public void cannotRaiseSalaryIfSalaryDecrease() {
        director.raiseSalary(0.90);
        assertEquals(70000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1400.00, director.payBonus(), 0.01);
    }
}
