import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Employee();
    }

    @Test
    public void hasName() {
        assertEquals("Peter Griffin", employee.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(12345, employee.hasNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(1000, employee.hasSalary());
    }

    @Test
    public void raiseSalary(){
        assertEquals(100, employee.raiseSalary());
    }

    @Test
    public void payBonus() {
        assertEquals(10, employee.payBonus());
    }
}
