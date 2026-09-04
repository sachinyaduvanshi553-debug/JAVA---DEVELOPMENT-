# 🎯 Java Core Top Interview Questions & Answers

### Q1: Why is String immutable in Java?
1. **Security**: Strings carry sensitive parameters like network sockets, URLs, database connection strings, and file paths. If mutable, a malicious thread could alter parameters after security checks.
2. **String Constant Pool (SCP)**: Immutability enables string interning and pool sharing, reducing heap memory footprint.
3. **Thread Safety**: Immutable objects are automatically thread-safe; multiple threads can share instances without synchronization.
4. **Hash Caching**: The `hashCode()` is computed once lazily and cached, allowing fast lookups in `HashMap` and `HashSet`.

---

### Q2: What is the contract between `equals()` and `hashCode()`?
1. If two objects are equal according to `equals(Object)`, their `hashCode()` **MUST** return the exact same integer value.
2. If two objects have different hash codes, they are guaranteed **not** equal.
3. If two objects have the same hash code, they may or may not be equal (Hash Collision).
*If you override `equals()`, you must always override `hashCode()`, otherwise hash-based collections (`HashMap`, `HashSet`) will fail to locate existing keys.*

---

### Q3: What is the difference between `Comparable` and `Comparator`?
* **`Comparable<T>`**: Defines **natural ordering** of an object (`compareTo(T o)`). Implemented inside the domain class itself (`java.lang`).
* **`Comparator<T>`**: Defines **custom/multiple ordering strategies** (`compare(T o1, T o2)`). Implemented externally via separate classes or lambda expressions (`java.util`).
