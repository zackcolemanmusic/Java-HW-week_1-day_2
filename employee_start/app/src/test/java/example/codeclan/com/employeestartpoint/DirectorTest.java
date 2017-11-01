package example.codeclan.com.employeestartpoint;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 31/10/2017.
 */

public class DirectorTest {

    @Test
    public void testGetBudget(){
        Director director = new Director(1, "bob", "22-22", 55000.00, "I.T", 2000);
        double budget = director.getBudget();
        assertEquals(2000, budget, 0.01);
    }

    @Test
    public void testSetBudget(){
        Director director = new Director(1, "bob", "22-22", 55000.00, "I.T", 2000);
        director.setBudget(1000);
        double budget = director.getBudget();
        assertEquals(1000, budget, 0.01);

    }
}
