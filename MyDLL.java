import java.util.*;
public class MyDLL {
    int data;
    MyDLL next;
    MyDLL prev;
    public MyDLL(int val){
        this.data=val;
        this.next=null;
        this.prev=null;
    }
    public MyDLL(int val,MyDLL next,MyDLL prev){
        this.data=val;
        this.next=next;
        this.prev=prev;
    }
public static MyDLL inputNodes(Scanner sc,MyDLL head){
        while(true){
            int value=sc.nextInt();
            if(value==-1){
                break;
            }
           head=MyDLL.createDLL(head,value);
        }
        return head;
    }
    //creating the Doubly linked list
    private static MyDLL createDLL(MyDLL node,int val){
        MyDLL newNode=new MyDLL(val);
        if(node==null){
        node=newNode;
        return node;
        }
        MyDLL temp=node;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        return node;
    }
    public static void printDLL(MyDLL head){
        MyDLL temp=head;
        System.out.print("[NULL] <- ");
        while(temp!=null){
            if(temp.next==null){
                System.out.print("["+temp.data+"]"+" ->");
            }
            else{
                System.out.print("["+temp.data+"]"+" <-> ");
            }
            temp=temp.next;
        }
        System.out.println("[NULL]");
    }
}