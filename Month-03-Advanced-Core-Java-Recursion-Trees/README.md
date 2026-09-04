# 🟦 Month 3: Advanced Core Java + Recursion + Trees (November)

> **Core Objective**: Transition from syntax mastery to software craftsmanship: implement clean object contracts, custom exceptions, robust generic type safety (PECS), functional programming with Lambdas & Streams, and master Tree & Backtracking algorithmic patterns.

---

## ⏱️ Daily 3-Hour Time Allocation
* **Hour 1 — DSA (LeetCode)**: 2 Problems / day (Mostly Medium). Target: ~40 problems.
* **Hour 2 — Advanced Java Core**: Object internals, Immutability, Exception hierarchies, Generics type erasure, Stream collectors.
* **Hour 3 — Engineering & Tools**: Maven / Gradle build tools, CI/CD pipeline basics, AI-assisted refactoring.

---

## 📂 Submodules in this Section

### ☕ 1. [01-Object-Internals-and-Immutability](./01-Object-Internals-and-Immutability/)
* Contract between `equals()` and `hashCode()`: why overriding one requires the other.
* Designing thread-safe truly immutable classes (`final` class, private `final` fields, defensive copying in getters and constructors).

### ☕ 2. [02-Exception-Handling](./02-Exception-Handling/)
* Checked exceptions (compile-time recoverable) vs Unchecked `RuntimeException` (programming errors).
* `try-with-resources` ensuring automatic resource disposal via `AutoCloseable`.
* Custom domain-specific exception hierarchies.

### ☕ 3. [03-Generics-and-Wildcards](./03-Generics-and-Wildcards/)
* Generic classes and methods, compile-time type safety vs runtime type erasure.
* Invariance vs Covariance (`? extends T`) vs Contravariance (`? super T`).
* **PECS Principle**: Producer Extends, Consumer Super.

### ⚡ 4. [04-Modern-Java-Lambdas-and-Streams](./04-Modern-Java-Lambdas-and-Streams/)
* Core functional interfaces: `Predicate<T>`, `Function<T, R>`, `Consumer<T>`, `Supplier<T>`, `UnaryOperator<T>`.
* Method references (static, instance of arbitrary object, instance of particular object, constructor).
* Stream pipelines: Intermediate (`filter`, `map`, `flatMap`, `distinct`, `sorted`) vs Terminal (`collect`, `reduce`, `count`, `forEach`).
* Advanced collectors: `groupingBy`, `partitioningBy`, `mapping`, downstream collectors.

### 🧠 5. [05-Recursion-Backtracking-Trees](./05-Recursion-Backtracking-Trees/)
* Recursion fundamentals: Base conditions, recursion trees, stack frame management.
* Backtracking framework: Choose $\rightarrow$ Explore $\rightarrow$ Unchoose (Subsets, Permutations, N-Queens, Sudoku).
* Binary Tree traversals: Preorder, Inorder, Postorder, Level-order (BFS), Diameter, Maximum Path Sum, Lowest Common Ancestor (LCA).

---

## 🎯 Curated LeetCode Target (~40 Problems)
| # | Problem | Pattern | Difficulty |
|---|---------|---------|------------|
| 1 | Subsets (#78) | Backtracking | Medium |
| 2 | Subsets II (#90) | Backtracking | Medium |
| 3 | Permutations (#46) | Backtracking | Medium |
| 4 | Combination Sum (#39) | Backtracking | Medium |
| 5 | Combination Sum II (#40) | Backtracking | Medium |
| 6 | Word Search (#79) | Backtracking / Grid | Medium |
| 7 | Palindrome Partitioning (#131) | Backtracking | Medium |
| 8 | N-Queens (#51) | Backtracking | Hard (Selected) |
| 9 | Maximum Depth of Binary Tree (#104) | Tree DFS | Easy |
| 10 | Invert Binary Tree (#226) | Tree DFS | Easy |
| 11 | Same Tree (#100) | Tree DFS | Easy |
| 12 | Subtree of Another Tree (#572) | Tree DFS | Easy |
| 13 | Lowest Common Ancestor of a BST (#235) | Tree | Medium |
| 14 | Binary Tree Level Order Traversal (#102) | Tree BFS | Medium |
| 15 | Binary Tree Right Side View (#199) | Tree BFS/DFS | Medium |
| 16 | Count Good Nodes in Binary Tree (#1448) | Tree DFS | Medium |
| 17 | Validate Binary Search Tree (#98) | Tree DFS / Range | Medium |
| 18 | Kth Smallest Element in a BST (#230) | Inorder Traversal | Medium |
| 19 | Construct Binary Tree from Preorder & Inorder (#105) | Tree Divide & Conquer | Medium |
| 20 | Binary Tree Maximum Path Sum (#124) | Tree DFS Postorder | Hard (Selected) |
