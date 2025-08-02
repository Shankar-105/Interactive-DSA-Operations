import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
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
    public static MyTree buildTree(List<Integer> nodes) {
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
 if (root == null){
    //result.add(-1);
    return;
 }
    result.add(root.data);
    preOrderTraversal(root.left, result);
    preOrderTraversal(root.right, result);
}
    // DFS InOrder Traversal (LEFT->ROOT->RIGHT)
public static void inOrderTraversal(MyTree root,List<Integer> result){
    if (root == null){
    //result.add(-1);
    return;
 }
    inOrderTraversal(root.left, result);
    result.add(root.data);
    inOrderTraversal(root.right, result);
}
   // DFS PostOrder Traversal (LEFT->RIGHT->ROOT)
public static void postOrderTraversal(MyTree root,List<Integer> result){
    if (root == null){
    return;
 }
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
    public static List<List<Integer>> zigZagLevelOrder(MyTree root) {
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
            System.out.print("Level " + (level+1) + ":   ");
            for (int i = 0; i < size; i++) {
                System.out.print(eachLevel.get(i)+"  ");
            }
            System.out.println();
            level++;
        }
}
public static void showTree(MyTree node, String prefix, boolean isTail) {
        if (node == null){
            System.out.println("Tree Has Nothing to Show Input some Nodes");
        }

        System.out.println(prefix + (isTail ? "└── " : "├── ") + node.data);

        List<MyTree> children = new ArrayList<>();
        if (node.left != null) children.add(node.left);
        if (node.right != null) children.add(node.right);

        for (int i = 0; i < children.size() - 1; i++) {
            showTree(children.get(i), prefix + (isTail ? "    " : "│   "), false);
        }

        if (!children.isEmpty()) {
            showTree(children.get(children.size() - 1), prefix + (isTail ? "    " : "│   "), true);
        }
    }
    private static int treeHeight(MyTree root) {
    if (root == null) return 0;
    int leftHeight=treeHeight(root.left);
    int rightHeight=treeHeight(root.right);
    return 1 + Math.max(leftHeight,rightHeight);
}
public static void searchInTree(MyTree root,int target) {
        if (root == null){
            System.out.println("Tree is Emptyy");
            return;
        }
        Queue<MyTree> q = new LinkedList<>();
        int lvl=1;
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                MyTree node = q.poll();
                if(node.data==target){
                 System.out.println("Node " + target + " found at Level " + lvl);
                 return;
                }
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            lvl++;
        }
    System.out.println("Node " + target + " not found in the tree.");
    }
    private static int assistIsBalanced(MyTree root) {
        if(root==null){return 0;}
        int lh=assistIsBalanced(root.left);
        if(lh==-1) return -1;
        int rh=assistIsBalanced(root.right);
        if(rh==-1) return -1;
        if(Math.abs(rh-lh)>1) return -1;
        return 1+ Math.max(lh,rh);
    }
    public static String isBalanced(MyTree root){
        return (assistIsBalanced(root)!=-1)? "Yes" : "No" ;
    }
    public static void treeSummary(MyTree root,List<Integer> nodes){
        System.out.println("== Tree Summary ==");
        System.out.print("Root Node: "+root.data);
        System.out.print(" | Total Nodes:"+nodes.size());
        System.out.print(" | Balanced:"+isBalanced(root));
        System.out.println(" | Height:"+treeHeight(root));
    }
    private static int assistDiameter(MyTree root,int[] maxi){
      if(root==null) return 0;
      int leftHeight=assistDiameter(root.left, maxi);
      int rightHeight=assistDiameter(root.right, maxi);
      maxi[0]=Math.max(maxi[0], leftHeight+rightHeight);
      return 1+Math.max(leftHeight, rightHeight);
    }
    public static int computeDiameter(MyTree root){
        int[] maxi=new int[1];
        assistDiameter(root,maxi);
        return maxi[0];
    }
    public static MyTree LowestCommonAncestor(MyTree root, MyTree p, MyTree q) {
        if(root==null || root==p || root==q){
            return root;
        }
        MyTree left=LowestCommonAncestor(root.left, p, q);
        MyTree right=LowestCommonAncestor(root.right, p, q);
        if(left==null){
            return right;
        }
        else if(right==null){
            return left;
        }
        else{
            return root;
        }
    }
}