# Tree Code

```java
public class MyTree {
    // Node structure
    int data;
    MyTree left, right;

    // Constructor
    MyTree(int val) { /* ... */ }

    // Insert a value
    public static MyTree insert(MyTree root, int val) { /* ... */ }

    // Pre-order Traversal
    public static void preOrderTraversal(MyTree root, List<Integer> result) { /* ... */ }

    // In-order Traversal
    public static void inOrderTraversal(MyTree root, List<Integer> result) { /* ... */ }

    // Post-order Traversal
    public static void postOrderTraversal(MyTree root, List<Integer> result) { /* ... */ }

    // Level-order Traversal
    public static List<List<Integer>> bfsTraversal(MyTree root) { /* ... */ }

    // Vertical Order Traversal
    public static List<List<Integer>> verticalTraversal(MyTree root) { /* ... */ }

    // Finding Lowest Common Ancestor
    public static MyTree LowestCommonAncestor(MyTree root, MyTree p, MyTree q) { /* ... */ }

    // Finding Diameter
    public static int computeDiameter(MyTree root) { /* ... */ }
}
```
