//import java.util.ArrayList;
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
    public static List<Integer> inputNodeValues(Scanner sc){
        List<Integer> nodes=new LinkedList<Integer>();
        while(true){
            int nodeVal =sc.nextInt();
            if(nodeVal==-2) break;
            nodes.add(nodeVal);
        }
        return nodes;
    }
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
    public static void bfsTraversal(MyTree root) {
        if (root == null) return;

        Queue<MyTree> q = new LinkedList<>();
        q.offer(root);
        int level = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            System.out.print("Level " + level + ":   ");
            for (int i = 0; i < size; i++) {
                MyTree node = q.poll();
                if (node != null) {
                    System.out.print(node.data + "  ");
                    q.offer(node.left);
                    q.offer(node.right);
                } else {
                    System.out.print("-1 "); // spacing for nulls
                }
            }
            System.out.println();
            level++;
        }
    }
public static void preOrderTraversal(MyTree root,List<Integer> result){
 if (root == null) return;
    result.add(root.data);
    preOrderTraversal(root.left, result);
    preOrderTraversal(root.right, result);
}
public static void inOrderTraversal(MyTree root){
    
}
public static void postOrderTraversal(MyTree root){
    
}
public static void printDFSTraversals(List<Integer> result){
for (int i = 0; i < result.size(); i++) {
        System.out.print(result.get(i));
        if (i != result.size() - 1) System.out.print(" -> ");
    }
    System.out.println();
}
}
