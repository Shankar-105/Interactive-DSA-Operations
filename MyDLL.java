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
                System.out.print("["+temp.data+"]"+" -> ");
            }
            else{
                System.out.print("["+temp.data+"]"+" <-> ");
            }
            temp=temp.next;
        }
        System.out.println("[NULL]");
    }
    // Insertions Over DLL
    public static MyDLL insertAtHead(MyDLL head,int newele){
        if(head==null){
            return new MyDLL(newele, null, null);
        }
    MyDLL newHead=new MyDLL(newele,head,null);
    head.prev=newHead;
    return newHead;
   }
   public static MyDLL insertAtTail(MyDLL head,int newele){
    MyDLL newTail=new MyDLL(newele,null,null);
    if(head==null){
        return newTail;
    }
    MyDLL temp=head;
    while(temp.next!=null){
            temp=temp.next;
        }
        newTail.prev=temp;
        temp.next=newTail;
   return head;
   }
   public static MyDLL insertAtK(MyDLL head,int k,int newele){
    if(head==null){
        if(k==1){
         MyDLL newNode=new MyDLL(newele);
        return newNode;
        }
        return head;
    }
    if(k==1){
        MyDLL newHead=new MyDLL(newele,head,null);
        head.prev=newHead;
        return newHead;
    }
    MyDLL temp=head;
    int cnt=0;
    while(temp.next!=null){
        cnt++;
        if(cnt==k){
            break;
        }       
            temp=temp.next;
        }
        if(cnt==(k-2)){
        MyDLL newNode=new MyDLL(newele,null,temp);
        temp.next=newNode;
        return head;
        }
        else{
           MyDLL newNode=new MyDLL(newele,temp,temp.prev);
           temp.prev.next=newNode;
           temp.prev=newNode;
        }
    return head;
   }
}