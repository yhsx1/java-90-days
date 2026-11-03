# Day 02 学习笔记

## 一、基本信息

- 学习日期：2026-11-03
- 所属阶段：第一阶段，Java 基础与面向对象
- 学习主题：Java 基本数据类型、变量、常量与基础输出
- 开发环境：Windows、JDK 21、IntelliJ IDEA
- 课程完成情况：4/4
- 最终验收结果：全部通过

## 二、Java 变量与基本数据类型

### 2.1 什么是变量

变量是程序中用于保存和访问数据的具名存储位置。

Java 是静态类型语言，变量具有确定的数据类型。

例如：

```java
int studentAge = 23;
String studentName = "Alice";
boolean isEnrolled = true;
```

其中：

- `int`、`String`、`boolean` 表示数据类型。
- `studentAge` 等是变量名。
- `=` 表示赋值。
- 右侧是变量的初始值。
- 分号表示语句结束。

变量使程序可以保存、访问和更新业务数据。

### 2.2 变量声明与初始化

变量可以声明时初始化：

```java
int age = 23;
```

也可以先声明，再赋值：

```java
int age;
age = 23;
```

Java 局部变量必须在读取前完成确定赋值。

例如：

```java
int age;
System.out.println(age);
```

上述代码无法通过编译。

变量完成初始化后，可以重新赋值：

```java
int age = 23;
age = 24;
```

重新赋值时不需要再次声明数据类型。

### 2.3 Java 的八种基本数据类型

Java 共有八种基本数据类型。

| 类型    | 位数               | 主要用途        |
|---------|--------------------|-----------------|
| byte    | 8                  | 小范围整数      |
| short   | 16                 | 小范围整数      |
| int     | 32                 | 普通整数        |
| long    | 64                 | 大范围整数      |
| float   | 32                 | 单精度浮点数    |
| double  | 64                 | 双精度浮点数    |
| char    | 16                 | UTF-16 代码单元 |
| boolean | 未规定固定存储位数 | 布尔状态        |

其中：

- byte：-128 到 127。
- short：-32768 到 32767。
- int：-2³¹ 到 2³¹-1。
- long：-2⁶³ 到 2⁶³-1。

常见声明：

```java
byte retryCount = 2;
short credits = 90;
int studentAge = 23;
long platformVisits = 3000000000L;
float attendanceRate = 96.5F;
double averageScore = 91.5;
char grade = 'A';
boolean isEnrolled = true;
```

需要注意：

- 普通整数通常优先使用 int。
- 较大的 long 整数字面量需要 L 后缀。
- 普通小数字面量默认属于 double。
- float 字面量通常需要 F 后缀。
- char 字面量使用单引号。
- boolean 只有 true 和 false 两种值。
- char 不一定对应一个完整的用户可见字符。

### 2.4 String 与基本数据类型

String 是 Java 标准库提供的类，属于引用类型，不是基本数据类型。

例如：

```java
String studentName = "Alice";
String studentId = "20260001";
```

String 用于表示字符串。

char 与 String 的区别：

```java
char grade = 'A';
String gradeText = "A";
```

学号、订单号等业务标识符即使包含数字，也不一定适合使用整数类型。

例如，编号 `00125` 如果作为普通整数保存，会丢失前导零的信息。

### 2.5 Java 变量命名规范

Java 变量一般采用小驼峰命名法。

例如：

```java
int studentAge = 23;
double totalAmount = 308.0;
boolean isEnrolled = true;
```

命名要求：

- 名称具有明确含义。
- 区分大小写。
- 不使用 Java 关键字。
- 不能以数字开头。
- 避免无意义的单字母名称。
- 保持同一业务字段的拼写一致。

## 三、Java 与 Python 的区别

### 3.1 类型系统

Python 是动态类型语言：

```python
age = 23
name = "Alice"
```

Java 是静态类型语言：

```java
int age = 23;
String name = "Alice";
```

Java 在编译阶段能够检查许多类型不匹配问题。

### 3.2 整数与浮点数

Python 的普通整数可以根据需要扩展精度。

Java 的 int 和 long 有固定的取值范围。

Python 常见实现中的 float 通常使用双精度浮点数，更接近 Java 的 double。

### 3.3 整数除法

Java：

```java
System.out.println(7 / 2);
```

输出：

```text
3
```

Python：

```python
print(7 / 2)
```

输出：

```text
3.5
```

Python 使用 `//` 进行整除：

```python
print(7 // 2)
```

输出：

```text
3
```

需要注意，Java 整数除法向零截断，而 Python 的 `//` 向负无穷取整。

对于负数，二者可能产生不同结果。

### 3.4 类型转换

Java 使用显式类型转换：

```java
int total = 10;
int count = 3;

double average = (double) total / count;
```

Python 使用类型转换函数：

```python
total = 10
count = 3

average = float(total) / count
```

Java 的转换规则与 Python 不完全相同。

### 3.5 字符串与布尔值

Python：

```python
name = "Alice"
active = True
```

Java：

```java
String name = "Alice";
boolean active = true;
```

Java 布尔字面量为小写。

Java 提供 char 基本类型，而 Python 没有独立的 char 基本类型。

Java 的 String 和 Python 的 str 都属于不可变字符串类型。

## 四、Java 运算与类型转换

### 4.1 算术运算符

Java 常用算术运算符：

| 运算符 | 含义 |
|--------|------|
| +      | 加法 |
| -      | 减法 |
| *      | 乘法 |
| /      | 除法 |
| %      | 取余 |

例如：

```java
int a = 10;
int b = 3;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

对应输出：

```text
13
7
30
3
1
```

### 4.2 整数除法与浮点数除法

当两个操作数都是整数时，Java 执行整数除法。

```java
int total = 10;
int count = 3;

double average = total / count;
```

此时 average 为 3.0，而不是 3.3333333333333335。

原因是 Java 先执行整数除法，再将结果赋给 double 变量。

正确使用浮点除法：

```java
double average = (double) total / count;
```

显式转换发生在除法之前。

### 4.3 自动类型转换

Java 允许某些数值类型自动拓宽转换。

例如：

```java
int studentCount = 120;
long totalStudents = studentCount;
```

常见转换路径包括：

```text
byte → short → int → long → float → double
```

char 也可以自动转换为部分数值类型。

自动拓宽转换并不保证任何数值都完全精确，特别是较大的整数转换为浮点类型时。

### 4.4 强制类型转换

当需要显式转换数据类型时，可以使用：

```java
double score = 89.75;
int result = (int) score;
```

result 为 89。

对于有限且处于目标整数范围内的浮点数，转换为整数时会向零截断小数部分，而不是四舍五入。

强制转换可能导致数据丢失。

### 4.5 复合赋值运算符

常见复合赋值：

```java
int quantity = 8;

quantity += 2;
quantity -= 1;
quantity *= 2;
quantity /= 3;
quantity %= 2;
```

`+=` 可以简化在原值基础上进行加法更新的操作。

Java 还支持 `++` 和 `--`。

复合赋值在某些情况下包含隐式类型转换，不能简单认为所有情况都与普通赋值完全等价。

### 4.6 整数溢出

Java int 的最大值为 2147483647。

例如：

```java
int maxValue = 2147483647;
int nextValue = maxValue + 1;
```

nextValue 为 -2147483648。

这是普通 int 加法发生溢出的结果。

在实际后端开发中，应根据业务范围选择数据类型，并对可能溢出的计算进行检查。

### 4.7 浮点数精度问题

Java 使用二进制浮点数表示 float 和 double。

例如：

```java
System.out.println(0.1 + 0.2);
```

输出：

```text
0.30000000000000004
```

浮点数并不能精确表示全部十进制小数。

涉及精确十进制金额计算时，Java 后端通常使用 BigDecimal。

本日仅掌握其应用场景，不要求使用。

### 4.8 运算优先级

乘除运算通常优先于加减运算。

例如：

```java
int result = 10 + 5 * 2;
```

result 为 20。

使用括号可以改变计算顺序：

```java
int result = (10 + 5) * 2;
```

result 为 30。

在业务计算中适当使用括号，可以提高代码可读性。

## 五、Java 常量与字符串输出

### 5.1 final 关键字

final 用于限制变量再次赋值。

例如：

```java
final int REQUIRED_CREDITS = 120;
```

完成赋值后，不能再次给 REQUIRED_CREDITS 赋值。

局部 final 变量可以先声明再初始化，但只能赋值一次，并且必须在读取前完成确定赋值。

### 5.2 常量与变量的区别

普通变量可以重新赋值：

```java
int studentAge = 23;
studentAge = 24;
```

final 变量不能再次赋值：

```java
final int MAX_RETRY_COUNT = 3;
```

对于引用类型，final 限制变量引用再次赋值，不一定代表引用对象内部状态不能修改。

### 5.3 常量命名规范

固定配置常量通常使用全大写字母加下划线：

```java
final String SCHOOL_NAME = "Example University";
final int REQUIRED_CREDITS = 120;
```

普通变量使用小驼峰命名：

```java
int completedCredits = 96;
```

不是所有局部 final 变量都必须大写，具体取决于变量用途。

### 5.4 字符串拼接

Java 使用 + 连接字符串：

```java
String name = "Alice";
int age = 23;

System.out.println("Name: " + name);
System.out.println("Age: " + age);
```

字符串拼接需要关注运算顺序。

例如：

```java
System.out.println("Result: " + 10 + 20);
```

结果：

```text
Result: 1020
```

如果需要先进行数值加法：

```java
System.out.println("Result: " + (10 + 20));
```

结果：

```text
Result: 30
```

### 5.5 print 与 println

System.out.print 输出内容后不自动换行。

System.out.println 输出内容后自动换行。

例如：

```java
System.out.print("Java ");
System.out.println("Backend");
```

输出：

```text
Java Backend
```

### 5.6 转义字符

常见转义字符：

| 转义字符 | 含义   |
|----------|--------|
| `\n`     | 换行   |
| `\t`     | 制表符 |
| `\"`     | 双引号 |
| `\\`     | 反斜杠 |

例如：

```java
System.out.print("Hello\n");
System.out.print("Java\n");
```

输出：

```text
Hello
Java
```

对于普通整行输出，通常优先使用 println。

## 六、Windows Java 开发环境

### 6.1 已安装的 JDK

发行版：Eclipse Temurin。

版本：21.0.12.1 LTS。

安装路径：

```text
E:\Eclipse Adoptium\jdk-21.0.12.101-hotspot
```

沿用 Day 01 已完成的环境配置。

### 6.2 IntelliJ IDEA

开发工具：IntelliJ IDEA。

Project SDK：temurin-21。

Module：java-90-days。

本地项目根目录：

```text
E:\Java\java-90-days
```

### 6.3 Day 02 工作目录

```text
E:\Java\java-90-days\01-java-basics\day02\code
```

Day 02 的四个 Java 文件均保存在该目录下。

### 6.4 编译命令

进入工作目录：

```powershell
cd E:\Java\java-90-days\01-java-basics\day02\code
```

编译单个文件：

```powershell
javac CourseStatisticsReport.java
```

检查编译退出码：

```powershell
$LASTEXITCODE
```

编译成功时退出码为 0。

### 6.5 运行命令

```powershell
java CourseStatisticsReport
```

运行时使用类名，不添加 `.class` 后缀。

### 6.6 编译与运行的区别

编译用于检查源代码并生成字节码。

运行由 JVM 加载和执行程序。

编译成功不代表业务逻辑或输出格式一定正确。

Day 02 的正式验收同时检查源代码、编译结果和实际运行输出。

## 七、Java 程序基本结构

### 7.1 类与源文件

Day 02 的每个程序都使用独立的 public 类。

例如：

```java
public class VariableExample {
    public static void main(String[] args) {
        int age = 23;
        System.out.println(age);
    }
}
```

public 顶层类的类名应与源文件基本名称一致。

### 7.2 main 方法

经典 Java 程序入口：

`public static void main(String[] args)`

Day 02 的四个练习均使用该结构。

### 7.3 变量声明与作用范围

本日变量主要声明在 main 方法内部。

方法中的局部变量必须在使用前初始化。

变量重新赋值时不需要再次声明类型。

### 7.4 花括号与分号

Java 使用花括号组织代码块。

普通语句通常以分号结束。

规范缩进有助于识别代码结构。

### 7.5 控制台输出

Day 02 同时使用：

- System.out.print
- System.out.println
- 字符串拼接
- 转义字符

通过这些基础能力输出学生信息和业务计算报告。

### 7.6 程序命名规范

四个练习采用有意义的类名：

- StudentInfoDemo
- BookOrderCalculator
- StudentProfilePrinter
- CourseStatisticsReport

类名采用大驼峰命名法。

变量名采用小驼峰命名法。

固定配置常量通常采用全大写加下划线的命名方式。

## 八、Day 02 Java 编程练习

### 8.1 练习目标

通过四个独立 Java 控制台程序，掌握基础数据存储、数值计算、常量及规范输出。

四个练习均不属于正式 Student Manager Console 项目。

### 8.2 文件位置

相对路径：

```text
01-java-basics/day02/code/
```

文件列表：

```text
StudentInfoDemo.java
BookOrderCalculator.java
StudentProfilePrinter.java
CourseStatisticsReport.java
```

完整工作目录：

```text
E:\Java\java-90-days\01-java-basics\day02\code
```

### 8.3 最终源代码

四个正式验收通过的程序分别保存在对应 Java 源文件中。

主要实现内容：

**StudentInfoDemo.java**

- 八种基本数据类型。
- String。
- 变量初始化。
- 变量重新赋值。
- 学生信息输出。

**BookOrderCalculator.java**

- 算术运算。
- 整数除法。
- 浮点除法。
- 显式类型转换。
- 复合赋值。
- 教材订单计算。

**StudentProfilePrinter.java**

- final 常量。
- String 字符串。
- 学分计算。
- print 与 println。
- 学籍信息输出。

**CourseStatisticsReport.java**

- 固定配置常量。
- 学生及课程数据。
- 成绩计算。
- 学分统计。
- 类型转换。
- 余数运算。
- 复合赋值。
- 综合报告输出。

### 8.4 编译命令

在 Day 02 的 code 目录中分别执行：

```powershell
javac StudentInfoDemo.java
javac BookOrderCalculator.java
javac StudentProfilePrinter.java
javac CourseStatisticsReport.java
```

四个程序均已完成编译验收。

### 8.5 运行命令

```powershell
java StudentInfoDemo
java BookOrderCalculator
java StudentProfilePrinter
java CourseStatisticsReport
```

四个程序的最终运行输出均符合对应课程的预期要求。

### 8.6 综合练习最终运行结果

```text
===== Course Statistics Report =====
School: Example University
Student Name: Alice
Student ID: 20260001
Student Age: 23
Course: Java Programming
Course Grade: A
Enrolled: true
Attendance Rate: 96.5
Platform Visits: 3000000000
Total Score: 275
Average Score: 91.66666666666667
Score Remainder: 2
Remaining Credits: 36
Updated Completed Credits: 88
Report Generated Successfully
```

### 8.7 综合验收结果

Day 02：

- 第 1 课：验收通过。
- 第 2 课：验收通过。
- 第 3 课：验收通过。
- 第 4 课：验收通过。

综合练习 TC01–TC16 全部通过。

## 九、错误记录与修改经验

### 9.1 本次实际错误

**第 1 课：StudentInfoDemo**

首次提交包含重复类定义。

身高输出包含多余冒号：

```text
Height: : 165.5
```

更新后的年龄输出标签不正确：

```text
Student Age: 24
```

**第 2 课：BookOrderCalculator**

平均金额字段名称中多了一个空格：

```text
Average  Amount: 102.66666666666667
```

**第 3 课：StudentProfilePrinter**

首次提交通过验收，没有需要修复的问题。

**第 4 课：CourseStatisticsReport**

余数变量误写为：

`scoreReminder`

正确名称为：

`scoreRemainder`

另外，首次提交未满足至少使用两次 System.out.print 的要求。

### 9.2 修复方式

第 1 课：

- 删除重复类定义。
- 修复多余冒号。
- 调整更新后年龄的输出标签。

第 2 课：

- 删除 Average Amount 字段名称中的多余空格。

第 4 课：

- 统一修复 scoreRemainder 的变量命名。
- 使用两次 System.out.print。
- 保持最终十六行输出不变。

所有问题均在修改后重新编译运行并通过验收。

### 9.3 调试经验

1. 源代码能够编译，不代表全部业务要求正确。
2. 输出格式需要检查大小写、空格、标点和换行。
3. Java 类名与文件名必须保持一致。
4. 变量名称应当具有准确的业务含义。
5. 强制类型转换需要发生在正确的运算阶段。
6. 复合赋值需要考虑变量当前值。
7. 修改代码后需要重新编译运行。
8. 代码审查和运行结果应分别验证。
9. 应优先进行最小范围修改，避免引入新的问题。
10. 最终验收以实际提交的代码及运行结果为准。

## 十、常见错误汇总

### 10.1 变量未初始化

```java
int age;
System.out.println(age);
```

局部变量在读取前未完成确定赋值，无法通过编译。

### 10.2 数据类型不匹配

```java
int age = "23";
```

字符串不能直接赋值给 int。

### 10.3 浮点数字面量错误

```java
float score = 95.5;
```

普通小数字面量默认是 double。

可使用适当的 float 字面量。

### 10.4 整数除法导致精度丢失

```java
int total = 10;
int count = 3;
double average = total / count;
```

右侧先执行整数除法，因此 average 为 3.0。

需要浮点除法时，应在运算之前完成适当转换。

### 10.5 强制类型转换造成数据丢失

缩窄转换可能丢失数值信息。

例如，超出 byte 范围的整数强制转换为 byte，可能得到与原数值不同的结果。

### 10.6 字符串拼接顺序错误

```java
System.out.println("Total: " + 10 + 20);
```

输出：

```text
Total: 1020
```

如果需要先计算加法，应使用括号。

### 10.7 final 变量重复赋值

```java
final int MAX_COUNT = 100;
MAX_COUNT = 200;
```

重复赋值会导致编译错误。

### 10.8 输出格式不匹配

常见问题：

- 多余冒号。
- 多余空格。
- 字段名称不正确。
- 字母大小写不一致。
- 缺少换行。
- 多余空行。

修复时需要逐行对照预期结果。

### 10.9 变量命名错误

`scoreReminder` 与 `scoreRemainder` 不是相同的变量名称。

变量命名应准确表达业务含义，并保持声明与引用一致。

### 10.10 未满足指定语法要求

即使程序输出正确，也需要检查是否按课程要求使用指定知识点。

例如，综合练习要求至少使用两次 System.out.print。

最终版本必须同时满足功能要求和语法练习要求。

## 十一、工程目录与文件规范

当前仓库根目录：

`E:\Java\java-90-days`

Day 02 相关主要文件：

```text
java-90-days/
├── README.md
├── .gitignore
├── 01-java-basics/
│   ├── day01/
│   │   ├── code/
│   │   │   └── HelloJava.java
│   │   ├── tasks.md
│   │   └── notes.md
│   └── day02/
│       ├── code/
│       │   ├── StudentInfoDemo.java
│       │   ├── BookOrderCalculator.java
│       │   ├── StudentProfilePrinter.java
│       │   └── CourseStatisticsReport.java
│       ├── tasks.md
│       └── notes.md
└── docs/
    ├── progress.md
    └── handoffs/
        ├── day01.md
        └── day02.md
```

这是 Day 01 和 Day 02 的主要学习文件结构，不包含全部本地 IDE 自动生成文件。

文件管理要求：

- Java 源代码保存在当天的 code 目录。
- 每个独立练习使用明确且不冲突的类名。
- tasks.md 记录课程任务与验收结果。
- notes.md 记录知识点、代码要点及错误经验。
- docs/progress.md 维护整体学习进度。
- docs/handoffs/dayXX.md 负责跨会话交接。
- .class 文件属于编译产物，不提交 Git。
- IDE 本地缓存和敏感配置不提交 Git。
- 不覆盖已经验收的 Day 01 文件。
- 不提前创建后续学习日或正式项目目录。

## 十二、Day 02 最终总结

### 12.1 已完成课程

1. Java 变量与八种基本数据类型。
2. 变量运算与类型转换。
3. 常量与字符串输出。
4. Day 02 综合编程验收。

四节课均已正式验收通过。

### 12.2 已掌握的基础操作

- 声明与初始化 Java 变量。
- 使用八种基本数据类型。
- 区分 String 与基本数据类型。
- 使用变量重新赋值。
- 使用基本算术运算符。
- 理解整数除法与浮点数除法。
- 使用自动类型转换与强制类型转换。
- 使用复合赋值运算符。
- 识别整数溢出与浮点精度问题。
- 使用 final 定义不可再次赋值的变量。
- 使用 String 保存文本。
- 使用字符串拼接输出业务信息。
- 使用 print 与 println 控制输出。
- 使用 javac 编译程序。
- 使用 java 运行程序。
- 根据代码审查意见修复错误。
- 对照预期输出完成正式验收。

### 12.3 正式项目状态

Student Manager Console：尚未开始，计划 Day 08 启动。

Campus Assistant Platform：尚未开始，计划 Day 36 启动。

### 12.4 下一学习日

Day 03 主题：

**Java 关系运算、逻辑运算与布尔表达式。**

预计学习内容：

1. Java 关系运算符。
2. 逻辑运算符与短路求值。
3. 运算优先级与布尔表达式。
4. Day 03 综合 Java 编程实操。

Day 03 继续执行一课一练、独立编程、提示修改及正式验收。

所有需要提交内容的环节，提供交互式提交框。

Day 01–77 不安排理论问答或模拟面试。

**Day 02 最终状态：4/4 课程验收通过。**