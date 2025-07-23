//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
public class Tree {
    int data;
    Tree left,right;
    Tree(int val){
        data=val;
        left=right=null;
    }
    Tree(int val,Tree l,Tree r){
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
    public static Tree buildTreeFromLevels(List<Integer> nodes) {
    if (nodes == null || nodes.isEmpty() || nodes.get(0) == -1) return null;
    
    Tree root = new Tree(nodes.get(0));
    Queue<Tree> q = new LinkedList<>();
    q.offer(root);
    int i = 1;
    while (i < nodes.size()) {
        Tree current = q.poll();

        // Left child
        if (nodes.get(i) != -1) {
            current.left = new Tree(nodes.get(i));
            q.offer(current.left);
        }
        i++;
        // Right child
        if (i < nodes.size() && nodes.get(i) != -1) {
            current.right = new Tree(nodes.get(i));
            q.offer(current.right);
        }
        i++;
    }
    return root;
}
}
