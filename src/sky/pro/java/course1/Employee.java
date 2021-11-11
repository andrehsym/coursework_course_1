package sky.pro.java.course1;

public class Employee {

    private final String nameOfEmployee;
    private int workDepartment;
    private int salaryOfEmployee;
    public static int hiredEmployeeCounter = 0;
    private final int id;

    public Employee(String nameOfEmployee, int workDepartment, int salaryOfEmployee) {
        this.id = hiredEmployeeCounter++;
        this.salaryOfEmployee = salaryOfEmployee;
        this.workDepartment = workDepartment;
        this.nameOfEmployee = nameOfEmployee;

    }

    public String getNameOfEmployee() {
        return nameOfEmployee;
    }

    public int getWorkDepartment() {
        return workDepartment;
    }

    public int getSalaryOfEmployee() {
        return salaryOfEmployee;
    }

    public static int getEmployeeCounter() {
        return hiredEmployeeCounter;
    }

    public int getId() {
        return id;
    }

    public void setWorkDepartment(int workDepartment) {
        this.workDepartment = workDepartment;
    }

    public void setSalaryOfEmployee(int salaryOfEmployee) {
        this.salaryOfEmployee = salaryOfEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nameOfEmployee: '" + nameOfEmployee + '\'' +
                ", workDepartment: " + workDepartment +
                ", salaryOfEmployee: " + salaryOfEmployee +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && nameOfEmployee.equals(employee.nameOfEmployee);
    }
}
