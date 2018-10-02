import Management.Manager;
import org.junit.Before;
import org.junit.Test;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
       manager = new Manager();
    }

    public String getName() {
        return this.name;
    }

    public int hasNiNumber() {
        return this.ninumber;
    }

    public int hasSalary() {
        return this.salary;
    }

    public double raiseSalary() {
        return this.raise;
    }

    public double payBonus() {
        return this.bonus;
    }
}
