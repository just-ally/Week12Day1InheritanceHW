import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Bill", "EE12345F", 25000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Bill", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("EE12345F", databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(1.03);
        assertEquals(25750.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(250.00, databaseAdmin.payBonus(), 0.01);
    }
}
