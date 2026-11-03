import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 读取学生信息
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter student age: ");
        int studentAge = scanner.nextInt();
        System.out.print("Enter student score: ");
        double studentScore = scanner.nextDouble();

        // 输出学生信息
        System.out.println("===== Student Information =====");
        System.out.printf("Name: %s%n", studentName);
        System.out.printf("Age: %d%n", studentAge);
        System.out.printf("Score: %.2f%n", studentScore);
    }
}
