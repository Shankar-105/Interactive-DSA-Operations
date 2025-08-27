import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class MyLinkedList {
    int data;
    MyLinkedList next;
    public MyLinkedList(int val){
        this.data=val;
        this.next=null;
    }
    public MyLinkedList(int val,MyLinkedList node){
        this.data=val;
        this.next=node;
    }
    public static MyLinkedList inputNodeValues(Scanner sc,MyLinkedList head){
        while(true){
            int value=sc.nextInt();
            if(value==-1){
                break;
            }
           head=MyLinkedList.createLinkedList(head,value);
        }
        return head;
    }
    //creating the linked list
    private static MyLinkedList createLinkedList(MyLinkedList node,int val){
        MyLinkedList newNode=new MyLinkedList(val);
        if(node==null){
        node=newNode;
        return node;
        }
        MyLinkedList temp=node;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return node;
    }
    // printing the linked list
    public static void printLinkedList(MyLinkedList head){
        MyLinkedList temp=head;
        System.out.println("== Curernt List Structure ==");
        while(temp!=null){
            System.out.print("["+temp.data+"]"+" -> ");
            temp=temp.next;
        }
        System.out.println("[NULL]");
        System.out.println("== List Summary ==");
        listSummary(head);
    }
    private static void listSummary(MyLinkedList head){
        int length =listSize(head);
        //String isEmpty=length!=0?"No":"Yes";
        MyLinkedList middleNode=middleNode(head);
        System.out.print("Length: "+length);
        if(middleNode!=null){
            System.out.print(" | Middle Node: "+middleNode.data);
        }
        else{
            System.out.print(" | Middle Node: Not Found");
        }
        if(length==0){
        System.out.println(" | Empty: Yup");
        }
        else{
            System.out.println(" | Empty: Nope");
        }
    }
    private static MyLinkedList middleNode(MyLinkedList head){
        if(head == null || head.next==null){
            return head;
        }
        MyLinkedList slow=head;
        MyLinkedList fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private static int listSize(MyLinkedList head){
        MyLinkedList temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    // reversing the linked list
    public static MyLinkedList reverseLinkedList(MyLinkedList head){
        MyLinkedList previousNode=null;
        MyLinkedList afterNode=null;
        MyLinkedList temp=head;
        while(temp!=null){
            afterNode=temp.next;
            temp.next=previousNode;
            previousNode=temp;
            temp=afterNode;
        }
        return previousNode;
    }
    //Insertions on Linked list
   public static MyLinkedList insertAtHead(MyLinkedList head,int newele){
    MyLinkedList newHead=new MyLinkedList(newele,head);
   return newHead;
   }
   public static MyLinkedList insertAtTail(MyLinkedList head,int newele){
    MyLinkedList newTail=new MyLinkedList(newele);
    if(head==null){
        return newTail;
    }
    MyLinkedList temp=head;
    while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newTail;
   return head;
   }
   public static MyLinkedList insertAtK(MyLinkedList head,int k,int newele){
    if(head==null){
        if(k==1){
         MyLinkedList newNode=new MyLinkedList(newele);
        return newNode;
        }
        return head;
    }
    if(k==1){
        MyLinkedList newNode=new MyLinkedList(newele,head);
        return newNode;
    }
    MyLinkedList temp=head;
     int cnt=0;
    while(temp!=null){
        cnt++;
        if(cnt==(k-1)){
            MyLinkedList newNode=new MyLinkedList(newele,temp.next);
            temp.next=newNode;
            break;
        }       
            temp=temp.next;
        }
    return head;
   }
   // Delitions on linked list
   public static MyLinkedList deleteHead(MyLinkedList head){
    if(head==null || head.next==null){
        System.out.println("Oh Man there's no element after this operation the list is Empty");
        return null;
    }
    MyLinkedList newHead=head.next;
    return newHead;
   }
   public static MyLinkedList deleteTail(MyLinkedList head){
    if(head==null || head.next==null){
        System.out.println("Oh Man there will be no element after this operation the list goes empty(Insert and again perform these Deletions)");
        return null;
    }
    MyLinkedList temp=head;
    while(temp.next.next!=null){
     temp=temp.next;
    }
    temp.next=null;
    return head;
   }
   public static MyLinkedList deleteAtK(MyLinkedList head,int k){
    if(head==null){
     System.out.println("Oh Man there's no element after this operation the list is Empty");
     return head;
    }
    else if(k==1){
        head=deleteHead(head);
        return head;
    }
    else{
    int cnt=0;
    MyLinkedList temp=head;
    while(temp!=null){
        cnt++;
        if(cnt==(k-1)){
        temp.next=temp.next.next;
        break;
        }
        temp=temp.next;
    }
    }
    return head;
   }
   public static MyLinkedList deleteNodeK(MyLinkedList head,int val){
    if (head == null){
       return null; 
    }
    else if(head.next==null && head.data==val){
        return null;
    }
    else{
        MyLinkedList temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.next.data==val){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
    }
    return head;
   }
   public static MyLinkedList deleteMiddleNode(MyLinkedList head){
        if(head == null || head.next==null){
            return null;
        }
        MyLinkedList nodeBeforeMiddle=null;
        MyLinkedList slow=head;
        MyLinkedList fast=head;
        while(fast!=null && fast.next!=null){
            nodeBeforeMiddle=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        nodeBeforeMiddle.next=slow.next;
        slow.next=null;
        return head;
    }
    public static void searchList(MyLinkedList head,int val){
        if(head==null){
            System.out.println("Empty List!");
        }
        int pos=0;
        MyLinkedList temp=head;
        while(temp!=null){
            pos++;
            if(temp.data==val){
            System.out.println("Node "+val+" Found at Position "+pos);
            return;
            }
            temp=temp.next;
        }
        System.out.println("Node With Value "+val+" Not Found");
    }
    public static void lgInList(MyLinkedList head){
        if(head==null){
            System.out.println("Max and Min Not Found Empty List!");
            return;
        }
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        MyLinkedList temp=head;
        while(temp!=null){
            maxi=Math.max(maxi,temp.data);
            mini=Math.min(temp.data, mini);
            temp=temp.next;
        }
        System.out.println("Max Value "+maxi+" | "+"Min Value "+mini);
    }
    public static void nThElement(MyLinkedList head,int pos){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        int cnt=0;
        MyLinkedList temp=head;
        while(temp!=null){
          cnt++;
          if(cnt==pos){
            System.out.println("Element At Position "+pos+" is "+temp.data);
            return;
          }
          temp=temp.next;
        }
        System.out.println("Position Out Of List Bounds");
    }
    public static void allOccs(MyLinkedList head,int val){
        if(head==null){
            System.out.println("Empty List!");
        }
        List<Integer> allOcc=new LinkedList<>();
        int pos=0;
        MyLinkedList temp=head;
        while(temp!=null){
            pos++;
            if(temp.data==val){
            allOcc.add(pos);
            }
            temp=temp.next;
        }
        if(!allOcc.isEmpty()){
            System.out.println("Found Value "+val+" at");
            for(int i=0;i<allOcc.size();i++){
                if(i!=allOcc.size()-1){
                    System.out.print("Position "+allOcc.get(i)+" | ");
                }
                else{
                    System.out.println("Position "+allOcc.get(i));
                }
            }
        }
        else{
            System.out.println("Element Not Found!");
        }
    }
    public static void sumPro(MyLinkedList head){
        if(head==null){
            System.out.println("Empty List!");
            return;
        }
        MyLinkedList temp=head;
        long sum=0;
        long prod=1;
        while(temp!=null){
        sum+=temp.data;
        prod*=temp.data;
        temp=temp.next;
        }
        System.out.println("Sum "+sum+" | Product "+prod);
    }
}
