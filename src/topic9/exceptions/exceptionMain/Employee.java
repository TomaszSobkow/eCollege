package topic9.exceptions.exceptionMain;

public class Employee {
    private String name, department;
    private int ID;

    public Employee(int ID , String name, String department){
        this.ID = ID;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString(){
        return  "\nID          " + getID() +
                "\nName:       " + name +
                "\nDepartment: " + getDepartment();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
