//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
//import javax.swing.tree.TreeNode;
public class MyTree {
    int data;
    MyTree left,right;
    MyTree(int val){
        data=val;
        left=right=null;
    }
    MyTree(int val,MyTree l,MyTree r){
        data=val;
        left=l;
        right=r;
    }
    //Storing Values into List
    public static List<Integer> inputNodeValues(Scanner sc){
        List<Integer> nodes=new LinkedList<Integer>();
        while(true){
            int nodeVal =sc.nextInt();
            if(nodeVal==-2) break;
            nodes.add(nodeVal);
        }
        return nodes;
    }
    //Consturcting Tree From User Input
    public static MyTree buildTreeFromLevels(List<Integer> nodes) {
    if (nodes == null || nodes.isEmpty() || nodes.get(0) == -1) return null;
    
    MyTree root = new MyTree(nodes.get(0));
    Queue<MyTree> q = new LinkedList<>();
    q.offer(root);
    int i = 1;
    while (i < nodes.size()) {
        MyTree current = q.poll();

        // Left child
        if (nodes.get(i) != -1) {
            current.left = new MyTree(nodes.get(i));
            q.offer(current.left);
        }
        i++;
        // Right child
        if (i < nodes.size() && nodes.get(i) != -1) {
            current.right = new MyTree(nodes.get(i));
            q.offer(current.right);
        }
        i++;
    }
    return root;
}
     // Breadth First Search
    public static List<List<Integer>> bfsTraversal(MyTree root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return null;
        Queue<MyTree> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                MyTree node = q.poll();
                level.add(node.data);
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            result.add(level);
        }
        return result;
    }
    // DFS PreOrder Traversal (ROOT->LEFT->RIGHT)
public static void preOrderTraversal(MyTree root,List<Integer> result){
 if (root == null) return;
    result.add(root.data);
    preOrderTraversal(root.left, result);
    preOrderTraversal(root.right, result);
}
    // DFS InOrder Traversal (LEFT->ROOT->RIGHT)
public static void inOrderTraversal(MyTree root,List<Integer> result){
    if (root == null) return;
    inOrderTraversal(root.left, result);
    result.add(root.data);
    inOrderTraversal(root.right, result);
}
    // DFS PostOrder Traversal (LEFT->RIGHT->ROOT)
public static void postOrderTraversal(MyTree root,List<Integer> result){
    if (root == null) return;
    postOrderTraversal(root.left, result);
    postOrderTraversal(root.right, result);
    result.add(root.data);
}
// Printing of the Stored DFS traversal
public static void printDFSTraversals(List<Integer> result){
for (int i = 0; i < result.size(); i++) {
        System.out.print(result.get(i));
        if (i != result.size() - 1) System.out.print(" -> ");
    }
    System.out.println();
}
//Zig Zag Level Order Traversal
    public static List<List<Integer>> zigzagLevelOrder(MyTree root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<MyTree> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                MyTree node = queue.poll();
                if (leftToRight) {
                    level.add(node.data);
                } else {
                    // Add at the beginning for reverse order
                    level.add(0, node.data);
                }

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            result.add(level);
            leftToRight = !leftToRight; // Toggle direction
        }

        return result;
    }
public static void printLevelOrderTraversals(List<List<Integer>> result){
    int level=0;
    while (level<result.size()) {
        List<Integer> eachLevel = result.get(level);
            int size = eachLevel.size();
            System.out.print("Level " + level + ":   ");
            for (int i = 0; i < size; i++) {
                System.out.print(eachLevel.get(i)+"  ");
            }
            System.out.println();
            level++;
        }
}
}
