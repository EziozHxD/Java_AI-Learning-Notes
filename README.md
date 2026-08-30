# ☕ 我的 Java 从零开始学习仓库

> 🚀 从零基础到入土  
> 一个零基础小白的 Java 入门之旅，用代码记录每一步成长，上传 GitHub 作为前行的动力。

---

## 📚 项目简介

本仓库是我从零开始学习 **Java 编程语言** 的完整记录。  
从最基础的语法起步，逐步深入变量、数据类型、运算符、键盘输入等核心知识。  
所有代码均已按**包结构**分类整理，方便查阅和复习。

---

## 📂 项目结构

```text
- `Java_AI-Learning-Notes/`
  - `src/`
    - `com.Ezio/`
      - `literal/`  # 字面量基础
        - [LiteralDemo1.java](src/com/Ezio/literal/LiteralDemo1.java)
      - `operator/`  # 运算符与练习
        - [OperatorDemo1.java](src/com/Ezio/operator/OperatorDemo1.java)  # 算术运算符基础
        - [OperatorDemo2.java](src/com/Ezio/operator/OperatorDemo2.java)  # 三位数拆分练习
        - [OperatorDemo3.java](src/com/Ezio/operator/OperatorDemo3.java)  # 秒数转时分秒
        - [OperatorDemo4.java](src/com/Ezio/operator/OperatorDemo4.java)  # 类型转换详解
        - [OperatorDemo5.java](src/com/Ezio/operator/OperatorDemo5.java)  # 逻辑运算符
        - [OperatorDemo6.java](src/com/Ezio/operator/OperatorDemo6.java)  # 位运算符
      - `variable/`  # 变量与数据类型
        - [VariableDemo1.java](src/com/Ezio/variable/VariableDemo1.java)  # 变量与赋值理念
        - [VariableDemo2.java](src/com/Ezio/variable/VariableDemo2.java)  # 回合制游戏伤害计算
        - [VariableDemo3.java](src/com/Ezio/variable/VariableDemo3.java)  # 8种基本数据类型
        - [VariableDemo4.java](src/com/Ezio/variable/VariableDemo4.java)  # BMI 指数计算
        - [VariableDemo5.java](src/com/Ezio/variable/VariableDemo5.java)  # Scanner 核心用法
        - [VariableDemo6.java](src/com/Ezio/variable/VariableDemo6.java)  # 键盘输入两数求和
        - [VariableDemo7.java](src/com/Ezio/variable/VariableDemo7.java)  # BMI 指数计算（优化版）
  - `.gitignore`
  - `README.md`
```

---

## 🛠️ 环境配置

| 工具 | 版本 |
|:---|:---|
| **JDK** | 25+ |
| **IDE** | IntelliJ IDEA |
| **构建工具** | 暂无（目前是 javac 编译运行） |

---

## 🏃 如何运行

### 方式一：在 IntelliJ IDEA 中运行（推荐）
1. 克隆本仓库到本地：
   ```bash
   git clone https://github.com/EzioHxD/Java_AI-Learning-Notes.git
   ```
2. 用 IDEA 打开项目（文件夹）。
3. 在 `src/com.Ezio/` 下找到任意 `.java` 文件（如 `variable/VariableDemo1.java`）。
4. 右键 → 选择 `Run 'VariableDemo1.main()'`。
5. 查看控制台输出结果。

### 方式二：命令行编译运行
```bash
# 进入项目根目录
cd Java_AI-Learning-Notes

# 编译（示例）
javac -d . src/com/Ezio/variable/VariableDemo1.java

# 运行
java com.Ezio.variable.VariableDemo1
```

---

## 🗺️ 学习路线

| 阶段 | 学习内容 | 对应文件 |
|:---|:---|:---|
| 1 | 变量与赋值理念 | `VariableDemo1.java` |
| 2 | 8种基本数据类型 | `VariableDemo3.java` |
| 3 | 回合制游戏变量练习 | `VariableDemo2.java` |
| 4 | BMI 指数计算 | `VariableDemo4.java` |
| 5 | 字面量基础输出 | `LiteralDemo1.java` |
| 6 | 算术运算符基础 | `OperatorDemo1.java` |
| 7 | 三位数拆分练习 | `OperatorDemo2.java` |
| 8 | 秒数转时分秒 | `OperatorDemo3.java` |
| 9 | 类型转换详解 | `OperatorDemo4.java` |
| 10 | Scanner 核心用法 | `VariableDemo5.java` |
| 11 | 键盘输入两数求和 | `VariableDemo6.java` |
| 12 | BMI 指数计算（优化版） | `VariableDemo7.java` |

---

## 💬 关于本仓库

> 这些代码是初学 Java 时的流程，可能存在不足的地方。  
> 欢迎批评指正，也欢迎一起交流学习！

---

**愿我们都能在编程的路上越走越远！** ☕🚀
