package example.codeclan.com.employeestartpoint;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 31/10/2017.
 */

public class ManagerTest {
    @Test
    public void testGetName() {
        Manager manager = new Manager(1, "bob", "22-22", 55000.00, "I.T");

        //manager.setDeptName("")

        String deptName = manager.getDeptName();

        assertEquals("I.T", deptName);
    }

    @Test
    public void testSetName(){
        Manager manager = new Manager(1, "bob", "22-22", 55000.00, "I.T");
        manager.setDeptName("AUTO");
        String deptName = manager.getDeptName();
        assertEquals("AUTO", deptName);
    }


}
