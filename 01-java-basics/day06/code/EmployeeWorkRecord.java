import java.awt.*;

public class EmployeeWorkRecord {
    public static void main(String[] args) {
        int workHours = 40;
        int[] weeklyHours = {8, 7, 9};

        printEmployee("Alice", 1001);
        printEmployee("Bob", 1002);
        printWorkHours(workHours);
        printSalaryInfo("Alice", 8500.5);
        changeHours(workHours);
        System.out.printf("Main Hours: %d%n", workHours);
        updateFirstHour(weeklyHours);
        System.out.printf("First Weekly Hour: %d%n", weeklyHours[0]);
    }

    // 输出员工姓名和编号
    public static void printEmployee(String name, int id) {
        System.out.printf("Employee: %s%n", name);
        System.out.printf("ID: %d%n", id);
    }

    // 输出工作时长
    public static void printWorkHours(int hours) {
        System.out.printf("Work Hours: %d%n", hours);
    }

    // 输出员工姓名和工资
    public static void printSalaryInfo(String name, double salary) {
        System.out.printf("Salary Employee: %s%n", name);
        System.out.printf("Salary: %.1f%n", salary);
    }

    // 基本类型修改
    public static void changeHours(int hours) {
        hours = 100;
        System.out.printf("Inside Hours: %d%n", hours);
    }

    // 引用类型修改
    public static void updateFirstHour(int[] hours) {
        hours[0] = 99;
    }
}
