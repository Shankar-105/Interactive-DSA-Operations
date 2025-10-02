import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
public class MyBST {
    int data;
    MyBST left,right;
    MyBST(int val){
        this.data=val;
        this.left=this.right=null;
    }
    MyBST(int val,MyBST l,MyBST r){
        this.data=val;
        this.left=l;
        this.right=r;
    }
    public static MyBST buildBST(Scanner sc,List<Integer> nodes,MyBST root){
    System.out.println("Enter Each Node Values (-1) to stop");
    while(true){
            int nodeVal =sc.nextInt();
            if(nodeVal==-1) break;
            nodes.add(nodeVal);
            root=MyBST.insert(root, nodeVal);
        }
        return root;
    }
    public static MyBST insert(MyBST root,int val){
    if(root==null){
    MyBST newRoot=new MyBST(val);
    return newRoot;
    }
    MyBST dummyPtr=root;
    while(dummyPtr!=null){
    if(dummyPtr.data>val){
        if(dummyPtr.left==null){
            dummyPtr.left=new MyBST(val);
            break;
        }
        else{
           dummyPtr=dummyPtr.left; 
        }
    }
    else if(dummyPtr.data<val){
            if(dummyPtr.right==null){
            dummyPtr.right=new MyBST(val);
            break;
        }
        else{
           dummyPtr=dummyPtr.right; 
        }
        }
        else{
            break;
        }
    }
    return root;
    }
    public static void showTree(MyBST node, String prefix, boolean isTail) {
        if (node == null){
            System.out.println("BST Has Nothing to Show Input some Nodes");
            return;
        }
        System.out.println(prefix + (isTail ? "└── " : "├── ") + node.data);
        List<MyBST> children = new ArrayList<>();
        if (node.right != null) children.add(node.right);
        if (node.left != null) children.add(node.left);
        for (int i = 0; i < children.size() - 1; i++) {
            showTree(children.get(i), prefix + (isTail ? "    " : "│   "), false);
        }
        if (!children.isEmpty()) {
            showTree(children.get(children.size() - 1), prefix + (isTail ? "    " : "│   "), true);
        }
    }
    public static void search(MyBST root,int key){
        MyBST temp=root;
        while(temp!=null && temp.data!=key){
            if (temp.data > key){
            temp = temp.left;   
        } 
        else{
            temp = temp.right;  
        }
        }
        if(temp!=null){
            System.out.println("Element "+key+" Found in the BST");
        }
        else{
            System.out.println("Element "+key+" not Found in the BST");
        }
    }
    public static void minValueNode(MyBST root){
        if(root==null){
            System.out.println("Empty Tree");
            return;
        }
        MyBST temp=root;
        while(temp.left!=null){
            temp=temp.left;
        }
        System.out.println("Lowest Value in the BST is "+temp.data);
    }
    public static void maxValueNode(MyBST root){
        if(root==null){
            System.out.println("Empty Tree");
            return;
        }
        MyBST temp=root;
        while(temp.right!=null){
            temp=temp.right;
        }
        System.out.println("Highest Value in the BST is "+temp.data);
    }
    private static MyBST assistDeleteroot(MyBST root){
        if(root==null){
            return root;
        }
        MyBST temp=root;
        while(temp.left!=null){
            temp=temp.left;
        }
        return temp;
    }
    public static MyBST deleteNode(MyBST root,int data){
        if (root == null) {
            return null;
        }
        if (data < root.data) {
            root.left = deleteNode(root.left, data);
        } 
        else if (data > root.data) {
            root.right = deleteNode(root.right, data);
        } 
        else {
            if (root.left == null) {
                return root.right;
            } 
            else if (root.right == null) {
                return root.left;
            }
            root.data = assistDeleteroot(root.right).data;
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }
    public static void preOrderTraversal(MyBST root,List<Integer> nodes){
         if(root==null){
            return;
         }
         nodes.add(root.data);
         preOrderTraversal(root.left,nodes);
         preOrderTraversal(root.right,nodes);
    }
    public static void inOrderTraversal(MyBST root,List<Integer> nodes){
         if(root==null){
            return;
         }
         inOrderTraversal(root.left,nodes);
         nodes.add(root.data);
         inOrderTraversal(root.right,nodes);
    }
    public static void postOrderTraversal(MyBST root,List<Integer> nodes){
         if(root==null){
            return;
         }
         postOrderTraversal(root.left,nodes);
         postOrderTraversal(root.right,nodes);
         nodes.add(root.data);
    }
    public static void printDFSTraversals(List<Integer> result){
    for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
        if (i != result.size() - 1){
            System.out.print(" -> ");
        }
    }
}
public static List<List<Integer>> bfsTraversal(MyBST root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return null;
        Queue<MyBST> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                MyBST node = q.poll();
                level.add(node.data);
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            result.add(level);
        }
        return result;
    }
    public static void printLevelOrderTraversals(List<List<Integer>> result){
    if(result == null){
        System.out.println("BST is Empty Insert few Nodes!");
        return;
        }
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
public static List<List<Integer>> zigZagLevelOrder(MyBST root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Queue<MyBST> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                MyBST node = queue.poll();
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
    public static int bstMaxDepth(MyBST root){
    if(root==null){
        return 0;
    }
    int leftHeight=bstMaxDepth(root.left);
    int rightHeight=bstMaxDepth(root.right);
    return 1+Math.max(leftHeight, rightHeight);
    }
    private static int isBalanced(MyBST root){
        if(root==null){
            return 0;
        }
        int leftHeight=isBalanced(root.left);
        if(leftHeight==-1) return -1;
        int rightHeight=isBalanced(root.right);
        if(rightHeight==-1) return -1;
        if(Math.abs(leftHeight-rightHeight)>1){
            return -1;
        }
        return 1+Math.max(leftHeight, rightHeight);
    }
    private static String isBstBalanced(MyBST root){
    return isBalanced(root)!=-1?"Yes":"No";
    }
    public static void bstSummary(MyBST root,List<Integer> nodes){
        // height of a tree is the number of edges in the longest path
        // from root to any node(leaves) which is (maxDepth-1)
        int bstHeight=bstMaxDepth(root)-1;
        System.out.println("== Tree Summary ==");
        System.out.print("Root Node: "+root.data);
        System.out.print(" | Total Nodes:"+nodes.size());
        System.out.print(" | Balanced:"+isBstBalanced(root));
        System.out.println(" | Height:"+bstHeight);
    }
    public static void floorInBST(MyBST root,int target){
        int maxi=Integer.MIN_VALUE;
        MyBST temp=root;
        while(temp!=null){
            if(temp.data<=target){
                maxi=Math.max(temp.data,maxi);
                temp=temp.right;
            }
            else{
                temp=temp.left;
            }
        }
        if(maxi!=Integer.MIN_VALUE){
            System.out.println("Floor of the Number "+target+" in the BST is "+maxi);
        }
        else{
            System.out.println("Floor of the Number "+target+" in the BST doesnt exist");
        }
    }
    public static void ceilInBST(MyBST root,int target){
        int mini=Integer.MAX_VALUE;
        MyBST temp=root;
        while(temp!=null){
            if(temp.data>=target){
                mini=Math.min(temp.data,mini);
                temp=temp.left;
            }
            else{
                temp=temp.right;
            }
        }
        if(mini!=Integer.MAX_VALUE){
            System.out.println("Ceil of the Number "+target+" in the BST is "+mini);
        }
        else{
            System.out.println("Ceil of the Number "+target+" in the BST doesnt exist");
        }
    }
    public static void inorderSuccessor(MyBST root,int target){
        int successor=0;
        MyBST temp=root;
        while(temp!=null){
            if(target<temp.data){
                successor=temp.data;
                temp=temp.left;
            }
            else{
                temp=temp.right;
            }
        }
        if(successor!=0){
            System.out.println("The Inorder Successor of "+target+" is "+successor);
        }
        else{
            System.out.println("Indorder Successor doesnt exist");
        }
    }
}