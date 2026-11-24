# Day 08 学习笔记

## 一、基本信息

- 所属阶段：第一阶段，Java 基础与面向对象
- 学习日期：2026-11-24
- 学习主题：类、对象、字段与成员方法
- 工作目录：`01-java-basics/day08/`
- Java 版本：Eclipse Temurin 21
- IDE：IntelliJ IDEA
- 已完成课程：4/4
- 已完成 Java 程序：4/4
- 静态审查：100/100 通过
- 正式业务测试：31/31 通过
- 累计验收轮次：7
- 核心综合程序：Student.java
- 全日结果：正式验收通过
- Markdown 归档：完成
- Git 归档：完成

## 二、类、对象与实例字段

### 2.1 面向对象编程的基本思想

面向对象编程（Object-Oriented Programming，OOP）是一种围绕对象及其数据和行为组织程序的方式。

在此前的 Java 基础学习中，主要使用：

- 变量保存单个数据。
- 数组保存多个同类型数据。
- 条件和循环控制程序执行。
- static 方法封装可复用逻辑。

面向对象编程进一步将相关数据和行为组织到类中。

例如，一个图书对象可以保存：

- 图书名称。
- 图书页数。
- 借阅状态。

一个服务器对象可以保存：

- 节点编号。
- CPU 使用率。
- 在线状态。

类还可以定义与这些数据有关的行为。

面向对象并不意味着不再使用数组、循环或静态方法，而是提供了新的业务组织方式。

### 2.2 类与对象

类是对一类事物的数据结构与行为的定义。

对象是类的具体实例。

例如：

```java
public class Device {
    String deviceId;
    double temperature;
    boolean online;
}
```

Device 是类。

通过 new 可以创建具体对象：

```java
Device device1 = new Device();
Device device2 = new Device();
```

device1 和 device2 是引用变量。

它们分别引用两个独立的 Device 对象。

同一个类可以创建多个对象，每个对象具有独立的实例字段。

### 2.3 Java 类的基本结构

```java
public class ClassName {
    // 实例字段

    // 实例方法

    public static void main(String[] args) {
        // 程序入口
    }
}
```

需要注意：

- public 类名应与 Java 文件名一致。
- 实例字段定义在类体内、方法外。
- 实例方法定义在类体内。
- main 是程序入口。
- 类中各方法的声明顺序通常不决定调用顺序。

### 2.4 实例字段

实例字段用于保存具体对象的状态。

例如：

```java
String title;
int pageCount;
boolean borrowed;
```

这些字段没有使用 static，因此每个 LibraryBook 对象分别拥有自己的字段值。

实例字段可以是基本类型，也可以是引用类型。

### 2.5 实例字段与局部变量

| 对比项 | 实例字段 | 局部变量 |
|---|---|---|
| 定义位置 | 类体内、方法外 | 方法或代码块内 |
| 所属范围 | 具体对象 | 当前方法调用或代码块 |
| 默认初始化 | 有 | 使用前必须完成确定赋值 |
| 主要用途 | 保存对象状态 | 保存临时数据和计算结果 |

例如：

```java
public class Rectangle {
    double width;
    double height;

    double calculateArea() {
        double area = width * height;
        return area;
    }
}
```

width 和 height 是实例字段。

area 是方法内部的局部变量。

### 2.6 实例字段默认值

创建对象时，未显式初始化的实例字段具有默认值。

| 类型 | 默认值 |
|---|---|
| byte | 0 |
| short | 0 |
| int | 0 |
| long | 0L |
| float | 0.0f |
| double | 0.0 |
| char | '\u0000' |
| boolean | false |
| 引用类型 | null |

String 属于引用类型，因此默认值为 null，而不是空字符串。

D08-S01 实际验证了：

```text
Default title: null
Default pageCount: 0
Default borrowed: false
```

局部变量不具有上述自动默认初始化规则。

例如：

```java
int count;
System.out.println(count);
```

如果 count 尚未完成确定赋值，则无法通过编译。

### 2.7 对象创建

基本语法：

```java
ClassName variableName = new ClassName();
```

例如：

```java
LibraryBook libraryBook = new LibraryBook();
```

该语句包含：

1. 声明 LibraryBook 类型的引用变量。
2. 使用 new 创建 LibraryBook 对象。
3. 将新对象的引用赋给 libraryBook。

如果普通类没有显式声明构造方法，编译器会提供默认构造方法。

构造方法的完整知识在 Day 09 学习。

### 2.8 实例字段读取与修改

读取字段：

```java
System.out.println(libraryBook.title);
```

修改字段：

```java
libraryBook.title = "Java Basics";
libraryBook.pageCount = 320;
libraryBook.borrowed = true;
```

点号操作符用于访问指定对象的成员。

通过对象引用修改实例字段时，修改结果保存在该对象中。

### 2.9 main 与实例字段

main 是静态方法，没有隐式关联的当前对象。

例如：

```java
public class Device {
    double temperature;

    public static void main(String[] args) {
        Device device = new Device();
        device.temperature = 35.5;
        System.out.println(device.temperature);
    }
}
```

不能在 main 中直接通过未限定的实例字段名称访问对象状态：

```java
System.out.println(temperature);
```

因为静态上下文没有确定应该访问哪个 Device 对象。

应通过明确的对象引用访问。

## 三、对象创建、引用与状态独立性

### 3.1 使用同一个类创建多个对象

```java
Device device1 = new Device();
Device device2 = new Device();

device1.temperature = 35.5;
device2.temperature = 42.0;
```

两次 new 分别创建两个对象。

两个对象分别保存自己的 temperature 字段。

如果执行：

```java
device1.temperature = 38.0;
```

device2.temperature 仍然为42.0。

### 3.2 对象状态独立性

不同对象拥有独立的实例字段。

例如：

| 字段 | device1 | device2 |
|---|---|---|
| deviceId | DEV-001 | DEV-002 |
| temperature | 35.5 | 42.0 |
| online | true | false |

修改第一个对象的字段，不会自动修改第二个对象的字段。

这一结论的前提是两个引用确实指向不同对象。

### 3.3 基本类型与引用类型

Java 的数据类型分为基本类型和引用类型。

基本类型变量保存具体的基本类型值。

引用类型变量保存对象引用或 null。

基本类型赋值：

```java
int a = 10;
int b = a;
b = 20;
```

最终：

```text
a = 10
b = 20
```

引用类型赋值：

```java
Device device1 = new Device();
Device device2 = device1;
```

这里仅创建一个 Device 对象。

device1 和 device2 保存相同的引用值。

两种赋值操作都在复制变量保存的值，但复制的数据类型不同。

### 3.4 对象创建与引用复制

创建两个独立对象：

```java
Device device1 = new Device();
Device device2 = new Device();
```

共享同一个对象：

```java
Device device1 = new Device();
Device device2 = device1;
```

| 对比项 | 两次 new | 一次 new 后复制引用 |
|---|---|---|
| 对象数量 | 2 | 1 |
| 引用变量数量 | 2 | 2 |
| 是否指向同一个对象 | 否 | 是 |
| 实例字段是否独立 | 是 | 访问同一对象字段 |

引用变量的数量不等于实际对象数量。

### 3.5 引用共享与别名

```java
Device device1 = new Device();
device1.temperature = 35.5;

Device alias = device1;
alias.temperature = 60.0;
```

此时：

```text
device1.temperature = 60.0
alias.temperature = 60.0
```

原因：

alias 与 device1 指向同一个对象。

通过 alias 修改字段，device1 可以读取相同对象的最新状态。

这种情况称为引用共享或引用别名（aliasing）。

### 3.6 引用关系示意

两个独立对象：

```text
device1 ──────> Device 对象1
                temperature = 35.5

device2 ──────> Device 对象2
                temperature = 42.0
```

建立共享引用：

```text
device1 ───┐
           ├──> Device 对象1
alias ─────┘    temperature = 35.5

device2 ──────> Device 对象2
                temperature = 42.0
```

通过 alias 修改 temperature 时，只修改对象1。

### 3.7 字段修改与引用重新赋值

字段修改：

```java
alias.temperature = 60.0;
```

改变的是引用所指对象的字段。

引用重新赋值：

```java
alias = device2;
```

改变的是 alias 保存的引用。

引用重新赋值不会自动修改原对象的数据，也不会改变 device1 或 device2 保存的引用。

### 3.8 引用比较

对于兼容的引用类型，== 判断两个引用是否指向同一个对象，或者是否都为 null。

例如：

```java
Device device1 = new Device();
Device device2 = new Device();
Device alias = device1;
```

比较结果：

| 表达式 | 结果 |
|---|---|
| device1 == device2 | false |
| device1 == alias | true |
| device2 != alias | true |

字段内容相同，不代表对象身份相同。

例如：

```java
device1.temperature = 35.5;
device2.temperature = 35.5;

System.out.println(device1.temperature == device2.temperature);
System.out.println(device1 == device2);
```

预期输出：

```text
true
false
```

字符串内容比较及 equals 方法在后续课程系统学习。

### 3.9 比较表达式与字符串拼接

正确：

```java
System.out.println("Same object: " + (device1 == device2));
```

不应遗漏括号：

```java
System.out.println("Same object: " + device1 == device2);
```

后者会先进行字符串拼接，再尝试比较不兼容的引用类型，导致编译错误。

使用 printf 时可以直接传入布尔表达式：

```java
System.out.printf("Same object: %b%n", device1 == device2);
```

### 3.10 未初始化引用与空引用

只声明局部引用变量：

```java
Device device;
```

此时尚未完成确定赋值。

显式赋予 null：

```java
Device device = null;
```

此时变量已经赋值，但没有指向实际对象。

创建对象：

```java
Device device = new Device();
```

此时可以通过 device 访问对象成员。

### 3.11 NullPointerException

如果通过 null 引用访问实例字段：

```java
Device device = null;
System.out.println(device.temperature);
```

程序运行时会产生 NullPointerException。

通过 null 引用调用实例方法也会产生同类异常。

可以先判断：

```java
if (device != null) {
    System.out.println(device.temperature);
}
```

### 3.12 解除共享引用

```java
Device device1 = new Device();
device1.temperature = 35.5;

Device alias = device1;
alias = null;
```

此时：

- alias 不再引用原对象。
- device1 仍然引用原对象。
- 对象字段没有因为 alias 赋值为 null 而改变。

赋值 null 不等同于立即销毁对象。

对象生命周期及垃圾回收机制将在后续课程学习。

### 3.13 数组与对象引用的联系

Java 数组也是对象。

```java
int[] array1 = {10, 20, 30};
int[] array2 = array1;

array2[0] = 99;

System.out.println(array1[0]);
System.out.println(array2[0]);
```

预期输出：

```text
99
99
```

array2 = array1 复制的是数组引用，不是数组中的所有元素。

这与普通对象引用赋值的行为一致。

### 3.14 D08-S02 引用状态变化

ServerNode.java 创建两个服务器对象。

```text
node1 ──────> 对象1：NODE-001
node2 ──────> 对象2：NODE-002
```

建立共享引用：

```java
ServerNode selectedNode = node1;
```

通过 selectedNode 修改 CPU 后：

```text
node1.cpuUsage = 75.0
selectedNode.cpuUsage = 75.0
node2.cpuUsage = 62.0
```

重新指定引用目标：

```java
selectedNode = node2;
```

再修改第二个对象：

```text
node1.cpuUsage = 75.0
node2.cpuUsage = 20.5
node2.online = true
```

解除引用后的最终状态：

```text
node1 ────────> 对象1：NODE-001, 75.0, true

selectedNode ─> null

node2 ────────> 对象2：NODE-002, 20.5, true
```

三个 ServerNode 类型引用变量，两个实际服务器对象。

## 四、实例成员方法与对象行为

### 4.1 实例方法的概念

实例方法是定义在类中、不使用 static 修饰的方法。

实例方法与具体调用对象相关联，可以读取和修改当前对象的实例字段。

例如：

```java
public class Server {
    boolean online;

    void start() {
        online = true;
    }

    void shutdown() {
        online = false;
    }
}
```

字段描述对象状态。

实例方法描述对象行为。

### 4.2 实例方法的定义

基本语法：

```java
返回值类型 方法名称(参数列表) {
    // 方法体
}
```

例如：

```java
void start() {
    online = true;
}
```

也可以添加 public：

```java
public void start() {
    online = true;
}
```

访问修饰符的完整含义在后续课程系统学习。

### 4.3 实例方法的调用

```java
Server server = new Server();
server.start();
```

调用实例方法时，方法作用于 server 当前引用的对象。

实例方法调用本身不会自动创建新对象。

### 4.4 实例方法与 static 方法

| 对比项 | 实例方法 | static 方法 |
|---|---|---|
| 是否使用 static | 否 | 是 |
| 是否有隐式当前对象 | 有 | 无 |
| 推荐调用方式 | 对象引用.方法名() | 类名.方法名() |
| 是否需要实例作为调用目标 | 是 | 否 |
| 能否直接访问当前对象实例字段 | 能 | 不能 |
| 能否通过对象引用访问实例字段 | 能 | 能 |
| 是否支持参数与返回值 | 支持 | 支持 |

静态方法示例：

```java
static int add(int a, int b) {
    return a + b;
}
```

实例方法示例：

```java
double calculateInterest() {
    return balance * 0.02;
}
```

实例方法能够根据当前账户对象的 balance 计算结果。

### 4.5 static 方法访问实例字段

错误示例：

```java
public class Account {
    double balance;

    static double calculateInterest() {
        return balance * 0.02;
    }
}
```

静态方法没有隐式当前对象，因此不能直接读取 balance。

合法的静态方法可以通过对象参数获得明确的引用：

```java
static double calculateInterest(Account account) {
    return account.balance * 0.02;
}
```

本日主要训练将与对象状态有关的业务逻辑定义为实例方法。

### 4.6 四种基本方法形式

#### 无参数、无返回值

```java
void printBalance() {
    System.out.println(balance);
}
```

#### 有参数、无返回值

```java
void deposit(double amount) {
    balance += amount;
}
```

#### 无参数、有返回值

```java
double calculateInterest() {
    return balance * 0.02;
}
```

#### 有参数、有返回值

```java
boolean hasEnoughBalance(double amount) {
    return balance >= amount;
}
```

实例方法的参数与返回值机制和 Day 06 学习的普通方法一致。

### 4.7 实例方法直接读取对象字段

```java
public class Rectangle {
    double width;
    double height;

    double calculateArea() {
        return width * height;
    }
}
```

矩形面积公式：

$$
S=w\times h
$$

调用：

```java
Rectangle rectangle = new Rectangle();

rectangle.width = 5.0;
rectangle.height = 3.0;

double area = rectangle.calculateArea();
```

计算结果：

$$
S=5\times3=15
$$

由于宽度和高度已经保存在对象中，不需要再次作为参数传给面积计算方法。

### 4.8 实例方法直接修改对象字段

```java
void deposit(double amount) {
    balance += amount;
}
```

假设初始余额为1000.0，调用：

```java
account.deposit(200.0);
```

更新后的余额为1200.0。

修改结果保存在原对象中，不是仅存在于临时局部变量中。

账户金额使用 double 仅作为当前教学示例，正式金融业务需要更加严格的精度处理。

### 4.9 实例字段、方法参数与局部变量

```java
double deposit(double amount) {
    double newBalance = balance + amount;
    balance = newBalance;
    return newBalance;
}
```

| 变量 | 类型 |
|---|---|
| balance | 实例字段 |
| amount | 方法参数 |
| newBalance | 局部变量 |

方法结束后，修改后的 balance 仍保存在对象中。

amount 和 newBalance 属于本次方法调用。

### 4.10 参数遮蔽实例字段

错误实现：

```java
void updateBalance(double balance) {
    balance = balance;
}
```

参数 balance 遮蔽了同名实例字段。

赋值操作不会修改对象的余额字段。

当前阶段可以使用不同参数名称：

```java
void updateBalance(double newBalance) {
    balance = newBalance;
}
```

Day 09 将学习使用 this 区分当前对象字段与同名参数。

### 4.11 return 与对象状态修改

只返回计算结果：

```java
double calculateBalance(double amount) {
    return balance + amount;
}
```

不会改变 balance。

只修改对象状态：

```java
void deposit(double amount) {
    balance += amount;
}
```

不返回业务结果。

既修改对象状态又返回结果：

```java
double depositAndReturn(double amount) {
    balance += amount;
    return balance;
}
```

是否发生状态修改取决于方法体是否真正执行字段赋值。

return 不会自动更新实例字段。

### 4.12 不同对象调用同一实例方法

```java
Account account1 = new Account();
Account account2 = new Account();

account1.balance = 1000.0;
account2.balance = 3000.0;

account1.deposit(200.0);
account2.deposit(500.0);
```

最终：

| 对象 | 初始余额 | 存入金额 | 最终余额 |
|---|---:|---:|---:|
| account1 | 1000.0 | 200.0 | 1200.0 |
| account2 | 3000.0 | 500.0 | 3500.0 |

两个对象使用同一个类中的方法定义，但分别修改各自的实例状态。

### 4.13 实例方法之间的调用

```java
double calculateArea() {
    return width * height;
}

boolean isLarge(double threshold) {
    return calculateArea() >= threshold;
}
```

isLarge 可以直接调用当前对象的 calculateArea 方法。

这样可以避免重复编写面积计算公式。

D08-S03 和 D08-S04 均正式使用了实例方法复用。

### 4.14 共享引用调用实例方法

```java
Account account1 = new Account();
account1.balance = 1000.0;

Account selectedAccount = account1;

selectedAccount.deposit(200.0);
```

account1 和 selectedAccount 指向同一个对象。

因此两个引用读取的 balance 均为1200.0。

方法操作的是引用当前指向的对象，而不是引用变量的名称。

### 4.15 main 与业务方法的职责划分

main 主要负责：

- 创建对象。
- 初始化数据。
- 组织调用顺序。
- 保存方法返回值。
- 输出操作和统计结果。

实例业务方法主要负责：

- 读取当前对象字段。
- 处理业务计算。
- 判断业务条件。
- 修改对象状态。
- 返回操作结果。
- 复用其他业务方法。

不应将所有业务逻辑全部集中到 main。

## 五、库存业务与实例方法复用

### 5.1 库存对象设计

InventoryItem.java 使用四个实例字段：

```java
String itemId;
String itemName;
int stock;
double unitPrice;
```

每个商品对象分别保存自己的编号、名称、库存和单价。

### 5.2 库存价值计算

库存总价值公式：

$$
V=s\times p
$$

其中：

- $V$ 为库存总价值。
- $s$ 为当前库存数量。
- $p$ 为商品单价。

正式实现：

```java
double calculateTotalValue() {
    return stock * unitPrice;
}
```

该方法只读取实例字段，不修改对象状态。

### 5.3 正常入库与非法入库

入库数量为正数时：

$$
s_{\text{new}}=s_{\text{old}}+q
$$

入库数量小于或等于零时，原库存保持不变。

正式实现：

```java
void addStock(int quantity) {
    if (quantity > 0) {
        stock += quantity;
    }
}
```

### 5.4 出库条件

合法出库必须同时满足：

$$
0<q\leq s
$$

其中 $q$ 为出库数量，$s$ 为当前库存。

正式实现：

```java
boolean canRemoveStock(int quantity) {
    return quantity > 0 && quantity <= stock;
}
```

该方法只判断是否允许出库，不修改库存。

### 5.5 实际出库与方法复用

```java
boolean removeStock(int quantity) {
    if (canRemoveStock(quantity)) {
        stock -= quantity;
        return true;
    }

    return false;
}
```

成功出库时：

$$
s_{\text{new}}=s_{\text{old}}-q
$$

失败时：

$$
s_{\text{new}}=s_{\text{old}}
$$

removeStock 复用 canRemoveStock，实现判断逻辑集中维护。

### 5.6 合法边界

当出库数量等于当前库存时，允许出库。

例如：

```text
当前库存：10
出库数量：10
最终库存：0
```

如果错误地使用严格小于条件，则无法完成全部出库。

零数量和负数出库均应被拒绝。

### 5.7 查询结果与状态修改

calculateTotalValue 和 canRemoveStock 属于不修改状态的查询类方法。

addStock 和 removeStock 属于状态修改方法。

removeStock 同时返回操作结果。

通过这种职责划分，可以在不改变库存的情况下预先判断能否出库。

### 5.8 最终库存价值

item1：

$$
V_1=15\times150=2250
$$

item2：

$$
V_2=0\times80=0
$$

正式输出：

```text
Final item1 value: 2250.00
Final item2 value: 0.00
```

## 六、Student.java 综合面向对象设计

### 6.1 从业务需求设计类

设计步骤：

1. 确定业务实体。
2. 确定对象需要保存的数据。
3. 确定对象需要具备的行为。
4. 确定业务规则和合法范围。
5. 组织 main 中的对象创建及调用流程。
6. 设计正常、非法和边界测试。

本日核心实体为 Student。

### 6.2 学生实例字段

```java
String studentId;
String name;
int age;
int javaScore;
int databaseScore;
int networkScore;
```

上述六个字段用于保存学生对象自身的数据。

总分、平均分及等级通过方法计算，不需要额外声明为实例字段。

### 6.3 原始状态与派生结果

学生三门成绩属于原始状态。

总分和平均分属于根据原始状态计算的派生结果。

如果额外保存总分字段，则每次修改成绩时还需要同步更新总分。

当前阶段优先使用实例方法实时计算，避免不必要的数据重复。

### 6.4 总成绩计算

总分公式：

$$
T=S_{\text{Java}}+S_{\text{Database}}+S_{\text{Network}}
$$

正式实现：

```java
int calculateTotalScore() {
    return javaScore + databaseScore + networkScore;
}
```

### 6.5 平均成绩计算

平均分公式：

$$
A=\frac{T}{3}
$$

正式实现：

```java
double calculateAverageScore() {
    return (double) calculateTotalScore() / 3;
}
```

通过方法复用获取总分。

先将总分转换为 double，再进行除法。

例如 Bob 的初始成绩：

$$
T=55+60+60=175
$$

$$
A=\frac{175}{3}=58.333333\ldots
$$

最终使用 printf 保留两位小数，输出58.33。

### 6.6 整数除法与浮点数除法

错误方式：

```java
double average = 175 / 3;
```

结果为58.0。

正确方式：

```java
double average = (double) 175 / 3;
```

或者：

```java
double average = 175 / 3.0;
```

必须在除法运算前引入浮点数类型。

下面的写法不能恢复已经丢失的小数：

```java
double average = (double) (175 / 3);
```

### 6.7 及格判断

本任务的及格条件为：

$$
A\geq60
$$

正式实现：

```java
boolean isPassed() {
    return calculateAverageScore() >= 60;
}
```

本任务不要求每门成绩均达到60分。

例如三科成绩为0、80、100：

$$
A=\frac{0+80+100}{3}=60
$$

因此该学生按照本次任务规则判定为及格。

### 6.8 成绩等级判断

| 平均成绩范围 | 等级 |
|---|---|
| $90\leq A\leq100$ | A |
| $80\leq A<90$ | B |
| $70\leq A<80$ | C |
| $60\leq A<70$ | D |
| $0\leq A<60$ | F |

正式实现：

```java
String calculateGrade() {
    double averageScore = calculateAverageScore();

    if (averageScore >= 90) {
        return "A";
    } else if (averageScore >= 80) {
        return "B";
    } else if (averageScore >= 70) {
        return "C";
    } else if (averageScore >= 60) {
        return "D";
    } else {
        return "F";
    }
}
```

采用从高分到低分的条件判断顺序。

进入第二个分支时，已经确定平均分小于90，因此不必重复编写上限条件。

等级判断直接使用原始平均成绩，不提前进行四舍五入。

### 6.9 成绩合法范围

合法单科成绩范围：

$$
0\leq S\leq100
$$

正式实现：

```java
boolean isValidScore(int score) {
    return score >= 0 && score <= 100;
}
```

必须接受0和100两个端点。

必须拒绝-1和101等超出范围的数据。

成绩合法性与及格状态是两个不同的业务概念。

例如59分是合法成绩，但不足60分。

### 6.10 三门成绩的整体更新

正式实现：

```java
boolean updateScores(int newJavaScore, int newDatabaseScore, int newNetworkScore) {
    if (isValidScore(newJavaScore) && isValidScore(newDatabaseScore) && isValidScore(newNetworkScore)) {
        javaScore = newJavaScore;
        databaseScore = newDatabaseScore;
        networkScore = newNetworkScore;
        return true;
    }

    return false;
}
```

业务流程：

1. 检查 Java 成绩合法性。
2. 检查数据库成绩合法性。
3. 检查计算机网络成绩合法性。
4. 全部条件成立时，更新三个字段。
5. 返回 true。
6. 任意条件不成立时，不修改任何字段，返回 false。

这里通过 && 实现组合判断。

由于短路求值的存在，前面的合法性判断失败后，后续判断可以不执行。

isValidScore 不具有状态修改副作用，因此短路不会影响业务正确性。

这种先完成条件验证、再整体修改字段的方式，是单线程程序中的业务整体更新，不等同于数据库事务或多线程原子操作。

### 6.11 避免部分字段更新

不合理的设计：

```java
if (isValidScore(newJavaScore)) {
    javaScore = newJavaScore;
}

if (isValidScore(newDatabaseScore)) {
    databaseScore = newDatabaseScore;
}
```

如果后续成绩非法，前面的字段可能已经被修改。

本日任务要求一次更新中的所有成绩全部合法，才允许进行任何字段修改。

实际测试确认：

| 非法更新场景 | Java | Database | Network |
|---|---:|---:|---:|
| 更新前 | 95 | 90 | 85 |
| Java 参数非法后 | 95 | 90 | 85 |
| Database 参数非法后 | 95 | 90 | 85 |
| Network 参数非法后 | 95 | 90 | 85 |

### 6.12 方法复用关系

```text
calculateTotalScore()
        ↑
calculateAverageScore()
        ↑
        ├── isPassed()
        └── calculateGrade()

isValidScore()
        ↑
updateScores()
```

箭头指向被调用的方法。

总分计算逻辑只需要维护一份。

平均分计算逻辑只需要维护一份。

成绩合法范围只需要维护一份。

### 6.13 更新后重新计算

```java
double oldAverage = student1.calculateAverageScore();

student1.updateScores(95, 90, 85);

double newAverage = student1.calculateAverageScore();
```

oldAverage 不会随着对象字段变化自动更新。

必须重新调用方法获取最新统计结果。

### 6.14 状态独立性

Alice 的成绩更新不会影响 Bob 的成绩。

Bob 后续进行五组等级测试时，也不会影响 Alice 的最终成绩。

两个 Student 对象始终具有独立的实例状态。

### 6.15 格式化输出

```java
System.out.printf("Average: %.2f%n", average);
```

常用格式符：

| 格式符 | 用途 |
|---|---|
| %s | 字符串 |
| %d | 整数 |
| %.1f | 保留一位小数 |
| %.2f | 保留两位小数 |
| %b | 布尔值 |
| %n | 平台对应的换行符 |
| %% | 输出百分号 |

printf 的显示精度不改变原始 double 变量的值。

业务判断应基于原始计算结果。

## 七、综合程序设计示例

### 7.1 电力设备负载监控

以下为本日教学示例，不计入四个正式验收程序。

```java
public class PowerEquipment {
    String equipmentId;
    double ratedPower;
    double actualPower;

    void printInfo() {
        System.out.printf("%s: %.1f / %.1f kW%n",
                equipmentId, actualPower, ratedPower);
    }

    double calculateLoadRate() {
        return actualPower / ratedPower * 100.0;
    }

    boolean needsWarning(double threshold) {
        return calculateLoadRate() >= threshold;
    }

    boolean updateActualPower(double newPower) {
        if (newPower >= 0) {
            actualPower = newPower;
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        PowerEquipment equipment1 = new PowerEquipment();
        PowerEquipment equipment2 = new PowerEquipment();

        equipment1.equipmentId = "EQ-001";
        equipment1.ratedPower = 100.0;
        equipment1.actualPower = 60.0;

        equipment2.equipmentId = "EQ-002";
        equipment2.ratedPower = 200.0;
        equipment2.actualPower = 160.0;

        equipment1.printInfo();
        equipment2.printInfo();

        double loadRate1 = equipment1.calculateLoadRate();
        double loadRate2 = equipment2.calculateLoadRate();

        System.out.printf("Equipment 1 load rate: %.1f%%%n",
                loadRate1);
        System.out.printf("Equipment 2 load rate: %.1f%%%n",
                loadRate2);

        boolean updateResult =
                equipment1.updateActualPower(95.0);

        System.out.println("Update result: " + updateResult);

        equipment1.printInfo();
        equipment2.printInfo();

        boolean warning1 = equipment1.needsWarning(90.0);
        boolean warning2 = equipment2.needsWarning(90.0);

        System.out.println("Equipment 1 warning: " + warning1);
        System.out.println("Equipment 2 warning: " + warning2);

        boolean invalidResult =
                equipment1.updateActualPower(-10.0);

        System.out.println("Invalid update: " + invalidResult);

        equipment1.printInfo();
        equipment2.printInfo();
    }
}
```

设备负载率：

$$
R=\frac{P_{\text{actual}}}{P_{\text{rated}}}\times100
$$

其中额定功率必须为正数。

教学示例假设额定功率已正确初始化。

预期输出：

```text
EQ-001: 60.0 / 100.0 kW
EQ-002: 160.0 / 200.0 kW
Equipment 1 load rate: 60.0%
Equipment 2 load rate: 80.0%
Update result: true
EQ-001: 95.0 / 100.0 kW
EQ-002: 160.0 / 200.0 kW
Equipment 1 warning: true
Equipment 2 warning: false
Invalid update: false
EQ-001: 95.0 / 100.0 kW
EQ-002: 160.0 / 200.0 kW
```

上述结果属于教学示例预期输出，不作为本日正式运行测试证据。

### 7.2 储液罐实例方法示例

```java
public class LiquidTank {
    String tankId;
    double capacity;
    double currentVolume;

    void printInfo() {
        System.out.printf("%s: %.1f / %.1f L%n",
                tankId, currentVolume, capacity);
    }

    double calculateRemainingCapacity() {
        return capacity - currentVolume;
    }

    boolean canAdd(double amount) {
        return amount > 0
                && amount <= calculateRemainingCapacity();
    }

    boolean addLiquid(double amount) {
        if (canAdd(amount)) {
            currentVolume += amount;
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        LiquidTank tank1 = new LiquidTank();
        LiquidTank tank2 = new LiquidTank();

        tank1.tankId = "TANK-001";
        tank1.capacity = 100.0;
        tank1.currentVolume = 40.0;

        tank2.tankId = "TANK-002";
        tank2.capacity = 80.0;
        tank2.currentVolume = 60.0;

        tank1.printInfo();
        tank2.printInfo();

        double remaining1 =
                tank1.calculateRemainingCapacity();

        double remaining2 =
                tank2.calculateRemainingCapacity();

        System.out.printf("Tank 1 remaining: %.1f L%n",
                remaining1);
        System.out.printf("Tank 2 remaining: %.1f L%n",
                remaining2);

        boolean result1 = tank1.addLiquid(30.0);
        boolean result2 = tank2.addLiquid(30.0);

        System.out.println("Tank 1 add result: " + result1);
        System.out.println("Tank 2 add result: " + result2);

        tank1.printInfo();
        tank2.printInfo();
    }
}
```

剩余容量：

$$
V_{\text{remaining}}=V_{\text{capacity}}-V_{\text{current}}
$$

两个对象调用同一方法并传入相同参数时，可以因为各自的对象状态不同而产生不同结果。

预期输出：

```text
TANK-001: 40.0 / 100.0 L
TANK-002: 60.0 / 80.0 L
Tank 1 remaining: 60.0 L
Tank 2 remaining: 20.0 L
Tank 1 add result: true
Tank 2 add result: false
TANK-001: 70.0 / 100.0 L
TANK-002: 60.0 / 80.0 L
```

上述结果属于教学示例预期输出。

### 7.3 不同业务场景的共同结构

| 业务实体 | 对象状态 | 对象行为 |
|---|---|---|
| 图书 | 名称、页数、借阅状态 | 字段读取与修改 |
| 服务器 | 节点编号、CPU、在线状态 | 状态管理 |
| 库存商品 | 编号、名称、库存、单价 | 入库、出库、价值计算 |
| 学生 | 学号、姓名、年龄、成绩 | 成绩统计与更新 |
| 电力设备 | 编号、额定功率、实际功率 | 负载计算与告警 |

不同业务具有相似的对象建模和方法组织思路。

## 八、Java 与 Python 的对比

### 8.1 类与字段

Python：

```python
class Device:
    pass

device = Device()
device.temperature = 35.5
```

Java：

```java
public class Device {
    double temperature;
}
```

创建并赋值：

```java
Device device = new Device();
device.temperature = 35.5;
```

Java 要求事先声明实例字段名称及类型。

普通 Python 实例属性可以动态设置。

### 8.2 对象创建

| Java | Python |
|---|---|
| new Device() | Device() |
| Device device | device |
| 静态类型 | 动态类型 |

### 8.3 引用赋值

Java：

```java
Device device1 = new Device();
Device device2 = device1;
```

Python：

```python
device1 = Device()
device2 = device1
```

两种语言都不会因为上述赋值自动复制整个对象。

### 8.4 对象身份比较

Java：

```java
device1 == device2
```

Python：

```python
device1 is device2
```

Java 中兼容引用类型的 == 用于比较引用身份。

Python 的 is 用于比较对象身份，== 通常用于相等性比较。

不能简单将两种语言的 == 完全等同。

### 8.5 空引用

Java：

```java
device == null
```

Python：

```python
device is None
```

### 8.6 实例方法

Python：

```python
class Account:

    def deposit(self, amount):
        self.balance += amount

    def calculate_interest(self):
        return self.balance * 0.02
```

Java：

```java
public class Account {
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    double calculateInterest() {
        return balance * 0.02;
    }
}
```

Java 实例方法隐式关联当前对象。

Python 实例方法通常显式声明 self 参数。

Java 的 this 将在 Day 09 正式学习。

### 8.7 方法参数与返回值

| 对比项 | Java | Python |
|---|---|---|
| 方法定义 | 返回类型与方法名称 | def |
| 参数类型 | 明确声明 | 通常不必显式声明 |
| 返回类型 | 明确声明 | 通常不必显式声明 |
| 无返回业务结果 | void | None |
| 布尔值 | true、false | True、False |

### 8.8 平均值计算

Python：

```python
average = 175 / 3
```

Java：

```java
double average = (double) 175 / 3;
```

Java 需要注意两个整数相除时默认进行整数除法。

### 8.9 格式化输出

Python：

```python
print(f"{average:.2f}")
```

Java：

```java
System.out.printf("%.2f%n", average);
```

两种方式都可以将数值显示为两位小数。

## 九、最终验收通过的 Java 源码

以下四个程序为 Day 08 最终正式验收通过的版本。

保留实际提交的变量名称、字段、方法签名、注释、执行流程和输出方式。

### 9.1 LibraryBook.java

文件路径：

`01-java-basics/day08/code/LibraryBook.java`

```java
public class LibraryBook {
    // 声明实例字段
    String title;
    int pageCount;
    boolean borrowed;

    public static void main(String[] args) {
        // 创建图书对象
        LibraryBook libraryBook = new LibraryBook();

        // 输出默认值
        System.out.println("Default title: " + libraryBook.title);
        System.out.println("Default pageCount: " + libraryBook.pageCount);
        System.out.println("Default borrowed: " + libraryBook.borrowed);

        // 设置图书信息
        libraryBook.title = "Java Basics";
        libraryBook.pageCount = 320;
        libraryBook.borrowed = true;

        // 输出图书信息
        System.out.println("Updated title: " + libraryBook.title);
        System.out.println("Updated pageCount: " + libraryBook.pageCount);
        System.out.println("Updated borrowed: " + libraryBook.borrowed);

        // 再次修改借阅状态并输出
        libraryBook.borrowed = false;
        System.out.println("Final borrowed: " + libraryBook.borrowed);
    }
}
```

### 9.2 ServerNode.java

文件路径：

`01-java-basics/day08/code/ServerNode.java`

```java
public class ServerNode {
    // 声明实例字段
    String nodeId;
    double cpuUsage;
    boolean online;

    public static void main(String[] args) {
        // 创建并初始化两个服务器对象
        ServerNode node1 = new ServerNode();
        ServerNode node2 = new ServerNode();

        // 设置服务器信息
        node1.nodeId = "NODE-001";
        node1.cpuUsage = 35.5;
        node1.online = true;

        node2.nodeId = "NODE-002";
        node2.cpuUsage = 62.0;
        node2.online = false;

        // 输出服务器完整信息
        System.out.printf("Initial node1: %s, %.1f, %b%n", node1.nodeId, node1.cpuUsage, node1.online);
        System.out.printf("Initial node2: %s, %.1f, %b%n", node2.nodeId, node2.cpuUsage, node2.online);

        // 验证两个对象的引用关系
        System.out.printf("Same object: %b%n", node1 == node2);

        // 验证对象状态独立性
        node1.cpuUsage = 48.0;
        System.out.printf("Independent node1 CPU: %.1f%n", node1.cpuUsage);
        System.out.printf("Independent node2 CPU: %.1f%n", node2.cpuUsage);

        // 创建共享引用
        ServerNode selectedNode = node1;
        System.out.printf("Selected is node1: %b%n", selectedNode == node1);
        selectedNode.cpuUsage = 75.0;
        System.out.printf("Shared node1 CPU: %.1f%n", node1.cpuUsage);
        System.out.printf("Shared selected CPU: %.1f%n", selectedNode.cpuUsage);

        // 重新指定引用目标
        selectedNode = node2;
        System.out.printf("Selected is node2: %b%n", selectedNode == node2);
        selectedNode.cpuUsage = 20.5;
        selectedNode.online = true;

        // 输出两个服务器的最终信息
        System.out.printf("Final node1: %s, %.1f, %b%n", node1.nodeId, node1.cpuUsage, node1.online);
        System.out.printf("Final node2: %s, %.1f, %b%n", node2.nodeId, node2.cpuUsage, node2.online);

        // 解除共享引用
        selectedNode = null;

        // 空引用判断与剩余对象输出
        System.out.printf("Selected is null: %b%n", selectedNode == null);
        System.out.printf("Remaining node2: %s, %.1f, %b%n", node2.nodeId, node2.cpuUsage, node2.online);
    }
}
```

### 9.3 InventoryItem.java

文件路径：

`01-java-basics/day08/code/InventoryItem.java`

```java
public class InventoryItem {
    // 声明实例字段
    String itemId;
    String itemName;
    int stock;
    double unitPrice;

    public static void main(String[] args) {
        // 创建两个商品对象
        InventoryItem item1 = new InventoryItem();
        InventoryItem item2 = new InventoryItem();

        // 设置商品信息
        item1.itemId = "ITEM-001";
        item1.itemName = "Keyboard";
        item1.stock = 20;
        item1.unitPrice = 150.0;

        item2.itemId = "ITEM-002";
        item2.itemName = "Mouse";
        item2.stock = 10;
        item2.unitPrice = 80.0;

        // 输出初始商品信息
        item1.printInfo();
        item2.printInfo();

        // 计算初始库存总价值并输出
        double item1InitialTotalValue = item1.calculateTotalValue();
        double item2InitialTotalValue = item2.calculateTotalValue();
        System.out.printf("Initial item1 value: %.2f%n", item1InitialTotalValue);
        System.out.printf("Initial item2 value: %.2f%n", item2InitialTotalValue);

        // 执行正常入库并输出两商品的库存
        item1.addStock(10);
        System.out.printf("Restocked item1 stock: %d%n", item1.stock);
        System.out.printf("Unchanged item2 stock: %d%n", item2.stock);

        // 执行非法入库并输出库存
        item1.addStock(-5);
        System.out.printf("Invalid restock item1 stock: %d%n", item1.stock);

        // 判断能否出库并输出结果
        boolean item1CanRemoveStock = item1.canRemoveStock(15);
        boolean item2CanRemoveStock = item2.canRemoveStock(15);
        System.out.printf("Can remove from item1: %b%n", item1CanRemoveStock);
        System.out.printf("Can remove from item2: %b%n", item2CanRemoveStock);

        // 执行出库操作并输出结果
        boolean item1RemoveStock = item1.removeStock(15);
        boolean item2RemoveStock = item2.removeStock(15);
        System.out.printf("Remove item1 result: %b%n", item1RemoveStock);
        System.out.printf("Remove item2 result: %b%n", item2RemoveStock);
        System.out.printf("After removal item1 stock: %d%n", item1.stock);
        System.out.printf("After removal item2 stock: %d%n", item2.stock);

        // 验证出库边界并输出结果
        boolean item2RemoveStockAll = item2.removeStock(10);
        boolean item1RemoveStockZero = item1.removeStock(0);
        boolean item1RemoveStockNegative = item1.removeStock(-3);
        System.out.printf("Exact removal result: %b%n", item2RemoveStockAll);
        System.out.printf("Exact removal item2 stock: %d%n", item2.stock);
        System.out.printf("Zero removal result: %b%n", item1RemoveStockZero);
        System.out.printf("Zero removal item1 stock: %d%n", item1.stock);
        System.out.printf("Negative removal result: %b%n", item1RemoveStockNegative);
        System.out.printf("Negative removal item1 stock: %d%n", item1.stock);

        // 输出最终状态及库存总价值
        System.out.println("Final inventory:");
        item1.printInfo();
        item2.printInfo();
        double item1FinalTotalValue = item1.calculateTotalValue();
        double item2FinalTotalValue = item2.calculateTotalValue();
        System.out.printf("Final item1 value: %.2f%n", item1FinalTotalValue);
        System.out.printf("Final item2 value: %.2f%n", item2FinalTotalValue);
    }

    // 输出商品信息
    void printInfo() {
        System.out.printf("Item: %s, %s, stock=%d, price=%.2f%n", itemId, itemName, stock, unitPrice);
    }

    // 商品入库
    void addStock(int quantity) {
        if (quantity > 0) {
            stock += quantity;
        }
    }

    // 计算库存总价值
    double calculateTotalValue() {
        return stock * unitPrice;
    }

    // 判断能否出库
    boolean canRemoveStock(int quantity) {
        return quantity > 0 && quantity <= stock;
    }

    // 执行出库
    boolean removeStock(int quantity) {
        if (canRemoveStock(quantity)) {
            stock -= quantity;
            return true;
        }

        return false;
    }
}
```

### 9.4 Student.java

文件路径：

`01-java-basics/day08/code/Student.java`

```java
public class Student {
    // 声明实例字段
    String studentId;
    String name;
    int age;
    int javaScore;
    int databaseScore;
    int networkScore;

    public static void main(String[] args) {
        // 创建并初始化两个学生对象
        Student student1 = new Student();
        Student student2 = new Student();

        student1.studentId = "STU-001";
        student1.name = "Alice";
        student1.age = 22;
        student1.javaScore = 90;
        student1.databaseScore = 80;
        student1.networkScore = 85;

        student2.studentId = "STU-002";
        student2.name = "Bob";
        student2.age = 23;
        student2.javaScore = 55;
        student2.databaseScore = 60;
        student2.networkScore = 60;

        // 输出学生信息
        student1.printInfo();
        student2.printInfo();

        // 计算初始成绩结果
        int student1InitialTotalScore = student1.calculateTotalScore();
        double student1InitialAverageScore = student1.calculateAverageScore();
        boolean student1InitialIsPassed = student1.isPassed();
        String student1InitialGrade = student1.calculateGrade();

        int student2InitialTotalScore = student2.calculateTotalScore();
        double student2InitialAverageScore = student2.calculateAverageScore();
        boolean student2InitialIsPassed = student2.isPassed();
        String student2InitialGrade = student2.calculateGrade();

        System.out.printf("Initial student1: total=%d, average=%.2f, passed=%b, grade=%s%n", student1InitialTotalScore, student1InitialAverageScore, student1InitialIsPassed, student1InitialGrade);
        System.out.printf("Initial student2: total=%d, average=%.2f, passed=%b, grade=%s%n", student2InitialTotalScore, student2InitialAverageScore, student2InitialIsPassed, student2InitialGrade);

        // 正常更新成绩及验证状态独立性
        boolean student1UpdateScore = student1.updateScores(95, 90, 85);
        System.out.printf("Update student1 result: %b%n", student1UpdateScore);
        student1.printInfo();
        student2.printInfo();

        int student1UpdatedTotalScore = student1.calculateTotalScore();
        double student1UpdatedAverageScore = student1.calculateAverageScore();
        boolean student1UpdatedIsPassed = student1.isPassed();
        String student1UpdatedGrade = student1.calculateGrade();
        System.out.printf("Updated student1: total=%d, average=%.2f, passed=%b, grade=%s%n", student1UpdatedTotalScore, student1UpdatedAverageScore, student1UpdatedIsPassed, student1UpdatedGrade);

        // 验证非法成绩更新
        boolean student1UpdatedInvalidJava = student1.updateScores(-1, 70, 80);
        System.out.printf("Invalid Java update: %b%n", student1UpdatedInvalidJava);
        student1.printInfo();

        boolean student1UpdatedInvalidDatabase = student1.updateScores(70, 101, 80);
        System.out.printf("Invalid Database update: %b%n", student1UpdatedInvalidDatabase);
        student1.printInfo();

        boolean student1UpdatedInvalidNetwork = student1.updateScores(70, 80, -5);
        System.out.printf("Invalid Network update: %b%n", student1UpdatedInvalidNetwork);
        student1.printInfo();

        // 验证单科成绩合法范围
        boolean isValidScore1 = student2.isValidScore(0);
        boolean isValidScore2 = student2.isValidScore(100);
        boolean isValidScore3 = student2.isValidScore(-1);
        boolean isValidScore4 = student2.isValidScore(101);

        System.out.printf("Valid score 0: %b%n", isValidScore1);
        System.out.printf("Valid score 100: %b%n", isValidScore2);
        System.out.printf("Valid score -1: %b%n", isValidScore3);
        System.out.printf("Valid score 101: %b%n", isValidScore4);

        // 验证等级分界值及合法成绩更新
        boolean student2UpdatedBoundary60 = student2.updateScores(0, 80, 100);
        double student2UpdatedAverageScoreBoundary60 = student2.calculateAverageScore();
        boolean student2UpdatedIsPassedBoundary60 = student2.isPassed();
        String student2UpdatedGradeBoundary60 = student2.calculateGrade();
        System.out.printf("Boundary 60: updated=%b, average=%.2f, passed=%b, grade=%s%n", student2UpdatedBoundary60, student2UpdatedAverageScoreBoundary60, student2UpdatedIsPassedBoundary60, student2UpdatedGradeBoundary60);

        boolean student2UpdatedBoundary70 = student2.updateScores(70, 70, 70);
        double student2UpdatedAverageScoreBoundary70 = student2.calculateAverageScore();
        boolean student2UpdatedIsPassedBoundary70 = student2.isPassed();
        String student2UpdatedGradeBoundary70 = student2.calculateGrade();
        System.out.printf("Boundary 70: updated=%b, average=%.2f, passed=%b, grade=%s%n", student2UpdatedBoundary70, student2UpdatedAverageScoreBoundary70, student2UpdatedIsPassedBoundary70, student2UpdatedGradeBoundary70);

        boolean student2UpdatedBoundary80 = student2.updateScores(80, 80, 80);
        double student2UpdatedAverageScoreBoundary80 = student2.calculateAverageScore();
        boolean student2UpdatedIsPassedBoundary80 = student2.isPassed();
        String student2UpdatedGradeBoundary80 = student2.calculateGrade();
        System.out.printf("Boundary 80: updated=%b, average=%.2f, passed=%b, grade=%s%n", student2UpdatedBoundary80, student2UpdatedAverageScoreBoundary80, student2UpdatedIsPassedBoundary80, student2UpdatedGradeBoundary80);

        boolean student2UpdatedBoundary90 = student2.updateScores(90, 90, 90);
        double student2UpdatedAverageScoreBoundary90 = student2.calculateAverageScore();
        boolean student2UpdatedIsPassedBoundary90 = student2.isPassed();
        String student2UpdatedGradeBoundary90 = student2.calculateGrade();
        System.out.printf("Boundary 90: updated=%b, average=%.2f, passed=%b, grade=%s%n", student2UpdatedBoundary90, student2UpdatedAverageScoreBoundary90, student2UpdatedIsPassedBoundary90, student2UpdatedGradeBoundary90);

        boolean student2UpdatedBelow60 = student2.updateScores(59, 60, 60);
        double student2UpdatedAverageScoreBelow60 = student2.calculateAverageScore();
        boolean student2UpdatedIsPassedBelow60 = student2.isPassed();
        String student2UpdatedGradeBelow60 = student2.calculateGrade();
        System.out.printf("Below 60: updated=%b, average=%.2f, passed=%b, grade=%s%n", student2UpdatedBelow60, student2UpdatedAverageScoreBelow60, student2UpdatedIsPassedBelow60, student2UpdatedGradeBelow60);

        // 输出最终状态与统计结果
        System.out.println("Final students:");
        student1.printInfo();
        student2.printInfo();

        int student1FinalTotalScore = student1.calculateTotalScore();
        double student1FinalAverageScore = student1.calculateAverageScore();
        boolean student1FinalIsPassed = student1.isPassed();
        String student1FinalGrade = student1.calculateGrade();

        int student2FinalTotalScore = student2.calculateTotalScore();
        double student2FinalAverageScore = student2.calculateAverageScore();
        boolean student2FinalIsPassed = student2.isPassed();
        String student2FinalGrade = student2.calculateGrade();

        System.out.printf("Final student1: total=%d, average=%.2f, passed=%b, grade=%s%n", student1FinalTotalScore, student1FinalAverageScore, student1FinalIsPassed, student1FinalGrade);
        System.out.printf("Final student2: total=%d, average=%.2f, passed=%b, grade=%s%n", student2FinalTotalScore, student2FinalAverageScore, student2FinalIsPassed, student2FinalGrade);
    }

    // 输出学生信息
    void printInfo() {
        System.out.printf("Student: %s, %s, age=%d, Java=%d, Database=%d, Network=%d%n", studentId, name, age, javaScore, databaseScore, networkScore);
    }

    // 计算总成绩
    int calculateTotalScore() {
        return javaScore + databaseScore + networkScore;
    }

    // 计算平均成绩
    double calculateAverageScore() {
        return (double) calculateTotalScore() / 3;
    }

    // 判断是否及格
    boolean isPassed() {
        return calculateAverageScore() >= 60;
    }

    // 计算成绩等级
    String calculateGrade() {
        double averageScore = calculateAverageScore();

        if (averageScore >= 90) {
            return "A";
        } else if (averageScore >= 80) {
            return "B";
        } else if (averageScore >= 70) {
            return "C";
        } else if (averageScore >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // 判断单科成绩是否合法
    boolean isValidScore(int score) {
        return score >= 0 && score <= 100;
    }

    // 同时更新三门成绩
    boolean updateScores(int newJavaScore, int newDatabaseScore, int newNetworkScore) {
        if (isValidScore(newJavaScore) && isValidScore(newDatabaseScore) && isValidScore(newNetworkScore)) {
            javaScore = newJavaScore;
            databaseScore = newDatabaseScore;
            networkScore = newNetworkScore;
            return true;
        }

        return false;
    }
}
```

## 十、正式实际运行记录

以下输出均来源于正式验收过程中实际提交的 IntelliJ IDEA 控制台运行结果。

不是根据参考答案模拟生成的运行证据。

### 10.1 LibraryBook.java

```text
Default title: null
Default pageCount: 0
Default borrowed: false
Updated title: Java Basics
Updated pageCount: 320
Updated borrowed: true
Final borrowed: false
```

验收结论：

- CR01–CR14：全部通过。
- TC01–TC03：全部通过。
- 正式输出：7/7 行正确。
- 首次提交通过。

### 10.2 ServerNode.java

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

验收结论：

- CR01–CR22：全部通过。
- TC01–TC06：全部通过。
- 正式输出：13/13 行正确。
- CR14、CR22 针对性复验通过。

### 10.3 InventoryItem.java

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

验收结论：

- CR01–CR28：全部通过。
- TC01–TC10：全部通过。
- 正式输出：24/24 行正确。
- CR19、CR25、CR27、CR28 针对性复验通过。
- TC01、TC10 针对性复验通过。

### 10.4 Student.java

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

验收结论：

- CR01–CR36：全部通过。
- TC01–TC12：全部通过。
- 正式输出：28/28 行正确。
- CR35、CR36 针对性复验通过。
- TC03 针对性复验通过。
- 48 次非 void 业务调用返回值全部正确保存。
- 七个实例方法全部通过。

## 十一、实际问题与修复经验

### 11.1 D08-S01

首次提交全部通过。

正确使用实例字段默认值及对象引用访问。

未发现阻断性问题。

### 11.2 D08-S02：共享引用变量命名

首次实现：

```java
ServerNode selectNode = node1;
```

正式要求：

```java
ServerNode selectedNode = node1;
```

两种命名均符合 Java 语法。

但首次实现不符合已经冻结的引用变量命名要求。

统一修改所有相关引用位置。

涉及 CR14、CR22。

经验：

业务规范明确规定变量名称时，应按规定实现，不能只检查变量是否具有合理语义。

### 11.3 D08-S02：解除引用执行顺序

首次实现先将共享引用设置为 null，再输出两个对象的 Final 信息。

虽然实际输出正确，但不符合先输出最终对象信息、再解除引用的规定。

修改后：

```java
System.out.printf("Final node1: %s, %.1f, %b%n", node1.nodeId, node1.cpuUsage, node1.online);
System.out.printf("Final node2: %s, %.1f, %b%n", node2.nodeId, node2.cpuUsage, node2.online);

selectedNode = null;

System.out.printf("Selected is null: %b%n", selectedNode == null);
```

经验：

正确的最终结果与符合规定的业务执行顺序是两个不同的验收维度。

最终：

- CR22/22。
- TC6/6。
- 两处问题全部修复。

### 11.4 D08-S03：商品名称大小写

首次实现：

```java
item1.itemName = "KeyBoard";
```

正式要求：

```java
item1.itemName = "Keyboard";
```

错误来源于初始业务数据。

printInfo 方法本身能够正确读取字段，因此不应该修改输出方法掩盖数据错误。

受影响的运行输出：

- 第1行。
- 第21行。

涉及 CR19、CR27、CR28、TC01、TC10。

修改初始字段值后，两个输出位置同时恢复正确。

经验：

发现输出错误时，应区分数据来源错误与格式化方法错误。

### 11.5 D08-S03：最终计算顺序

首次实现先计算最终库存价值，再调用两个 printInfo 方法。

正式要求先输出两个对象的最终信息，然后计算并保存最终库存价值。

最终实现：

```java
System.out.println("Final inventory:");
item1.printInfo();
item2.printInfo();
double item1FinalTotalValue = item1.calculateTotalValue();
double item2FinalTotalValue = item2.calculateTotalValue();
```

涉及 CR25、CR28。

经验：

即使只读方法交换调用顺序不会影响数值，也应遵循正式任务明确规定的流程。

最终：

- CR28/28。
- TC10/10。
- 两处问题全部修复。

### 11.6 D08-S04：输出标签错误

首次实现：

```java
System.out.printf("Updated student1 result: %b%n", student1UpdateScore);
```

正式要求：

```java
System.out.printf("Update student1 result: %b%n", student1UpdateScore);
```

第5行输出多了一个字母 d。

第8行 Updated student1 是正确标签，不应同步修改。

涉及 CR35、CR36、TC03。

经验：

固定英文标签应逐项检查，不应进行无范围限制的全局替换。

### 11.7 D08-S04：合法性检查返回值保存顺序

首次实现采用逐次调用 isValidScore、逐次输出的方式。

各判断结果均正确，但不符合功能五规定的先保存全部结果、再统一输出的流程。

修改后：

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

涉及 CR36。

TC07 此前已通过，本次仅检查相关输出是否保持正确。

经验：

应区分方法调用、结果保存与结果展示三个阶段。

最终：

- CR36/36。
- TC12/12。
- 两处问题全部修复。

### 11.8 本日实际问题汇总

| 课程 | 问题 | 最终状态 |
|---|---|---|
| D08-S02 | 共享引用命名错误 | 已修复 |
| D08-S02 | 解除引用时机提前 | 已修复 |
| D08-S03 | 商品名称大小写错误 | 已修复 |
| D08-S03 | 最终计算顺序不符合规定 | 已修复 |
| D08-S04 | 正常更新输出标签错误 | 已修复 |
| D08-S04 | 合法性检查未先统一保存结果 | 已修复 |

六处问题均属于任务规范符合性问题。

未发现核心业务逻辑错误。

已通过的实例业务方法不因局部修复而重新设计。

## 十二、常见错误与注意事项

### 12.1 将实例字段声明为 static

如果需要不同对象分别保存状态，不应将相关字段定义为 static。

static 类变量的系统知识在 Day 13 学习。

### 12.2 未创建对象就访问字段

局部引用变量必须完成确定赋值。

null 引用不能用于访问实例字段或调用实例方法。

### 12.3 将引用复制误认为对象复制

```java
Device device2 = device1;
```

不会创建新的 Device 对象。

### 12.4 混淆引用身份与字段内容

两个对象的字段值相同，并不代表两个引用指向同一个对象。

### 12.5 在 static 方法中直接调用实例方法

main 中调用实例业务方法时，应使用明确的对象引用。

### 12.6 方法参数遮蔽实例字段

当前阶段通过使用不同参数名称避免同名冲突。

Day 09 学习 this。

### 12.7 错误使用 void 返回值

void 方法没有可赋值的业务返回结果。

不能将 void 方法调用赋给 int、double 或其他变量。

### 12.8 遗漏方法返回路径

非 void 方法必须在能够正常完成的方法执行路径上返回符合声明类型的结果。

### 12.9 将 return 误认为字段修改

返回计算结果不等同于修改对象状态。

必须明确执行实例字段赋值才能改变对象中的数据。

### 12.10 在 main 中重复业务计算

已经定义独立计算方法后，应复用该方法，不应在 main 中再次编写相同公式。

### 12.11 先修改字段再检查全部条件

多个字段需要整体更新时，应先验证全部输入，再修改字段。

### 12.12 使用过期的计算结果

对象状态发生变化后，之前保存的基本类型计算结果不会自动更新。

应重新调用方法获取最新值。

### 12.13 整数除法与提前舍入

应在除法运算前引入 double。

输出时的 %.2f 只控制显示精度。

业务等级判断应基于原始计算结果。

### 12.14 任务规范符合性

提交前检查：

- 文件名与类名。
- 指定字段与引用变量名称。
- 方法名称、参数类型和返回类型。
- 初始业务数据。
- 字符串大小写。
- 方法执行顺序。
- 返回值保存要求。
- 正式输出标签及数值格式。

程序能够运行并不自动表示已经满足全部业务规范。

## 十三、与实际 Java 后端开发的联系

### 13.1 业务实体建模

后端程序经常需要使用类表示业务实体，例如：

- 银行账户。
- 电力设备。
- 服务器节点。
- 商品。
- 学生。
- 订单。

每个实体具有各自的业务数据和状态。

### 13.2 对象状态管理

不同对象分别保存自己的业务状态。

需要理解引用共享可能导致其他代码观察到同一对象的修改。

### 13.3 业务方法复用

将计算和判断逻辑组织为独立方法，可以减少重复实现。

例如：

- 库存出库复用库存充足检查。
- 学生等级判断复用平均分计算。
- 成绩更新复用成绩合法性检查。

### 13.4 业务合法性与状态保护

在账户资料更新、订单操作、设备配置更新等场景中，需要先验证业务数据，再修改对象状态。

本日整体成绩更新为后续业务校验和状态一致性学习建立了基础。

### 13.5 当前阶段的知识边界

本日只学习基础对象建模。

尚未系统学习：

- 构造方法。
- this。
- private 封装。
- getter/setter。
- 继承。
- 多态。
- 抽象类。
- 接口。
- Java 集合框架。
- Spring Boot 分层结构。
- 数据库事务。

这些知识在后续学习日按照 README 第3.1节逐步学习。

## 十四、正式验收总结

### 14.1 各课程验收结果

| 课程 | Java 文件 | 静态审查 | 正式测试 | 验收轮次 |
|---|---|---|---|---:|
| D08-S01 | LibraryBook.java | 14/14 | 3/3 | 1 |
| D08-S02 | ServerNode.java | 22/22 | 6/6 | 2 |
| D08-S03 | InventoryItem.java | 28/28 | 10/10 | 2 |
| D08-S04 | Student.java | 36/36 | 12/12 | 2 |
| 合计 | 4 个程序 | 100/100 | 31/31 | 7 |

### 14.2 首次验收与最终验收

| 项目 | 首次累计 | 最终累计 |
|---|---|---|
| 静态代码审查 | 92/100 | 100/100 |
| 正式业务测试 | 28/31 | 31/31 |
| 全部验收项目 | 120/131 | 131/131 |

最终验收通过率：

$$
\text{Pass Rate}=\frac{131}{131}\times100\%=100\%
$$

### 14.3 核心综合成果

Student.java：

- 六个实例字段正确。
- 七个实例业务方法正确。
- 两个学生对象创建正确。
- 48 次非 void 业务方法调用结果全部正确保存。
- 三次非法成绩更新均未发生部分修改。
- 四个合法性范围参数测试通过。
- 五组成绩等级测试通过。
- 正式28行运行输出正确。
- CR01–CR36 全部通过。
- TC01–TC12 全部通过。

### 14.4 学习经验

本日重点掌握：

- 类描述对象的结构。
- 实例字段描述对象的状态。
- 实例方法描述对象的行为。
- 引用赋值不会自动复制对象。
- 不同对象具有独立实例状态。
- 实例方法可以复用当前对象的其他方法。
- 返回值与状态修改需要区分。
- 合法性检查应先于业务状态修改。
- 修改后需要重新计算派生结果。
- 业务逻辑正确与任务规范符合性同样重要。

## 十五、学习归档与下一步

本日四个最终验收程序及真实运行记录均已归档。

Markdown 学习任务、理论笔记、累计进度、交接记录及 README 已同步更新。

Git 归档完成。

累计学习进度：

$$
\frac{8}{90}\times100\%\approx8.89\%
$$

下一学习日：Day 09。

学习主题：

构造方法、this、封装、getter/setter。

核心任务：

为学生年龄和成绩增加合法性限制。

Day 09 应继承本日对象创建、实例字段、实例方法、方法复用、状态独立性及成绩校验的正式学习成果。

**Day 08 全部课程正式验收通过，累计学习进度为8/90天。**