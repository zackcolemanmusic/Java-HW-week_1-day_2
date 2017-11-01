package example.codeclan.com.employeestartpoint;

/**
 * Created by user on 31/10/2017.
 */

public class Director extends Manager{

    private double budget;

    public Director(int id, String name, String socialSecurityNumber,
                    double salary, String deptName, double budget) {
        super(id, name, socialSecurityNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget(){
        return budget;
    }

    public void setBudget(double newBudget){
        this.budget = newBudget;

    }
}
