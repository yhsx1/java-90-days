# Day 04 学习笔记

## 一、基本信息

- 学习日期：2026-11-09 至 2026-11-13
- 所属阶段：第一阶段，Java 基础与面向对象
- 学习主题：Java for、while、break、continue 与循环控制
- 开发环境：Windows、JDK 21、IntelliJ IDEA
- 课程完成情况：4/4
- Java 编程练习：4 个
- 核心综合验收文件：NumberPractice.java
- 最终验收结果：全部通过

## 二、Java 循环控制基础

### 2.1 什么是循环

循环是程序根据特定条件，重复执行某段代码的控制结构。

使用循环可以减少重复代码，并根据循环条件控制程序执行次数。

Java 常见循环结构包括：

- for 循环。
- while 循环。

本日重点学习上述两种结构，以及 break、continue 和嵌套循环。

### 2.2 为什么需要循环

例如，需要连续输出五个整数：

```java
System.out.println(1);
System.out.println(2);
System.out.println(3);
System.out.println(4);
System.out.println(5);
```

可以通过循环简化：

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

循环适用于计数、累加、输入处理、批量扫描和重复业务处理。

### 2.3 for 循环

基本语法：

```java
for (初始化表达式; 条件表达式; 更新表达式) {
    // 循环体
}
```

例如：

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

执行顺序：

1. 初始化循环变量。
2. 判断条件。
3. 条件为 true 时执行循环体。
4. 执行更新表达式。
5. 返回条件判断。
6. 条件为 false 时退出循环。

其中，初始化表达式通常只执行一次。

### 2.4 while 循环

基本语法：

```java
while (条件表达式) {
    // 循环体
}
```

例如：

```java
int count = 1;

while (count <= 3) {
    System.out.println(count);
    count++;
}
```

while 会先检查条件，再决定是否执行循环体。

循环条件初始为 false 时，循环体执行零次。

while 通常需要程序员自行管理循环变量和状态更新。

### 2.5 循环条件

Java 循环条件必须产生 boolean 结果。

例如：

```java
int stock = 20;
boolean continueFlag = true;

while (stock > 0 && continueFlag) {
    // 库存处理
}
```

只有 stock 大于 0 且 continueFlag 为 true，循环才继续。

多个条件可以使用 &&、|| 等逻辑运算符组合。

### 2.6 循环变量与循环次数

典型计数循环：

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

执行五次。

如果使用：

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

同样执行五次，但输出从 0 到 4。

需要根据实际业务确定循环起点、终点和更新步长。

### 2.7 无限循环

当循环条件持续为 true，且程序没有能够改变条件的执行路径时，可能发生非预期无限循环。

例如：

```java
int number = 1;

while (number <= 5) {
    System.out.println(number);
}
```

number 没有变化，无法达到正常终止条件。

本例仅用于分析错误，不应直接执行。

有意设计的无限循环也可以通过 break 正常退出：

```java
while (true) {
    int number = scanner.nextInt();

    if (number == 0) {
        break;
    }
}
```

本日核心程序采用了这种结构。

## 三、Java 与 Python 的区别

### 3.1 for 循环

Java：

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

Python：

```python
for i in range(5):
    print(i)
```

两种写法均输出 0 到 4。

主要区别：

- Java 传统 for 在循环头中定义初始化、条件和更新。
- Python 常使用 range 生成迭代序列。
- Java 使用花括号界定代码块。
- Python 使用缩进界定代码块。
- Java 循环变量可以使用 int 等明确类型。
- Python 变量不需要显式声明类型。

### 3.2 while 循环

Java：

```java
int number = 1;

while (number <= 3) {
    System.out.println(number);
    number++;
}
```

Python：

```python
number = 1

while number <= 3:
    print(number)
    number += 1
```

区别：

- Java 条件需要括号。
- Python 条件后需要冒号。
- Java 可以使用 ++。
- Python 不使用 ++ 自增运算符。
- 两种语言都需要确保循环状态能够正确变化。

### 3.3 break 与 continue

两种语言都使用：

- break：退出当前循环。
- continue：跳过本轮剩余语句。

在嵌套循环中，不带标签的 break 和 continue 默认作用于最内层循环。

### 3.4 循环在业务开发中的使用

Java 后端常使用循环完成：

- 批量处理业务记录。
- 逐条校验输入数据。
- 处理分页任务。
- 扫描订单和商品。
- 累计业务指标。
- 根据业务状态决定是否继续处理。

本日使用货架扫描、库存扣减和数字练习模拟这些场景。

## 四、Java 循环运算与表达式

### 4.1 关系运算符与循环条件

常用关系运算符：

| 运算符 | 含义     |
|--------|----------|
| <      | 小于     |
| <=     | 小于等于 |
| >      | 大于     |
| >=     | 大于等于 |
| ==     | 等于     |
| !=     | 不等于   |

循环条件常用关系运算符判断循环是否继续。

### 4.2 自增与自减

```java
i++;
i--;
```

分别表示变量增加 1 和减少 1。

还可以使用：

```java
i += 2;
i -= 2;
```

根据实际业务调整更新步长。

### 4.3 循环累加

```java
int total = 0;

for (int i = 1; i <= 5; i++) {
    total += i;
}
```

结果为 15。

累计变量应保留之前各轮计算结果。

对于多轮独立计算，需要在每次新计算开始前重新初始化累计变量。

### 4.4 取余运算与循环筛选

```java
if (i % 3 == 0) {
    System.out.println(i);
}
```

通过取余判断整数是否为 3 的倍数。

ForPractice.java 使用该条件完成数字筛选和计数。

### 4.5 逻辑运算与循环控制

```java
while (stock > 0 && continueFlag) {
    // 库存扣减
}
```

&& 表示两个条件同时成立。

```java
if (n < 0 || n > 20) {
    System.out.println("Invalid input");
}
```

|| 表示满足任一条件即成立。

NumberPractice.java 使用逻辑或判断非法输入范围。

### 4.6 循环边界

循环上界是否包含，需要通过比较运算符明确控制。

例如：

```java
for (int i = 1; i <= n; i++) {
    total += i;
}
```

包含 n。

若使用 i < n，则无法累加到 n。

本日综合任务特别检查了 n=1 和 n=20 两个有效边界。

## 五、Java 循环语法与流程控制

### 5.1 for 与 while 的区别

| 比较项       | for                | while              |
|--------------|--------------------|--------------------|
| 常见用途     | 计数和固定范围处理 | 状态驱动的重复处理 |
| 初始化       | 通常写在循环头     | 通常写在循环前     |
| 更新         | 通常写在循环头     | 通常写在循环体     |
| 条件判断     | 先判断             | 先判断             |
| 最少执行次数 | 0                  | 0                  |

两者能够表达相同的基础循环逻辑，但适用场景和代码结构不同。

### 5.2 break

break 用于提前退出其所作用的循环。

```java
for (int i = 1; i <= 10; i++) {
    if (i == 4) {
        break;
    }

    System.out.println(i);
}
```

实际输出 1、2、3。

Day 03 学习的传统 switch 中，break 用于退出 switch。

在本日学习的循环中，break 用于退出对应循环。

### 5.3 continue

continue 用于跳过当前轮次剩余的循环体语句。

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }

    System.out.println(i);
}
```

实际输出 1、2、4、5。

continue 不等于 break。

### 5.4 continue 与 while 状态更新

while 中的 continue 会直接转入下一次条件判断。

如果状态更新语句被 continue 跳过，可能导致非预期无限循环。

因此需要确保每条继续执行的路径都能够正确维护循环状态。

### 5.5 嵌套循环

嵌套循环是在一个循环内部再编写另一个循环。

```java
for (int row = 1; row <= 3; row++) {
    for (int column = 1; column <= 2; column++) {
        System.out.printf("(%d,%d)%n", row, column);
    }
}
```

执行顺序：

1. 外层确定当前行。
2. 内层依次处理当前行的各列。
3. 内层结束。
4. 外层进入下一行。
5. 内层重新初始化。

### 5.6 嵌套循环执行次数

当外层执行三次、每次内层执行四次时，内层循环体总计执行：

3 × 4 = 12 次。

如果内层循环受到 break 影响，实际执行次数可能减少。

### 5.7 嵌套循环中的 break

在 ShelfScanPractice.java 中：

```java
if (j == targetColumn) {
    System.out.printf("Target found in row %d%n", i);
    break;
}
```

break 只退出当前行对应的内层循环。

外层循环继续扫描下一行。

### 5.8 嵌套循环中的 continue

```java
if (j == 2) {
    continue;
}
```

跳过第 2 列后，内层循环继续执行下一列。

### 5.9 九九乘法表执行逻辑

九九乘法表使用两层 for：

- 外层变量控制行号 1–9。
- 内层变量从 1 增加到当前行号。
- 第 1 行有一个乘法表达式。
- 第 9 行有九个乘法表达式。

表达式总数：

1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45。

本日核心综合程序成功输出完整下三角九九乘法表。

## 六、Windows Java 开发环境

### 6.1 当前环境

| 项目        | 配置                          |
|-------------|-------------------------------|
| 操作系统    | Windows                       |
| JDK         | Eclipse Temurin 21.0.12.1 LTS |
| javac       | 21                            |
| IDE         | IntelliJ IDEA                 |
| Project SDK | temurin-21                    |
| Module      | java-90-days                  |
| 项目根目录  | `E:\Java\java-90-days`        |

### 6.2 进入工作目录

```powershell
cd E:\Java\java-90-days\01-java-basics\day04\code
```

### 6.3 编译程序

```powershell
javac -encoding UTF-8 NumberPractice.java
```

### 6.4 运行程序

```powershell
java NumberPractice
```

### 6.5 编译与运行区别

javac 将 Java 源文件编译为字节码文件。

java 命令启动 JVM 执行相应的 Java 类。

编译成功时 javac 通常不输出额外信息。

本日四个程序均有用户报告的编译成功状态及符合业务要求的控制台运行记录。

### 6.6 编译产物管理

生成的 `.class` 文件不纳入 Git。

正式归档只保留需要版本管理的 Java 源代码和 Markdown 文档。

## 七、Java 程序基本结构

### 7.1 类与 main 方法

```java
public class NumberPractice {
    public static void main(String[] args) {
        // 程序入口
    }
}
```

文件名与 public 类名必须一致。

### 7.2 Scanner 标准输入

```java
Scanner scanner = new Scanner(System.in);
```

通过 nextInt 读取用户输入的整数。

本日练习按照任务要求处理整数输入，没有额外引入非整数输入异常处理。

### 7.3 变量作用域

在 for 中声明的循环变量，通常只在对应循环语句作用域内有效。

在循环内部声明的累计变量，可以用于实现每轮计算重新初始化。

例如：

```java
while (true) {
    int total = 0;

    // 当前轮的计算
}
```

当程序进入下一轮循环时，会重新初始化 total。

### 7.4 输出格式

本日使用：

- System.out.print：输出输入提示与表达式分隔符。
- System.out.println：输出标题、固定信息和结果。
- System.out.printf：输出数字、求和结果及乘法表达式。

常用格式符：

- %d：整数。
- %n：换行。

### 7.5 字符与字符串输出

本日综合程序使用：

```java
System.out.print(' ');
System.out.print('\n');
```

分别输出一个空格字符和换行字符。

字符字面量使用单引号，字符串字面量使用双引号。

## 八、Day 04 Java 编程练习

### 8.1 练习目标

本日四节课程均完成独立编程练习：

| 课程    | 程序                   | 核心能力                       |
|---------|------------------------|--------------------------------|
| D04-S01 | ForPractice.java       | for 循环、条件筛选、计数       |
| D04-S02 | InventoryPractice.java | while、状态控制、库存扣减      |
| D04-S03 | ShelfScanPractice.java | break、continue、嵌套循环      |
| D04-S04 | NumberPractice.java    | 循环求和、九九乘法表、综合控制 |

当天核心综合验收文件：

`NumberPractice.java`

### 8.2 文件位置

```text
01-java-basics/
└── day04/
    ├── code/
    │   ├── ForPractice.java
    │   ├── InventoryPractice.java
    │   ├── ShelfScanPractice.java
    │   └── NumberPractice.java
    ├── tasks.md
    └── notes.md
```

### 8.3 最终源代码

#### 8.3.1 ForPractice.java

```java
import java.util.Scanner;

public class ForPractice {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 获取用户输入
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        // 统计指定范围内 3 的倍数
        int count = 0;
        if (n >= 1 && n <= 30) {
            System.out.println("Multiples of 3:");
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0) {
                    count++;
                    System.out.printf("%d%n", i);
                }
            }
            System.out.printf("Count: %d%n", count);
        } else {
            System.out.println("Invalid input");
        }
    }
}
```

#### 8.3.2 InventoryPractice.java

```java
import java.util.Scanner;

public class InventoryPractice {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 初始化库存与操作标记
        int stock = 20;
        boolean continueFlag = true;

        // 输出
        System.out.printf("Initial stock: %d%n", stock);

        // 商品库存扣减
        while (stock > 0 && continueFlag) {
            // 输入扣减数量
            System.out.print("Enter quantity (0 to stop): ");
            int quantity = scanner.nextInt();

            // 扣减操作
            if (quantity == 0) {
                continueFlag = false;
            } else if (quantity < 0) {
                System.out.println("Invalid quantity");
            } else if (quantity > stock) {
                System.out.println("Insufficient stock");
            } else {
                stock -= quantity;
                System.out.printf("Remaining stock: %d%n", stock);
            }
        }

        // 输出最终库存
        System.out.printf("Final stock: %d%n", stock);
    }
}
```

#### 8.3.3 ShelfScanPractice.java

```java
import java.util.Scanner;

public class ShelfScanPractice {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 获取行数、列数以及目标列数
        System.out.print("Enter rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter columns: ");
        int columns = scanner.nextInt();
        System.out.print("Enter target column: ");
        int targetColumn = scanner.nextInt();

        // 输入检测
        boolean rowsValid = rows >= 1 && rows <= 4;
        boolean columnsValid = columns >= 2 && columns <= 6;
        boolean targetColumnValid = targetColumn >= 1 && targetColumn <= columns && targetColumn != 2;

        // 货架扫描操作
        if (rowsValid && columnsValid && targetColumnValid) {
            System.out.println("Start scanning");
            for (int i = 1; i <= rows; i++) {
                System.out.printf("Row %d:%n", i);
                for (int j = 1; j <= columns; j++){
                    if (j == 2) {
                        continue;
                    }
                    System.out.printf("Scan (%d,%d)%n", i, j);
                    if (j == targetColumn) {
                        System.out.printf("Target found in row %d%n", i);
                        break;
                    }
                }
            }

            System.out.println("Scan completed");
        } else {
            System.out.println("Invalid input");
        }
    }
}
```

#### 8.3.4 NumberPractice.java

```java
import java.util.Scanner;

public class NumberPractice {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 输出程序启动标题
        System.out.println("=== Number Practice ===");

        // 程序死循环，满足特定条件时退出
        while (true) {
            // 获取用户输入
            System.out.print("Enter N (0 to exit): ");
            int n = scanner.nextInt();

            // 根据用户输入执行对应操作
            if (n == 0) {
                System.out.println("Program ended");
                break;
            } else if (n < 0 || n > 20) {
                // 输入非法重新输入并开始下一轮循环
                System.out.println("Invalid input");
                continue;
            }
            // 计算累加并输出结果
            int total = 0;
            for (int i = 1; i <= n; i++) {
                total += i;
            }
            System.out.printf("Sum(1..%d) = %d%n", n, total);

            // 输出九九乘法表
            System.out.println("Multiplication Table:");
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.printf("%d*%d=%d", j, i, i * j);
                    if (j < i) {
                        System.out.print(' ');
                    } else {
                        System.out.print('\n');
                    }
                }
            }
        }
    }
}
```

以上为正式验收通过时提交的最终源代码，保留实际代码内容，不额外改写历史验收版本。

### 8.4 编译命令

进入目录：

```powershell
cd E:\Java\java-90-days\01-java-basics\day04\code
```

分别编译：

```powershell
javac -encoding UTF-8 ForPractice.java
javac -encoding UTF-8 InventoryPractice.java
javac -encoding UTF-8 ShelfScanPractice.java
javac -encoding UTF-8 NumberPractice.java
```

四个程序均有成功编译声明。

### 8.5 运行命令

```powershell
java ForPractice
java InventoryPractice
java ShelfScanPractice
java NumberPractice
```

每组正式业务测试均根据测试输入单独运行并检查控制台输出。

### 8.6 综合练习最终运行结果

#### ForPractice.java

输入 10：

```text
Enter N: 10
Multiples of 3:
3
6
9
Count: 3
```

输入 30：

```text
Enter N: 30
Multiples of 3:
3
6
9
12
15
18
21
24
27
30
Count: 10
```

输入 0：

```text
Enter N: 0
Invalid input
```

#### InventoryPractice.java

用户主动停止：

```text
Initial stock: 20
Enter quantity (0 to stop): 5
Remaining stock: 15
Enter quantity (0 to stop): 0
Final stock: 15
```

库存耗尽：

```text
Initial stock: 20
Enter quantity (0 to stop): 8
Remaining stock: 12
Enter quantity (0 to stop): 12
Remaining stock: 0
Final stock: 0
```

非法数量与库存不足：

```text
Initial stock: 20
Enter quantity (0 to stop): -3
Invalid quantity
Enter quantity (0 to stop): 6
Remaining stock: 14
Enter quantity (0 to stop): 0
Final stock: 14
```

#### ShelfScanPractice.java

正常扫描：

```text
Enter rows: 2
Enter columns: 4
Enter target column: 3
Start scanning
Row 1:
Scan (1,1)
Scan (1,3)
Target found in row 1
Row 2:
Scan (2,1)
Scan (2,3)
Target found in row 2
Scan completed
```

非法行数：

```text
Enter rows: 0
Enter columns: 4
Enter target column: 3
Invalid input
```

非法目标列：

```text
Enter rows: 2
Enter columns: 4
Enter target column: 2
Invalid input
```

#### NumberPractice.java

立即退出：

```text
=== Number Practice ===
Enter N (0 to exit): 0
Program ended
```

正常输入：

```text
=== Number Practice ===
Enter N (0 to exit): 5
Sum(1..5) = 15
Multiplication Table:
1*1=1
1*2=2 2*2=4
1*3=3 2*3=6 3*3=9
1*4=4 2*4=8 3*4=12 4*4=16
1*5=5 2*5=10 3*5=15 4*5=20 5*5=25
1*6=6 2*6=12 3*6=18 4*6=24 5*6=30 6*6=36
1*7=7 2*7=14 3*7=21 4*7=28 5*7=35 6*7=42 7*7=49
1*8=8 2*8=16 3*8=24 4*8=32 5*8=40 6*8=48 7*8=56 8*8=64
1*9=9 2*9=18 3*9=27 4*9=36 5*9=45 6*9=54 7*9=63 8*9=72 9*9=81
Enter N (0 to exit): 0
Program ended
```

有效上界：

```text
=== Number Practice ===
Enter N (0 to exit): 20
Sum(1..20) = 210
Multiplication Table:
1*1=1
1*2=2 2*2=4
1*3=3 2*3=6 3*3=9
1*4=4 2*4=8 3*4=12 4*4=16
1*5=5 2*5=10 3*5=15 4*5=20 5*5=25
1*6=6 2*6=12 3*6=18 4*6=24 5*6=30 6*6=36
1*7=7 2*7=14 3*7=21 4*7=28 5*7=35 6*7=42 7*7=49
1*8=8 2*8=16 3*8=24 4*8=32 5*8=40 6*8=48 7*8=56 8*8=64
1*9=9 2*9=18 3*9=27 4*9=36 5*9=45 6*9=54 7*9=63 8*9=72 9*9=81
Enter N (0 to exit): 0
Program ended
```

非法输入：

```text
=== Number Practice ===
Enter N (0 to exit): -1
Invalid input
Enter N (0 to exit): 0
Program ended
```

连续有效输入的实际测试结果：

| 测试编号 | 输入顺序     | 求和结果   | 乘法表次数 | 结果 |
|----------|--------------|------------|-----------:|------|
| TC09     | 5, 3, 0      | 15、6      |          2 | 通过 |
| TC10     | -2, 4, 0     | 10         |          1 | 通过 |
| TC12     | 20, 1, 10, 0 | 210、1、55 |          3 | 通过 |

TC11 输入 21、0、5 时，程序在读取 0 后结束，没有继续处理 5。

所有十二组正式运行记录均在课程验收中提交，完整九九乘法表每次输出均符合规定。

### 8.7 综合验收结果

| Java 文件              | 代码审查 | 正式业务测试 | 结果 |
|------------------------|----------|--------------|------|
| ForPractice.java       | 12/12    | 6/6          | 通过 |
| InventoryPractice.java | 12/12    | 8/8          | 通过 |
| ShelfScanPractice.java | 15/15    | 8/8          | 通过 |
| NumberPractice.java    | 20/20    | 12/12        | 通过 |

累计原定业务测试：34/34 通过。

另外：

- InventoryPractice.java：4/4 针对性复验通过。
- ShelfScanPractice.java：6/6 针对性复验通过。
- NumberPractice.java：第一次修改后 12/12 综合测试通过。

Day 04 四节课程全部正式验收通过。

## 九、错误记录与修改经验

### 9.1 本次实际错误

第 1 课：

ForPractice.java 首次提交通过全部验收。

没有阻断性错误。

第 2 课：

InventoryPractice.java 首次提交中使用 break 退出 while。

虽然实现了正确的业务功能，但违反了本课禁止使用 break 的要求。

首次代码审查为 11/12，通过了全部八组业务测试。

第 3 课：

ShelfScanPractice.java 首次提交只判断 targetColumn 是否不等于 2。

遗漏了：

- rows 的有效范围。
- columns 的有效范围。
- targetColumn 的完整取值范围。

导致非法行数和非法列数测试失败。

首次业务测试为 6/8 通过。

第 4 课：

NumberPractice.java 首次提交存在三项阻断性问题。

第一项：输入 0 时依靠 while 条件自然结束，没有实际使用 break。

第二项：求和输出使用固定字母 N，没有输出实际输入的整数。

第三项：九九乘法表没有输出标题，并且每行末尾包含多余空格。

首次综合业务测试只有 TC01 完整通过。

### 9.2 修复方式

第 1 课：

无需修改。

记录 Scanner 资源管理和 count 变量作用域的优化建议。

第 2 课：

- 新增 boolean continueFlag。
- 将 while 条件设置为 stock > 0 && continueFlag。
- 输入 0 时设置 continueFlag 为 false。
- 删除 break。
- 保留原有库存扣减逻辑。

第一次复验后全部通过。

第 3 课：

- 新增 rowsValid。
- 新增 columnsValid。
- 新增 targetColumnValid。
- 使用 && 组合多个输入合法性条件。
- 非法输入直接输出 Invalid input。

第一次复验后全部通过。

第 4 课：

- 使用 while(true) 管理多轮输入。
- 在检测到 n == 0 时输出结束提示并使用 break。
- 保留 continue 处理非法输入。
- 通过 printf 输出实际输入 N 和 total。
- 添加 Multiplication Table 标题。
- 根据内层循环变量判断是否输出空格或换行。
- 修复行末多余空格问题。

第一次修改后，20 项代码审查及 12 组业务测试全部通过。

### 9.3 调试经验

1. 循环能够完成业务功能，不代表一定满足指定的控制方式。
2. while 可以通过复合条件实现自然终止，也可以通过 break 主动退出。
3. 使用 continue 前必须明确是否会跳过循环状态更新。
4. 嵌套循环中的 break 默认只退出当前内层循环。
5. 输入范围校验必须包含上下界和特殊非法值。
6. 输出内容正确但格式不一致，同样可能导致验收失败。
7. printf 中的固定文本与格式占位符不能混淆。
8. 九九乘法表不仅要检查计算结果，还要检查空格与换行。
9. 多轮计算时，累计变量必须根据业务要求重新初始化。
10. 已通过且未修改的功能可以保留历史测试记录，修改影响的路径应重点复验。
11. 代码审查、编译声明和实际运行记录需要分别记录。
12. 正式验收应以全部规定测试和阻断问题修复结果为依据。

## 十、常见错误汇总

### 10.1 for 循环边界错误

将 <= 误写为 <，可能少执行一次。

将 < 误写为 <=，可能多执行一次。

### 10.2 循环变量更新错误

忘记更新循环变量或更新方向错误，可能导致非预期无限循环。

### 10.3 累计变量初始化位置错误

将累计变量错误地放在每次累加之前重新初始化，会导致历史累计结果丢失。

### 10.4 while 缺少终止机制

循环状态始终满足继续条件时，程序无法按预期结束。

### 10.5 continue 跳过状态更新

在 while 中，如果 continue 跳过必要的变量更新，可能造成重复执行同一轮状态。

### 10.6 break 使用层级错误

嵌套循环中，普通 break 只结束直接所属的循环。

不能误认为它会自动结束所有外层循环。

### 10.7 输入校验不完整

只检查某一个特殊非法值，不能替代完整的有效范围判断。

### 10.8 输出格式错误

常见问题包括：

- 输出缺少标题。
- 固定输出字母而不是实际变量值。
- 行末多余空格。
- 缺少换行。
- 多余空白行。
- 非法输入后仍然输出正常业务结果。

### 10.9 多轮计算结果污染

累计变量没有在新一轮业务计算开始时重新初始化，可能导致计算结果错误。

### 10.10 编译与运行混淆

静态代码看起来正确，不等于已经编译成功。

编译成功，也不等于全部业务测试均已通过。

## 十一、工程目录与文件规范

### 11.1 Day 04 工作目录

```text
01-java-basics/
└── day04/
    ├── code/
    │   ├── ForPractice.java
    │   ├── InventoryPractice.java
    │   ├── ShelfScanPractice.java
    │   └── NumberPractice.java
    ├── tasks.md
    └── notes.md
```

### 11.2 Java 文件规范

- public 类名与文件名一致。
- 类名使用大驼峰。
- 变量名使用小驼峰。
- 使用四空格缩进。
- 使用花括号明确代码块。
- 循环条件和变量更新应清晰。
- 避免非预期无限循环。
- 避免重复代码。
- 正确处理输入边界。
- 不引入尚未学习的复杂语法。

### 11.3 Markdown 文件规范

- tasks.md：记录课程任务、实际练习及正式验收结果。
- notes.md：记录理论知识、最终代码、运行结果和修改经验。
- docs/progress.md：维护 90 天整体进度及各学习日历史记录。
- docs/handoffs/day04.md：提供跨天学习交接。
- README.md：维护正式学习路线、仓库信息及当前进度。

### 11.4 Git 文件规范

- 保留 .java 源代码。
- 保留 Markdown 学习记录。
- 不提交 .class 文件。
- 不提交 IDEA 缓存和无关编译产物。
- 不修改已验收通过的历史 Java 源代码。
- Day 04 Git 已提交。

## 十二、Day 04 最终总结

### 12.1 已完成课程

| 课程    | 学习内容                     | 最终结果 |
|---------|------------------------------|----------|
| D04-S01 | for 循环                     | 验收通过 |
| D04-S02 | while 循环                   | 验收通过 |
| D04-S03 | break、continue 与嵌套循环   | 验收通过 |
| D04-S04 | NumberPractice.java 综合编程 | 验收通过 |

四节课程全部通过。

### 12.2 已掌握的基础操作

- 正确使用 for 循环。
- 正确使用 while 循环。
- 根据循环条件控制执行次数。
- 正确初始化与更新循环变量。
- 使用循环完成整数求和。
- 使用 break 提前结束循环。
- 使用 continue 跳过当前轮次剩余语句。
- 使用嵌套循环完成行列遍历。
- 正确理解内外层循环执行顺序。
- 完成九九乘法表输出。
- 使用 Scanner 处理多轮整数输入。
- 使用 if/else 处理非法输入。
- 使用 printf 控制数字输出格式。
- 进行正常值、边界值及非法值测试。
- 根据审查提示独立修复程序错误。

### 12.3 正式项目状态

Student Manager Console：

- 尚未开始。
- 按 README 计划于 Day 08 启动。

Campus Assistant Platform：

- 尚未开始。
- 按 README 计划于 Day 36 启动。

当前学习主要完成 Java 基础语法及循环控制能力建设。

Day 04 课程已完成正式验收，Git 归档尚待提交与推送。

### 12.4 下一学习日

Day 05 主题：

**数组、一维数组遍历、索引。**

核心综合验收文件：

`01-java-basics/day05/code/ScoreStatistics.java`

主要目标：

- 掌握一维数组基本概念。
- 掌握数组声明、创建与初始化。
- 掌握数组索引与长度。
- 使用循环遍历数组。
- 正确处理数组访问边界。
- 完成学生成绩最高分、最低分与平均分统计。

Day 05 不提前改变 README 中既定的学习路线。