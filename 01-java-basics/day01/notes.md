# Day 01 学习笔记

## 一、基本信息

- 学习日期：2026-10-26
- 所属阶段：第一阶段，Java 基础与面向对象
- 学习主题：Java 基础认知、开发环境配置与第一个 Java 程序
- 开发环境：Windows、JDK 21、IntelliJ IDEA
- 课程完成情况：4/4
- 最终验收结果：全部通过

## 二、Java 基础认知

### 2.1 Java 是什么

Java 是一种通用的、面向对象的、静态类型编程语言。

Java 不仅是一门编程语言，也拥有成熟的标准库、运行环境及第三方开发生态。

Java 的典型应用包括：

- 企业级后端服务
- Web API
- 金融和支付业务系统
- 校园及企业管理系统
- 大数据处理
- AI 应用的后端服务集成

本学习计划以 Java 后端开发为主线，后续逐步学习 Spring Boot、MySQL、Redis 及 AI 智能体集成。

### 2.2 Java 的主要特点

**1. 面向对象**

Java 可以通过类和对象组织程序代码。

类可以封装数据和方法，便于构建结构清晰、易于维护的业务系统。

**2. 静态类型**

Java 变量具有确定的类型。

编译器可以在程序运行前发现许多类型不匹配问题。

例如，整数变量不能直接赋值为字符串。

**3. 跨平台**

Java 源代码通常先编译为 JVM 字节码。

兼容的 JVM 实现可以在不同操作系统上执行相同的字节码。

实际跨平台能力仍然受到原生依赖和操作系统特定功能的影响。

**4. 成熟的生态系统**

Java 拥有丰富的标准库、开发框架和工程工具。

常见后端技术包括：

- Spring Framework
- Spring Boot
- MyBatis
- MySQL
- Redis
- Maven
- JUnit

**5. 并发编程支持**

Java 提供线程、线程池、并发集合和同步机制等工具。

这些能力能够用于处理后端服务中的并发任务。

## 三、Java 与 Python 的区别

### 3.1 类型系统

Python 是动态类型语言。

```python
age = 23
name = "Alice"
```

Java 是静态类型语言。

```java
public class VariableExample {
    public static void main(String[] args) {
        int age = 23;
        String name = "Alice";

        System.out.println(age);
        System.out.println(name);
    }
}
```

Java 变量通常需要声明类型。

Java 也支持局部变量类型推断，但类型仍然在编译阶段确定。

### 3.2 代码块

Python 主要使用缩进表示代码块。

```python
def welcome():
    print("Welcome to Java!")
```

Java 使用花括号表示代码块。

```java
public class Welcome {
    public static void main(String[] args) {
        System.out.println("Welcome to Java!");
    }
}
```

Java 不依靠缩进决定代码块边界，但规范缩进仍然非常重要。

### 3.3 语句结束

Python 通常通过换行结束语句。

Java 中的普通语句通常以分号结束。

例如：

```java
public class StatementExample {
    public static void main(String[] args) {
        System.out.println("First");
        System.out.println("Second");
    }
}
```

### 3.4 编译与运行

Python 常见实现会先将源代码转换为字节码，再由解释器执行。

Java 通常先将源代码编译成 JVM 字节码，然后由 JVM 执行。

因此，不能简单认为 Python 完全不经过编译，也不能认为 JVM 只使用解释执行。

### 3.5 对后续学习的意义

已有的 Python 编程经验有助于理解变量、条件判断、循环和方法等概念。

学习 Java 时需要特别重视：

- 类型声明与类型检查
- 类和对象
- 方法声明
- 编译与运行
- 代码组织
- 项目工程结构

## 四、JDK、JRE、JVM

### 4.1 JVM

JVM 全称 Java Virtual Machine，即 Java 虚拟机。

主要职责：

1. 加载 Java 字节码。
2. 验证字节码。
3. 执行程序。
4. 管理运行时内存。
5. 提供垃圾回收机制。
6. 支持解释执行和即时编译。

JVM 是 Java 跨平台能力的重要基础。

### 4.2 JRE

JRE 全称 Java Runtime Environment，即 Java 运行环境。

传统意义上的 JRE 包含：

- JVM
- Java 标准类库
- 运行 Java 程序所需的其他组件

在现代 Java 发行版中，通常不再单独提供传统形式的 JRE 安装包。

学习和开发时可以直接使用 JDK 21。

### 4.3 JDK

JDK 全称 Java Development Kit，即 Java 开发工具包。

JDK 提供：

- Java 编译器
- Java 启动器
- Java 标准类库
- 调试与诊断工具
- Java 运行组件

常见工具：

- `javac`：编译 Java 源代码。
- `java`：启动 Java 程序。
- `jar`：创建或管理 JAR 文件。

### 4.4 三者的关系

可以从功能上理解：

- JVM：负责执行 Java 字节码。
- JRE：提供 Java 程序的运行环境。
- JDK：提供 Java 开发工具以及运行所需组件。

开发 Java 程序时，安装完整 JDK 即可满足基础开发需求。

## 五、Java 编译与运行流程

### 5.1 基本流程

```text
Java 源代码
     |
     | javac 编译
     v
Java 字节码
     |
     | java 启动 JVM
     v
字节码加载与执行
     |
     v
程序运行结果
```

### 5.2 Java 源文件

Java 源文件以 `.java` 为后缀。

例如：

`HelloJava.java`

源文件保存程序员编写的 Java 代码。

### 5.3 Java 字节码文件

Java 编译器通常会生成 `.class` 文件。

例如：

`HelloJava.class`

`.class` 文件保存 JVM 字节码，不直接等同于某种特定处理器的机器指令。

### 5.4 编译命令

```powershell
javac -encoding UTF-8 HelloJava.java
```

该命令将 Java 源代码编译为字节码。

如果编译成功，通常不会产生错误输出。

### 5.5 运行命令

```powershell
java HelloJava
```

对于本日没有声明 package 的简单程序，可以在类文件所在目录执行此命令。

运行时使用类名，不添加 `.class` 后缀。

### 5.6 编译和运行的区别

编译阶段主要进行语法、类型等检查并生成字节码。

运行阶段由 JVM 加载和执行程序。

程序编译成功并不代表输出内容、业务逻辑一定正确。

## 六、Windows Java 开发环境

### 6.1 已安装的 JDK

发行版：Eclipse Temurin

版本：21.0.12.1 LTS

JDK 路径：

```text
E:\Eclipse Adoptium\jdk-21.0.12.101-hotspot
```

### 6.2 JAVA_HOME

实际配置：

```text
E:\Eclipse Adoptium\jdk-21.0.12.101-hotspot
```

JAVA_HOME 通常指向 JDK 根目录，而不是 bin 子目录。

部分 Java 开发工具会使用该变量定位 JDK。

### 6.3 Path

当前识别到的 Java 相关路径：

```text
E:\Eclipse Adoptium\jdk-21.0.12.101-hotspot\bin
C:\Program Files\Common Files\Oracle\Java\javapath
```

Temurin JDK 路径排在前面。

当前没有发现需要修改 Path 的问题。

### 6.4 环境检查命令

检查 Java：

```powershell
java -version
```

检查编译器：

```powershell
javac -version
```

检查命令路径：

```powershell
where.exe java
where.exe javac
```

检查 JAVA_HOME：

```powershell
$env:JAVA_HOME
```

检查编译器文件：

```powershell
Test-Path "$env:JAVA_HOME\bin\javac.exe"
```

本次 Test-Path 检查结果为 True。

### 6.5 IntelliJ IDEA

开发工具：IntelliJ IDEA

Project SDK：temurin-21

Module：java-90-days

本地项目根目录：

```text
E:\Java\java-90-days
```

IDEA 负责提供编辑、代码检查、编译运行和调试等功能。

JDK 提供 Java 编译和运行能力。

### 6.6 IDEA 项目与源码目录

当前项目存在默认 `src/` 目录。

但是 Day 01 的独立练习按照学习计划保存在：

`01-java-basics/day01/code/`

在 IDEA 中可以通过配置 Sources Root，让相应目录作为 Java 源码目录参与编译。

以后学习 Maven 后，正式项目会采用标准 Maven 项目结构。

## 七、Java 程序基本结构

### 7.1 类

使用 `class` 关键字定义类。

完整示例：

```java
public class ClassExample {
    public static void main(String[] args) {
        System.out.println("Class Example");
    }
}
```

对于 public 顶层类，源文件的基本文件名必须与类名一致。

例如：

- 类名：ClassExample
- 文件名：ClassExample.java

Java 区分大小写。

### 7.2 main 方法

经典的 Java 程序入口方法声明为：

`public static void main(String[] args)`

其中：

- `public`：访问修饰符。
- `static`：静态方法。
- `void`：没有返回值。
- `main`：方法名称。
- `String[] args`：接收命令行字符串参数。

目前只需要理解其作为经典程序入口的作用。

访问修饰符、静态成员和数组会在后续课程深入学习。

### 7.3 花括号

Java 使用 `{` 和 `}` 界定代码块。

类的方法通常写在类的大括号内部。

规范缩进能够提高代码可读性。

### 7.4 分号

Java 中的普通语句通常以 `;` 结束。

遗漏分号通常会造成编译错误。

### 7.5 控制台输出

使用 `System.out.println()` 输出内容，并自动换行。

使用 `System.out.print()` 输出内容，但不自动换行。

完整示例：

```java
public class PrintExample {
    public static void main(String[] args) {
        System.out.print("Java ");
        System.out.println("Backend");
        System.out.println("Learning");
    }
}
```

运行输出：

```text
Java Backend
Learning
```

### 7.6 字符串和字符

Java 字符串字面量通常使用双引号。

例如：`"Hello"`

字符字面量使用单引号。

例如：`'A'`

`String` 与 `char` 的具体区别将在后续学习数据类型时详细介绍。

## 八、第一个 Java 程序

### 8.1 练习目标

独立创建 Java 控制台程序，完成指定文本输出。

### 8.2 文件位置

相对路径：

`01-java-basics/day01/code/HelloJava.java`

完整路径：

`E:\Java\java-90-days\01-java-basics\day01\code\HelloJava.java`

### 8.3 最终源代码

```java
public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        System.out.println("I am learning Java backend development.");
        System.out.println("Day 01 - My first Java program.");
    }
}
```

### 8.4 编译命令

```powershell
javac -encoding UTF-8 HelloJava.java
```

实际结果：编译成功，无错误输出。

### 8.5 运行命令

```powershell
java HelloJava
```

实际运行输出：

```text
Hello, Java!
I am learning Java backend development.
Day 01 - My first Java program.
```

### 8.6 编译产物

已确认存在：

- `HelloJava.java`
- `HelloJava.class`

### 8.7 IDEA 运行结果

已通过 IntelliJ IDEA 成功运行。

IDEA 可以将编译产物输出到独立目录，不要求 `.class` 文件始终与 `.java` 文件位于同一目录。

## 九、错误记录与修改经验

### 9.1 本次实际错误

第一次提交时，第一行输出为：

```text
Hello Java!
```

而任务要求：

```text
Hello, Java!
```

错误原因：字符串中缺少英文逗号。

### 9.2 修复方式

修改 `HelloJava.java` 中的第一条输出语句。

正确写法：

`System.out.println("Hello, Java!");`

然后重新编译并运行。

最终输出符合预期，正式验收通过。

### 9.3 调试经验

1. 代码能够编译，不代表满足全部功能要求。
2. 控制台输出需要检查大小写、空格、标点和换行。
3. 修改源文件后，应重新编译或使用 IDE 重新运行。
4. 出现问题时，应优先定位错误位置。
5. 修改范围应该尽可能小，避免引入其他错误。
6. 实际运行结果是功能验收的重要依据。

## 十、常见错误汇总

### 10.1 Java 命令无法识别

常见原因：

- JDK 未安装。
- Path 未正确配置。
- 终端没有读取到更新后的环境变量。

处理方式：检查 JDK 安装目录与环境变量。

### 10.2 javac 无法识别

常见原因：编译器路径没有被正确配置。

处理方式：检查 JDK 的 bin 目录和 Path。

### 10.3 public 类名与文件名不一致

例如 public 类名为 HelloJava 时，源文件应命名为 HelloJava.java。

### 10.4 忘记分号

Java 普通语句缺少分号可能导致编译错误。

### 10.5 找不到主类

出现 `Could not find or load main class` 时，需要检查：

- 当前运行目录。
- 类名与大小写。
- classpath。
- package 声明。
- 是否已经编译。

### 10.6 输出内容不匹配

即使程序编译与运行成功，也要检查输出是否严格满足任务要求。

## 十一、工程目录与文件规范

当前仓库根目录：

`E:\Java\java-90-days`

Day 01 的主要文件：

```text
java-90-days/
├── README.md
├── .gitignore
├── 01-java-basics/
│   └── day01/
│       ├── code/
│       │   ├── HelloJava.java
│       │   └── HelloJava.class
│       ├── tasks.md
│       └── notes.md
└── docs/
    ├── progress.md
    └── handoffs/
        └── day01.md
```

这只是与 Day 01 相关的主要文件结构，不包含 IDEA 自动生成的全部配置文件。

注意：

- `.java` 文件是源代码，需要保留和版本管理。
- `.class` 文件是编译产物，通常不提交 Git。
- `.idea/` 和 `.iml` 等本地 IDE 配置按照仓库规则处理。
- 每天的独立练习保存在对应 dayXX 目录。
- 正式项目只在计划开始时创建。

## 十二、Day 01 最终总结

### 12.1 已完成课程

1. Java 基础认知。
2. Java 开发环境配置。
3. 第一个 Java 程序。
4. Day 01 综合实操验收。

四节课均已正式验收通过。

### 12.2 已掌握的基础操作

- 使用命令检查 JDK 版本。
- 使用命令检查 Java 编译器。
- 验证 JAVA_HOME 与 Path。
- 在 IntelliJ IDEA 中配置 JDK 21。
- 创建简单 Java 源文件。
- 编写经典 main 方法。
- 使用 System.out.println 输出内容。
- 使用 javac 编译 Java 程序。
- 使用 java 运行程序。
- 查看编译生成的 class 文件。
- 根据需求修改代码和复验运行结果。

### 12.3 正式项目状态

Student Manager Console：尚未开始，计划 Day 08 启动。

Campus Assistant Platform：尚未开始，计划 Day 36 启动。

### 12.4 下一学习日

Day 02 主题：

**Java 基本数据类型、变量、常量与基础输出。**

预计学习内容：

1. Java 变量与八种基本数据类型。
2. 基本运算与类型转换。
3. final 常量及字符串输出。
4. 综合 Java 编程实操。

Day 02 继续执行一课一练、独立编程、提示修改和正式验收。

Day 01–77 不安排理论问答或面试训练。

**Day 01 最终状态：4/4 课程验收通过。**
