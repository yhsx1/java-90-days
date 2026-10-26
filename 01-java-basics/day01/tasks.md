# Day 01 学习任务

## 基本信息

- 所属阶段：第一阶段，Java 基础与面向对象
- 学习日期：2026-10-26
- 课程主题：Java 基础认知、开发环境配置与第一个 Java 程序
- 工作目录：`01-java-basics/day01/`
- 课程总数：4
- 正式验收结果：全部通过

## 第 1 课：Java 基础认知

### 学习内容

- [x] Java 的特点与应用领域
- [x] Java 与 Python 的主要区别
- [x] JDK、JRE、JVM
- [x] Java 源代码、字节码及执行流程

### 实操任务

- [x] 执行 `java -version`
- [x] 执行 `javac -version`
- [x] 执行 `where.exe java`
- [x] 执行 `where.exe javac`
- [x] 确认 IDEA 安装状态

### 验收结果

- Java：Temurin 21.0.12.1 LTS
- javac：21.0.12.1
- Java 相关路径识别正常
- IntelliJ IDEA 已安装

**课程状态：验收通过**

## 第 2 课：Java 开发环境配置

### 学习内容

- [x] JDK 安装目录结构
- [x] JAVA_HOME
- [x] Windows Path
- [x] IDEA Project SDK
- [x] Java 模块与源码目录

### 实操任务

- [x] 验证 JAVA_HOME
- [x] 检查 Java 相关 Path
- [x] 验证 javac.exe 文件存在
- [x] 配置 IntelliJ IDEA SDK
- [x] 创建学习仓库根目录
- [x] 创建 Day 01 基础目录
- [x] 创建 README.md 与 .gitignore

### 验收结果

项目根目录：

`E:\Java\java-90-days`

JDK：

`E:\Eclipse Adoptium\jdk-21.0.12.101-hotspot`

IDEA Project SDK：

`temurin-21`

Java Module：

`java-90-days`

**课程状态：验收通过**

## 第 3 课：第一个 Java 程序

### 练习目标

独立编写并运行 Java 控制台程序。

### 文件路径

`01-java-basics/day01/code/HelloJava.java`

### 功能要求

- [x] 创建 public class HelloJava
- [x] 编写 main 方法
- [x] 输出指定三行内容
- [x] 保持正确缩进与代码格式
- [x] 使用 javac 编译
- [x] 检查 .class 文件
- [x] 使用 java 命令运行
- [x] 使用 IDEA 运行
- [x] 修复输出格式问题

### 测试用例

| 编号 | 测试内容         | 结果 |
|------|------------------|------|
| TC01 | Java 编译        | 通过 |
| TC02 | 生成 .class 文件 | 通过 |
| TC03 | 命令行运行       | 通过 |
| TC04 | 输出内容一致性   | 通过 |
| TC05 | IDEA 运行        | 通过 |
| TC06 | 代码规范         | 通过 |

### 最终运行结果

```text id="96ylsv"
Hello, Java!
I am learning Java backend development.
Day 01 - My first Java program.
```

**课程状态：验收通过**

## 第 4 课：综合实操验收

### 实操任务

- [x] 最终重新编译 HelloJava.java
- [x] 检查最终运行结果
- [x] 确认 HelloJava.java 存在
- [x] 确认 HelloJava.class 存在
- [x] 检查项目目录结构
- [x] 保存 tasks.md
- [x] 保存 notes.md
- [x] 保存 docs/progress.md
- [x] 提交综合验收结果

### 验收结果

- javac 编译：成功
- java 运行：成功
- 输出内容：完全匹配
- 源文件：已确认存在
- 字节码文件：已确认存在
- 项目目录：已确认正常
- Markdown 学习文件：已确认保存

**课程状态：验收通过**

## Day 01 最终总结

| 项目          | 结果             |
|---------------|------------------|
| 完成课程      | 4 / 4            |
| 课程验收      | 全部通过         |
| Java 编程练习 | 1 个             |
| 编译运行      | 成功             |
| 代码修复      | 1 处输出格式问题 |
| 正式项目开发  | 未开始           |
| 下一学习日    | Day 02           |

**Day 01 正式综合验收：通过**
