package Management;

public class Manager extends Employee {
    private String deptName;

    public Manager(String deptName){
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
