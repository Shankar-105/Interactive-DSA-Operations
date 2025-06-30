public class LinkedList {
    int data;
    LinkedList next;
    public LinkedList(int val){
        this.data=val;
        this.next=null;
    }
    public LinkedList(int val,LinkedList node){
        this.data=val;
        this.next=node;
    }
    //creating the linked list
    public static LinkedList createLinkedList(LinkedList node,int val){
        LinkedList newNode=new LinkedList(val);
        if(node==null){
        node=newNode;
        return node;
        }
        LinkedList temp=node;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return node;
    }
    // printing the linked list
    public static void printLinkedList(LinkedList head){
        LinkedList temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    // reversing the linked list
    public static LinkedList reverLinkedList(LinkedList head){
        LinkedList previousNode=null;
        LinkedList afterNode=null;
        LinkedList temp=head;
        while(temp!=null){
            afterNode=temp.next;
            temp.next=previousNode;
            previousNode=temp;
            temp=afterNode;
        }
        return previousNode;
    }
    //Insertions on linked list
   public static LinkedList insertAtHead(LinkedList head,int newele){
    LinkedList newHead=new LinkedList(newele,head);
   return newHead;
   }
   public static LinkedList insertAtTail(LinkedList head,int newele){
    LinkedList newTail=new LinkedList(newele);
    if(head==null){
        return newTail;
    }
    LinkedList temp=head;
    while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newTail;
   return head;
   }
   public static LinkedList insertAtK(LinkedList head,int k,int newele){
    if(head==null){
        if(k==1){
         LinkedList newNode=new LinkedList(newele);
        return newNode;
        }
        return head;
    }
    if(k==1){
        LinkedList newNode=new LinkedList(newele,head);
        return newNode;
    }
    LinkedList temp=head;
     int cnt=0;
    while(temp!=null){
        cnt++;
        if(cnt==(k-1)){
            LinkedList newNode=new LinkedList(newele,temp.next);
            temp.next=newNode;
            break;
        }       
            temp=temp.next;
        }
    return head;
   }
   // Delitions on linked list
   public static LinkedList deleteHead(LinkedList head){
    if(head==null || head.next==null){
        System.out.println("Oh Man there's no element after this operation the list is Empty");
        return null;
    }
    LinkedList newHead=head.next;
    return newHead;
   }
   public static LinkedList deleteTail(LinkedList head){
    if(head==null || head.next==null){
        System.out.println("Oh Man there will be no element after this operation the list goes empty(Insert and again perform these Deletions)");
        return null;
    }
    LinkedList temp=head;
    while(temp.next.next!=null){
     temp=temp.next;
    }
    temp.next=null;
    return head;
   }
   public static LinkedList deleteAtK(LinkedList head,int k){
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
    LinkedList temp=head;
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
   public static LinkedList deleteNodeK(LinkedList head,int val){
    if (head == null){
       return null; 
    }
    else if(head.next==null && head.data==val){
        return null;
    }
    else{
        LinkedList temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.next.data==val){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
    }
    return head;
   }
    public static void main(String[] args){

    }
}
