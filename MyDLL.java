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
}