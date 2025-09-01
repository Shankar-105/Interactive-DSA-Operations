import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class MySLL {
    int data;
    MySLL next;
    public MySLL(int val){
        this.data=val;
        this.next=null;
    }
    public MySLL(int val,MySLL node){
        this.data=val;
        this.next=node;
    }
    public static MySLL inputNodeValues(Scanner sc,MySLL head){
        while(true){
            int value=sc.nextInt();
            if(value==-1){
                break;
            }
           head=MySLL.createLinkedList(head,value);
        }
        return head;
    }
    //creating the linked list
    private static MySLL createLinkedList(MySLL node,int val){
        MySLL newNode=new MySLL(val);
        if(node==null){
        node=newNode;
        return node;
        }
        MySLL temp=node;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return node;
    }
    // printing the linked list
    public static void printLinkedList(MySLL head){
        MySLL temp=head;
        System.out.println("== Curernt List Structure ==");
        while(temp!=null){
            System.out.print("["+temp.data+"]"+" -> ");
            temp=temp.next;
        }
        System.out.println("[NULL]");
        System.out.println("== List Summary ==");
        listSummary(head);
    }
    private static void listSummary(MySLL head){
        int length =listSize(head);
        //String isEmpty=length!=0?"No":"Yes";
        MySLL middleNode=middleNode(head);
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
    private static MySLL middleNode(MySLL head){
        if(head == null || head.next==null){
            return head;
        }
        MySLL slow=head;
        MySLL fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    protected static int listSize(MySLL head){
        MySLL temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    // reversing the linked list
    public static MySLL reverseLinkedList(MySLL head){
        MySLL previousNode=null;
        MySLL afterNode=null;
        MySLL temp=head;
        while(temp!=null){
            afterNode=temp.next;
            temp.next=previousNode;
            previousNode=temp;
            temp=afterNode;
        }
        return previousNode;
    }
    //Insertions on Linked list
   public static MySLL insertAtHead(MySLL head,int newele){
    MySLL newHead=new MySLL(newele,head);
   return newHead;
   }
   public static MySLL insertAtTail(MySLL head,int newele){
    MySLL newTail=new MySLL(newele);
    if(head==null){
        return newTail;
    }
    MySLL temp=head;
    while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newTail;
   return head;
   }
   public static MySLL insertAtK(MySLL head,int k,int newele){
    if(head==null){
        if(k==1){
         MySLL newNode=new MySLL(newele);
        return newNode;
        }
        return head;
    }
    if(k==1){
        MySLL newNode=new MySLL(newele,head);
        return newNode;
    }
    MySLL temp=head;
     int cnt=0;
    while(temp!=null){
        cnt++;
        if(cnt==(k-1)){
            MySLL newNode=new MySLL(newele,temp.next);
            temp.next=newNode;
            break;
        }       
            temp=temp.next;
        }
    return head;
   }
   // Delitions on linked list
   public static MySLL deleteHead(MySLL head){
    if(head==null || head.next==null){
        System.out.println("Oh Man there's no element after this operation the list is Empty");
        return null;
    }
    MySLL newHead=head.next;
    return newHead;
   }
   public static MySLL deleteTail(MySLL head){
    if(head==null || head.next==null){
        System.out.println("Oh Man there will be no element after this operation the list goes empty(Insert and again perform these Deletions)");
        return null;
    }
    MySLL temp=head;
    while(temp.next.next!=null){
     temp=temp.next;
    }
    temp.next=null;
    return head;
   }
   public static MySLL deleteAtK(MySLL head,int k){
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
    MySLL temp=head;
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
   public static MySLL deleteNodeK(MySLL head,int val){
    if (head == null){
       return null; 
    }
    else if(head.next==null && head.data==val){
        return null;
    }
    else{
        MySLL temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.next.data==val){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
    }
    return head;
   }
   public static MySLL deleteMiddleNode(MySLL head){
        if(head == null || head.next==null){
            return null;
        }
        MySLL nodeBeforeMiddle=null;
        MySLL slow=head;
        MySLL fast=head;
        while(fast!=null && fast.next!=null){
            nodeBeforeMiddle=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        nodeBeforeMiddle.next=slow.next;
        slow.next=null;
        return head;
    }
    public static void searchList(MySLL head,int val){
        if(head==null){
            System.out.println("Empty List!");
        }
        int pos=0;
        MySLL temp=head;
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
    public static void lgInList(MySLL head){
        if(head==null){
            System.out.println("Max and Min Not Found Empty List!");
            return;
        }
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        MySLL temp=head;
        while(temp!=null){
            maxi=Math.max(maxi,temp.data);
            mini=Math.min(temp.data, mini);
            temp=temp.next;
        }
        System.out.println("Max Value "+maxi+" | "+"Min Value "+mini);
    }
    public static void nThElement(MySLL head,Scanner sc){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        System.out.println("Enter the Nth Position");
        int nThPos=sc.nextInt();
       if(nThPos>MySLL.listSize(head)){
       System.out.println("Unable To Fetch the Position,Out of List Bounds");
      }
        int cnt=0;
        MySLL temp=head;
        while(temp!=null){
          cnt++;
          if(cnt==nThPos){
            System.out.println("Element At Position "+nThPos+" is "+temp.data);
            return;
          }
          temp=temp.next;
        }
    }
    public static void allOccs(MySLL head,int val){
        if(head==null){
            System.out.println("Empty List!");
        }
        List<Integer> allOcc=new LinkedList<>();
        int pos=0;
        MySLL temp=head;
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
    public static void sumPro(MySLL head){
        if(head==null){
            System.out.println("Empty List!");
            return;
        }
        MySLL temp=head;
        long sum=0;
        long prod=1;
        while(temp!=null){
        sum+=temp.data;
        prod*=temp.data;
        temp=temp.next;
        }
        System.out.println("Sum "+sum+" | Product "+prod);
    }
    public static MySLL nodeBeforeMiddle(MySLL head){
        if(head == null || head.next==null){
            return null;
        }
        MySLL nodeBeforeMiddle=null;
        MySLL slow=head;
        MySLL fast=head;
        while(fast!=null && fast.next!=null){
            nodeBeforeMiddle=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        return nodeBeforeMiddle;
    }
    private static MySLL mergeTwoLists(MySLL list1, MySLL list2) {
        MySLL left=list1;
        MySLL right=list2;
        MySLL dummy=new MySLL(-1);
        MySLL current=dummy;
        while(left!=null && right!=null){
            if(left.data<=right.data){
                current.next=left;
                current=left;
                left=left.next;
            }
            else{
             current.next=right;
             current=right;
             right=right.next;
            }
        }
        if(left!=null){
            current.next=left;
        }
        else{current.next=right;}
        return dummy.next;
    }
    public static MySLL sortList(MySLL head){
      if(head==null || head.next==null){
        return head;
      }
      MySLL nodeBeforeMiddle=nodeBeforeMiddle(head);
      MySLL leftHead=head;
      MySLL rightHead=nodeBeforeMiddle.next;
      nodeBeforeMiddle.next=null;
      leftHead=sortList(leftHead);
      rightHead=sortList(rightHead);
      return mergeTwoLists(leftHead,rightHead);
    }
    public static void updateValue(MySLL head,Scanner sc){
        if(head==null){
            System.out.println("List is Empty!");
            return;
        }
        System.out.println("Enter the Position");
        int updPos=sc.nextInt();
        if(updPos>MySLL.listSize(head)){
        System.out.println("Unable To Fetch the Position,MayBe Out of List Bounds!");
         }
        else{
        System.out.println("Enter the New Value to be Updated");
        int updVal=sc.nextInt();
        MySLL temp=head;
        int pos=0;
        while(temp!=null){
        pos++;
        if(pos==updPos){
        temp.data=updVal;
        System.out.println("Value of Node at Position "+updPos+" Changed to "+updVal);
        return;
        }
        temp=temp.next;
        }
    }
    }
    public static MySLL rotateClockwise(MySLL head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int size=listSize(head);
        k = k % size;
        if (k == 0){
         return head;
        }
        int stepsToNewTail = size - k;
        MySLL newTail = head;
        while(stepsToNewTail>1){
        newTail=newTail.next;
        stepsToNewTail--;
        }
        MySLL newHead = newTail.next;
        newTail.next = null;
        MySLL tail =newHead;
        while(tail.next!=null){
           tail=tail.next;
        }
        tail.next = head;
        return newHead;
    }
    public static MySLL rotateAntiClockwise(MySLL head, int k) {
    if (head == null || head.next == null || k == 0) {
        return head;
    }
    int size = listSize(head);
    k = k % size;
    if (k == 0) {
        return head;
    }
    MySLL newTail = head;
    while (k > 1) {
        newTail = newTail.next;
        k--;
    }
    MySLL newHead = newTail.next;
    newTail.next = null;
    MySLL tail = newHead;
    while (tail.next != null) {
        tail = tail.next;
    }
    tail.next = head;
    return newHead;
}
public static MySLL shuffleList(MySLL head) {
        if (head == null || head.next == null){
         return head;
        }
        List<MySLL> nodes = new ArrayList<>();
        MySLL temp = head;
        while (temp != null) {
            nodes.add(temp);
            temp = temp.next;
        }
        // Fisher Yates Shuffle
        Collections.shuffle(nodes);
        for (int i = 0; i < nodes.size() - 1; i++) {
            nodes.get(i).next = nodes.get(i+1);
        }
        nodes.get(nodes.size()-1).next = null;
        return nodes.get(0);
    }
    public static void animatedForwardTraversal(MySLL head){
        MySLL temp=head;
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
    public static void previewSplit(Scanner sc,MySLL head){   
    if(head==null){
        System.out.println("List is Empty");
        return;
    }
    int size=listSize(head);
    System.out.println("Split Position need to Range in between [1 to List Size)");
    System.out.println("Current List Size:"+size);
    System.out.println("Enter Split Position");
    int splitAtK=sc.nextInt();
    MySLL temp=head;
    int cnt=0;
    if(splitAtK>=size){
        System.out.println("Out of Bounds");
        return;
    }
    else{
        while(temp!=null){
        cnt++;
        if(cnt==splitAtK){
            assistPreviewSplit(head,temp.next);
            break;
        }
        temp=temp.next;
        }
    }
    System.out.println("This is Only a Traversal List Remains the same as Before!");
    }
    private static void assistPreviewSplit(MySLL head,MySLL newHead){
        MySLL move=head;
        System.out.println("First Half");
            while(move.next!=newHead){
                System.out.print("["+move.data+"]"+" -> ");
                move=move.next;
            }
            System.out.println("["+move.data+"]");
            System.out.println("Second Half");
            while(newHead.next!=null){
                System.out.print("["+newHead.data+"]"+" -> ");
                newHead=newHead.next;
            }
            System.out.println("["+newHead.data+"]");
    }
}
