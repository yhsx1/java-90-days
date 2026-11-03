public class BookOrderCalculator {
    public static void main(String[] args) {
        // 变量声明与初始化
        double bookPrice = 39.5;
        int bookQuantity = 8;
        double shippingFee = 12.0;
        double discountAmount = 20.0;
        int studentCount = 3;

        // 输出教材订购业务数据
        System.out.println("Book Price: " + bookPrice);
        System.out.println("Book Quantity: " + bookQuantity);

        // 教材订单费用计算
        double subtotal = bookPrice * bookQuantity;
        double totalAmount = subtotal + shippingFee - discountAmount;
        double averageAmount = totalAmount / studentCount;

        // 输出教材订单费用计算结果
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Average Amount: " + averageAmount);

        // 整数除法与强制类型转换
        int booksPerStudent = bookQuantity / studentCount;
        int remainingBooks = bookQuantity % studentCount;
        double exactBooksPerStudent = (double) bookQuantity / studentCount;

        // 输出整数除法与强制类型转换计算结果
        System.out.println("Books Per Student: " + booksPerStudent);
        System.out.println("Remaining Books: " + remainingBooks);
        System.out.println("Exact Books Per Student: " + exactBooksPerStudent);

        // 更新订单数量
        bookQuantity += 2;

        // 输出更新后的订单数量
        System.out.println("Updated Book Quantity: " + bookQuantity);
    }
}
