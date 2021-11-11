package sky.pro.java.course1;

public class Main {

    private static Employee[] employees;

    public static void main(String[] args) {

        employees = new Employee[10];

        Employee alex = new Employee("Alex Johnson", 1, 100_000);
        Employee vasya = new Employee("Vasya Petrov", 2, 120_000);
        Employee george = new Employee("George Ford", 3, 98_000);
        Employee ekaterina = new Employee("Ekaterina Petrova", 2, 115_000);
        Employee anya = new Employee("Anya Ivanova", 3, 138_000);
        Employee ethan = new Employee("Ethan Winters", 1, 107_000);
        Employee chris = new Employee("Chris Redfield", 1, 124_000);
        Employee ada = new Employee("Ada Wong", 2, 119_000);

        hireAnEmployee(alex);
        hireAnEmployee(vasya);
        hireAnEmployee(george);
        hireAnEmployee(ekaterina);
        hireAnEmployee(anya);
        hireAnEmployee(ethan);
        hireAnEmployee(chris);
        hireAnEmployee(ada);

        printListOfHiredEmployees();
        System.out.println("The amount of salary costs per month: " + salaryAmountPerMonth());
        System.out.println();
        System.out.println("Lowest salary employee: " + employeeWithMinSalary() + " with " + minSalary());
        System.out.println();
        System.out.println("Highest salary employee: " + employeeWithMaxSalary() + " with " + maxSalary());
        System.out.println();
        System.out.println("Average salary: " + averageSalaryPerMonth());
        System.out.println();
        printFullNameOfHiredEmployees();



        }

    public static void printListOfHiredEmployees() {
        System.out.println("List of all employees with their data: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
        System.out.println();
    }

    public static void printFullNameOfHiredEmployees() {
        System.out.print("Names of all hired employees: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.print(employee.getNameOfEmployee());
                System.out.print("; ");
            }
        }
        System.out.println();
    }

    public static int averageSalaryPerMonth() {
        int numberOfEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                numberOfEmployees++;
            }
            }
        return salaryAmountPerMonth() / numberOfEmployees;
    }

    public static int salaryAmountPerMonth() {
        int sumOfSalaries = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                int k = employee.getSalaryOfEmployee();
                sumOfSalaries += k;
            }
        }
        return sumOfSalaries;
    }

    public static int minSalary() {
        int minSalary = employees[0].getSalaryOfEmployee();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalaryOfEmployee() < minSalary) {
                minSalary = employee.getSalaryOfEmployee();
            }
        }
        return minSalary;
    }

    public static String employeeWithMinSalary() {
        String employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalaryOfEmployee() == minSalary()) {
                employeeWithMinSalary = employee.getNameOfEmployee();
            }
        }
        return employeeWithMinSalary;
    }

    public static int maxSalary() {
        int maxSalary = employees[0].getSalaryOfEmployee();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalaryOfEmployee() > maxSalary) {
                maxSalary = employee.getSalaryOfEmployee();
            }
        }
        return maxSalary;
    }

    public static String employeeWithMaxSalary() {
        String employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalaryOfEmployee() == maxSalary()) {
                employeeWithMaxSalary = employee.getNameOfEmployee();
            }
        }
        return employeeWithMaxSalary;
    }

    public static boolean hireAnEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;

                return true;
            }
        }
        return false;
    }















}
