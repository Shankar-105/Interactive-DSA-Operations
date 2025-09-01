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
    private static MyDLL createDLL(MyDLL MyDLL,int val){
        MyDLL newNode=new MyDLL(val);
        if(MyDLL==null){
        MyDLL=newNode;
        return MyDLL;
        }
        MyDLL temp=MyDLL;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        return MyDLL;
    }
    public static void printDLL(MyDLL head){
        MyDLL temp=head;
        System.out.println("== Curernt List Structure ==");
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
        System.out.println("== List Summary ==");
        listSummary(head);
    }
    private static void listSummary(MyDLL head){
        int length =listSize(head);
        //String isEmpty=length!=0?"No":"Yes";
        MyDLL middleNode=middleNode(head);
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
    private static MyDLL middleNode(MyDLL head){
        if(head == null || head.next==null){
            return head;
        }
        MyDLL slow=head;
        MyDLL fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private static int listSize(MyDLL head){
        MyDLL temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    public static MyDLL reverseLinkedList(MyDLL head){
        MyDLL temp=head;
        if(head==null||head.next==null){
            return head;
        }
        MyDLL prevNode=null;
        MyDLL afterNode=null;
        while(temp!=null){
            prevNode=temp.prev;
            afterNode=temp.next;
            temp.prev=afterNode;
            temp.next=prevNode;
            temp=afterNode;
        }
        return prevNode.prev;
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
   public static MyDLL deleteHead(MyDLL head){
    if(head==null || head.next==null){
        return null;
    }
    head=head.next;
    head.prev=null;
    return head;
   }
   public static MyDLL deleteTail(MyDLL head){
    if(head==null || head.next==null){
        return null;
    }
    MyDLL temp=head;
    while(temp.next!=null){
     temp=temp.next;
    }
    temp.prev.next=null;
    temp.prev=null;
    return head;
   }
   public static MyDLL deleteAtK(MyDLL head,int k){
    if(head==null){
        return null;
    }
    int cnt=0;
    MyDLL temp=head;
    while(temp.next!=null){
        cnt++;
        if(cnt==k) {
            break;
        }
        temp=temp.next;
    }
    MyDLL prevNode=temp.prev;
    MyDLL nextNode=temp.next;
    if(prevNode==null && nextNode==null){
        return null;
    }
    else if(prevNode==null){
        return deleteHead(head);
    }
    else if(nextNode==null){
        return deleteTail(head);
    }
    else{
        prevNode.next=nextNode;
        nextNode.prev=prevNode;
        temp.prev=null;
        temp.next=null;
        }
    return head;
   }
   public static MyDLL deleteNodeK(MyDLL head,int val){
    if (head == null){
       return null; 
    }
    else if(head.next==null && head.data==val){
        return null;
    }
    else{
        MyDLL temp=head;
        while(temp!=null){
        if(temp.data==val) {
            break;
        }
        temp=temp.next;
    }
    MyDLL prevNode=temp.prev;
    MyDLL nextNode=temp.next;
    prevNode.next=nextNode;
    if(nextNode!=null){
        nextNode.prev=prevNode;
    }
    temp.prev=null;
    temp.next=null;
    }
    return head;
   }
   public static MyDLL deleteMiddleNode(MyDLL head){
        if(head == null || head.next==null){
            return null;
        }
        MyDLL slow=head;
        MyDLL fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        MyDLL nodeBeforeMiddle=slow.prev;
        MyDLL nodeafterMiddle=slow.next;
        nodeBeforeMiddle.next=nodeafterMiddle;
        nodeafterMiddle.prev=nodeBeforeMiddle;
        slow.prev=null;
        slow.next=null;
        return head;
    }
    public static void searchList(MyDLL head,int val){
        int pos=0;
        MyDLL temp=head;
        while(temp!=null){
            pos++;
            if(temp.data==val){
            System.out.println("MyDLL "+val+" Found at Position "+pos);
            return;
            }
            temp=temp.next;
        }
        System.out.println("MyDLL With Value "+val+" Not Found");
    }
    public static void lgInList(MyDLL head){
        if(head==null){
            System.out.println("Max and Min Not Found Empty List!");
            return;
        }
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        MyDLL temp=head;
        while(temp!=null){
            maxi=Math.max(maxi,temp.data);
            mini=Math.min(temp.data, mini);
            temp=temp.next;
        }
        System.out.println("Max Value "+maxi+" | "+"Min Value "+mini);
    }
    public static void nThElement(MyDLL head,Scanner sc){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        System.out.println("Enter the Nth Position");
        int nThPos=sc.nextInt();
       if(nThPos>MyDLL.listSize(head)){
       System.out.println("Unable To Fetch the Position,Out of List Bounds");
      }
        int cnt=0;
        MyDLL temp=head;
        while(temp!=null){
          cnt++;
          if(cnt==nThPos){
            System.out.println("Element At Position "+nThPos+" is "+temp.data);
            return;
          }
          temp=temp.next;
        }
    }
    public static void allOccs(MyDLL head,int val){
        if(head==null){
            System.out.println("Empty List!");
        }
        List<Integer> allOcc=new java.util.LinkedList<>();
        int pos=0;
        MyDLL temp=head;
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
    public static void sumPro(MyDLL head){
        if(head==null){
            System.out.println("Empty List!");
            return;
        }
        MyDLL temp=head;
        long sum=0;
        long prod=1;
        while(temp!=null){
        sum+=temp.data;
        prod*=temp.data;
        temp=temp.next;
        }
        System.out.println("Sum "+sum+" | Product "+prod);
    }
    public static MyDLL nodeBeforeMiddle(MyDLL head){
        if(head == null || head.next==null){
            return null;
        }
        MyDLL nodeBeforeMiddle=null;
        MyDLL slow=head;
        MyDLL fast=head;
        while(fast!=null && fast.next!=null){
            nodeBeforeMiddle=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        return nodeBeforeMiddle;
    }
    private static MyDLL mergeTwoLists(MyDLL list1, MyDLL list2) {
        MyDLL left=list1;
        MyDLL right=list2;
        MyDLL dummy=new MyDLL(-1);
        MyDLL current=dummy;
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
    public static MyDLL sortList(MyDLL head){
      if(head==null || head.next==null){
        return head;
      }
      MyDLL nodeBeforeMiddle=nodeBeforeMiddle(head);
      MyDLL leftHead=head;
      MyDLL rightHead=nodeBeforeMiddle.next;
      nodeBeforeMiddle.next=null;
      leftHead=sortList(leftHead);
      rightHead=sortList(rightHead);
      return mergeTwoLists(leftHead,rightHead);
    }
    public static void updateValue(MyDLL head,Scanner sc){
        if(head==null){
            System.out.println("List is Empty!");
            return;
        }
        System.out.println("Enter the Position");
        int updPos=sc.nextInt();
        if(updPos>MyDLL.listSize(head)){
        System.out.println("Unable To Fetch the Position,MayBe Out of List Bounds!");
         }
        else{
        System.out.println("Enter the New Value to be Updated");
        int updVal=sc.nextInt();
        MyDLL temp=head;
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
    public static void zigZagDisplay(MyDLL head) {
    if (head == null) {
        System.out.print("List is Empty");
        return;
    }
    MyDLL temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }
    MyDLL dummyHead = head;
    MyDLL tail = temp;
    boolean toggle = true;
    while (true) {
        if (dummyHead == tail) {
            System.out.print("[" + dummyHead.data + "]");
            
            return;
        } else if (toggle == true) {
            System.out.print("[" + dummyHead.data + "]" + " <-> ");
            dummyHead = dummyHead.next;
        } 
        else {
            System.out.print("[" + tail.data + "]" + " <-> ");
            tail = tail.prev;
        }
        toggle = !toggle;
    }
}
public static MyDLL rotateClockwise(MyDLL head, int k) {
    if (head == null || head.next == null || k == 0) {
        return head;
    }
    int size = listSize(head);
    k = k % size;
    if (k == 0) {
        return head;
    }
    int stepsToNewTail = size - k;
    MyDLL newTail = head;
    while (stepsToNewTail > 1) {
        newTail = newTail.next;
        stepsToNewTail--;
    }
    MyDLL newHead = newTail.next;
    newTail.next = null;
    newHead.prev = null;

    MyDLL tail = newHead;
    while (tail.next != null) {
        tail = tail.next;
    }
    tail.next = head;
    head.prev = tail;

    return newHead;
}
public static MyDLL rotateAntiClockwise(MyDLL head, int k) {
    if (head == null || head.next == null || k == 0) {
        return head;
    }
    int size = listSize(head);
    k = k % size;
    if (k == 0) {
        return head;
    }
    MyDLL newTail = head;
    while (k > 1) {
        newTail = newTail.next;
        k--;
    }
    MyDLL newHead = newTail.next;
    newTail.next = null;
    newHead.prev = null;

    MyDLL tail = newHead;
    while (tail.next != null) {
        tail = tail.next;
    }
    tail.next = head;
    head.prev = tail;
    return newHead;
}
public static MyDLL shuffleList(MyDLL head) {
    if (head == null || head.next == null) {
        return head;
    }
    List<MyDLL> nodes = new ArrayList<>();
    MyDLL temp = head;
    while (temp != null) {
        nodes.add(temp);
        temp = temp.next;
    }
    // Fisher Yates Shuffle
    Collections.shuffle(nodes);
    for (int i = 0; i < nodes.size() - 1; i++) {
        nodes.get(i).next = nodes.get(i+1);
        nodes.get(i+1).prev = nodes.get(i);
    }
    nodes.get(nodes.size()-1).next = null;
    nodes.get(0).prev = null;
    return nodes.get(0);
}
public static void animatedForwardTraversal(MyDLL head){
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
    public static void animatedBackwardTraversal(MyDLL head){
        MyDLL temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        MyDLL tail=temp;
        System.out.print("[NULL] <- ");
        while(tail!=null){
            if(tail.prev==null){
                System.out.print("["+tail.data+"]"+" -> ");
            }
            else{
                System.out.print("["+tail.data+"]"+" <-> ");
            }
            tail=tail.prev;
        }
        System.out.println("[NULL]");
    }
    public static void previewSplit(Scanner sc, MyDLL head) {   
    if (head == null) {
        System.out.println("List is Empty");
        return;
    }
    int size = listSize(head);
    System.out.println("Split Position need to Range in between [1 to List Size)");
    System.out.println("Current List Size: " + size);
    System.out.println("Enter Split Position");
    int splitAtK = sc.nextInt();
    MyDLL temp = head;
    int cnt = 0;
    if (splitAtK >= size) {
        System.out.println("Out of Bounds");
        return;
    } else {
        while (temp != null) {
            cnt++;
            if (cnt == splitAtK) {
                assistPreviewSplit(head, temp.next);
                break;
            }
            temp = temp.next;
        }
    }
    System.out.println("This is Only a Traversal List Remains the same as Before!");
}

private static void assistPreviewSplit(MyDLL head, MyDLL newHead) {
    MyDLL move = head;
    System.out.println("First Half");
    while (move.next != newHead) {
        System.out.print("[" + move.data + "] <-> ");
        move = move.next;
    }
    System.out.println("[" + move.data + "]");

    System.out.println("Second Half");
    while (newHead.next != null) {
        System.out.print("[" + newHead.data + "] <-> ");
        newHead = newHead.next;
    }
    System.out.println("[" + newHead.data + "]");
}
}