# Binary Search Tree (BST) Code

```java
public class MyBST {
    // Node structure
    int data;
    MyBST left, right;

    // Constructor
    MyBST(int val) { /* ... */ }

    // Insert a value
    public static MyBST insert(MyBST root, int val) { /* ... */ }

    // Delete a value
    public static MyBST deleteNode(MyBST root, int data) { /* ... */ }

    // Search for a value
    public static void search(MyBST root, int key) { /* ... */ }

    // In-order Traversal
    public static void inOrderTraversal(MyBST root, List<Integer> nodes) { /* ... */ }

    // Pre-order Traversal
    public static void preOrderTraversal(MyBST root, List<Integer> nodes) { /* ... */ }

    // Post-order Traversal
    public static void postOrderTraversal(MyBST root, List<Integer> nodes) { /* ... */ }

    // Level-order Traversal
    public static List<List<Integer>> bfsTraversal(MyBST root) { /* ... */ }

    // Find Minimum Value
    public static void minValueNode(MyBST root) { /* ... */ }

    // Find Maximum Value
    public static void maxValueNode(MyBST root) { /* ... */ }

    // Kth Smallest
    public static void kThSmallest(MyBST root, int k, int length) { /* ... */ }

    // Kth Largest
    public static void kThLargest(MyBST root, int k, int length) { /* ... */ }
}
```
