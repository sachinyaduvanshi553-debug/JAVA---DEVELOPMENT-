# 🟦 Month 4: JVM Internals + Multithreading + Heap + Greedy (December)

> **Core Objective**: Elevate your engineering depth beyond 99% of candidates: deeply understand the JVM execution pipeline, memory layout, GC mechanisms, master thread safety, lock contention, thread pools, and conquer BST, Heap, and Greedy algorithmic optimization problems.

---

## ⏱️ Daily 3-Hour Time Allocation
* **Hour 1 — DSA (LeetCode)**: 2 Problems / day (BST, Heap/PriorityQueue, Greedy Intervals). Target: ~40 problems.
* **Hour 2 — JVM & Concurrency**: ClassLoaders, Metaspace, GC (G1/ZGC), Java Memory Model (JMM), `volatile`, `ReentrantLock`, `ExecutorService`.
* **Hour 3 — Engineering & Tools**: Profiling with JConsole / VisualVM, Thread dump analysis, AI-assisted performance profiling.

---

## 📂 Submodules in this Section

### ☕ 1. [01-JVM-Internals-and-Memory-Management](./01-JVM-Internals-and-Memory-Management/)
* **Class Loading Subsystem**: Bootstrap $\rightarrow$ Extension/Platform $\rightarrow$ Application ClassLoader. Delegation model.
* **JVM Memory Architecture**:
  * **Thread-Shared**: Heap (Young Gen: Eden, S0, S1; Old Gen: Tenured), Metaspace (off-heap class metadata), Code Cache.
  * **Thread-Private**: JVM Stack (Stack frames: Local variables table, Operand stack, Frame data), PC Register, Native Method Stack.
* **Garbage Collection**: Stop-The-World (STW), Mark-Sweep-Compact, Generational hypothesis, Serial, Parallel, G1 GC, ZGC.
* **JIT Compilation**: C1 (Client) compiler $\rightarrow$ C2 (Server) compiler, method inlining, escape analysis, loop unrolling.
* **Memory Diagnostics**: Diagnosing `java.lang.OutOfMemoryError: Java heap space`, `Metaspace`, and `StackOverflowError`.

### 🧵 2. [02-Multithreading-and-Concurrency](./02-Multithreading-and-Concurrency/)
* **Thread Mechanics**: Process vs Thread, Thread States (NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED).
* **Creating Execution**: `Thread`, `Runnable`, `Callable<V>`, `Future<V>`.
* **Memory Visibility & Ordering**: Java Memory Model (JMM), `happens-before` relationship, cache coherence, CPU cache lines, `volatile`.
* **Synchronization**: `synchronized` monitor locks, lock coarsening/elision/biased locking, explicit `ReentrantLock` & `ReadWriteLock`.
* **Concurrency Primitives**: `wait()`, `notify()`, `notifyAll()`, deadlock condition detection (Coffman conditions) and avoidance.
* **Modern Concurrency Utilities**: `ExecutorService`, `ThreadPoolExecutor` configurations, `CountDownLatch`, `Semaphore`, `CyclicBarrier`.
* **Lock-Free Concurrency**: CAS (Compare-And-Swap), `AtomicInteger`, `AtomicReference`, `LongAdder`.
* **Concurrent Collections**: `ConcurrentHashMap` (striped locking/CAS), `CopyOnWriteArrayList`, `BlockingQueue` implementations.

### 🧠 3. [03-BST-Heap-Greedy](./03-BST-Heap-Greedy/)
* **Binary Search Trees**: Search, Insert, Delete (3 node cases), Inorder predecessor/successor, BST validation.
* **Heap / PriorityQueue**: Min-heap vs Max-heap array representation, sift-up, sift-down, heapify in $O(N)$, Top-K pattern.
* **Greedy Heuristics**: Interval scheduling, Merge intervals, Activity selection, Jump game patterns.

---

## 🎯 Curated LeetCode Target (~40 Problems)
| # | Problem | Pattern | Difficulty |
|---|---------|---------|------------|
| 1 | Validate Binary Search Tree (#98) | BST | Medium |
| 2 | Kth Smallest Element in a BST (#230) | BST / Inorder | Medium |
| 3 | Delete Node in a BST (#450) | BST | Medium |
| 4 | Lowest Common Ancestor of a BST (#235) | BST | Easy/Medium |
| 5 | Kth Largest Element in an Array (#215) | Min-Heap / QuickSelect | Medium |
| 6 | Top K Frequent Elements (#347) | Min-Heap / Bucket | Medium |
| 7 | Find Median from Data Stream (#295) | Two Heaps (Min/Max) | Hard (Selected) |
| 8 | Task Scheduler (#621) | Max-Heap / Greedy | Medium |
| 9 | Merge k Sorted Lists (#23) | Min-Heap | Hard (Selected) |
| 10 | K Closest Points to Origin (#973) | Max-Heap | Medium |
| 11 | Maximum Subsequence Score (#2542) | Sorting + Min-Heap | Medium |
| 12 | Non-overlapping Intervals (#435) | Greedy Intervals | Medium |
| 13 | Merge Intervals (#56) | Sorting / Intervals | Medium |
| 14 | Insert Interval (#57) | Intervals | Medium |
| 15 | Minimum Number of Arrows to Burst Balloons (#452) | Greedy Intervals | Medium |
| 16 | Jump Game (#55) | Greedy | Medium |
| 17 | Jump Game II (#45) | Greedy BFS | Medium |
| 18 | Gas Station (#134) | Greedy | Medium |
| 19 | Hand of Straights (#846) | Greedy / TreeMap | Medium |
| 20 | Partition Labels (#763) | Greedy / Two Pointers | Medium |
