# Day 01 每日交接记录

## 1. 交接信息

- 学习计划：Java 90 Days
- 完成日期：2026-10-26
- 已完成学习日：Day 01
- 下一学习日：Day 02
- 所属阶段：Java 基础与面向对象
- 当前状态：Day 01 全部验收通过
- 已通过课程：4 / 4

## 2. 学习总体方向

主线：Java 后端开发工程师。

辅线：AI 智能体应用开发。

目标：90 天内建立 Java 后端核心技能，完成两个具有工程质量的正式项目，为实习和校招做好准备。

每日学习时间：2–3 小时。

## 3. 已完成课程

### Day 01 · 第 1 课

主题：Java 基础认知。

完成内容：

- Java 的特点与应用领域
- Java 与 Python 的区别
- JDK、JRE、JVM
- Java 编译和运行流程
- Java 环境命令检查

验收状态：通过。

### Day 01 · 第 2 课

主题：Java 开发环境配置。

完成内容：

- JDK 21 验证
- JAVA_HOME 验证
- Path 验证
- IntelliJ IDEA SDK 配置
- Java 模块检查
- 学习仓库目录创建

验收状态：通过。

### Day 01 · 第 3 课

主题：第一个 Java 程序。

完成内容：

- 创建 HelloJava.java
- 编写 main 方法
- 使用 System.out.println
- javac 编译
- java 运行
- .class 文件检查
- IDEA 运行
- 输出错误修复

验收状态：通过。

### Day 01 · 第 4 课

主题：综合实操验收。

完成内容：

- 最终重新编译
- 最终运行结果验证
- 文件检查
- 目录检查
- Markdown 记录保存
- 综合正式验收

验收状态：通过。

## 4. 实际开发环境

操作系统：Windows 10/11，具体版本未记录。

JDK 发行版：Eclipse Temurin。

JDK 版本：21.0.12.1 LTS。

JAVA_HOME：

`E:\Eclipse Adoptium\jdk-21.0.12.101-hotspot`

IDE：IntelliJ IDEA。

Project SDK：temurin-21。

Java Module：java-90-days。

本地工作目录：

`E:\Java\java-90-days`

注意：以后必须使用真实目录名称 `java-90-days`，不能擅自改为 `java-90days`。

## 5. 当前文件结构

根据 Day 01 已提交的目录信息及学习记录：

```text id="rm833o"
java-90-days/
├── README.md
├── .gitignore
├── .idea/
├── java-90-days.iml
├── src/
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

README.md、tasks.md、notes.md、progress.md 和 day01.md 已提供最终内容。

day01.md 的实际保存需要学习者在本地完成。

## 6. 已完成代码

文件：

`01-java-basics/day01/code/HelloJava.java`

最终内容：

```java id="b143ky"
public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        System.out.println("I am learning Java backend development.");
        System.out.println("Day 01 - My first Java program.");
    }
}
```

编译命令：

```powershell id="l1sfni"
javac -encoding UTF-8 HelloJava.java
```

运行命令：

```powershell id="v4em1r"
java HelloJava
```

最终验证输出：

```text id="sx8ljc"
Hello, Java!
I am learning Java backend development.
Day 01 - My first Java program.
```

编译、运行结果已通过验收。

## 7. 错误与修改记录

初次提交时，第一行输出为：

`Hello Java!`

正确要求为：

`Hello, Java!`

问题：缺少英文逗号。

处理：修改字符串，重新编译运行。

最终通过验收。

本日无其他已报告的未解决编程错误。

## 8. 正式项目状态

### Student Manager Console

规划路径：

`projects/student-manager-console/`

计划开始：Day 08。

状态：尚未开始。

当前没有正式业务代码。

### Campus Assistant Platform

规划路径：

`projects/campus-assistant-platform/`

计划开始：Day 36。

状态：尚未开始。

当前没有正式业务代码。

不要提前创建这两个正式项目。

## 9. Git 状态

Git 安装、Git 初始化、本地 Commit 和 GitHub 推送情况均尚未验证。

后续需要检查实际仓库状态。

不能假设已经提交到 GitHub。

## 10. Markdown 文件管理规则

所有 Markdown 文件由导师直接生成完整内容。

学习者负责保存到指定路径。

不再要求提交 Markdown 正文进行验收。

代码、编译结果、运行输出、SQL、API 和其他实操成果仍然必须接受正式检查。

## 11. 后续教学规则

Day 01–77：

- 禁止理论问答题。
- 禁止选择题、判断题、填空题。
- 禁止面试模拟。
- 不提前公布编程练习答案。
- 每次只讲一节课。
- 一课一练。
- 代码检查后先提示修改。
- 正式验收通过后才能继续。
- 不重复搭建已有项目。

Day 78–90 集中进行面试训练。

## 12. Day 02 学习计划

主题：

**Java 基本数据类型、变量、常量与基础输出**

建议课程安排：

1. Java 变量与八种基本数据类型。
2. 变量运算与类型转换。
3. final 常量与字符串输出。
4. Day 02 综合实操验收。

计划工作目录：

`01-java-basics/day02/`

每日时间：2–3 小时。

Day 02 还没有开始。

## 13. Day 02 开始前的约束

1. 继续使用原有项目根目录。
2. 不修改 Day 01 已验收的代码。
3. 不重复安装 JDK 或 IDEA。
4. 不提前创建正式项目。
5. Day 02 练习放在 day02 目录。
6. Markdown 文件直接提供完整内容。
7. Java 编程练习使用可填写的代码提交框。
8. 不安排理论问答题。
9. 不一次性讲完当天全部课程。
10. 第 1 课验收通过后才能进入第 2 课。

## 14. 最终交接结论

Day 01 四节课全部完成。

JDK 21 和 IntelliJ IDEA 开发环境验证通过。

HelloJava.java 编译运行成功。

Day 01 学习任务、笔记与进度记录已经整理。

两个正式项目均未开始。

下一步：在新的学习会话中正式开始 Day 02 第 1 课。
