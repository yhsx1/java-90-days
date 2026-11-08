public class LibraryAccessCheck {
    public static void main(String[] args) {
        // 变量声明与初始化
        int studentAge = 25;
        boolean accountActive = false;
        boolean hasViolation = false;
        boolean isMember = true;
        int creditPoints = 100;

        // 四个条件判断
        boolean ageValid = studentAge >= 18 && studentAge <= 60;
        boolean noViolation = !hasViolation;
        boolean qualificationValid = isMember || (creditPoints >= 80);
        boolean canBorrow = ageValid && accountActive && noViolation && qualificationValid;

        // 输出
        System.out.println("Age Valid: " + ageValid);
        System.out.println("No Violation: " + noViolation);
        System.out.println("Qualification Valid: " + qualificationValid);
        System.out.println("Account Active: " + accountActive);
        System.out.println("Can Borrow: " + canBorrow);
    }
}
