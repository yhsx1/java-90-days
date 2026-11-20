# Day 06 学习笔记

## 一、基本信息

- 所属阶段：第一阶段，Java 基础与面向对象
- 学习日期：2026-11-16 至 2026-11-20
- 学习主题：方法定义、参数、返回值与方法重载
- 工作目录：`01-java-basics/day06/`
- Java 版本：Eclipse Temurin 21
- IDE：IntelliJ IDEA
- 已完成课程：4/4
- 已完成 Java 程序：4/4
- 静态审查：76/76 通过
- 正式业务测试：23/23 通过
- 核心综合程序：Calculator.java
- 全日结果：正式验收通过

## 二、方法的概念与用途

### 2.1 什么是方法

Java 方法（Method）是定义在类中的一组具有特定功能的代码。

方法通常具有以下作用：

1. 将重复逻辑封装起来。
2. 实现代码复用。
3. 将复杂业务拆分为多个相对独立的功能。
4. 提高程序可读性。
5. 降低代码维护成本。
6. 使业务逻辑能够被其他方法调用。

在 Day 01–05 中，许多业务代码直接编写在 main 方法中。

Day 06 开始，逐渐将具体功能交给独立方法处理，让 main 主要负责组织程序执行流程。

### 2.2 方法的基本语法

```java
public static void methodName() {
    // 方法体
}
```

主要组成：

| 部分 | 含义 |
|---|---|
| public | 访问修饰符 |
| static | 静态方法，属于类 |
| void | 不返回结果 |
| methodName | 方法名称 |
| () | 形参列表 |
| {} | 方法体 |

方法名称推荐使用小驼峰命名法，例如：

- printWelcome
- calculateAverage
- isValidScore
- updateFirstHour

### 2.3 方法定义和方法调用

定义方法：

```java
public static void printWelcome() {
    System.out.println("Welcome!");
}
```

调用方法：

```java
printWelcome();
```

定义方法不会自动执行方法体。

只有在程序执行到调用语句时，才会进入对应方法执行代码。

### 2.4 方法执行流程

```java
public class MethodFlowDemo {
    public static void main(String[] args) {
        System.out.println("Step 1");
        showMessage();
        System.out.println("Step 3");
    }

    public static void showMessage() {
        System.out.println("Step 2");
    }
}
```

运行输出：

```text
Step 1
Step 2
Step 3
```

执行过程：

1. 从 main 方法开始。
2. 输出 Step 1。
3. 调用 showMessage。
4. 进入 showMessage 方法体。
5. 输出 Step 2。
6. showMessage 执行结束。
7. 返回 main 中调用位置之后。
8. 输出 Step 3。

自定义方法在类中的定义顺序，不决定程序实际调用顺序。

### 2.5 void 的含义

void 表示方法不向调用者提供返回值。

例如：

```java
public static void printNumber() {
    System.out.println(100);
}
```

该方法能够输出数字，但不代表返回数字。

下面的代码不合法：

```java
int number = printNumber();
```

因为 void 方法没有可赋给 int 变量的返回结果。

### 2.6 static 的基础认识

static 方法属于类，可以在不创建对象的情况下通过类名调用。

在当前课程中，main 和自定义方法均使用 static，因此同一个类中的 main 可以直接调用这些自定义静态方法。

例如：

```java
public class StaticDemo {
    public static void main(String[] args) {
        printMessage();
    }

    public static void printMessage() {
        System.out.println("Hello");
    }
}
```

非 static 方法属于对象，后续面向对象课程将详细学习。

### 2.7 方法定义位置

普通 Java 方法不能定义在另一个方法内部。

正确结构：

```java
public class Demo {
    public static void main(String[] args) {
        showMessage();
    }

    public static void showMessage() {
        System.out.println("Hello");
    }
}
```

两个方法均位于类内部。

## 三、方法参数与实参传递

### 3.1 为什么需要参数

如果方法没有参数，处理的数据通常是固定的，或者需要通过其他方式获取。

参数允许调用方将不同的数据交给同一个方法处理。

例如：

```java
public static void printAge(int age) {
    System.out.println("Age: " + age);
}
```

调用：

```java
printAge(20);
printAge(25);
```

一个方法能够处理不同的年龄数据。

### 3.2 形式参数

形式参数（Parameter）定义在方法声明的参数列表中。

例如：

```java
public static void printAge(int age)
```

其中 `int age` 是形参声明。

age 在方法内部作为变量使用。

### 3.3 实际参数

实际参数（Argument）是调用方法时传入的表达式或数据。

例如：

```java
printAge(20);
```

20 是实际参数。

也可以传入变量：

```java
int studentAge = 22;
printAge(studentAge);
```

调用时，实参需要符合形参的类型要求。

### 3.4 多参数方法

```java
public static void printEmployee(String name, int id) {
    System.out.println("Employee: " + name);
    System.out.println("ID: " + id);
}
```

调用：

```java
printEmployee("Alice", 1001);
```

Java 使用逗号分隔多个参数。

调用时需要正确匹配：

1. 参数数量。
2. 参数类型。
3. 参数顺序。

例如，`printEmployee("Alice", 1001)` 与 `printEmployee(1001, "Alice")` 并不等价。

### 3.5 参数类型转换

当方法声明接收 double 参数时，可以传入 int 类型的数值。

```java
public static void printPrice(double price) {
    System.out.println(price);
}
```

以下调用合法：

```java
printPrice(10);
```

因为 int 可以自动拓宽转换为 double。

但是 double 不能直接隐式转换为 int。

### 3.6 局部变量与作用域

方法内部定义的普通局部变量通常只能在其有效作用域内使用。

例如：

```java
public static void showNumber(int value) {
    int doubled = value * 2;
    System.out.println(doubled);
}
```

main 不能直接访问 showNumber 中的 doubled。

不同方法可以使用相同名称的局部变量，它们是不同的变量。

if、for 等代码块还会引入相应的作用域限制。

### 3.7 Java 按值传递

Java 的参数传递机制始终是按值传递（Pass by Value）。

方法接收实参表达式计算结果的副本。

对于基本类型：

- 复制基本类型的值。
- 修改方法形参不会修改调用者的原变量。

例如：

```java
public static void changeNumber(int number) {
    number = 100;
}
```

调用：

```java
int value = 40;
changeNumber(value);
System.out.println(value);
```

输出：

```text
40
```

因为方法内的 number 与调用者的 value 是不同的局部变量。

### 3.8 数组引用参数传递

Java 数组属于引用类型。

数组变量保存的是引用值。

例如：

```java
public static void updateFirst(int[] values) {
    values[0] = 99;
}
```

调用：

```java
int[] numbers = {8, 7, 9};

updateFirst(numbers);

System.out.println(numbers[0]);
```

输出：

```text
99
```

调用时，Java 复制的是数组引用值。

此时方法内的 values 和调用方的 numbers 指向同一个数组对象。

因此修改 values[0] 就是在修改共同引用的数组对象。

需要区分：

- 给形参重新赋一个数组引用：不会自动修改调用方的引用变量。
- 通过形参修改共同引用数组的元素：调用方可以观察到元素变化。

不能简单将 Java 描述为“基本类型按值传递、数组按引用传递”。

准确结论：

**Java 始终按值传递。基本类型复制基本值，引用类型复制引用值。**

## 四、return 与方法返回值

### 4.1 返回值的作用

方法可以不仅接收数据，还可以将计算结果交还给调用者。

例如：

```java
public static int calculateTotal(int a, int b) {
    return a + b;
}
```

调用：

```java
int total = calculateTotal(10, 20);
```

total 得到 30。

返回值能够：

- 保存到变量。
- 参与其他计算。
- 作为其他方法的参数。
- 直接用于输出。
- 继续参与业务处理。

### 4.2 返回值方法的结构

```java
public static 返回类型 方法名(参数列表) {
    // 方法逻辑
    return 表达式;
}
```

例如：

```java
public static int square(int number) {
    return number * number;
}
```

方法声明的返回类型，应与 return 后表达式的类型兼容。

### 4.3 常见返回类型

int：

```java
public static int doubleNumber(int number) {
    return number * 2;
}
```

double：

```java
public static double calculateAverage(int a, int b) {
    return (a + b) / 2.0;
}
```

boolean：

```java
public static boolean isAdult(int age) {
    return age >= 18;
}
```

String：

```java
public static String getStatus(boolean active) {
    if (active) {
        return "Active";
    }

    return "Inactive";
}
```

### 4.4 return 与输出的区别

```java
public static void printSum(int a, int b) {
    System.out.println(a + b);
}
```

该方法只执行输出操作，不返回数值。

```java
public static int calculateSum(int a, int b) {
    return a + b;
}
```

该方法将结果交给调用者。

调用方可以继续计算：

```java
int result = calculateSum(10, 20);
int doubled = result * 2;
```

因此：

- println 负责展示。
- return 负责返回结果。
- 业务计算方法通常应该专注于计算。
- main 或其他调用层负责决定如何展示结果。

### 4.5 return 提前结束方法

执行 return 后，当前方法立即结束。

例如：

```java
public static int getPositiveNumber(int number) {
    if (number < 0) {
        return 0;
    }

    return number;
}
```

当 number 小于 0 时，会直接返回 0，不再执行后面的返回语句。

这种方式可以用于非法参数检查或提前终止不必要的处理。

### 4.6 void 方法中的 return

void 方法也可以使用不带返回值表达式的 return：

```java
public static void printScore(int score) {
    if (score < 0 || score > 100) {
        System.out.println("Invalid score");
        return;
    }

    System.out.println(score);
}
```

这里 return 的作用是提前结束当前方法，不返回业务数据。

### 4.7 条件分支中的返回路径

对于有返回值的方法，所有能够正常完成的方法执行路径必须有适当的返回结果。

正确示例：

```java
public static boolean isPass(int score) {
    if (score >= 60) {
        return true;
    } else {
        return false;
    }
}
```

也可以简化为：

```java
public static boolean isPass(int score) {
    return score >= 60;
}
```

错误示例：

```java
public static boolean isPass(int score) {
    if (score >= 60) {
        return true;
    }
}
```

如果 score 小于 60，没有返回语句可以执行，会导致 missing return statement 编译错误。

### 4.8 整数除法与 double

错误思路：

```java
public static double average(int a, int b) {
    return (a + b) / 2;
}
```

虽然声明返回 double，但内部 `(a + b) / 2` 先执行整数除法。

例如 175 / 2 得到整数 87，最后转换为 87.0。

正确写法：

```java
public static double average(int a, int b) {
    return (a + b) / 2.0;
}
```

得到 87.5。

也可以使用：

```java
return (double) (a + b) / 2;
```

需要记住：

**方法返回 double，并不代表内部整数表达式自动采用浮点数运算。**

### 4.9 返回值类型不匹配

错误示例：

```java
public static int getNumber() {
    return 10.5;
}
```

因为 double 不能直接隐式转换为 int。

正确设计方法时，需要同时关注：

- 参数类型。
- 计算表达式类型。
- 返回值类型。
- 调用方接收变量类型。

## 五、方法重载

### 5.1 方法重载的含义

方法重载（Method Overloading）是指在同一个类中定义多个名称相同、但形参列表不同的方法。

例如：

```java
public static void show(int value) {
    System.out.println(value);
}

public static void show(double value) {
    System.out.println(value);
}
```

两个方法名称均为 show，但参数类型不同，构成合法重载。

### 5.2 参数数量不同

```java
public static void show(int a) {
    System.out.println(a);
}

public static void show(int a, int b) {
    System.out.println(a + ", " + b);
}
```

参数数量不同，可以构成重载。

### 5.3 参数类型不同

```java
public static void show(int number) {
    System.out.println(number);
}

public static void show(String text) {
    System.out.println(text);
}
```

参数类型不同，可以构成重载。

### 5.4 参数类型排列顺序不同

```java
public static void show(int id, String name) {
    System.out.println(id + ": " + name);
}

public static void show(String name, int id) {
    System.out.println(name + ": " + id);
}
```

参数类型顺序不同，可以构成重载。

但仅调换两个相同类型参数的名称，不构成重载。

### 5.5 仅修改返回类型不能构成重载

下面两个方法不能同时定义：

```java
public static int getValue(int number) {
    return number;
}

public static double getValue(int number) {
    return number;
}
```

两个方法名称相同，参数列表也相同。

仅返回类型不同，不构成合法重载。

### 5.6 方法签名

Java 方法签名由方法名称及形参类型等构成，不包含返回类型。

对于当前学习范围：

- 参数数量不同，可以重载。
- 参数类型不同，可以重载。
- 参数类型排列顺序不同，可以重载。
- 仅形参名称不同，不可以重载。
- 仅返回类型不同，不可以重载。
- 仅访问修饰符不同，不可以重载。
- 仅 static 修饰不同，不可以重载。

### 5.7 重载解析

当调用重载方法时，编译器根据实参类型选择适用方法。

例如：

```java
public static void showNumber(int value) {
    System.out.println("int");
}

public static void showNumber(double value) {
    System.out.println("double");
}
```

调用：

```java
showNumber(10);
showNumber(10.5);
```

输出：

```text
int
double
```

在这些简单场景下，精确类型匹配优于需要基本类型拓宽转换的匹配。

### 5.8 基本类型拓宽转换

常见关系包括：

```text
byte → short → int → long → float → double
char → int → long → float → double
```

当没有精确匹配的方法时，编译器可能通过允许的自动类型转换匹配其他重载版本。

重载解析不仅取决于方法出现顺序，也不能简单认为编译器总是选择参数类型范围最大的版本。

### 5.9 重载歧义

例如：

```java
public static void show(int a, double b) {
    System.out.println("First");
}

public static void show(double a, int b) {
    System.out.println("Second");
}
```

调用：

```java
show(10, 20);
```

可能产生歧义，因为两个方法都适用，而编译器无法确定唯一最具体的版本。

可以通过明确参数类型消除歧义：

```java
show(10, 20.0);
show(10.0, 20);
```

### 5.10 重载与重写

重载 Overload：

- 方法名称相同。
- 参数列表不同。
- 不需要继承关系。

重写 Override：

- 通常涉及继承或接口实现。
- 子类提供符合重写规则的方法实现。
- 后续面向对象课程再深入学习。

## 六、方法复用与业务逻辑拆分

### 6.1 方法之间可以互相调用

例如：

```java
public static int max(int a, int b) {
    if (a >= b) {
        return a;
    }

    return b;
}
```

三参数版本可以复用两参数方法：

```java
public static int max(int a, int b, int c) {
    return max(max(a, b), c);
}
```

执行：

```java
max(5, 9, 9);
```

先计算：

```text
max(5, 9) = 9
```

然后计算：

```text
max(9, 9) = 9
```

最终返回 9。

这种写法避免了重复实现比较逻辑。

### 6.2 方法职责划分

当前阶段推荐：

main 方法负责：

1. 准备输入数据。
2. 调用业务方法。
3. 保存方法返回值。
4. 统一输出结果。

自定义业务方法负责：

1. 接收参数。
2. 执行计算或判断。
3. 必要时进行合法性检查。
4. 返回结果。

这为后续面向对象与分层开发奠定基础。

## 七、除数为零与 Double.NaN

### 7.1 整数除以零

对于整数除法，除数为 0 会导致 ArithmeticException。

例如：

```java
int result = 10 / 0;
```

属于非法整数运算。

### 7.2 先校验后计算

本日综合程序使用：

```java
public static boolean isValidDivisor(int divisor) {
    return divisor != 0;
}
```

除法方法先调用它检查除数。

### 7.3 Double.NaN

Double.NaN 是 double 类型的特殊值，表示 Not a Number。

本节按照明确业务规范，用它表示不允许执行的除零计算结果。

例如：

```java
public static double divide(int a, int b) {
    if (isValidDivisor(b)) {
        return (double) a / b;
    } else {
        return Double.NaN;
    }
}
```

对于：

```java
divide(10, 0);
```

返回 NaN。

对于：

```java
divide(10, 4);
```

返回 2.5。

这里的规则属于本节教学约定。真实系统应根据具体业务设计合理的异常、错误结果或数据校验机制。

## 八、Java 与 Python 的对比

| 对比内容 | Java | Python |
|---|---|---|
| 方法或函数定义 | 需要在类中声明方法 | 可以使用 def 定义模块级函数 |
| 方法参数类型 | 必须声明类型 | 不强制类型注解 |
| 返回类型 | 必须声明 | 不强制声明 |
| 无返回值 | void | 无显式返回值时通常返回 None |
| 方法体结构 | 花括号 | 缩进 |
| 调用方式 | 方法名加参数列表 | 函数名加参数列表 |
| 局部作用域 | 块与方法作用域 | 主要采用函数等作用域规则 |
| 参数传递 | 按值传递 | 对象共享传递机制 |
| 方法重载 | 支持参数列表不同的重载 | 普通 def 不支持直接重复定义同名函数实现 Java 式重载 |

### 8.1 Python 函数

```python
def calculate_sum(a, b):
    return a + b

result = calculate_sum(10, 20)
print(result)
```

### 8.2 Java 方法

```java
public static int calculateSum(int a, int b) {
    return a + b;
}
```

调用：

```java
int result = calculateSum(10, 20);
System.out.println(result);
```

Java 更强调方法声明时的静态类型约束。

这些约束有助于编译器提前发现参数和返回值不兼容的问题。

## 九、最终验收通过的 Java 源码

以下记录 Day 06 四节课程最终通过正式验收的源码版本。

### 9.1 LibraryNotice.java

文件路径：

`01-java-basics/day06/code/LibraryNotice.java`

```java
public class LibraryNotice {
    public static void main(String[] args) {
        printWelcome();
        printRules();
        printSeparator();
        printRules();
        printClosing();
    }

    // 输出欢迎信息
    public static void printWelcome() {
        System.out.println("=== Library Open ===");
    }

    // 输出两条入馆规则
    public static void printRules() {
        System.out.println("Keep quiet.");
        System.out.println("No food allowed.");
    }

    // 输出分割线
    public static void printSeparator() {
        System.out.println("--------------------");
    }

    // 输出闭馆提醒
    public static void printClosing() {
        System.out.println("=== Library Closed ===");
    }
}
```

实际运行输出：

```text
=== Library Open ===
Keep quiet.
No food allowed.
--------------------
Keep quiet.
No food allowed.
=== Library Closed ===
```

正式验收：

- 静态审查：14/14 通过。
- 业务测试：1/1 通过。
- 首次提交通过。
- 无阻断性问题。

### 9.2 EmployeeWorkRecord.java

文件路径：

`01-java-basics/day06/code/EmployeeWorkRecord.java`

以下保留最终针对性复验通过的完整源码版本。

```java
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
```

实际运行输出：

```text
Employee: Alice
ID: 1001
Employee: Bob
ID: 1002
Work Hours: 40
Salary Employee: Alice
Salary: 8500.5
Inside Hours: 100
Main Hours: 40
First Weekly Hour: 99
```

正式验收：

- 静态审查：18/18 通过。
- 业务测试：3/3 通过。
- 工资输出格式修复后复验通过。
- 无阻断性问题。

说明：

源码中保留了已验收版本的 `import java.awt.*;` 和原始注释。

该 import 未使用，属于非阻断性代码规范问题。未在归档时擅自改写已经验收的源码。

### 9.3 StudentScoreCalculator.java

文件路径：

`01-java-basics/day06/code/StudentScoreCalculator.java`

```java
public class StudentScoreCalculator {
    public static void main(String[] args) {
        // 分数变量声明与初始化
        int score1 = 80;
        int score2 = 95;

        // 计算总分
        int total = calculateTotal(score1, score2);

        // 计算平均分
        double average = calculateAverage(score1, score2);

        // 判断成绩合法性
        boolean valid = isValidScore(score1);

        // 判断两门成绩是否合法且平均分是否及格
        boolean pass = isPass(score1, score2);

        // 输出
        System.out.printf("Total: %d%n", total);
        System.out.printf("Average: %.1f%n", average);
        System.out.printf("Valid: %b%n", valid);
        System.out.printf("Pass: %b%n", pass);
        System.out.printf("Invalid Score: %b%n", isValidScore(-5));
        System.out.printf("Invalid Pass: %b%n", isPass(80, 120));
    }

    // 计算两门课程总分
    public static int calculateTotal(int score1, int score2) {
        return score1 + score2;
    }

    // 计算两门课程平均分
    public static double calculateAverage(int score1, int score2) {
        return (score1 + score2) / 2.0;
    }

    // 判断单科成绩合法性
    public static boolean isValidScore(int score) {
        return score >= 0 && score <= 100;
    }

    // 判断两门成绩是否合法且平均分是否及格
    public static boolean isPass(int score1, int score2) {
        if (isValidScore(score1) && isValidScore(score2)) {
            double average = calculateAverage(score1, score2);

            return average >= 60;
        } else {
            return false;
        }
    }
}
```

正式 main 实际输出：

```text
Total: 175
Average: 87.5
Valid: true
Pass: true
Invalid Score: false
Invalid Pass: false
```

TC05–TC07 补充测试实际输出：

```text
true
true
false
true
false
```

正式验收：

- 静态审查：20/20 通过。
- 业务测试：7/7 通过。
- 首次提交通过。
- 无阻断性问题。

### 9.4 Calculator.java

文件路径：

`01-java-basics/day06/code/Calculator.java`

以下为 Day 06 核心综合程序最终正式验收通过的完整源码。

```java
public class Calculator {
    public static void main(String[] args) {
        // 方法调用
        int intAddResult = add(10, 5);
        double doubleAddResult = add(10.5, 2.5);
        int intSubtractResult = subtract(10, 5);
        int intMultiplyResult = multiply(10, 5);
        double intDivideResult = divide(10, 4);
        double intDivideZeroResult = divide(10, 0);
        int twoIntMaxResult = max(10, 20);
        int threeIntMaxResult = max(10, 20, 15);
        boolean validDivisor = isValidDivisor(4);
        boolean invalidDivisor = isValidDivisor(0);

        // 方法测试与输出
        System.out.printf("Int Add: %d%n", intAddResult);
        System.out.printf("Double Add: %.1f%n", doubleAddResult);
        System.out.printf("Subtract: %d%n", intSubtractResult);
        System.out.printf("Multiply: %d%n", intMultiplyResult);
        System.out.printf("Divide: %.1f%n", intDivideResult);
        System.out.printf("Divide Zero: %.1f%n", intDivideZeroResult);
        System.out.printf("Max Two: %d%n", twoIntMaxResult);
        System.out.printf("Max Three: %d%n", threeIntMaxResult);
        System.out.printf("Valid Divisor: %b%n", validDivisor);
        System.out.printf("Invalid Divisor: %b%n", invalidDivisor);
    }

    // 整数加法
    public static int add(int a, int b) {
        return a + b;
    }

    // 小数加法
    public static double add(double a, double b) {
        return a + b;
    }

    // 整数减法
    public static int subtract(int a, int b) {
        return a - b;
    }

    // 整数乘法
    public static int multiply(int a, int b) {
        return a * b;
    }

    // 整数参数的浮点数除法
    public static double divide(int a, int b) {
        if (isValidDivisor(b)) {
            return (double) a / b;
        } else {
            return Double.NaN;
        }
    }

    // 两个整数的最大值
    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    // 三个整数的最大值
    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    // 判断除数合法性
    public static boolean isValidDivisor(int divisor) {
        return divisor != 0;
    }
}
```

正式 main 实际输出：

```text
Int Add: 15
Double Add: 13.0
Subtract: 5
Multiply: 50
Divide: 2.5
Divide Zero: NaN
Max Two: 20
Max Three: 20
Valid Divisor: true
Invalid Divisor: false
```

TC06–TC12 补充边界测试实际输出：

```text
-2
-5
0
3.5
0.0
10
9
9
```

正式验收：

- 静态审查：24/24 通过。
- 业务测试：12/12 通过。
- CR22 修复后针对性复验通过。
- 正式十行输出回归验证通过。
- 无阻断性问题。

## 十、实际错误与修复经验

### 10.1 D06-S01：方法复用正确

LibraryNotice.java 首次提交即通过全部审查。

正确实现了：

- 一个方法只定义一次。
- 同一个方法可以调用多次。
- main 负责调用顺序。
- 自定义方法负责输出具体业务信息。

非阻断性改进建议：

将注释中的“分割线”统一为“分隔线”。

### 10.2 D06-S02：工资输出小数位不符合要求

首次提交：

```java
System.out.printf("Salary: %.2f%n", salary);
```

实际输出：

```text
Salary: 8500.50
```

任务要求：

```text
Salary: 8500.5
```

修改为：

```java
System.out.printf("Salary: %.1f%n", salary);
```

修复后：

- CR18 复验通过。
- TC01 复验通过。
- CR01–CR17 保留通过。
- TC02–TC03 保留通过。
- 最终静态审查 18/18。
- 最终业务测试 3/3。

经验：

Java 代码语法正确、业务数值正确，并不代表输出格式一定符合正式规范。

printf 的格式说明符会直接影响结果展示。

`%.1f` 是固定一位小数的格式要求，并不意味着适用于所有工资数据的精度需求。

### 10.3 D06-S02：无用 import 与注释精确性

最终通过的源代码中包含：

```java
import java.awt.*;
```

当前程序未使用 AWT 类，因此可以删除该导入。

原注释：

```java
// 引用类型修改
```

更准确的描述是：

```java
// 通过引用参数修改数组元素
```

因为 Java 仍采用按值传递，数组参数复制的是引用值。

这两点属于非阻断性代码规范建议。

### 10.4 D06-S03：return 与方法复用正确

StudentScoreCalculator.java 首次提交即通过全部审查与测试。

正确实现：

```java
return (score1 + score2) / 2.0;
```

避免整数除法截断。

同时：

```java
return score >= 0 && score <= 100;
```

直接返回 boolean 表达式。

isPass 方法复用已有的成绩合法性判断与平均分计算方法。

通过不同分支返回 true 或 false，确保返回路径完整。

### 10.5 D06-S04：main 未按要求先保存返回值

首次提交中：

```java
System.out.printf("Int Add: %d%n", add(10, 5));
```

这在 Java 中是合法写法，计算结果和输出也正确。

但是正式练习明确要求：

先将方法返回值保存到局部变量，再统一输出。

首次结果：

- 静态审查 23/24。
- 业务测试 12/12。
- CR22 未通过。

修改后：

```java
int intAddResult = add(10, 5);
```

然后：

```java
System.out.printf("Int Add: %d%n", intAddResult);
```

其余九项调用也按照返回类型分别保存到 int、double 和 boolean 局部变量中。

针对性复验：

- CR22 更新为通过。
- CR01–CR21、CR23–CR24 保留通过。
- TC01–TC05 重新完成输出回归验证。
- TC06–TC12 保留通过。
- 最终静态审查 24/24。
- 最终业务测试 12/12。

经验：

应区分 Java 语法正确性与具体课程的结构性要求。

在实际开发中，直接把方法返回值传入 printf 是合法的；但本节为了验证返回值保存与使用能力，明确要求分成两个步骤。

### 10.6 D06-S04：除法与方法复用

使用：

```java
return (double) a / b;
```

避免整数除法。

使用：

```java
return Double.NaN;
```

处理本节规定的除零情况。

使用：

```java
return max(max(a, b), c);
```

复用两参数 max 方法。

经验：

- 应在危险运算发生前进行检查。
- 方法之间可以互相调用。
- 重载方法可以复用其他重载版本。
- 嵌套调用能够减少重复业务代码。
- 方法应尽可能保持清晰的单一职责。

## 十一、实际后端开发中的应用

### 11.1 Service 业务方法

后端开发中的 Service 层通常包含各种业务方法。

例如：

```java
public static boolean isValidScore(int score) {
    return score >= 0 && score <= 100;
}
```

可以用于校验成绩数据。

未来学习 Spring Boot 时，这类逻辑可以进一步封装到业务服务中。

### 11.2 参数校验

方法可以根据传入的数据判断合法性。

例如：

- 学号是否合法。
- 成绩是否在范围内。
- 库存数量是否非负。
- 用户是否符合某项业务条件。

使用返回 boolean 的方法可以提高条件判断的可读性。

### 11.3 业务计算

独立计算方法可以用于：

- 计算订单金额。
- 统计学生成绩。
- 计算库存总量。
- 计算运费。
- 计算设备运行指标。
- 处理基本数值统计。

### 11.4 避免 main 承担全部业务

随着项目变大，main 不应该承担所有细节。

应逐渐形成：

```text
程序入口
    |
    +-- 准备数据
    |
    +-- 调用数据校验方法
    |
    +-- 调用业务计算方法
    |
    +-- 获取返回结果
    |
    +-- 展示或传递结果
```

后续面向对象课程会进一步学习类与对象。

Spring Boot 阶段将正式学习 Controller、Service 等分层组织方式。

### 11.5 方法重载的实际用途

方法重载适用于业务含义一致、参数形式不同的操作。

例如：

- 根据不同类型的标识查询数据。
- 使用不同参数数量创建业务对象。
- 采用不同类型的参数进行格式转换。
- 通过不同参数组合执行相同类别的计算。

重载应该服务于清晰的业务语义，而不是为了让多个无关方法使用同一个名称。

## 十二、Day 06 最终总结

已完成四个独立 Java 程序：

1. LibraryNotice.java
2. EmployeeWorkRecord.java
3. StudentScoreCalculator.java
4. Calculator.java

验收结果：

| 项目 | 结果 |
|---|---|
| 课程验收 | 4/4 |
| Java 编程练习 | 4/4 |
| 静态代码审查 | 76/76 |
| 正式业务测试 | 23/23 |
| 核心综合程序 | Calculator.java |
| 核心综合审查 | 24/24 |
| 核心综合测试 | 12/12 |
| 阻断性问题 | 0 |
| 课程状态 | 全部正式验收通过 |

本日已经掌握：

- 方法定义与调用。
- void 与 static 基础。
- 方法参数及实参传递。
- 局部变量和作用域。
- Java 按值传递。
- 基本类型与数组引用参数行为。
- return 与返回值。
- 提前返回及完整返回路径。
- 整数除法与 double。
- 方法重载。
- 重载解析的基本规则。
- 方法之间的调用与复用。
- 基础计算业务封装。
- 除数为零与最大值边界处理。

Day 06 学习记录按照 Git 归档完成的预期最终状态整理。

累计完成学习进度：6/90 天。

下一学习日：Day 07。

学习主题：第一周综合复习与考核。

核心任务：命令行学生成绩统计器，至少通过五组业务测试。

Day 07 必须在 Day 06 的实际 Git 归档正式验收完成后开始。