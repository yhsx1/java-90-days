# Day 08 学习交接记录

## 1. 当前学习进度

- 学习日期：2026-11-24
- 当前学习日：Day 08 / 90
- 当前阶段：第一阶段，Java 基础与面向对象
- 学习主题：类、对象、字段与成员方法
- 课程验收：4/4 通过
- Java 编程练习：4/4 通过
- 静态代码审查：100/100 通过
- 正式业务测试：31/31 通过
- 核心综合程序：Student.java
- 核心综合审查：36/36 通过
- 核心综合测试：12/12 通过
- 累计验收轮次：7
- 实际问题修复：6/6
- 阻断性问题：0
- Markdown 归档：完成
- Git 归档：完成
- 累计进度：8/90 天
- 下一学习日：Day 09

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

- `01-java-basics/day08/code/LibraryBook.java`
- `01-java-basics/day08/code/ServerNode.java`
- `01-java-basics/day08/code/InventoryItem.java`
- `01-java-basics/day08/code/Student.java`

以上四个程序均已通过正式静态代码审查、实际运行测试及必要针对性复验。

正式项目状态：

- Student Manager Console：尚未正式开始，已完成类、对象、实例字段及实例方法的前置训练。
- Campus Assistant Platform：尚未开始，计划在 Day 36–77 开发。

Day 08 的 Student.java 是独立面向对象基础练习，不是完整学生管理系统 CRUD 项目。

Day 01–07 的历史成果、源码、运行证据及验收结论保持不变。

## 3. 本日已掌握知识

### 类、对象与实例字段

- 面向对象编程的基本思想
- 类与对象的关系
- class 关键字
- public 类与 Java 文件名称
- new 创建对象
- 引用变量声明
- 实例字段声明
- 实例字段默认值
- String 默认值 null
- int 默认值 0
- double 默认值 0.0
- boolean 默认值 false
- 实例字段与局部变量区别
- 使用点号访问字段
- 使用点号修改字段
- main 静态上下文与实例字段区别

### 对象引用与状态独立性

- 同一个类创建多个对象
- 每个对象拥有独立实例字段
- 基本类型赋值
- 引用类型赋值
- 对象创建与引用复制区别
- 引用变量数量与实际对象数量区别
- 多个引用指向同一对象
- 引用共享与引用别名
- 通过共享引用修改对象状态
- 引用重新赋值
- 字段修改与引用重新赋值区别
- 使用 == 和 != 比较对象引用
- 字段内容相同与对象身份相同区别
- 局部引用变量的确定赋值
- null 引用
- NullPointerException 基础
- 解除引用不直接销毁原对象
- 数组引用与普通对象引用联系

### 实例成员方法

- 实例方法定义
- 实例方法调用
- 实例方法中的当前对象
- 实例方法读取当前对象字段
- 实例方法修改当前对象字段
- 实例方法与 static 方法区别
- 静态方法通过对象参数访问字段
- 无参数、无返回值方法
- 有参数、无返回值方法
- 无参数、有返回值方法
- 有参数、有返回值方法
- 实例字段、方法参数、局部变量区别
- 参数遮蔽同名实例字段
- return 与状态修改区别
- 查询方法与状态修改方法
- 不同对象调用同一实例方法
- 实例方法之间的调用
- 方法复用
- 共享引用调用实例方法
- main 与业务方法职责划分

### 业务建模与状态保护

- 根据业务需求确定类的字段与方法
- 区分原始对象状态与派生计算结果
- 根据实例字段计算库存价值
- 正常入库与非法入库保护
- 出库合法性判断
- 库存充足条件
- 正常出库与失败保护
- 恰好全部出库
- 零数量及负数出库处理
- 三门课程总分
- 三门课程平均分
- 浮点数除法
- 平均成绩及格判断
- A、B、C、D、F 等级判断
- 原始平均成绩与显示精度区别
- 0–100 成绩合法范围
- 多个字段整体更新
- 先检查全部参数，再修改对象字段
- && 短路求值
- 任意参数非法时保持全部原始状态
- 更新后重新计算业务结果

### 编程与测试能力

- 多个对象独立初始化
- 固定业务数据实际运行
- 通过实例方法执行正常业务操作
- 通过实际输出验证状态变化
- 方法返回值保存
- printf 格式化输出
- 固定字符串及标签准确性检查
- 正常操作测试
- 非法操作测试
- 对象状态独立性测试
- 引用共享测试
- 空引用测试
- 合法上下限测试
- 等级边界测试
- 针对性代码复验
- 必要输出回归检查

## 4. 本日课程与验收结果

| 课程 | 主题 | 静态审查 | 业务测试 | 状态 |
|---|---|---|---|---|
| D08-S01 | 类、对象与实例字段 | 14/14 | 3/3 | 通过 |
| D08-S02 | 对象创建、引用与字段访问 | 22/22 | 6/6 | 通过 |
| D08-S03 | 实例成员方法与对象行为 | 28/28 | 10/10 | 通过 |
| D08-S04 | Student.java 综合编程 | 36/36 | 12/12 | 通过 |
| 合计 | 四节课程 | 100/100 | 31/31 | 全部通过 |

### D08-S01

完成 LibraryBook.java。

声明三个实例字段：

- String title
- int pageCount
- boolean borrowed

通过 new 创建一个图书对象。

在主动赋值之前读取实例字段默认值。

验证默认值：

```text
null
0
false
```

主动设置字段：

- title = Java Basics
- pageCount = 320
- borrowed = true

重新读取对象字段。

最后将 borrowed 修改为 false。

正式七行运行输出全部正确。

首次提交全部通过。

最终：

- CR01–CR14：14/14。
- TC01–TC03：3/3。
- 验收轮次：1。
- 阻断性问题：0。

### D08-S02

完成 ServerNode.java。

声明三个实例字段：

- String nodeId
- double cpuUsage
- boolean online

创建两个独立服务器对象。

使用三个引用变量：

- node1
- node2
- selectedNode

通过两次 new 创建两个对象。

完成四次规定的引用比较。

验证：

- 两个独立对象的字段互不干扰。
- selectedNode 可以指向 node1 的对象。
- 通过共享引用修改字段后，原引用能够读取最新状态。
- selectedNode 可以重新指向 node2 的对象。
- 引用重新赋值不会修改原对象字段。
- 将 selectedNode 设置为 null 后，node2 仍可访问原对象。

首次验收：

- CR20/22。
- TC6/6。

实际问题：

- selectNode 命名与正式要求不一致。
- 解除共享引用的执行时机提前。

修改后：

- 统一使用 selectedNode。
- 先输出两个对象的最终信息，再解除共享引用。
- CR14、CR22 复验通过。
- 正式13行输出回归检查通过。
- 全部六组原有 TC 保留通过。

最终：

- CR01–CR22：22/22。
- TC01–TC06：6/6。
- 验收轮次：2。
- 阻断性问题：0。

### D08-S03

完成 InventoryItem.java。

声明四个实例字段：

- String itemId
- String itemName
- int stock
- double unitPrice

定义五个实例方法：

- void printInfo()
- void addStock(int quantity)
- double calculateTotalValue()
- boolean canRemoveStock(int quantity)
- boolean removeStock(int quantity)

实现：

- 商品信息输出。
- 正常入库。
- 非法入库保护。
- 库存总价值计算。
- 出库条件判断。
- 正常出库。
- 库存不足保护。
- 全部出库。
- 零数量出库拒绝。
- 负数出库拒绝。
- 多对象状态独立性。

removeStock 复用 canRemoveStock。

main 中11次非 void 业务调用结果均正确保存到局部变量。

首次验收：

- CR24/28。
- TC8/10。

实际问题：

- KeyBoard 大小写错误。
- 最终库存价值计算时机提前。

修改后：

- 商品名称修正为 Keyboard。
- 先输出两个商品的最终信息，再计算并保存最终库存价值。
- CR19、CR25、CR27、CR28 复验通过。
- TC01、TC10 复验通过。
- TC02–TC09 原有通过结论保留。
- 正式24行输出全部正确。

五个实例业务方法全部保持原有正确实现。

最终：

- CR01–CR28：28/28。
- TC01–TC10：10/10。
- 验收轮次：2。
- 阻断性问题：0。

### D08-S04

完成核心综合程序 Student.java。

声明六个实例字段：

- String studentId
- String name
- int age
- int javaScore
- int databaseScore
- int networkScore

实现七个实例业务方法：

- void printInfo()
- int calculateTotalScore()
- double calculateAverageScore()
- boolean isPassed()
- String calculateGrade()
- boolean isValidScore(int score)
- boolean updateScores(int newJavaScore, int newDatabaseScore, int newNetworkScore)

创建两个独立学生对象 student1、student2。

实现：

- 初始学生信息输出。
- 总分与平均分统计。
- 及格判断。
- 五个成绩等级判断。
- 正常成绩更新。
- 三种非法成绩更新。
- 合法成绩范围边界。
- 五组等级边界。
- 对象状态独立性。
- 更新后的重新计算。
- 最终学生状态及统计结果。

方法复用：

- calculateAverageScore 复用 calculateTotalScore。
- isPassed 复用 calculateAverageScore。
- calculateGrade 复用 calculateAverageScore。
- updateScores 复用 isValidScore。

七个实例方法均正确实现。

48次非 void 业务方法调用返回值全部正确保存。

三次非法成绩更新均未引起任何字段的部分修改。

首次验收：

- CR34/36。
- TC11/12。

实际问题：

- 第5行输出标签错误。
- 功能五没有先保存全部四个合法性检查结果，再统一输出。

修改后：

- 第5行修正为 Update student1 result: true。
- 第8行原有正确标签继续保留。
- 四次 isValidScore 调用结果先保存，再依次输出。
- CR35、CR36 针对性复验通过。
- TC03 针对性复验通过。
- TC07 相关运行输出回归检查正确。
- 其余历史通过项保留。
- 正式28行输出全部正确。

最终：

- CR01–CR36：36/36。
- TC01–TC12：12/12。
- 验收轮次：2。
- 阻断性问题：0。

### 全日验收统计

| 课程 | 首次 CR | 首次 TC | 最终 CR | 最终 TC | 验收轮次 |
|---|---|---|---|---|---:|
| D08-S01 | 14/14 | 3/3 | 14/14 | 3/3 | 1 |
| D08-S02 | 20/22 | 6/6 | 22/22 | 6/6 | 2 |
| D08-S03 | 24/28 | 8/10 | 28/28 | 10/10 | 2 |
| D08-S04 | 34/36 | 11/12 | 36/36 | 12/12 | 2 |
| 合计 | 92/100 | 28/31 | 100/100 | 31/31 | 7 |

本日四轮首次验收、三轮针对性复验。

最终全部131项验收通过。

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
│   ├── day06/
│   ├── day07/
│   └── day08/
│       ├── code/
│       │   ├── LibraryBook.java
│       │   ├── ServerNode.java
│       │   ├── InventoryItem.java
│       │   └── Student.java
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
        ├── day06.md
        ├── day07.md
        └── day08.md
```

Day 01–07 的历史代码、学习记录及正式验收结论全部保留。

Day 08 四个 Java 程序及五份 Markdown 学习记录均已整理归档。

## 6. 实际问题与修复经验

### D08-S01

首次提交全部通过。

没有发现阻断性问题。

经验：

创建对象后，可以在主动赋值之前读取实例字段的默认值。

局部变量不能套用实例字段默认初始化规则。

### D08-S02

问题一：

共享引用变量命名为 selectNode。

正式要求：

```java
ServerNode selectedNode = node1;
```

修改后全部相关引用位置统一使用 selectedNode。

问题二：

首次实现提前执行：

```java
selectedNode = null;
```

修改后先输出两个对象的最终信息，再解除共享引用。

复验结果：

- CR14：PASS。
- CR22：PASS。
- 正式13行输出全部正确。
- 其余 CR 保留通过。
- TC01–TC06 保留通过。

经验：

引用变量名称不影响对象身份，但明确冻结的命名规则属于验收要求。

解除引用不会自动修改原对象字段。

程序的实际业务结果正确，并不意味着执行流程一定符合正式要求。

### D08-S03

问题一：

首次商品名称初始化为：

```java
item1.itemName = "KeyBoard";
```

修改为：

```java
item1.itemName = "Keyboard";
```

问题二：

首次最终库存价值计算发生在两个 printInfo 调用之前。

修改后：

```java
System.out.println("Final inventory:");
item1.printInfo();
item2.printInfo();
double item1FinalTotalValue = item1.calculateTotalValue();
double item2FinalTotalValue = item2.calculateTotalValue();
```

复验结果：

- CR19、CR25、CR27、CR28：全部通过。
- TC01、TC10：全部通过。
- TC02–TC09 保留通过。
- 正式24行输出全部正确。

经验：

输出错误可能来源于初始业务数据，而不是输出方法。

修复时应定位真正的问题来源。

已经正确的业务方法不应为解决其他问题而被无关修改。

### D08-S04

问题一：

第5行首次输出：

```text
Updated student1 result: true
```

正式要求：

```text
Update student1 result: true
```

修改对应 printf 格式字符串。

保留第8行 Updated student1 的正确输出。

问题二：

功能五首次采用逐次调用 isValidScore、逐次输出的方式。

修改为：

```java
boolean isValidScore1 = student2.isValidScore(0);
boolean isValidScore2 = student2.isValidScore(100);
boolean isValidScore3 = student2.isValidScore(-1);
boolean isValidScore4 = student2.isValidScore(101);

System.out.printf("Valid score 0: %b%n", isValidScore1);
System.out.printf("Valid score 100: %b%n", isValidScore2);
System.out.printf("Valid score -1: %b%n", isValidScore3);
System.out.printf("Valid score 101: %b%n", isValidScore4);
```

复验结果：

- CR35、CR36：全部通过。
- TC03：通过。
- TC01–TC02、TC04–TC12 保留通过。
- TC07 输出回归检查正确。
- 正式28行输出全部正确。

经验：

固定英文标签需要逐字核对。

明确要求先保存全部业务结果时，应将调用计算与结果输出区分为两个阶段。

### 本日综合经验

本日实际发现六处问题，全部完成修复。

六处问题均属于任务规范符合性问题。

四个程序不存在已知核心业务逻辑错误。

需要继续加强：

- 指定变量名称自查。
- 初始业务数据准确性。
- 固定字符串大小写。
- 方法调用与输出顺序。
- 返回值保存规则。
- 正式输出逐行核对。

后续遇到问题时继续遵循最小修改原则，保留已通过的业务方法及验收成果。

## 7. 验收规则

继续执行以下规则：

1. 每次只学习一节课程。
2. 当前课程通过后才开始下一节。
3. 正式练习由学习者独立完成。
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
17. 每日归档正文统一按照 Git 归档已完成的预期状态编写。
18. README 第3.1节是逐日课程安排的正式依据。
19. 不提前提供正式练习完整答案。
20. 已完成学习日的课程不重复审查。
21. 正式任务发布后冻结 CR、TC 和业务限制，不随意追加强制性验收项目。
22. 保留最终验收源码的原有变量名称、注释、业务逻辑和输出方式。
23. Markdown 学习记录只记录真实发生的问题及实际提交的运行证据。
24. 教学示例的预期输出不得作为正式任务实际运行证据。
25. 数学公式应符合 GitHub Markdown 渲染规范。

### 归档正文规则

每个学习日全部正式通过后，统一整理：

- 当日 tasks.md。
- 当日 notes.md。
- docs/progress.md。
- docs/handoffs/dayXX.md。
- README.md。

归档正文统一采用当天 Git 归档已经完成的预期最终状态。

不得将文档中的完成状态当成真实 Git 提交或推送证据。

具体 Git 提交编号只依据真实 Git 历史记录。

### 数学公式规则

行内公式：

```text
$A=\frac{T}{3}$
```

独立公式在正式 Markdown 中使用：

$$
A=\frac{T}{3}
$$

要求：

- 独立公式的两个 $$ 分隔符分别独占一行。
- 公式前后保留空行。
- 正式数学公式不放入普通代码块。
- 不使用 \[ 和 \] 作为正式 GitHub Markdown 独立公式分隔符。
- 保留完整的 LaTeX 反斜杠、花括号和数学命令。
- 简单计算可以使用普通文本。

## 8. Git 与 GitHub 归档

- 本地仓库：`E:\Java\java-90-days`
- GitHub：https://github.com/yhsx1/java-90-days
- 分支：main
- Day 01：历史 Git 归档完成
- Day 02：历史 Git 归档完成，已确认提交 `d29df72`
- Day 03：历史 Git 归档完成，已确认提交 `ed7f5d4`
- Day 04：历史 Git 归档完成，已确认提交 `8f1758fffbeb9104db89abeec5876d106f3ebcd7`
- Day 05：历史 Git 归档完成，具体 SHA 以真实 Git 日志为准
- Day 06：历史 Git 归档完成，具体 SHA 以真实 Git 日志为准
- Day 07：历史 Git 归档完成，已确认提交 `17bb5ffdea1ee14d32a622b6922b5a265881042b`
- Day 08：学习记录按照 Git 归档完成的最终状态编写
- `.class` 文件及 IDEA 缓存：不纳入版本管理

### Day 08 归档内容

四个 Java 程序：

1. LibraryBook.java
2. ServerNode.java
3. InventoryItem.java
4. Student.java

五个 Markdown 文件：

1. `01-java-basics/day08/tasks.md`
2. `01-java-basics/day08/notes.md`
3. `docs/progress.md`
4. `docs/handoffs/day08.md`
5. `README.md`

正式验收：

- 课程：4/4。
- Java 文件：4/4。
- 静态审查：100/100。
- 业务测试：31/31。
- 核心综合审查：36/36。
- 核心综合测试：12/12。
- 累计验收轮次：7。
- 实际问题修复：6/6。
- 阻断性问题：0。

Git 提交说明：

`feat(day08): complete Java classes objects and student exercises`

Day 08 Git 归档按照完成后的预期状态整理。

具体 Commit SHA 以真实 Git 历史为准，不预先编造。

### Git 归档验收机制

真实归档时执行：

1. 检查当前 Git 分支。
2. 检查工作区状态。
3. 检查新增及修改文件。
4. 检查非本日文件是否存在意外修改。
5. 精准暂存当天四个 Java 文件及五份 Markdown。
6. 使用 git diff --cached --name-status 检查暂存范围。
7. 使用 git diff --cached --check 检查暂存内容。
8. 使用规定的 Commit Message 提交。
9. 推送至 origin/main。
10. 检查真实 Commit SHA。
11. 检查 HEAD 与 origin/main 是否一致。
12. 检查工作区是否 clean。

不随意使用 git add .。

发现历史文件存在未提交修改时，必须先检查 diff，再判断是否需要保留。

不未经检查直接使用破坏性命令丢弃历史修改。

## 9. 下一学习日：Day 09

正式课程主题：

**构造方法、this、封装、getter/setter**

README 第3.1节规定：

为学生年龄和成绩增加合法性限制。

### Day 09 目标

主要学习：

- 构造方法的概念。
- 构造方法的作用。
- 默认构造方法。
- 显式定义无参数构造方法。
- 有参数构造方法。
- 构造方法与对象初始化。
- 构造方法重载。
- 构造方法与普通实例方法区别。
- this 表示当前对象。
- this 与同名字段、参数的区分。
- 封装的基本思想。
- private 实例字段。
- getter 读取对象状态。
- setter 修改对象状态。
- 在对象初始化过程中维护合法状态。
- 在状态修改过程中进行参数校验。
- 学生年龄合法范围。
- 学生成绩合法范围。
- 合法数据更新。
- 非法更新后的状态保护。
- 多个学生对象的状态独立性。

Day 09 的具体子课程、正式文件名称、业务数据及年龄范围等验收标准，应在对应课程发布时明确并冻结。

不提前将尚未发布的具体业务参数视为已经确定。

### Day 09 学习要求

- 继承 Day 01–08 全部正式验收成果。
- 不重新要求提交历史 Java 源码或测试。
- 以 README 第3.1节为唯一逐日课程路线依据。
- Day 09 重点是构造方法、this 和封装。
- 理论教学必须完整并循序渐进。
- 保持一课一练、逐课验收。
- 正式练习由学习者独立完成。
- 不提前提供正式练习的完整答案。
- 使用交互式区域提交源码及实际输出。
- 冻结必要 CR 和 TC 标准。
- 严格区分 PASS、FAIL 和待验收。
- 历史通过项不重复验收。
- 对修改部分进行针对性复验。
- 不要求 javac 编译终端证据。
- 不提前系统学习 Day 10 的继承、super 和方法重写。
- 不提前扩展为完整学生管理系统 CRUD 项目。
- 不安排独立理论问答、选择题或模拟面试。
- 全部课程通过后，再统一整理 Markdown 与 Git 归档。
- 归档正文继承 Git 已完成的预期状态规则。
- 数学公式遵循 GitHub Markdown 渲染规范。

### 与 Day 08 的知识衔接

Day 08 通过直接字段赋值完成对象初始化。

Day 09 将通过构造方法组织对象初始化。

Day 08 通过不同参数名称避免字段遮蔽。

Day 09 将学习使用 this 区分当前对象字段及同名参数。

Day 08 允许 main 直接修改实例字段。

Day 09 将学习使用封装限制外部直接访问，并通过合法业务方法维护对象状态。

Day 08 已经实现 isValidScore 和 updateScores。

Day 09 应在此基础上进一步理解如何利用构造方法、private 和 getter/setter 保护对象状态。

不需要机械重复 Day 08 的默认值、引用共享及库存业务练习。

历史 Day 08 源码必须保持原有正式验收版本，不应通过修改历史 Student.java 来替代 Day 09 独立练习。

## 10. 最终交接结论

Day 08 四节课程全部正式验收通过。

已完成四个独立 Java 程序：

- LibraryBook.java。
- ServerNode.java。
- InventoryItem.java。
- Student.java。

静态代码审查：100/100。

正式业务测试：31/31。

累计验收轮次：7。

实际问题修复：6/6。

核心综合文件 Student.java：

- 六个实例字段全部正确。
- 七个实例业务方法全部正确。
- 两个学生对象全部正确。
- 48次非 void 业务调用结果正确保存。
- CR01–CR36 全部通过。
- TC01–TC12 全部通过。
- CR35、CR36 针对性复验通过。
- TC03 针对性复验通过。
- 正式28行输出全部正确。
- 无剩余阻断性问题。

累计学习进度更新为 **8/90 天**。

Day 08 Markdown 学习记录已整理，并按照 Git 归档完成的预期最终状态编写。

下一学习日：**Day 09**。

下一学习主题：**构造方法、this、封装、getter/setter**。

核心任务：**为学生年龄和成绩增加合法性限制。**

Day 09 必须继承 Day 01–08 的完整课程成果和正式验收记录。