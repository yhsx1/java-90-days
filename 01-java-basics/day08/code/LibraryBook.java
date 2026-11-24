public class LibraryBook {
    // 声明实例字段
    String title;
    int pageCount;
    boolean borrowed;

    public static void main(String[] args) {
        // 创建图书对象
        LibraryBook libraryBook = new LibraryBook();

        // 输出默认值
        System.out.println("Default title: " + libraryBook.title);
        System.out.println("Default pageCount: " + libraryBook.pageCount);
        System.out.println("Default borrowed: " + libraryBook.borrowed);

        // 设置图书信息
        libraryBook.title = "Java Basics";
        libraryBook.pageCount = 320;
        libraryBook.borrowed = true;

        // 输出图书信息
        System.out.println("Updated title: " + libraryBook.title);
        System.out.println("Updated pageCount: " + libraryBook.pageCount);
        System.out.println("Updated borrowed: " + libraryBook.borrowed);

        // 再次修改借阅状态并输出
        libraryBook.borrowed = false;
        System.out.println("Final borrowed: " + libraryBook.borrowed);
    }
}
