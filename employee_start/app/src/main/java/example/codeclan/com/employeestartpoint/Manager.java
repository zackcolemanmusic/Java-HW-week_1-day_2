package example.codeclan.com.employeestartpoint;

/**
 * Created by user on 31/10/2017.
 */

public class Manager extends Employee {

    private String deptName;

    //initialize
    public Manager(int id, String name, String socialSecurityNumber,
                   double salary, String deptName) {
        super(id, name, socialSecurityNumber, salary);
        this.deptName = deptName;
    }


    public String getDeptName(){
        return deptName;
    }

    public void setDeptName(String newName){
        this.deptName = newName;
    }
}
