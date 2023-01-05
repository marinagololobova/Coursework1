public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee( "Иванов Иван Петрович", 3, 55500);
        employee[1] = new Employee( "Иванова Анна Петровна", 5, 45500);
        employee[2] = new Employee( "Петров Александр Иванович", 1, 60300);
        employee[3] = new Employee( "Александров Андрей Владимирович", 4, 65500);
        employee[4] = new Employee( "Андреев Василий Иванович", 2, 40000);
        employee[5] = new Employee( "Сидоров Владимир Андреевич", 3, 70400);
        employee[6] = new Employee( "Петрова Наталья Вячеславовна", 5, 45700);
        employee[7] = new Employee( "Алексеев Иван Николаевич", 1, 85000);
        employee[8] = new Employee( "Алексеева Ирина Сергеевна", 4, 60702);
        employee[9] = new Employee( "Соколов Николай Владимирович", 2, 57820);

        for (Employee i : employee) {
            System.out.println(i);
        }

        calculateAmountSalaries(employee);
        searchEmployeeWithMinSalary(employee);
        searchEmployeeWithMaxSalary(employee);
        calculateAverageSalary(employee);
        printFullNameEmployees(employee);

    }
    public static double calculateAmountSalaries(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum);
        return sum;
    }

    public static void searchEmployeeWithMinSalary (Employee[] employees) {
        double min = 90000;
        String minEmp = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                minEmp = employees[i].getFullName();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + minEmp);
    }

    public static void searchEmployeeWithMaxSalary (Employee[] employees) {
        double max = 0;
        String maxEmp = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                maxEmp = employees[i].getFullName();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + maxEmp);
    }

    public static void calculateAverageSalary (Employee[] employees) {
        double averageValue = calculateAmountSalaries(employees) / employees.length;
        System.out.println("Среднее значение зарплат: " + averageValue);
    }

    public static void printFullNameEmployees (Employee[] employees) {
        String emp = "";
        for (int i = 0; i < employees.length; i++) {
            emp += employees[i].getFullName() + "\n";
        }
        System.out.println(emp);
    }
}