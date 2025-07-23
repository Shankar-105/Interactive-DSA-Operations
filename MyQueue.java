public class MyQueue {
   static int length;
   static Node front;
   static Node back;
    MyQueue(){
        MyQueue.length=0;
        MyQueue.back=null;
        MyQueue.front=null;
    }
    public static Node push(int y){
    Node newNode =new Node(y);
    if(back==null){
        front=back=newNode;
        length++;
        return front;
    }
    back.next=newNode;
    back=newNode;
    length++;
    return front;
    }
    public static Node pop(){
    if(isQEmpty()){
      System.out.println("Heyyy Queue Has Nothing To Remove...Push Some Elements and Perform This Operation For a Better Experiance");
        return null;
    }
    if(front==back){
        front=null;
        back=null;
        length=0;
        System.out.println("Queue has Gonee Empty!!");
        return front;
    }
    front=front.next;
    length--;
    return front;
    }
    public static boolean isQEmpty(){
        if(length==0){
            return true;
        }
        return false;
    }
    public static int sizeofQ(){
        return length;
    }
    public static int peekOfQ(){
        if(isQEmpty()){
            return 0;
        }
    return front.value;
    }
    public static int lastOfQ(){
        if(isQEmpty()){
            return 0;
        }
    return back.value;
    }
    public static void printQueue(Node head){
        Node temp=head;
        System.out.println("Here's The Queue");
        System.out.println("------------");
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println("\n------------");
    }
    public static void main(String[] args) {
    push(2);
    push(3);
    push(5);
    pop();
   // System.out.println("peek "+peekOfQ());
    //System.out.println("last "+lastOfQ());
   pop();
   pop();
    push(10);
    printQueue(front);
}
}
