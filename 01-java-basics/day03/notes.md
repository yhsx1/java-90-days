# Day 03 学习笔记

## 一、基本信息

- 学习日期：2026-11-05 至 2026-11-08
- 所属阶段：第一阶段，Java 基础与面向对象
- 学习主题：Java 运算符、if/else、switch 与成绩等级判断
- 开发环境：Windows、JDK 21、IntelliJ IDEA
- 课程完成情况：4/4
- Java 编程练习：4 个
- 核心综合验收文件：GradeJudge.java
- 最终验收结果：全部通过

## 二、Java 关系运算符与逻辑表达式

### 2.1 什么是关系运算符

关系运算符用于比较两个表达式的值，判断某个条件是否成立。

关系表达式的结果为 boolean 类型，只可能是 true 或 false。

例如：

```java
int score = 85;

boolean passed = score >= 60;
boolean excellent = score >= 90;
```

其中：

- passed 为 true。
- excellent 为 false。

关系运算符是 Java 条件判断的基础。

### 2.2 Java 六种关系运算符

| 运算符 | 含义     | 示例           |
|--------|----------|----------------|
| >      | 大于     | `score > 90`   |
| <      | 小于     | `score < 60`   |
| >=     | 大于等于 | `score >= 60`  |
| <=     | 小于等于 | `score <= 100` |
| ==     | 等于     | `status == 1`  |
| !=     | 不等于   | `status != 0`  |

注意：

```java
int age = 20;
boolean result = age == 20;
```

`=` 用于赋值，`==` 用于比较是否相等。

### 2.3 boolean 类型与比较结果

Java 的 boolean 类型只有两个值：

```java
true
false
```

例如：

```java
int age = 22;

boolean ageValid = age >= 18;
System.out.println(ageValid);
```

输出：

```text
true
```

Java 的逻辑判断必须使用 boolean 表达式，不能直接将普通整数作为条件。

### 2.4 逻辑与 &&

逻辑与要求两个条件同时成立。

```java
int age = 22;
boolean accountActive = true;

boolean allowed = age >= 18 && accountActive;
```

两个条件均为 true，因此 allowed 为 true。

真值规则：

| 条件 A | 条件 B | A && B |
|--------|--------|--------|
| true   | true   | true   |
| true   | false  | false  |
| false  | true   | false  |
| false  | false  | false  |

### 2.5 逻辑或 ||

逻辑或表示只要至少一个条件成立，整体结果就为 true。

```java
boolean isMember = false;
int creditPoints = 85;

boolean qualificationValid =
        isMember || creditPoints >= 80;
```

因为信用积分满足要求，所以 qualificationValid 为 true。

### 2.6 逻辑非 !

逻辑非用于反转 boolean 值。

```java
boolean hasViolation = false;
boolean noViolation = !hasViolation;
```

noViolation 为 true。

对于复杂业务规则，可以结合 &&、|| 和 ! 使用。

### 2.7 短路求值

逻辑与 && 和逻辑或 || 都具有短路求值特性。

对于：

```java
A && B
```

当 A 为 false 时，Java 不再计算 B。

对于：

```java
A || B
```

当 A 为 true 时，Java 不再计算 B。

例如：

```java
int total = 100;
int count = 0;

boolean valid = count != 0 && total / count > 10;
```

因为第一个条件为 false，第二个表达式不会执行，从而避免整数除零异常。

对于 boolean 操作数，`&` 和 `|` 也能进行逻辑运算，但不会短路。

### 2.8 多条件业务表达式

实际业务通常需要同时判断多个条件。

例如：

```java
boolean canBorrow =
        ageValid
        && accountActive
        && noViolation
        && qualificationValid;
```

该表达式要求：

1. 年龄合格。
2. 账户正常。
3. 没有违规记录。
4. 借阅资格合格。

四项条件都成立时才能借阅。

### 2.9 运算符优先级

本日主要运算符的优先级：

1. 括号 `()`
2. 逻辑非 `!`
3. 乘除取余 `* / %`
4. 加减 `+ -`
5. 大小比较 `< <= > >=`
6. 相等比较 `== !=`
7. 逻辑与 `&&`
8. 逻辑或 `||`

复杂表达式应使用括号明确分组。

例如：

```java
boolean allowed =
        (age >= 18 && age <= 60)
        && (isMember || creditPoints >= 80)
        && !hasViolation;
```

括号有助于代码阅读和维护。

## 三、Java 与 Python 的区别

### 3.1 比较运算符

Java 和 Python 都支持：

- `>`
- `<`
- `>=`
- `<=`
- `==`
- `!=`

但 Python 支持连续区间比较：

```python
18 <= age <= 60
```

Java 必须写成：

```java
age >= 18 && age <= 60
```

### 3.2 逻辑运算符

| 操作   | Java  | Python |
|--------|-------|--------|
| 逻辑与 | &&    | and    |
| 逻辑或 | \|\|  | or     |
| 逻辑非 | !     | not    |
| 真值   | true  | True   |
| 假值   | false | False  |

Java 的 &&、|| 要求 boolean 操作数，并返回 boolean。

Python 的 and、or 可以操作其他对象，其结果也不一定为布尔值。

### 3.3 if/else 语法

Java：

```java
if (score >= 90) {
    System.out.println("Excellent");
} else if (score >= 60) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

Python：

```python
if score >= 90:
    print("Excellent")
elif score >= 60:
    print("Pass")
else:
    print("Fail")
```

主要区别：

- Java 使用 else if。
- Python 使用 elif。
- Java 使用花括号划分代码块。
- Python 使用缩进划分代码块。
- Java 条件必须为 boolean 类型。

### 3.4 switch 与 match/case

Java：

```java
int status = 2;

switch (status) {
    case 1:
        System.out.println("Pending");
        break;
    case 2:
        System.out.println("Paid");
        break;
    default:
        System.out.println("Unknown");
}
```

Python 3.10+：

```python
status = 2

match status:
    case 1:
        print("Pending")
    case 2:
        print("Paid")
    case _:
        print("Unknown")
```

Java 传统 switch 可能产生贯穿，而 Python 的 match/case 不会发生传统 switch 式的贯穿。

### 3.5 boolean 条件判断

Python 可以直接根据整数、字符串等对象的真值进行条件判断。

Java 不允许把普通整数自动转换成 boolean。

错误示例：

```java
int count = 5;

if (count) {
    System.out.println("Valid");
}
```

正确写法：

```java
if (count > 0) {
    System.out.println("Valid");
}
```

### 3.6 Java 21 箭头式 switch

Java 21 支持箭头式 switch：

```java
switch (status) {
    case 1 -> System.out.println("Pending");
    case 2 -> System.out.println("Paid");
    default -> System.out.println("Unknown");
}
```

箭头式分支不会产生传统贯穿，也不需要在每个分支末尾添加 break。

本日综合练习使用传统 switch，以验证对 break 的掌握。

## 四、Java 条件运算与表达式

### 4.1 关系比较表达式

```java
int score = 85;

boolean passed = score >= 60;
boolean excellent = score >= 90;
```

关系运算符用于构建业务条件。

### 4.2 逻辑运算表达式

```java
boolean valid = score >= 0 && score <= 100;
boolean invalid = score < 0 || score > 100;
```

两个表达式分别表示成绩合法和成绩非法。

### 4.3 数值区间判断

Java 不支持：

```java
// 错误
boolean valid = 0 <= score <= 100;
```

正确写法：

```java
boolean valid = score >= 0 && score <= 100;
```

对于连续数值范围，应明确上下边界是否包含端点。

### 4.4 条件执行顺序

else if 从上到下判断条件。

例如：

```java
if (score >= 90) {
    grade = 'A';
} else if (score >= 80) {
    grade = 'B';
}
```

进入第二个分支时，已经确定 score 小于 90。

因此无需重复检查 score 小于 90。

### 4.5 条件遮蔽

错误示例：

```java
int score = 95;

if (score >= 60) {
    System.out.println("Pass");
} else if (score >= 90) {
    System.out.println("Excellent");
}
```

由于第一个条件已经成立，后面的优秀等级分支不会执行。

对于根据分数下限划分等级的场景，应该合理安排条件顺序。

### 4.6 非法业务数据判断

在进行正常业务逻辑之前，应明确检查输入范围。

例如：

```java
if (score < 0 || score > 100) {
    System.out.println("Invalid score");
}
```

非法数据不应进入正常等级结果输出流程。

### 4.7 浮点数精度与成绩边界

double 能保存小数成绩，但不应直接用于一般浮点计算结果的精确相等判断。

成绩等级计算中，应当保留原始分数的小数部分。

例如：

- 89.999 属于 B。
- 90.000 属于 A。
- 59.999 属于 F。
- 60.000 属于 D。

不应在等级判断前进行整数转换或四舍五入。

## 五、Java 条件判断与分支语法

### 5.1 if 单分支

语法：

```java
if (condition) {
    // 条件成立时执行
}
```

示例：

```java
int stock = 5;
int quantity = 8;

if (quantity > stock) {
    System.out.println("Insufficient stock");
}
```

### 5.2 if/else 双分支

语法：

```java
if (condition) {
    // 条件成立
} else {
    // 条件不成立
}
```

示例：

```java
if (balance >= paymentAmount) {
    System.out.println("Payment allowed");
} else {
    System.out.println("Insufficient balance");
}
```

两个分支只会执行其中一个。

### 5.3 else if 多分支

```java
if (score >= 90) {
    System.out.println("Excellent");
} else if (score >= 60) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

执行规则：

1. 从第一个 if 开始。
2. 条件成立时执行对应代码块。
3. 执行后跳过同一分支链中的其他条件。
4. 所有条件不成立时进入 else。

### 5.4 花括号与代码块

Java 使用花括号确定分支所控制的代码范围。

建议即使只有一条语句，也保留花括号。

```java
if (age >= 18) {
    System.out.println("Adult");
}
```

这种写法可以提高可读性，减少后续维护时的逻辑错误。

### 5.5 switch 基本结构

```java
switch (status) {
    case 1:
        System.out.println("Pending");
        break;
    case 2:
        System.out.println("Paid");
        break;
    default:
        System.out.println("Unknown");
}
```

switch 适合对固定值进行多分支匹配。

### 5.6 case 固定值匹配

case 标签用于匹配 switch 表达式的值。

例如：

```java
case 3:
    System.out.println("Shipped");
    break;
```

普通 Java 21 switch 中不能直接使用 double 范围比较替代 case 标签。

### 5.7 break 的作用

break 用于结束当前 switch。

```java
case 1:
    System.out.println("Pending");
    break;
```

遇到 break 后，程序不再执行后续 case 的语句。

break 不会直接结束整个 main 方法。

### 5.8 switch 贯穿现象

传统 switch 如果缺少 break，可能继续执行后续 case 的代码。

```java
int value = 2;

switch (value) {
    case 1:
        System.out.println("One");
    case 2:
        System.out.println("Two");
    case 3:
        System.out.println("Three");
}
```

输出：

```text
Two
Three
```

这是传统 switch 的贯穿现象。

### 5.9 default 默认分支

default 用于处理没有匹配 case 的情况。

```java
default:
    System.out.println("Invalid order status");
```

在 OrderStatusChecker.java 中，default 用于处理 0、6、-1 等未定义状态码。

default 的输出文字必须与业务要求一致。

### 5.10 多个 case 共用代码

多个 case 可以共用相同逻辑。

```java
switch (month) {
    case 4:
    case 6:
    case 9:
    case 11:
        System.out.println("30-day month");
        break;
    default:
        System.out.println("Other month");
}
```

这是有意使用贯穿，并非遗漏 break。

### 5.11 switch 与 if/else 的区别

| 对比         | if/else            | switch                     |
|--------------|--------------------|----------------------------|
| 主要用途     | 条件判断与范围比较 | 固定值匹配                 |
| 条件类型     | boolean 表达式     | 支持的选择表达式类型       |
| 区间判断     | 适合               | 普通 switch 不适合         |
| 多个条件组合 | 适合               | 不适合直接表达任意布尔组合 |
| 常见业务     | 分数、金额、权限   | 状态码、菜单、等级说明     |

GradeJudge.java 使用 if/else 判断分数区间，再使用 switch 输出等级说明。

## 六、Windows Java 开发环境

### 6.1 已安装的 JDK

- JDK：Eclipse Temurin 21.0.12.1 LTS
- Java 编译器：javac 21
- Java 版本：21

### 6.2 IntelliJ IDEA

- IDE：IntelliJ IDEA
- Project SDK：temurin-21
- 项目模块：java-90-days

### 6.3 Day 03 工作目录

```text
E:\Java\java-90-days\01-java-basics\day03\code
```

Day 03 包含四个已验收 Java 程序：

- LibraryAccessCheck.java
- ShippingFeeCalculator.java
- OrderStatusChecker.java
- GradeJudge.java

### 6.4 编译命令

```powershell
javac -encoding UTF-8 LibraryAccessCheck.java
javac -encoding UTF-8 ShippingFeeCalculator.java
javac -encoding UTF-8 OrderStatusChecker.java
javac -encoding UTF-8 GradeJudge.java
```

所有程序的编译记录均为成功。

### 6.5 运行命令

```powershell
java LibraryAccessCheck
java ShippingFeeCalculator
java OrderStatusChecker
java GradeJudge
```

四个程序均完成正式运行验收。

### 6.6 编译与运行的区别

- javac：将 .java 源文件编译为 .class 字节码。
- java：通过 JVM 执行编译后的程序。
- 编译成功表示语法等编译期检查通过。
- 运行成功不代表全部业务逻辑一定正确。
- 需要结合不同测试数据检查程序的实际行为。

## 七、Java 程序基本结构

### 7.1 类与源文件

```java
public class GradeJudge {
}
```

public 顶层类名必须与 Java 源文件名一致。

### 7.2 main 方法

```java
public static void main(String[] args) {
}
```

main 方法是本日控制台程序的入口。

### 7.3 变量声明与作用范围

```java
double score = 85.5;
char grade = 'B';
String description = "Good";
```

变量只能在其有效作用域内访问。

使用花括号创建代码块时，需要注意变量声明的位置。

### 7.4 花括号与分号

Java 使用花括号划分代码块。

一般变量声明、赋值和方法调用语句使用分号结束。

```java
int score = 90;

if (score >= 60) {
    System.out.println("Pass");
}
```

### 7.5 控制台输入输出

Scanner 用于从标准输入读取数据。

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
```

常用输入：

```java
int status = scanner.nextInt();
double score = scanner.nextDouble();
```

常用输出：

```java
System.out.print("Enter score: ");
System.out.println("Grade: A");
System.out.printf("Amount: %.2f%n", 85.5);
```

### 7.6 程序命名规范

- 类名使用大驼峰命名。
- 变量名使用小驼峰命名。
- 文件名与 public 类名一致。
- 使用四个空格缩进。
- 使用清晰的变量名称。
- 合理组织 if/else 和 switch。
- 避免无必要的重复判断。

## 八、Day 03 Java 编程练习

### 8.1 练习目标

Day 03 共完成四个 Java 程序。

| 程序                       | 练习目标                     |
|----------------------------|------------------------------|
| LibraryAccessCheck.java    | 关系运算符与多条件布尔表达式 |
| ShippingFeeCalculator.java | if/else 金额区间与运费计算   |
| OrderStatusChecker.java    | switch 状态码判断            |
| GradeJudge.java            | 成绩等级判断与边界测试       |

其中 GradeJudge.java 是 README 指定的 Day 03 核心综合验收文件。

### 8.2 文件位置

```text
01-java-basics/
└── day03/
    ├── code/
    │   ├── LibraryAccessCheck.java
    │   ├── ShippingFeeCalculator.java
    │   ├── OrderStatusChecker.java
    │   └── GradeJudge.java
    ├── tasks.md
    └── notes.md
```

### 8.3 最终源代码

#### LibraryAccessCheck.java

```java
public class LibraryAccessCheck {
    public static void main(String[] args) {
        // 变量声明与初始化
        int studentAge = 22;
        boolean accountActive = true;
        boolean hasViolation = false;
        boolean isMember = false;
        int creditPoints = 85;

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
```

#### ShippingFeeCalculator.java

```java
import java.util.Scanner;

public class ShippingFeeCalculator {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 读取订单金额
        System.out.print("Enter order amount: ");
        double orderAmount = scanner.nextDouble();

        // 费用计算与结果输出
        if (orderAmount < 0) {
            System.out.println("Invalid order amount");
        } else if(orderAmount >= 0 && orderAmount < 50) {
            System.out.printf("Shipping Fee: %.2f%n", 10.00);
            System.out.printf("Total Amount: %.2f%n", orderAmount + 10.00);
        } else if(orderAmount < 100) {
            System.out.printf("Shipping Fee: %.2f%n", 5.00);
            System.out.printf("Total Amount: %.2f%n", orderAmount + 5.00);
        } else {
            System.out.printf("Shipping Fee: %.2f%n", 0.00);
            System.out.printf("Total Amount: %.2f%n", orderAmount);
        }
    }
}
```

#### OrderStatusChecker.java

```java
import java.util.Scanner;

public class OrderStatusChecker {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 读取状态码
        System.out.print("Enter order status: ");
        int orderStatus = scanner.nextInt();

        // 根据状态码输出订单状态与业务说明
        switch (orderStatus) {
            case 1:
                System.out.println("Status: Pending");
                System.out.println("Description: Waiting for payment");
                break;
            case 2:
                System.out.println("Status: Paid");
                System.out.println("Description: Payment received");
                break;
            case 3:
                System.out.println("Status: Shipped");
                System.out.println("Description: Order is on the way");
                break;
            case 4:
                System.out.println("Status: Completed");
                System.out.println("Description: Order delivered");
                break;
            case 5:
                System.out.println("Status: Cancelled");
                System.out.println("Description: Order cancelled");
                break;
            default:
                System.out.println("Invalid order status");
        }
    }
}
```

#### GradeJudge.java

```java
import java.util.Scanner;

public class GradeJudge {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 读取成绩
        System.out.print("Enter student score: ");
        double score = scanner.nextDouble();

        // 成绩等级评定
        char grade = ' ';
        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
        } else {
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
        }

        // 等级说明评定
        String gradeDescription = "";
        switch (grade) {
            case 'A':
                gradeDescription = "Excellent";
                break;
            case 'B':
                gradeDescription = "Good";
                break;
            case 'C':
                gradeDescription = "Average";
                break;
            case 'D':
                gradeDescription = "Pass";
                break;
            case 'F':
                gradeDescription = "Fail";
                break;
            default:
        }

        // 输出评定结果
        if (score >= 0 && score <= 100) {
            System.out.println("Grade: " + grade);
            System.out.println("Description: " + gradeDescription);
        }
    }
}
```

### 8.4 编译命令

```powershell
cd E:\Java\java-90-days\01-java-basics\day03\code

javac -encoding UTF-8 LibraryAccessCheck.java
javac -encoding UTF-8 ShippingFeeCalculator.java
javac -encoding UTF-8 OrderStatusChecker.java
javac -encoding UTF-8 GradeJudge.java
```

四个程序编译成功，未出现编译错误。

### 8.5 运行命令

```powershell
java LibraryAccessCheck
java ShippingFeeCalculator
java OrderStatusChecker
java GradeJudge
```

需要输入数据的程序，每次运行处理一组数据。

### 8.6 综合练习最终运行结果

LibraryAccessCheck.java：

```text
Age Valid: true
No Violation: true
Qualification Valid: true
Account Active: true
Can Borrow: true
```

ShippingFeeCalculator.java：

```text
Enter order amount: 50
Shipping Fee: 5.00
Total Amount: 55.00
```

OrderStatusChecker.java：

```text
Enter order status: 3
Status: Shipped
Description: Order is on the way
```

GradeJudge.java：

```text
Enter student score: 95.5
Grade: A
Description: Excellent
```

非法成绩：

```text
Enter student score: -0.01
Invalid score
```

精细边界：

```text
Enter student score: 89.999
Grade: B
Description: Good
```

GradeJudge.java 全部二十四组测试：

| 编号 |   输入 | 实际结果      |
|------|-------:|---------------|
| TC01 |    100 | A / Excellent |
| TC02 |   95.5 | A / Excellent |
| TC03 |     90 | A / Excellent |
| TC04 |  89.99 | B / Good      |
| TC05 |   85.5 | B / Good      |
| TC06 |     80 | B / Good      |
| TC07 |  79.99 | C / Average   |
| TC08 |   75.5 | C / Average   |
| TC09 |     70 | C / Average   |
| TC10 |  69.99 | D / Pass      |
| TC11 |   65.5 | D / Pass      |
| TC12 |     60 | D / Pass      |
| TC13 |  59.99 | F / Fail      |
| TC14 |   45.5 | F / Fail      |
| TC15 |      0 | F / Fail      |
| TC16 |  -0.01 | Invalid score |
| TC17 |     -1 | Invalid score |
| TC18 |   -100 | Invalid score |
| TC19 | 100.01 | Invalid score |
| TC20 |    101 | Invalid score |
| TC21 |    150 | Invalid score |
| TC22 | 89.999 | B / Good      |
| TC23 | 59.999 | F / Fail      |
| TC24 | 99.999 | A / Excellent |

全部运行输出符合验收要求。

### 8.7 综合验收结果

| 程序                       | 验收项目 | 业务测试 | 结果 |
|----------------------------|----------|----------|------|
| LibraryAccessCheck.java    | 12/12    | 6/6      | 通过 |
| ShippingFeeCalculator.java | 15/15    | 10/10    | 通过 |
| OrderStatusChecker.java    | 15/15    | 8/8      | 通过 |
| GradeJudge.java            | 20/20    | 24/24    | 通过 |

综合结果：

- javac 编译：全部成功
- java 命令行运行：全部成功
- 代码审查：全部通过
- 业务测试：48/48 通过
- 核心综合验收：GradeJudge.java 通过

## 九、错误记录与修改经验

### 9.1 本次实际错误

第 1 课：

- LibraryAccessCheck.java 首次提交遗漏 accountActive 条件。
- 最终借阅资格判断未完整覆盖业务要求。

第 2 课：

- ShippingFeeCalculator.java 首次提交通过。
- 代码中存在可以省略的冗余条件。
- else if 后的空格格式可以改进。

第 3 课：

- OrderStatusChecker.java 首次 default 输出两行额外内容。
- 第一次修改后的 Unknown order status 与要求不一致。
- 最终通过修改输出文字解决问题。

第 4 课：

- GradeJudge.java 首次提交通过。
- 存在重复判断成绩合法性的可优化代码。
- 非法成绩仍会进入后续 switch。
- default 分支为空。

以上第 4 课问题属于代码质量建议，不影响本次规定范围内的程序正确性。

### 9.2 修复方式

LibraryAccessCheck.java：

- 将 accountActive 加入最终借阅条件。
- 重新编译。
- 重点运行账户异常测试。
- 六组测试全部通过。

OrderStatusChecker.java：

- 删除 default 中多余的 Status 和 Description 输出。
- 将错误提示文字统一为 Invalid order status。
- 重新运行 TC06、TC07、TC08。
- 八组测试最终全部通过。

ShippingFeeCalculator.java 和 GradeJudge.java 均不需要修改已验收代码。

### 9.3 调试经验

1. 先检查业务需求，再检查条件表达式是否完整。
2. 使用异常业务状态验证必要条件。
3. 重点测试各数值区间的边界。
4. 检查 else if 条件执行顺序。
5. 传统 switch 要注意 break。
6. default 输出必须符合规定格式。
7. 编译成功后仍然需要实际运行测试。
8. 正常测试通过后还应进行非法值和边界值测试。
9. 不随意修改已经验收通过的正确代码。
10. 记录可优化问题，但应区分功能错误与代码风格建议。

## 十、常见错误汇总

### 10.1 赋值与相等比较混淆

错误：

```java
// 使用 = 代替比较
```

正确使用 == 判断是否相等。

### 10.2 Java 与 Python 逻辑语法混淆

Java 使用 &&、||、!。

不能直接使用 Python 的 and、or、not。

### 10.3 使用连续区间比较

Java 不支持：

```java
// 错误示意
// 0 <= score <= 100
```

应使用两个关系表达式并通过 && 连接。

### 10.4 业务条件遗漏

多个条件共同决定业务结果时，应检查是否遗漏账户状态、权限或其他限制。

本日 LibraryAccessCheck.java 曾遗漏账户状态条件。

### 10.5 else if 分支顺序错误

较宽泛的条件写在前面，可能使后续分支无法执行。

对于按最低分数划分的成绩等级，可以按照从高到低的顺序判断。

### 10.6 数值边界判断错误

应明确区间端点是否包含。

例如：

- 49.99 元与 50 元对应不同运费。
- 99.99 元与 100 元对应不同运费。
- 89.999 分与 90 分对应不同等级。

### 10.7 非法输入未处理

成绩小于 0 或大于 100 时，应输出 Invalid score。

不能把非法负分直接当成 F 等级。

### 10.8 switch 遗漏 break

传统 switch 缺少 break 可能导致贯穿。

独立分支应合理使用 break。

### 10.9 default 输出格式错误

本日 OrderStatusChecker.java 曾输出：

```text
Status: Invalid
Description: Unknown order status
```

以及：

```text
Unknown order status
```

最终正确输出：

```text
Invalid order status
```

### 10.10 char 与 String 混淆

```java
char grade = 'A';
String description = "Excellent";
```

char 使用单引号，String 使用双引号。

### 10.11 浮点成绩提前转换为整数

不应在成绩等级判断前将 double 成绩直接转换为 int。

否则可能丢失小数部分，影响边界处理。

### 10.12 重复条件判断

已经通过前面的分支确定某个条件不成立时，后面的分支通常无需重复同一判断。

应在正确性的基础上减少冗余。

### 10.13 空 default 分支

空 default 在传统 switch 中可以编译，但会静默忽略未知状态。

实际业务中应根据需求设计明确的异常状态处理。

### 10.14 输出格式不匹配

即使业务逻辑正确，输出文字、空格、大小写或行数不符合要求，也会导致验收失败。

## 十一、工程目录与文件规范

Day 03 工作目录：

```text
01-java-basics/
└── day03/
    ├── code/
    │   ├── LibraryAccessCheck.java
    │   ├── ShippingFeeCalculator.java
    │   ├── OrderStatusChecker.java
    │   └── GradeJudge.java
    ├── tasks.md
    └── notes.md
```

文件管理要求：

- Java 源代码放在 code 目录。
- tasks.md 保存课程任务与验收记录。
- notes.md 保存知识点、最终源代码和调试经验。
- docs/progress.md 维护整体学习进度。
- docs/handoffs/day03.md 保存下一学习日的交接信息。
- README.md 保留完整学习路线。
- 不提交 .class 编译产物。
- 不提交临时文件、IDE 缓存或敏感配置。
- 不修改已验收的 Day 01、Day 02 历史 Java 代码。
- 路线图指定的 GradeJudge.java 为 Day 03 核心综合验收文件。

## 十二、Day 03 最终总结

### 12.1 已完成课程

| 课程    | 主题                               | 验收结果 |
|---------|------------------------------------|----------|
| 第 1 课 | 关系运算符、逻辑运算符与布尔表达式 | 通过     |
| 第 2 课 | if/else 条件判断                   | 通过     |
| 第 3 课 | switch 多分支选择                  | 通过     |
| 第 4 课 | GradeJudge.java 综合编程           | 通过     |

### 12.2 已掌握的基础操作

- 关系运算符与 boolean 表达式
- 逻辑与、逻辑或、逻辑非
- 短路求值
- 运算符优先级
- if/else 条件判断
- else if 多分支判断
- 数值区间与边界处理
- switch、case、break、default
- 传统 switch 贯穿
- Java 21 箭头式 switch 基础
- Scanner 输入与条件分支综合应用
- 成绩等级判断
- 非法输入处理
- 多组实际运行测试

### 12.3 正式项目状态

- Student Manager Console：尚未开始。
- Campus Assistant Platform：尚未开始。
- Day 03 四个 Java 编程练习：全部验收通过。
- GradeJudge.java：核心综合验收通过。
- 学习进度：3/90 天。

### 12.4 下一学习日

Day 04：

**Java for、while、break、continue 与循环控制。**

核心综合验收文件：

`01-java-basics/day04/code/NumberPractice.java`

主要学习内容：

- for 循环
- while 循环
- break
- continue
- 循环求和
- 九九乘法表

**Day 03 正式综合验收：通过**