import java.util.ArrayList;
import java.util.List;

public class TestSimulator {
    private static void check(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }

    public static void main(String[] args) {
        MySLL sll = new MySLL(3, new MySLL(1, new MySLL(2)));
        sll = MySLL.rotateClockwise(sll, -1);
        check(MySLL.listSize(sll) == 3, "SLL rotation should preserve size");

        MyDLL dll = new MyDLL(1);
        dll = MyDLL.insertAtTail(dll, 2);
        dll = MyDLL.reverseLinkedList(dll);
        check(dll.data == 2 && dll.next.data == 1, "DLL reversal should swap head and tail");

        MyBST root = null;
        root = MyBST.insert(root, 2);
        root = MyBST.insert(root, 1);
        root = MyBST.insert(root, 3);
        check(MyBST.bstMaxDepth(root) == 2, "BST depth should include both child levels");

        List<Integer> minHeap = new ArrayList<>();
        MyMinHeap.heapifyUp(minHeap, 5);
        MyMinHeap.heapifyUp(minHeap, 2);
        check(minHeap.get(0) == 2, "Min heap root should be the minimum");

        List<Integer> maxHeap = new ArrayList<>();
        MyMaxHeap.heapifyUp(maxHeap, 5);
        MyMaxHeap.heapifyUp(maxHeap, 8);
        check(maxHeap.get(0) == 8, "Max heap root should be the maximum");

        System.out.println("All simulator checks passed");
    }
}
