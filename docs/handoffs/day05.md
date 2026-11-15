# Day 05 学习交接记录

## 1. 当前学习进度

- 学习日期：2026-11-13 至 2026-11-15
- 当前学习日：Day 05 / 90
- 当前阶段：Java 基础与面向对象
- 课程验收：4/4 通过
- Java 编程练习：4/4 通过
- 静态代码审查：64/64 适用项通过
- 正式业务测试：23/23 通过
- 核心综合审查：20/20 通过
- 核心综合测试：10/10 通过
- 累计进度：5/90 天
- 下一学习日：Day 06

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

- `01-java-basics/day05/code/WarehouseStock.java`
- `01-java-basics/day05/code/InventoryUpdate.java`
- `01-java-basics/day05/code/DailySalesSummary.java`
- `01-java-basics/day05/code/ScoreStatistics.java`

四个 Java 程序均已通过正式代码审查及必要业务测试。

## 3. 本日已掌握知识

### 数组基础

- 一维数组的概念与用途
- 数组与普通变量的区别
- 数组声明
- 使用 new 创建数组
- 静态初始化
- 动态初始化
- 数组元素默认值
- 数组引用的基本概念
- 数组长度固定
- 数组索引从 0 开始
- length 属性
- 数组与 Python list 的区别

### 数组索引与修改

- 按索引读取元素
- 按索引修改元素
- 使用数组元素进行运算
- 复合赋值
- 业务编号与数组索引转换
- 合法索引范围判断
- ArrayIndexOutOfBoundsException
- 使用 if/else 防止数组越界
- 非法数据不允许修改业务数组

### 数组遍历与输入

- for 循环遍历数组
- while 循环遍历数组
- 使用 length 控制循环边界
- Scanner 批量读取整数
- 根据输入数量动态创建数组
- hasNextInt 输入类型检查
- 使用 break 终止非法输入
- 使用 boolean 保存数据有效状态
- 数组累加统计

### 数组综合统计

- 使用第一个元素初始化最大值
- 使用第一个元素初始化最小值
- 遍历数组计算最大值
- 遍历数组计算最小值
- 累计数组元素总和
- 使用 double 计算平均值
- 避免整数除法精度损失
- 使用 printf 保留两位小数
- 单元素数组统计
- 相同成绩统计
- 首尾极值处理
- 非法人数与成绩处理

## 4. 本日课程与验收结果

| 课程 | Java 文件 | 静态审查 | 业务测试 | 状态 |
|---|---|---|---|---|
| D05-S01 | WarehouseStock.java | 14/14 | 1/1 | 通过 |
| D05-S02 | InventoryUpdate.java | 14/14 | 5/5 | 通过 |
| D05-S03 | DailySalesSummary.java | 16/16 | 7/7 | 通过 |
| D05-S04 | ScoreStatistics.java | 20/20 | 10/10 | 通过 |

全部课程和编程任务正式验收通过。

### D05-S01

完成固定数组创建、库存数据访问、数组长度读取以及首尾元素访问。

采用一组必要标准测试，代码审查和测试均通过。

### D05-S02

完成商品库存更新与数组索引合法性检查。

发现入库数量上限遗漏后，补充 1000 上限判断。

针对性复验通过。

### D05-S03

完成基于 Scanner 的多日销量输入、数组遍历及总销量统计。

修复 public 类名错误以及非整数销量未及时退出循环的问题。

针对性复验通过。

### D05-S04

完成学生成绩统计核心综合程序。

实现最高分、最低分、平均分及非法输入处理。

修复非法学生人数提示大小写问题。

最终 CR01–CR20 全部通过。

最终 TC01–TC10 全部通过。

## 5. 当前文件结构

```text
java-90-days/
├── README.md
├── 01-java-basics/
│   ├── day01/
│   ├── day02/
│   ├── day03/
│   ├── day04/
│   └── day05/
│       ├── code/
│       │   ├── WarehouseStock.java
│       │   ├── InventoryUpdate.java
│       │   ├── DailySalesSummary.java
│       │   └── ScoreStatistics.java
│       ├── tasks.md
│       └── notes.md
└── docs/
    ├── progress.md
    └── handoffs/
        ├── day01.md
        ├── day02.md
        ├── day03.md
        ├── day04.md
        └── day05.md
```

Day 01–04 历史课程记录保持原有验收结论。

Day 05 新增四个 Java 程序及对应 Markdown 学习记录。

## 6. 实际问题及修复经验

### D05-S01

根据固定数据展示程序的实际复杂度，采用一组必要业务测试。

### D05-S02

问题：入库数量只检查非负，没有限制上限。

修复：同时验证入库数量不超过 1000。

结果：新增 TC05 通过，最终 5/5 测试通过。

### D05-S03

问题一：public 类名与规定文件名不一致。

问题二：非整数销量未立即退出输入循环。

修复：统一类名，并在非法销量分支使用 break。

结果：新增 TC07 通过，最终 7/7 测试通过。

### D05-S04

问题：非法学生人数提示首字母小写。

修复：统一改为 Invalid student count。

结果：TC07、TC08 重新测试通过，最终 10/10 测试通过。

当前不存在已知的阻断性 Java 代码问题。

## 7. 验收规则

从 Day 05 起，统一采用以下规则：

1. 每次只开展一节课程。
2. 当前课程通过后才能进入下一节。
3. 正式练习由学习者独立编写。
4. 进行必要的静态代码审查。
5. 不要求提交单独的编译终端证据。
6. 仍然检查明显语法错误。
7. 根据业务复杂度安排必要测试。
8. 简单固定输出程序不强制多组测试。
9. 涉及条件分支、边界或非法输入时覆盖必要场景。
10. 修改后保留未受影响的历史通过项。
11. 仅对受影响的项目进行针对性复验。
12. 提交的运行输出必须来自真实执行。
13. 所有课程通过后再进行最终 Markdown 与 Git 归档。

Day 01–77 继续以代码和实操验收为主，不提前安排理论问答。

## 8. Git 与 GitHub 归档

- 本地仓库：`E:\Java\java-90-days`
- GitHub：`https://github.com/yhsx1/java-90-days`
- 分支：main
- Day 01：历史归档完成
- Day 02：历史归档完成
- Day 02 已确认提交：`d29df72`
- Day 03：历史归档完成
- Day 03 已验收提交：`ed7f5d4`
- Day 04：历史归档完成
- Day 04 已验收提交：`8f1758fffbeb9104db89abeec5876d106f3ebcd7`
- Day 05 四个 Java 程序：正式验收通过
- Day 05 Markdown 学习记录：归档完成
- Day 05 Git 归档：完成
- `.class` 文件：不纳入版本管理

Day 05 归档提交说明：

`feat(day05): complete Java arrays and score statistics exercises`

Day 05 提交 SHA 以实际 Git 日志为准，不在归档前预设。

## 9. 下一学习日：Day 06

正式课程主题：

**Java 方法定义、参数、返回值与方法重载**

README 第 3.1 节规定的核心综合文件：

`Calculator.java`

核心任务：

封装加法、减法、乘法、除法及最大值计算。

### 建议课程安排

| 课程 | 主题 |
|---|---|
| D06-S01 | 方法定义、调用与 void |
| D06-S02 | 方法参数与实参传递 |
| D06-S03 | 返回值、return 与方法调用结果 |
| D06-S04 | 方法重载与 Calculator.java 综合验收 |

具体课程安排以 README 最新 main 分支和 Day 06 正式启动提示词为准。

### Day 06 学习要求

- 继承 Day 01–05 正式验收结果。
- 不重复系统讲授已完成的数组和循环基础。
- 可以正常复用数组、条件、循环和 Scanner。
- 重点学习方法的定义、调用、参数、返回值和重载。
- 一课一练、逐课验收。
- 不提前进入 Day 07。
- 不提前引入集合、面向对象综合开发或 Spring Boot。
- 继续执行动态测试数量和免编译证据规则。

## 10. 最终交接结论

Day 05 四节课程全部通过正式验收。

已完成四个 Java 程序。

静态代码审查：64/64。

必要业务测试：23/23。

核心综合文件 ScoreStatistics.java：20/20 审查通过，10/10 测试通过。

累计学习进度更新为 5/90 天。

Day 05 学习记录与 Git 归档完成。

下一学习日：Day 06。

Day 06 核心文件：Calculator.java。