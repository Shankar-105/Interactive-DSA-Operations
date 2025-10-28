public class MyStack{
static int size;
static Node top;
MyStack(){
    MyStack.size=0;
    MyStack.top=null;
}
public static Node addNode(int x){
    Node newNode =new Node(x);
    if(top==null){
    top=newNode;
    size++;
    return top;
    }
    newNode.next=top;
    top=newNode;
    size++;
    return top;
}
public static Node removeNode(){
if(isEmpty()){
    System.out.println("Man The Stack's Empty Push Some Elements and Perform This Operation For a Better Experiance");
    top=null;
    return top;
}
top=top.next;
size--;
System.out.println("Removed it :)");
return top;
}
public static int sizeof(){
    return size;
}
public static boolean isEmpty(){
    if(size==0){
        return true;
    }
    return false;
}
public static int stackTop(){
    if(isEmpty()){
    return 0;
    }
    return top.value;
}
public static void printStack(Node head){
        Node temp=head;
        System.out.println("Here's The Stack");
        System.out.println("------------");
        while(temp!=null){
            System.out.println("     "+temp.value);
            temp=temp.next;
        }
        System.out.println("------------");
    }
public static void main(String[] args) {
    
}
}