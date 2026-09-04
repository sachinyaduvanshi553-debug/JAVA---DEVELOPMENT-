# 🟦 Month 2: OOP + Collections Framework + Linear DSA (October)

> **Core Objective**: Master production-level Object-Oriented Programming (OOP) design, master the internals and time-complexity of Java Collections, and implement core Linear Data Structures (Linked Lists, Stacks, Queues).

---

## ⏱️ Daily 3-Hour Time Allocation
* **Hour 1 — DSA (LeetCode)**: 2 Problems / day (Easy/Medium → Medium). Target: ~40 problems.
* **Hour 2 — Java Core**: OOP Pillars, Object contracts, Collection internals (`HashMap` buckets, `ArrayList` resizing, red-black trees in `TreeMap`).
* **Hour 3 — Engineering & Tools**: Writing modular clean code, JUnit 5 unit testing basics, AI prompt-to-test generation.

---

## 📂 Submodules in this Section

### ☕ 1. [01-OOP-In-Depth](./01-OOP-In-Depth/)
* **`01-Classes-Objects-Constructors/`**: Constructor chaining, `this()`, object instantiation in Heap.
* **`02-Access-Modifiers-Static-Final/`**: `public`, `protected`, default, `private`, static variables/methods, `final` classes/methods/variables.
* **`03-Encapsulation-Inheritance-Polymorphism/`**: Data hiding, Method Overloading (compile-time) vs Overriding (runtime dynamic method dispatch), `super`.
* **`04-Abstraction-Interfaces-AbstractClasses/`**: Interface default/static methods, multiple inheritance via interfaces, abstract base classes.
* **`05-Composition-Aggregation-Association/`**: "HAS-A" relationship vs "IS-A" relationship, loose coupling, composition over inheritance.

### ☕ 2. [02-Collections-Framework](./02-Collections-Framework/)
* **`01-List-ArrayList-LinkedList/`**: Resizing array mechanics ($1.5\times$), contiguous memory vs pointer dereferencing.
* **`02-Set-HashSet-LinkedHashSet-TreeSet/`**: Hash collisions, maintaining insertion order, balanced binary search tree (`TreeSet`).
* **`03-Map-HashMap-LinkedHashMap-TreeMap/`**: Internal bucket array, `hashCode()` & `equals()` contract, collision resolution (Linked List $\rightarrow$ Red-Black Tree threshold 8).
* **`04-Queue-Deque-PriorityQueue/`**: FIFO queues, double-ended queues, binary min-heap backed `PriorityQueue`.
* **`05-Comparable-Comparator-Iterator/`**: Natural ordering (`Comparable<T>`) vs custom sort strategies (`Comparator<T>`), fail-fast vs fail-safe iterators.

### 🧠 3. [03-Linear-DSA](./03-Linear-DSA/)
* **`01-LinkedList-Singly-Doubly-Cycles/`**: Reversal, Floyd's Cycle Detection, finding middle, merging sorted lists.
* **`02-Stack-MonotonicStack-NextGreaterElement/`**: LIFO semantics, monotonic decreasing/increasing stacks for range queries.
* **`03-Queue-CircularQueue-Deque/`**: Fixed array circular queues, sliding window maximum with `Deque`.

---

## 🎯 Curated LeetCode Target (~40 Problems)
| # | Problem | Pattern | Difficulty |
|---|---------|---------|------------|
| 1 | Reverse Linked List (#206) | Linked List | Easy |
| 2 | Merge Two Sorted Lists (#21) | Linked List | Easy |
| 3 | Linked List Cycle (#141) | Fast & Slow Pointer | Easy |
| 4 | Linked List Cycle II (#142) | Fast & Slow Pointer | Medium |
| 5 | Middle of the Linked List (#876) | Fast & Slow Pointer | Easy |
| 6 | Remove Nth Node From End of List (#19) | Two Pointers | Medium |
| 7 | Reorder List (#143) | Linked List | Medium |
| 8 | Palindrome Linked List (#234) | Two Pointers | Easy |
| 9 | Copy List with Random Pointer (#138) | Hash Table / Linked List | Medium |
| 10 | Valid Parentheses (#20) | Stack | Easy |
| 11 | Min Stack (#155) | Stack Design | Medium |
| 12 | Evaluate Reverse Polish Notation (#150) | Stack | Medium |
| 13 | Daily Temperatures (#739) | Monotonic Stack | Medium |
| 14 | Next Greater Element I (#496) | Monotonic Stack | Easy |
| 15 | Next Greater Element II (#503) | Monotonic Stack | Medium |
| 16 | Online Stock Span (#901) | Monotonic Stack | Medium |
| 17 | Largest Rectangle in Histogram (#84) | Monotonic Stack | Hard (Selected) |
| 18 | Implement Queue using Stacks (#232) | Queue Design | Easy |
| 19 | Design Circular Queue (#622) | Queue Design | Medium |
| 20 | Sliding Window Maximum (#239) | Monotonic Deque | Hard (Selected) |
