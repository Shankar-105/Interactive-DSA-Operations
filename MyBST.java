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
        if(dummyPtr.right==null){
            dummyPtr.right=new MyBST(val);
            break;
        }
        else{
           dummyPtr=dummyPtr.right; 
        }
    }
        else{
            if(dummyPtr.left==null){
            dummyPtr.left=new MyBST(val);
            break;
        }
        else{
           dummyPtr=dummyPtr.left; 
        }
        }
    }
    return root;
    }
}