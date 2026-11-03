public class StudentInfoDemo {
    public static void main(String[] args) {
        // 变量声明与初始化
        String studentName = "Alice";
        int studentAge = 23;
        String studentId = "20260001";
        double height = 165.5;
        float weight = 52.5F;
        char grade = 'A';
        boolean isEnrolled = true;
        short credits = 90;
        byte retryCount = 2;
        long campusPopulation = 3000000000L;

        // 输出
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Student ID: " + studentId);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Grade: " + grade);
        System.out.println("Enrolled: " + isEnrolled);
        System.out.println("Credits: " + credits);
        System.out.println("Retry Count: " + retryCount);
        System.out.println("Campus Population: " + campusPopulation);

        // 变量重新赋值
        studentAge = 24;

        // 输出重新赋值的结果
        System.out.println("Updated Age: " + studentAge);
    }
}
