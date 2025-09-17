import java.util.ArrayList;
import java.util.List;
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
    public static MyBST buildBST(Scanner sc,MyBST root){
    System.out.println("Enter Nodes");
    while(true){
            int nodeVal =sc.nextInt();
            if(nodeVal==-1) break;
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
    }