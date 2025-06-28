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
    public static void printLinkedList(LinkedList head){
        LinkedList temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
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
    //Insertions
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
    public static void main(String[] args){

    }
}
