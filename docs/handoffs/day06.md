# Day 06 学习交接记录

## 1. 当前学习进度

- 学习日期：2026-11-16 至 2026-11-20
- 当前学习日：Day 06 / 90
- 当前阶段：第一阶段，Java 基础与面向对象
- 学习主题：方法定义、参数、返回值与方法重载
- 课程验收：4/4 通过
- Java 编程练习：4/4 通过
- 静态代码审查：76/76 通过
- 正式业务测试：23/23 通过
- 核心综合审查：24/24 通过
- 核心综合测试：12/12 通过
- 阻断性问题：0
- 累计进度：6/90 天
- 下一学习日：Day 07

## 2. 当前项目状态

开发环境：

- 操作系统：Windows
- JDK：Eclipse Temurin 21.0.12.1 LTS
- IDE：IntelliJ IDEA
- Project SDK：temurin-21
- 项目根目录：`E:\Java\java-90-days`
- Module：java-90-days
- Git 分支：main
- GitHub 仓库：https://github.com/yhsx1/java-90-days

已完成 Java 程序：

- `01-java-basics/day06/code/LibraryNotice.java`
- `01-java-basics/day06/code/EmployeeWorkRecord.java`
- `01-java-basics/day06/code/StudentScoreCalculator.java`
- `01-java-basics/day06/code/Calculator.java`

以上四个程序均已完成正式代码审查和必要业务测试。

## 3. 本日已掌握知识

### 方法基础

- Java 方法的作用
- 方法定义与调用
- 方法名称及命名规范
- 方法体
- void 方法
- static 方法基础
- main 与自定义方法的关系
- 方法执行顺序
- 方法复用
- 方法定义位置
- Java 方法与 Python 函数的区别

### 方法参数

- 形式参数
- 实际参数
- 单参数与多参数方法
- 参数数量匹配
- 参数类型匹配
- 参数顺序
- 局部变量与作用域
- 基本类型按值传递
- 数组引用值的复制
- 通过引用参数修改数组元素
- 参数自动类型转换

### 方法返回值

- 返回值类型
- return 语句
- void 与非 void 方法
- return 与控制台输出的区别
- 使用返回值进行其他计算
- return 提前结束方法
- 条件分支返回路径
- 缺少 return 的编译错误
- int、double、boolean、String 返回值
- 整数除法与浮点数除法
- 计算逻辑与输出逻辑分离

### 方法重载与综合计算

- 方法重载的含义
- 参数数量不同的重载
- 参数类型不同的重载
- 参数类型排列顺序不同的重载
- 仅修改返回类型不构成重载
- 仅修改形参名称不构成重载
- 重载解析
- 精确匹配与基本类型拓宽转换
- 重载调用歧义
- 重载与重写的区别
- 方法之间的调用与复用
- 嵌套方法调用
- 加减乘除计算
- 两参数和三参数最大值
- 除数为零处理
- Double.NaN
- 使用局部变量保存返回值
- main 统一输出结果

## 4. 本日课程与验收结果

| 课程 | Java 文件 | 静态审查 | 业务测试 | 状态 |
|---|---|---|---|---|
| D06-S01 | LibraryNotice.java | 14/14 | 1/1 | 通过 |
| D06-S02 | EmployeeWorkRecord.java | 18/18 | 3/3 | 通过 |
| D06-S03 | StudentScoreCalculator.java | 20/20 | 7/7 | 通过 |
| D06-S04 | Calculator.java | 24/24 | 12/12 | 通过 |
| 合计 | 4 个 Java 文件 | 76/76 | 23/23 | 全部通过 |

### D06-S01

使用四个 public static void 方法构建图书馆通知程序。

完成方法定义、调用与重复使用。

printRules 方法定义一次、调用两次。

首次提交通过 14 项静态审查和 1 项必要业务测试。

### D06-S02

编写员工信息与工作时长管理程序。

通过 String、int、double 和 int[] 参数传递不同业务数据。

验证基本类型形参被修改后，main 中的原变量不变。

验证通过数组引用形参修改数组元素后，main 可以观察到修改结果。

首次提交存在工资输出格式差异，修改后针对性复验通过。

最终 18/18 静态审查、3/3 业务测试通过。

### D06-S03

完成学生成绩计算程序。

实现：

- 总分计算。
- 浮点数平均分。
- 成绩合法性检查。
- 平均分及格判断。
- 非法成绩提前返回。
- 方法之间的调用与复用。
- 结果统一输出。

首次提交通过 20 项静态审查和 7 项业务测试。

### D06-S04

完成核心综合程序 Calculator.java。

实现：

- 整数加法与 double 加法重载。
- 减法与乘法。
- 浮点数除法。
- 除数为零检查。
- Double.NaN 返回。
- 两参数及三参数 max 重载。
- 三参数 max 复用两参数 max。
- main 保存十项方法调用结果并统一输出。

首次提交全部业务测试通过，但 CR22 因 main 未先保存返回值而未通过。

修改 main 后，CR22 针对性复验通过，正式输出回归验证通过。

最终 24/24 静态审查、12/12 业务测试通过。

## 5. 当前文件结构

```text
java-90-days/
├── README.md
├── 01-java-basics/
│   ├── day01/
│   ├── day02/
│   ├── day03/
│   ├── day04/
│   ├── day05/
│   └── day06/
│       ├── code/
│       │   ├── LibraryNotice.java
│       │   ├── EmployeeWorkRecord.java
│       │   ├── StudentScoreCalculator.java
│       │   └── Calculator.java
│       ├── tasks.md
│       └── notes.md
└── docs/
    ├── progress.md
    └── handoffs/
        ├── day01.md
        ├── day02.md
        ├── day03.md
        ├── day04.md
        ├── day05.md
        └── day06.md
```

Day 01–05 的课程代码、学习记录及历史验收结论保持不变。

## 6. 实际问题与修复经验

### D06-S01

未发现阻断性问题。

首次提交通过全部 CR 和 TC。

存在一项非阻断性注释用词建议，不影响验收。

### D06-S02

问题：工资输出固定保留两位小数。

首次实际输出：

```text
Salary: 8500.50
```

正式预期：

```text
Salary: 8500.5
```

修复：

将：

```java
System.out.printf("Salary: %.2f%n", salary);
```

修改为：

```java
System.out.printf("Salary: %.1f%n", salary);
```

结果：

- CR18 复验通过。
- TC01 复验通过。
- CR01–CR17 保留通过。
- TC02–TC03 保留通过。
- 最终 18/18、3/3。

经验：

printf 的格式说明符必须符合具体业务的输出精度要求。

另有无用 import 和注释用语建议，均不属于阻断性问题。

### D06-S03

首次提交全部通过。

使用：

```java
return (score1 + score2) / 2.0;
```

避免整数除法截断。

isPass 复用 isValidScore 和 calculateAverage。

所有条件分支均具有正确返回路径。

### D06-S04

问题：main 直接在 printf 中调用方法，未按课程要求保存返回值。

首次审查结果：

- CR：23/24。
- TC：12/12。
- CR22 未通过。

修复后：

先使用对应类型的局部变量接收十项计算与判断结果，再进行统一输出。

结果：

- CR22 复验通过。
- 其余 CR 保留通过。
- TC01–TC05 回归验证通过。
- TC06–TC12 保留通过。
- 最终 24/24、12/12。

经验：

Java 语法正确并不一定满足具体程序的结构性要求。

方法返回值保存、业务处理与统一输出是本节的明确训练目标。

目前不存在已知阻断性 Java 代码问题。

## 7. 验收规则

继续执行以下规则：

1. 每次只学习一节课程。
2. 当前课程通过后才开始下一节。
3. 练习由学习者独立完成。
4. 提交完整 Java 源码及必要实际运行结果。
5. 进行明确的 CR 静态代码审查。
6. 根据实际业务分支安排必要 TC。
7. 不要求单独提交 javac 编译终端记录。
8. 明显语法错误仍属于未通过项目。
9. 不机械增加测试数量。
10. 保留已经通过的历史审查项目和业务测试。
11. 对实际修改部分进行针对性复验。
12. 修改公共逻辑时安排必要回归测试。
13. 未提交的测试不得虚构通过。
14. Day 01–77 不安排独立理论问答或模拟面试。
15. 全部课程通过后统一整理 Markdown。
16. Git 提交与推送必须通过真实操作验收。

## 8. Git 与 GitHub 归档

- 本地仓库：`E:\Java\java-90-days`
- GitHub：https://github.com/yhsx1/java-90-days
- 分支：main
- Day 01：历史 Git 归档完成
- Day 02：历史 Git 归档完成，已确认提交 `d29df72`
- Day 03：历史 Git 归档完成，已确认提交 `ed7f5d4`
- Day 04：历史 Git 归档完成，已确认提交 `8f1758fffbeb9104db89abeec5876d106f3ebcd7`
- Day 05：历史 Git 归档完成，具体 SHA 以真实 Git 日志为准
- Day 06：课程与代码验收完成，学习记录按照 Git 归档完成的预期状态编写
- `.class` 文件及 IDEA 缓存：不纳入版本管理

Day 06 归档内容：

四个 Java 程序：

1. LibraryNotice.java
2. EmployeeWorkRecord.java
3. StudentScoreCalculator.java
4. Calculator.java

五个 Markdown 文件：

1. `01-java-basics/day06/tasks.md`
2. `01-java-basics/day06/notes.md`
3. `docs/progress.md`
4. `docs/handoffs/day06.md`
5. `README.md`

建议 Git 提交说明：

`feat(day06): complete Java methods and calculator exercises`

Day 06 Commit SHA 必须以真实提交记录为准，不预先填写。

## 9. 下一学习日：Day 07

正式课程主题：

**第一周综合复习与考核**

README 第 3.1 节规定：

完成命令行学生成绩统计器，至少通过五组业务测试。

### Day 07 目标

综合使用 Day 01–06 已学习知识：

- Java 类与 main 方法。
- 基本数据类型。
- 变量与常量。
- Scanner 输入。
- printf 输出。
- 运算符。
- if/else。
- switch 的已学基础。
- for、while。
- break、continue。
- 一维数组。
- 数组索引与遍历。
- 方法定义与调用。
- 方法参数。
- return 与返回值。
- 方法重载基础。

### Day 07 学习要求

- 继承 Day 01–06 全部正式验收成果。
- 不重新要求提交历史 Java 源码或测试。
- 以 README 第 3.1 节为唯一逐日课程路线依据。
- Day 07 属于第一周综合复习与考核。
- 优先通过独立综合编程检验已掌握知识。
- 不提前引入面向对象实例方法、集合、泛型、数据库或 Spring Boot。
- 不安排独立理论问答、选择题或模拟面试。
- 保持交互式代码提交。
- 核心程序至少通过五组具有不同意义的业务测试。
- 仍需进行适当静态代码审查。
- 业务测试数量根据实际设计和风险确定。
- 历史通过项不重复验收。
- 完成 Day 07 全部课程后，再整理相应 Markdown 和 Git 归档。

在 Day 06 Git 正式归档完成前，不进入 Day 07。

## 10. 最终交接结论

Day 06 四节课程全部正式验收通过。

已完成四个独立 Java 程序。

静态代码审查：76/76。

正式业务测试：23/23。

核心综合文件 Calculator.java：

- CR01–CR24 全部通过。
- TC01–TC12 全部通过。
- CR22 针对性复验通过。
- 无阻断性问题。

累计学习进度更新为 6/90 天（按照 Day 06 Git 归档完成的预期最终状态）。

Day 06 Markdown 学习记录已整理。

下一学习日：Day 07。

下一学习主题：第一周综合复习与考核。

核心任务：命令行学生成绩统计器。

Day 07 在 Day 06 实际 Git 归档正式验收后启动。