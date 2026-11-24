# Day 08 学习任务

## 一、基本信息

- 所属阶段：第一阶段，Java 基础与面向对象
- 学习日期：2026-11-24
- 学习主题：类、对象、字段与成员方法
- 工作目录：`01-java-basics/day08/`
- Java 版本：Eclipse Temurin 21
- IDE：IntelliJ IDEA
- 核心综合程序：Student.java
- 课程数量：4 节
- Java 编程任务：4 个
- 静态代码审查：100/100 通过
- 正式业务测试：31/31 通过
- 累计验收轮次：7 轮
- 全日状态：正式验收通过
- Markdown 归档：完成
- Git 归档：完成

## 二、学习目标

- [x] 理解面向对象编程的基本思想
- [x] 理解类与对象的关系
- [x] 使用 class 定义 Java 类
- [x] 使用 new 创建对象
- [x] 声明不同类型的实例字段
- [x] 掌握实例字段的默认值
- [x] 使用点号访问和修改实例字段
- [x] 理解引用变量与实际对象的区别
- [x] 理解多个对象的状态独立性
- [x] 理解引用赋值和引用共享
- [x] 理解引用重新赋值
- [x] 使用 == 判断对象引用关系
- [x] 理解 null 与空引用判断
- [x] 定义和调用实例成员方法
- [x] 区分实例方法与 static 方法
- [x] 使用实例方法读取对象状态
- [x] 使用实例方法修改对象状态
- [x] 综合使用方法参数与返回值
- [x] 使用实例方法之间的调用实现方法复用
- [x] 区分方法返回值与对象状态修改
- [x] 验证不同对象调用同一实例方法的行为
- [x] 实现业务数据合法性检查
- [x] 实现多个字段的整体更新
- [x] 使用浮点数除法计算平均成绩
- [x] 实现成绩等级及边界判断
- [x] 完成 Student.java 核心综合任务
- [x] 完成必要业务测试及针对性复验
- [x] 完成 Markdown 与 Git 归档

## 三、课程安排

| 课程编号 | 课程主题 | 正式编程文件 | 状态 |
|---|---|---|---|
| D08-S01 | 类、对象与实例字段 | LibraryBook.java | 验收通过 |
| D08-S02 | 对象创建、引用与字段访问 | ServerNode.java | 验收通过 |
| D08-S03 | 实例成员方法与对象行为 | InventoryItem.java | 验收通过 |
| D08-S04 | Student.java 综合编程 | Student.java | 验收通过 |

---

## 第 1 课：类、对象与实例字段

课程编号：D08-S01。

### 学习内容

- [x] 理解类是对象的结构定义
- [x] 理解对象是类的具体实例
- [x] 使用 public class 定义类
- [x] 理解实例字段与局部变量的区别
- [x] 声明 String、int、boolean 类型实例字段
- [x] 理解实例字段默认初始化
- [x] 使用 new 创建对象
- [x] 使用引用变量保存对象引用
- [x] 使用点号读取实例字段
- [x] 使用点号修改实例字段
- [x] 理解 main 与实例字段之间的关系
- [x] 初步理解 null
- [x] 完成 LibraryBook.java
- [x] 完成 CR01–CR14 静态审查
- [x] 完成 TC01–TC03 正式业务测试

### 实操任务

文件路径：

`01-java-basics/day08/code/LibraryBook.java`

练习目标：

定义图书类，创建一个图书对象，验证实例字段默认值、字段赋值及状态修改。

实例字段：

| 字段 | 类型 | 默认值 | 赋值后的值 |
|---|---|---|---|
| title | String | null | Java Basics |
| pageCount | int | 0 | 320 |
| borrowed | boolean | false | true |

业务要求：

1. 定义 public class LibraryBook。
2. 声明三个非 static 实例字段。
3. 在 main 中恰好创建一个 LibraryBook 对象。
4. 在主动设置字段之前输出三个默认值。
5. 通过对象引用设置图书名称、页数及借阅状态。
6. 通过对象引用输出更新后的三个字段。
7. 再次将 borrowed 修改为 false。
8. 输出最终借阅状态。

不使用 Scanner、显式构造方法、this、getter/setter、继承、接口或集合。

### 静态代码审查

| 编号 | 审查要求 | 结果 |
|---|---|---|
| CR01 | 文件名为 LibraryBook.java | PASS |
| CR02 | public 类名为 LibraryBook | PASS |
| CR03 | main 方法签名正确 | PASS |
| CR04 | 三个字段的名称及类型正确 | PASS |
| CR05 | 字段声明在类体内、方法外 | PASS |
| CR06 | 三个字段均为实例字段 | PASS |
| CR07 | 使用 new 恰好创建一个 LibraryBook 对象 | PASS |
| CR08 | 主动赋值前读取字段默认值 | PASS |
| CR09 | 正确输出三个字段的默认值 | PASS |
| CR10 | 正确设置三个规定字段 | PASS |
| CR11 | 通过对象引用读取更新后的字段 | PASS |
| CR12 | 再次将 borrowed 修改为 false | PASS |
| CR13 | 正式七行输出格式正确 | PASS |
| CR14 | 遵守全部冻结的编程限制 | PASS |

### 正式业务测试

| 编号 | 测试场景 | 预期结果 | 结果 |
|---|---|---|---|
| TC01 | 对象创建及字段默认值 | null、0、false | PASS |
| TC02 | 字段赋值及读取 | Java Basics、320、true | PASS |
| TC03 | 借阅状态再次修改 | false | PASS |

一次完整运行覆盖全部三组测试。

实际运行输出：

```text
Default title: null
Default pageCount: 0
Default borrowed: false
Updated title: Java Basics
Updated pageCount: 320
Updated borrowed: true
Final borrowed: false
```

### 实际问题与修复

本节首次提交通过全部静态审查及正式业务测试。

未发现阻断性问题，不需要修改或复验。

### 验收结果

| 项目 | 结果 |
|---|---|
| 静态代码审查 | 14/14 通过 |
| 正式业务测试 | 3/3 通过 |
| 正式运行输出 | 7/7 行正确 |
| 验收轮次 | 1 |
| 阻断性问题 | 0 |
| 最终状态 | 正式验收通过 |

**课程状态：正式验收通过。**

---

## 第 2 课：对象创建、引用与字段访问

课程编号：D08-S02。

### 学习内容

- [x] 使用同一个类创建多个对象
- [x] 理解不同对象的实例字段独立性
- [x] 区分基本类型变量与引用变量
- [x] 理解引用赋值不复制对象
- [x] 理解引用数量与对象数量的区别
- [x] 使用多个引用访问同一个对象
- [x] 通过共享引用修改对象状态
- [x] 区分字段修改与引用重新赋值
- [x] 使用 == 和 != 比较引用关系
- [x] 理解字段值相同与对象身份相同的区别
- [x] 区分未赋值引用、null 引用和有效引用
- [x] 理解 NullPointerException 基础
- [x] 理解将引用设置为 null 的作用
- [x] 联系数组引用与普通对象引用
- [x] 完成 ServerNode.java
- [x] 完成 CR01–CR22 静态审查
- [x] 完成 TC01–TC06 正式业务测试
- [x] 完成针对性复验

### 实操任务

文件路径：

`01-java-basics/day08/code/ServerNode.java`

练习目标：

创建两个独立服务器对象，验证状态独立性、引用共享、引用重新赋值、引用比较及空引用行为。

实例字段：

| 字段 | 类型 | 含义 |
|---|---|---|
| nodeId | String | 节点编号 |
| cpuUsage | double | CPU 使用率 |
| online | boolean | 在线状态 |

初始业务数据：

| 字段 | node1 | node2 |
|---|---|---|
| nodeId | NODE-001 | NODE-002 |
| cpuUsage | 35.5 | 62.0 |
| online | true | false |

业务流程：

1. 创建两个独立服务器对象。
2. 分别设置两个对象的实例字段。
3. 输出初始信息。
4. 使用 == 比较 node1 与 node2。
5. 将 node1 的 CPU 使用率修改为 48.0。
6. 输出两个对象的 CPU 使用率，验证状态独立性。
7. 声明 selectedNode，使其引用 node1 的对象。
8. 比较 selectedNode 与 node1。
9. 通过 selectedNode 将 CPU 使用率修改为 75.0。
10. 分别通过 node1 和 selectedNode 读取 CPU 使用率。
11. 将 selectedNode 重新赋值为 node2。
12. 比较 selectedNode 与 node2。
13. 通过 selectedNode 将 CPU 使用率修改为 20.5，将在线状态修改为 true。
14. 分别输出两个对象的最终完整信息。
15. 将 selectedNode 设置为 null。
16. 判断 selectedNode 是否为 null。
17. 通过 node2 再次读取剩余对象信息。

编程限制：

- 恰好创建两个 ServerNode 对象。
- 使用 node1、node2、selectedNode 三个规定的引用变量。
- 不使用 static 业务字段。
- 不额外定义业务方法。
- 不使用 Scanner、循环、数组、集合、显式构造方法或 this。
- 不硬编码引用比较结果或字段读取结果。

### 静态代码审查

| 编号 | 审查要求 | 最终结果 |
|---|---|---|
| CR01 | 文件名为 ServerNode.java | PASS |
| CR02 | public 类名为 ServerNode | PASS |
| CR03 | main 方法签名正确 | PASS |
| CR04 | 三个规定字段的名称和数据类型正确 | PASS |
| CR05 | 字段位于类体内、方法外，均为实例字段 | PASS |
| CR06 | 使用 new 恰好创建两个服务器对象 | PASS |
| CR07 | 使用规定的 node1 和 node2 引用变量 | PASS |
| CR08 | 正确初始化 node1 的三个字段 | PASS |
| CR09 | 正确初始化 node2 的三个字段 | PASS |
| CR10 | 通过实际字段访问输出两个对象初始信息 | PASS |
| CR11 | 使用 == 比较 node1 和 node2，并输出实际结果 | PASS |
| CR12 | 通过 node1 修改 CPU 为48.0，未修改 node2 | PASS |
| CR13 | 正确读取并输出独立修改后的两个 CPU 字段 | PASS |
| CR14 | 正确声明 selectedNode 并指向 node1 的对象，未创建额外对象 | PASS |
| CR15 | 使用 == 验证 selectedNode 与 node1 的引用关系 | PASS |
| CR16 | 通过 selectedNode 修改 CPU 为75.0，并通过两个引用读取 | PASS |
| CR17 | 正确将 selectedNode 重新赋值为 node2，并使用 == 验证 | PASS |
| CR18 | 通过 selectedNode 修改第二个对象的 CPU 和在线状态 | PASS |
| CR19 | 正确读取并输出两个对象最终完整信息 | PASS |
| CR20 | 正确解除引用、判断 null 并通过 node2 访问剩余对象 | PASS |
| CR21 | 正式13行输出内容、格式及顺序正确，无硬编码业务结果 | PASS |
| CR22 | Java 语法正确，遵守全部冻结限制 | PASS |

### 正式业务测试

| 编号 | 测试场景 | 对应输出行 | 最终结果 |
|---|---|---|---|
| TC01 | 多个对象创建与初始化 | 1–2 | PASS |
| TC02 | 独立对象引用比较 | 3 | PASS |
| TC03 | 对象状态独立性 | 4–5 | PASS |
| TC04 | 引用共享与字段修改 | 6–8 | PASS |
| TC05 | 引用重新赋值与目标对象修改 | 9–11 | PASS |
| TC06 | 解除引用与原对象保留 | 12–13 | PASS |

对象状态变化：

| 阶段 | node1 CPU | node2 CPU | node1 online | node2 online |
|---|---:|---:|---|---|
| 初始化 | 35.5 | 62.0 | true | false |
| 独立修改 | 48.0 | 62.0 | true | false |
| 共享引用修改 | 75.0 | 62.0 | true | false |
| 重新指定引用目标并修改 | 75.0 | 20.5 | true | true |
| 解除共享引用 | 75.0 | 20.5 | true | true |

最终实际运行输出：

```text
Initial node1: NODE-001, 35.5, true
Initial node2: NODE-002, 62.0, false
Same object: false
Independent node1 CPU: 48.0
Independent node2 CPU: 62.0
Selected is node1: true
Shared node1 CPU: 75.0
Shared selected CPU: 75.0
Selected is node2: true
Final node1: NODE-001, 75.0, true
Final node2: NODE-002, 20.5, true
Selected is null: true
Remaining node2: NODE-002, 20.5, true
```

### 实际问题与修复

首次验收：

- 静态代码审查：20/22 通过。
- 正式业务测试：6/6 通过。
- 未通过项：CR14、CR22。

问题一：

共享引用变量命名为 selectNode，与正式任务规定的 selectedNode 不一致。

修改方式：

将所有 selectNode 统一重命名为 selectedNode。

问题二：

首次实现先解除共享引用，再输出两个对象的最终信息。

该执行顺序不符合正式任务规定。

修改方式：

将 selectedNode = null 移动至两条 Final 信息输出之后、null 判断之前。

两处问题均不影响原有核心业务结果，属于任务规范符合性问题。

针对性复验：

- CR14：PASS。
- CR22：PASS。
- 正式13行输出回归检查：全部通过。
- CR01–CR13、CR15–CR21 原有通过结果保留。
- TC01–TC06 原有通过结果保留。

### 验收结果

| 项目 | 结果 |
|---|---|
| 静态代码审查 | 22/22 通过 |
| 正式业务测试 | 6/6 通过 |
| 正式运行输出 | 13/13 行正确 |
| 实际问题 | 2 处 |
| 已修复问题 | 2 处 |
| 验收轮次 | 2 |
| 阻断性问题 | 0 |
| 最终状态 | 正式验收通过 |

**课程状态：正式验收通过。**

---

## 第 3 课：实例成员方法与对象行为

课程编号：D08-S03。

### 学习内容

- [x] 理解实例方法的概念及作用
- [x] 区分实例方法与 static 方法
- [x] 通过对象引用调用实例方法
- [x] 理解实例方法中的当前对象
- [x] 使用实例方法读取当前对象字段
- [x] 使用实例方法修改当前对象字段
- [x] 无参数、无返回值方法
- [x] 有参数、无返回值方法
- [x] 无参数、有返回值方法
- [x] 有参数、有返回值方法
- [x] 区分字段、方法参数与局部变量
- [x] 理解参数遮蔽实例字段的问题
- [x] 区分方法返回值与状态修改
- [x] 理解不同对象调用同一实例方法
- [x] 实例方法之间的调用及复用
- [x] 通过共享引用调用实例方法
- [x] 区分 main 与实例业务方法职责
- [x] 实现正常入库与非法入库处理
- [x] 实现正常出库与库存不足处理
- [x] 实现零数量及负数边界检查
- [x] 完成 InventoryItem.java
- [x] 完成 CR01–CR28 静态审查
- [x] 完成 TC01–TC10 正式业务测试
- [x] 完成针对性复验

### 实操任务

文件路径：

`01-java-basics/day08/code/InventoryItem.java`

练习目标：

使用多个商品对象和五个实例方法完成库存管理，验证方法参数、返回值、状态修改、方法复用及对象独立性。

实例字段：

| 字段 | 类型 | 含义 |
|---|---|---|
| itemId | String | 商品编号 |
| itemName | String | 商品名称 |
| stock | int | 当前库存 |
| unitPrice | double | 商品单价 |

必须实现的实例方法：

| 方法 | 返回类型 | 功能 |
|---|---|---|
| printInfo() | void | 输出商品完整信息 |
| addStock(int quantity) | void | 正数入库，非法数量不修改库存 |
| calculateTotalValue() | double | 计算当前库存价值 |
| canRemoveStock(int quantity) | boolean | 判断出库数量是否合法且库存充足 |
| removeStock(int quantity) | boolean | 复用出库判断，成功时扣减库存 |

库存价值公式：

$$
\text{Total Value}=\text{Stock}\times\text{Unit Price}
$$

合法出库条件：

$$
0<q\leq s
$$

其中 $q$ 为出库数量，$s$ 为当前库存。

初始业务数据：

| 字段 | item1 | item2 |
|---|---|---|
| itemId | ITEM-001 | ITEM-002 |
| itemName | Keyboard | Mouse |
| stock | 20 | 10 |
| unitPrice | 150.0 | 80.0 |

业务流程：

1. 创建两个独立商品对象并初始化。
2. 调用两个 printInfo 方法。
3. 计算、保存并输出两个初始库存价值。
4. 对 item1 执行10件正常入库。
5. 输出两个对象库存，验证状态独立性。
6. 对 item1 尝试-5件非法入库。
7. 分别判断两个对象能否出库15件。
8. 分别执行两个对象出库15件的操作。
9. 对 item2 执行10件全部出库。
10. 对 item1 执行0件和-3件非法出库。
11. 输出最终商品信息。
12. 重新计算、保存并输出最终库存价值。

编程限制：

- 恰好创建两个 InventoryItem 对象。
- 使用 item1、item2 两个规定引用变量。
- 四个字段均为实例字段。
- 五个业务方法均为实例方法。
- 后续库存修改必须通过实例方法完成。
- removeStock 必须复用 canRemoveStock。
- main 中所有非 void 业务调用结果先保存到对应类型局部变量。
- 不使用显式构造方法、this、getter/setter、Scanner、循环、业务数组、继承、接口或集合。
- 不硬编码计算结果、库存变化结果和布尔结果。

### 静态代码审查

| 编号 | 审查要求 | 最终结果 |
|---|---|---|
| CR01 | 文件名为 InventoryItem.java | PASS |
| CR02 | public 类名为 InventoryItem | PASS |
| CR03 | main 方法签名正确 | PASS |
| CR04 | 四个实例字段名称及类型正确 | PASS |
| CR05 | 字段位于类体内、方法外，未使用 static | PASS |
| CR06 | 五个规定实例方法签名正确 | PASS |
| CR07 | 五个业务方法均为实例方法 | PASS |
| CR08 | printInfo 正确读取当前对象全部字段 | PASS |
| CR09 | printInfo 输出格式正确，单价保留两位小数 | PASS |
| CR10 | addStock 正确处理正数入库 | PASS |
| CR11 | addStock 正确拒绝零数量和负数，无额外输出 | PASS |
| CR12 | calculateTotalValue 正确计算并返回库存价值，不修改状态 | PASS |
| CR13 | canRemoveStock 正确检查数量大于零 | PASS |
| CR14 | canRemoveStock 正确检查库存充足条件，不修改状态 | PASS |
| CR15 | removeStock 正确复用 canRemoveStock | PASS |
| CR16 | removeStock 成功时正确扣减库存并返回 true | PASS |
| CR17 | removeStock 失败时保持库存不变并返回 false | PASS |
| CR18 | 恰好创建两个对象，使用规定引用变量名称 | PASS |
| CR19 | 两个对象的初始字段值全部正确 | PASS |
| CR20 | 正确获取并输出初始信息及库存价值 | PASS |
| CR21 | 正确通过实例方法执行正常及非法入库 | PASS |
| CR22 | 正确调用 canRemoveStock 完成两个对象的出库判断 | PASS |
| CR23 | 正确调用 removeStock 完成正常出库及库存不足场景 | PASS |
| CR24 | 正确完成全部出库、零数量及负数边界操作 | PASS |
| CR25 | 正确按规定顺序输出最终信息并计算最终库存价值 | PASS |
| CR26 | main 中所有非 void 业务方法返回值正确保存，职责划分正确 | PASS |
| CR27 | 正式24行输出内容、格式及顺序正确，无硬编码业务结果 | PASS |
| CR28 | Java 语法正确，遵守全部冻结限制 | PASS |

### 正式业务测试

| 编号 | 测试场景 | 对应输出行 | 最终结果 |
|---|---|---|---|
| TC01 | 对象初始化及信息输出 | 1–2 | PASS |
| TC02 | 初始库存价值计算 | 3–4 | PASS |
| TC03 | 正常入库及对象状态独立性 | 5–6 | PASS |
| TC04 | 非法入库 | 7 | PASS |
| TC05 | 出库条件判断 | 8–9 | PASS |
| TC06 | 正常出库及库存不足 | 10–13 | PASS |
| TC07 | 恰好全部出库 | 14–15 | PASS |
| TC08 | 零数量出库 | 16–17 | PASS |
| TC09 | 负数出库 | 18–19 | PASS |
| TC10 | 最终对象状态及库存价值 | 20–24 | PASS |

零数量入库由 CR11 静态审查覆盖，不额外增加运行测试。

库存状态变化：

| 阶段 | item1 库存 | item2 库存 |
|---|---:|---:|
| 初始化 | 20 | 10 |
| 正常入库 | 30 | 10 |
| 非法入库 | 30 | 10 |
| 出库判断 | 30 | 10 |
| 正常出库及库存不足 | 15 | 10 |
| 全部出库 | 15 | 0 |
| 零数量出库 | 15 | 0 |
| 负数出库 | 15 | 0 |

最终实际运行输出：

```text
Item: ITEM-001, Keyboard, stock=20, price=150.00
Item: ITEM-002, Mouse, stock=10, price=80.00
Initial item1 value: 3000.00
Initial item2 value: 800.00
Restocked item1 stock: 30
Unchanged item2 stock: 10
Invalid restock item1 stock: 30
Can remove from item1: true
Can remove from item2: false
Remove item1 result: true
Remove item2 result: false
After removal item1 stock: 15
After removal item2 stock: 10
Exact removal result: true
Exact removal item2 stock: 0
Zero removal result: false
Zero removal item1 stock: 15
Negative removal result: false
Negative removal item1 stock: 15
Final inventory:
Item: ITEM-001, Keyboard, stock=15, price=150.00
Item: ITEM-002, Mouse, stock=0, price=80.00
Final item1 value: 2250.00
Final item2 value: 0.00
```

### 实际问题与修复

首次验收：

- 静态代码审查：24/28 通过。
- 正式业务测试：8/10 通过。
- 未通过 CR：CR19、CR25、CR27、CR28。
- 未通过 TC：TC01、TC10。

问题一：

第一个商品名称初始化为 KeyBoard，而正式要求为 Keyboard。

导致第1行和第21行输出不符合要求。

修改方式：

将 item1.itemName 的初始值修改为 Keyboard。

保留 printInfo 方法原有正确实现，不通过字符串转换绕过数据错误。

问题二：

最终库存价值计算早于最终商品信息输出。

修改方式：

先输出 Final inventory 和两个商品的完整信息，再调用两个 calculateTotalValue 方法，将结果保存到局部变量并输出。

针对性复验：

- CR19：PASS。
- CR25：PASS。
- CR27：PASS。
- CR28：PASS。
- TC01：PASS。
- TC10：PASS。
- 正式24行输出回归检查：全部通过。
- CR01–CR18、CR20–CR24、CR26 原有通过结果保留。
- TC02–TC09 原有通过结果保留。

五个实例业务方法均保持原有正确实现。

### 验收结果

| 项目 | 结果 |
|---|---|
| 静态代码审查 | 28/28 通过 |
| 正式业务测试 | 10/10 通过 |
| 实例业务方法 | 5/5 正确 |
| 非 void 业务调用返回值保存 | 11/11 正确 |
| 正式运行输出 | 24/24 行正确 |
| 实际问题 | 2 处 |
| 已修复问题 | 2 处 |
| 验收轮次 | 2 |
| 阻断性问题 | 0 |
| 最终状态 | 正式验收通过 |

**课程状态：正式验收通过。**

---

## 第 4 课：Student.java 综合编程

课程编号：D08-S04。

### 学习内容

- [x] 综合运用类、对象与实例字段
- [x] 根据业务需求设计类
- [x] 区分对象状态与临时计算结果
- [x] 区分查询方法与状态修改方法
- [x] 创建多个独立学生对象
- [x] 定义七个实例业务方法
- [x] 通过实例方法输出学生信息
- [x] 计算三门课程总分
- [x] 复用总分方法计算平均分
- [x] 使用 double 避免整数除法截断
- [x] 根据原始平均成绩判断及格
- [x] 根据原始平均成绩判断等级
- [x] 实现成绩合法范围检查
- [x] 复用合法性检查方法
- [x] 全部参数合法后整体更新三个字段
- [x] 拒绝任意一个参数非法的更新
- [x] 验证非法更新不会发生部分修改
- [x] 验证0分和100分合法端点
- [x] 验证60、70、80、90分等级边界
- [x] 验证低于60分的合法成绩
- [x] 验证不同学生对象的状态独立性
- [x] 更新后重新计算业务结果
- [x] 在 main 中保存全部非 void 业务返回值
- [x] 按规定顺序完成综合业务流程
- [x] 完成 Student.java 核心综合任务
- [x] 完成 CR01–CR36 静态审查
- [x] 完成 TC01–TC12 正式业务测试
- [x] 完成针对性复验

### 综合实操任务

文件路径：

`01-java-basics/day08/code/Student.java`

练习目标：

综合使用面向对象基础知识，创建多个学生对象，实现学生信息展示、成绩计算、成绩等级判断及合法成绩更新。

实例字段：

| 字段 | 类型 | 含义 |
|---|---|---|
| studentId | String | 学号 |
| name | String | 姓名 |
| age | int | 年龄 |
| javaScore | int | Java 成绩 |
| databaseScore | int | 数据库成绩 |
| networkScore | int | 计算机网络成绩 |

初始数据：

| 字段 | student1 | student2 |
|---|---|---|
| studentId | STU-001 | STU-002 |
| name | Alice | Bob |
| age | 22 | 23 |
| javaScore | 90 | 55 |
| databaseScore | 80 | 60 |
| networkScore | 85 | 60 |

七个实例方法：

| 方法 | 返回类型 | 功能 |
|---|---|---|
| printInfo() | void | 输出六个实例字段 |
| calculateTotalScore() | int | 计算三科总分 |
| calculateAverageScore() | double | 复用总分方法计算平均分 |
| isPassed() | boolean | 复用平均分方法判断及格 |
| calculateGrade() | String | 根据原始平均成绩判断等级 |
| isValidScore(int score) | boolean | 判断单科成绩是否合法 |
| updateScores(int newJavaScore, int newDatabaseScore, int newNetworkScore) | boolean | 全部合法后整体更新成绩 |

总分公式：

$$
T=S_{\text{Java}}+S_{\text{Database}}+S_{\text{Network}}
$$

平均分公式：

$$
A=\frac{T}{3}
$$

合法成绩范围：

$$
0\leq S\leq100
$$

及格规则：

$$
A\geq60
$$

等级规则：

| 平均成绩范围 | 等级 |
|---|---|
| $90\leq A\leq100$ | A |
| $80\leq A<90$ | B |
| $70\leq A<80$ | C |
| $60\leq A<70$ | D |
| $0\leq A<60$ | F |

等级判断使用原始平均成绩，而不是提前舍入后的显示结果。

方法复用关系：

```text
isPassed()
    └── calculateAverageScore()
            └── calculateTotalScore()

calculateGrade()
    └── calculateAverageScore()
            └── calculateTotalScore()

updateScores()
    └── isValidScore()
```

### 综合业务流程

#### 功能一：创建并初始化两个学生对象

- 恰好创建两个 Student 对象。
- 使用 student1、student2 两个引用变量。
- 按规定设置全部六个实例字段。
- 依次调用两个 printInfo 方法。

#### 功能二：初始成绩统计

分别调用两个对象的四个统计方法，保存返回值并统一输出。

| 项目 | student1 | student2 |
|---|---:|---:|
| 总分 | 255 | 175 |
| 平均分 | 85.00 | 58.33 |
| 及格 | true | false |
| 等级 | B | F |

#### 功能三：正常更新与状态独立性

将 student1 三科成绩更新为95、90、85。

输出更新结果及两个对象的完整信息。

重新调用 student1 的四个统计方法。

预期：

- 更新成功。
- student1 总分270，平均分90.00，等级A。
- student2 原始信息保持不变。

#### 功能四：非法成绩更新

| 场景 | Java | Database | Network | 预期返回值 |
|---|---:|---:|---:|---|
| Java 非法 | -1 | 70 | 80 | false |
| Database 非法 | 70 | 101 | 80 | false |
| Network 非法 | 70 | 80 | -5 | false |

每次操作后立即输出返回值及 student1 的完整信息。

三次非法更新均不得修改原有成绩95、90、85。

#### 功能五：单科成绩合法范围

通过 student2 分别调用 isValidScore。

| 参数 | 预期返回值 |
|---:|---|
| 0 | true |
| 100 | true |
| -1 | false |
| 101 | false |

先保存全部四次调用结果，再依次输出。

#### 功能六：成绩等级边界

依次对 student2 执行以下五组成绩更新。

| 场景 | Java | Database | Network | 平均分 | 及格 | 等级 |
|---|---:|---:|---:|---:|---|---|
| 恰好60 | 0 | 80 | 100 | 60.00 | true | D |
| 恰好70 | 70 | 70 | 70 | 70.00 | true | C |
| 恰好80 | 80 | 80 | 80 | 80.00 | true | B |
| 恰好90 | 90 | 90 | 90 | 90.00 | true | A |
| 低于60 | 59 | 60 | 60 | 59.67 | false | F |

每组先更新成绩，再重新计算平均分、及格状态和等级。

保存全部四个返回值并输出本组结果后，才进入下一组测试。

#### 功能七：最终状态及统计

先输出 Final students:。

依次调用两个 printInfo 方法。

再分别调用两个对象的四个统计方法，保存返回值并统一输出。

最终状态：

| 项目 | student1 | student2 |
|---|---|---|
| Java 成绩 | 95 | 59 |
| Database 成绩 | 90 | 60 |
| Network 成绩 | 85 | 60 |
| 总分 | 270 | 179 |
| 平均分 | 90.00 | 59.67 |
| 及格 | true | false |
| 等级 | A | F |

### 正式编程限制

1. 使用 public class Student。
2. 声明六个规定的实例字段。
3. 不额外定义总分、平均分、等级等派生字段。
4. 定义七个规定的实例业务方法。
5. 七个业务方法均不使用 static。
6. 使用标准 main 方法。
7. 恰好创建两个 Student 对象。
8. 使用 student1、student2 两个规定引用变量。
9. 后续成绩修改必须通过 updateScores 完成。
10. calculateAverageScore 必须复用 calculateTotalScore。
11. isPassed 与 calculateGrade 必须复用 calculateAverageScore。
12. calculateGrade 必须先保存平均分到 double 局部变量。
13. updateScores 必须复用 isValidScore。
14. 全部成绩合法后才允许修改三个成绩字段。
15. main 中全部非 void 业务调用返回值均保存到对应类型局部变量。
16. 遵守正式业务执行顺序。
17. 不使用显式构造方法、this、getter/setter。
18. 不使用 Scanner、循环、业务数组、集合、继承或接口。
19. 不额外定义其他业务方法。
20. 不硬编码业务计算和判断结果，除 printInfo 外的业务方法不得输出信息。

标准 main 的 String[] args 参数不属于禁止使用的业务数组。

### 静态代码审查

| 编号 | 审查要求 | 最终结果 |
|---|---|---|
| CR01 | 文件名为 Student.java | PASS |
| CR02 | public 类名为 Student | PASS |
| CR03 | main 方法签名正确 | PASS |
| CR04 | 六个规定字段名称及类型正确 | PASS |
| CR05 | 字段位于类体内、方法外，均为实例字段 | PASS |
| CR06 | 未额外定义派生数据字段 | PASS |
| CR07 | 七个规定实例方法签名正确 | PASS |
| CR08 | 七个业务方法均未使用 static | PASS |
| CR09 | printInfo 正确读取全部六个字段 | PASS |
| CR10 | printInfo 输出标签、格式及顺序正确 | PASS |
| CR11 | calculateTotalScore 正确计算并返回总分 | PASS |
| CR12 | calculateAverageScore 正确复用 calculateTotalScore | PASS |
| CR13 | 使用浮点数除法并返回原始平均成绩 | PASS |
| CR14 | isPassed 正确复用平均分方法并检查60分及格线 | PASS |
| CR15 | calculateGrade 调用平均分方法并保存 double 返回值 | PASS |
| CR16 | 正确实现五个成绩等级及全部边界 | PASS |
| CR17 | 正确检查0–100的合法成绩范围 | PASS |
| CR18 | updateScores 正确复用 isValidScore 检查三个参数 | PASS |
| CR19 | 全部参数合法时更新三个成绩字段并返回 true | PASS |
| CR20 | 任意参数非法时返回 false，全部原始成绩保持不变 | PASS |
| CR21 | updateScores 不修改学号、姓名及年龄 | PASS |
| CR22 | 方法状态修改及输出职责符合规定 | PASS |
| CR23 | 恰好创建两个对象，引用名称正确 | PASS |
| CR24 | 两个学生对象的初始字段值正确 | PASS |
| CR25 | 正确调用 printInfo 及四个统计方法获取初始结果 | PASS |
| CR26 | 正确更新 student1 并验证两个对象状态独立性 | PASS |
| CR27 | 更新后重新调用统计方法，未使用过期结果 | PASS |
| CR28 | 正确执行三个非法更新场景 | PASS |
| CR29 | 每次非法更新后立即输出结果及完整对象信息 | PASS |
| CR30 | 正确完成0、100、-1、101四个范围测试 | PASS |
| CR31 | 正确完成60、70、80、90及低于60的五组等级测试 | PASS |
| CR32 | 每组边界测试完成全部计算及输出后再进入下一组 | PASS |
| CR33 | 按规定顺序输出最终学生信息及统计结果 | PASS |
| CR34 | main 中全部非 void 业务方法返回值正确保存 | PASS |
| CR35 | 正式28行输出内容、格式、精度及顺序正确 | PASS |
| CR36 | Java 语法正确，遵守全部冻结编程限制 | PASS |

### 正式业务测试

| 编号 | 测试场景 | 对应输出行 | 最终结果 |
|---|---|---|---|
| TC01 | 两个对象创建及初始信息 | 1–2 | PASS |
| TC02 | 初始成绩统计 | 3–4 | PASS |
| TC03 | 正常更新与对象状态独立性 | 5–8 | PASS |
| TC04 | Java 成绩非法 | 9–10 | PASS |
| TC05 | Database 成绩非法 | 11–12 | PASS |
| TC06 | Network 成绩非法 | 13–14 | PASS |
| TC07 | 单科成绩合法范围边界 | 15–18 | PASS |
| TC08 | 平均分恰好60 | 19 | PASS |
| TC09 | 平均分恰好70 | 20 | PASS |
| TC10 | 平均分恰好80及90 | 21–22 | PASS |
| TC11 | 低于60分的合法成绩 | 23 | PASS |
| TC12 | 最终对象状态及统计结果 | 24–28 | PASS |

正式业务测试使用一次完整程序运行覆盖全部12组测试。

最终实际运行输出：

```text
Student: STU-001, Alice, age=22, Java=90, Database=80, Network=85
Student: STU-002, Bob, age=23, Java=55, Database=60, Network=60
Initial student1: total=255, average=85.00, passed=true, grade=B
Initial student2: total=175, average=58.33, passed=false, grade=F
Update student1 result: true
Student: STU-001, Alice, age=22, Java=95, Database=90, Network=85
Student: STU-002, Bob, age=23, Java=55, Database=60, Network=60
Updated student1: total=270, average=90.00, passed=true, grade=A
Invalid Java update: false
Student: STU-001, Alice, age=22, Java=95, Database=90, Network=85
Invalid Database update: false
Student: STU-001, Alice, age=22, Java=95, Database=90, Network=85
Invalid Network update: false
Student: STU-001, Alice, age=22, Java=95, Database=90, Network=85
Valid score 0: true
Valid score 100: true
Valid score -1: false
Valid score 101: false
Boundary 60: updated=true, average=60.00, passed=true, grade=D
Boundary 70: updated=true, average=70.00, passed=true, grade=C
Boundary 80: updated=true, average=80.00, passed=true, grade=B
Boundary 90: updated=true, average=90.00, passed=true, grade=A
Below 60: updated=true, average=59.67, passed=false, grade=F
Final students:
Student: STU-001, Alice, age=22, Java=95, Database=90, Network=85
Student: STU-002, Bob, age=23, Java=59, Database=60, Network=60
Final student1: total=270, average=90.00, passed=true, grade=A
Final student2: total=179, average=59.67, passed=false, grade=F
```

### 实际问题与修复

首次验收：

- 静态代码审查：34/36 通过。
- 正式业务测试：11/12 通过。
- 未通过 CR：CR35、CR36。
- 未通过 TC：TC03。

问题一：

第5行输出标签为：

```text
Updated student1 result: true
```

正式要求为：

```text
Update student1 result: true
```

修改方式：

仅修正对应 printf 格式字符串。

第8行的 Updated student1 统计标签本身正确，继续保留。

问题二：

功能五采用逐次调用 isValidScore、逐次输出的组织方式。

不符合先保存全部四个返回值、再依次输出的明确流程要求。

修改方式：

将四次 isValidScore 调用及局部变量赋值集中在前，四次输出集中在后。

七个实例业务方法均无需修改。

针对性复验：

- CR35：PASS。
- CR36：PASS。
- TC03：PASS。
- 正式28行输出回归检查：全部通过。
- 功能五第15–18行输出保持正确。
- CR01–CR34 原有通过结果保留。
- TC01–TC02、TC04–TC12 原有通过结果保留。

### 验收结果

| 项目 | 结果 |
|---|---|
| 静态代码审查 | 36/36 通过 |
| 正式业务测试 | 12/12 通过 |
| 实例字段 | 6/6 正确 |
| 实例业务方法 | 7/7 正确 |
| 学生对象 | 2/2 正确 |
| 非 void 业务调用返回值保存 | 48/48 正确 |
| 正式运行输出 | 28/28 行正确 |
| 实际问题 | 2 处 |
| 已修复问题 | 2 处 |
| 验收轮次 | 2 |
| 阻断性问题 | 0 |
| 最终状态 | 正式验收通过 |

**课程状态：正式验收通过。**

---

## 四、Day 08 正式验收汇总

### 4.1 各课程验收结果

| 课程 | Java 文件 | 首次 CR | 首次 TC | 最终 CR | 最终 TC | 验收轮次 |
|---|---|---|---|---|---|---:|
| D08-S01 | LibraryBook.java | 14/14 | 3/3 | 14/14 | 3/3 | 1 |
| D08-S02 | ServerNode.java | 20/22 | 6/6 | 22/22 | 6/6 | 2 |
| D08-S03 | InventoryItem.java | 24/28 | 8/10 | 28/28 | 10/10 | 2 |
| D08-S04 | Student.java | 34/36 | 11/12 | 36/36 | 12/12 | 2 |
| 合计 | 4 个程序 | 92/100 | 28/31 | 100/100 | 31/31 | 7 |

### 4.2 实际问题汇总

| 课程 | 实际问题 | 修复结果 |
|---|---|---|
| D08-S01 | 无 | 首次通过 |
| D08-S02 | selectNode 命名不符合要求 | 已修复 |
| D08-S02 | 解除引用执行时机提前 | 已修复 |
| D08-S03 | KeyBoard 大小写错误 | 已修复 |
| D08-S03 | 最终库存价值计算时机提前 | 已修复 |
| D08-S04 | 第5行输出标签错误 | 已修复 |
| D08-S04 | 合法性检查未先保存全部结果 | 已修复 |

实际问题总数：6。

已修复问题：6。

剩余阻断性问题：0。

所有实际问题均属于任务规范符合性问题。

四个程序的核心业务实现均正确。

### 4.3 正式验收完成检查

- [x] 四节课程全部正式验收通过
- [x] 四个 Java 程序全部正式验收通过
- [x] CR01–CR14：LibraryBook.java 全部通过
- [x] CR01–CR22：ServerNode.java 全部通过
- [x] CR01–CR28：InventoryItem.java 全部通过
- [x] CR01–CR36：Student.java 全部通过
- [x] 100 项静态代码审查全部通过
- [x] 31 组正式业务测试全部通过
- [x] 所有必要针对性复验通过
- [x] 六处实际问题全部修复
- [x] 无剩余阻断性问题
- [x] 满足 README 第3.1节 Day 08 核心要求

## 五、本日学习成果

已完成以下四个正式 Java 文件：

```text
01-java-basics/
└── day08/
    ├── code/
    │   ├── LibraryBook.java
    │   ├── ServerNode.java
    │   ├── InventoryItem.java
    │   └── Student.java
    ├── tasks.md
    └── notes.md
```

本日实现了从变量、数组及静态方法组织程序，到使用类、对象、实例字段和实例方法组织业务实体的初步过渡。

核心综合程序 Student.java 已实现：

- 多学生对象创建。
- 学生信息输出。
- 总分和平均分计算。
- 及格判断。
- 成绩等级判断。
- 成绩合法性检查。
- 合法成绩整体更新。
- 非法更新状态保护。
- 多对象状态独立性。
- 实例方法复用。
- 返回值保存及统一输出。
- 必要业务与边界测试。

本日未提前实现完整学生管理系统 CRUD，也未提前引入构造方法、this、封装和 getter/setter。

## 六、学习归档

- [x] 四个最终 Java 源码归档
- [x] tasks.md 学习任务归档
- [x] notes.md 学习笔记归档
- [x] docs/progress.md 累计进度更新
- [x] docs/handoffs/day08.md 交接记录归档
- [x] README.md 学习进度更新
- [x] Git 归档完成

Git 提交说明：

`feat(day08): complete Java classes objects and student exercises`

具体 Commit SHA 以真实 Git 历史记录为准。

## 七、下一学习日

下一学习日：Day 09。

学习主题：构造方法、this、封装、getter/setter。

README 第3.1节规定的核心任务：

为学生年龄和成绩增加合法性限制。

继续继承本日已经掌握的类、对象、实例字段、实例方法、方法复用及对象状态管理知识。

Day 01–77 不安排独立理论问答。

**Day 08 四节课程全部正式验收通过，Markdown 与 Git 学习归档完成。累计学习进度为8/90天，下一学习日为 Day 09。**