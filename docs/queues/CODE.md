# MyQueue.java — Method Codes (Menu Order)

---

## Enqueue — Add element to the back  
**_Method: `push`_**  
*Creates a node and appends it to the queue's back; updates front/back and length.*

```java
public static Node push(int y){
    Node newNode = new Node(y);
    if(back == null){
        front = back = newNode;
        length++;
        return front;
    }
    back.next = newNode;
    back = newNode;
    length++;
    return front;
}
```

---

## Dequeue — Remove element from the front  
**_Method: `pop`_**  
*Removes the front node and updates pointers; handles empty and single-node cases.*

```java
public static Node pop(){
    if(isQEmpty()){
        System.out.println("Heyyy Queue Has Nothing To Remove...Push Some Elements and Perform This Operation For a Better Experiance");
        return null;
    }
    if(front == back){
        front = null;
        back = null;
        length = 0;
        System.out.println("Queue has Gonee Empty!!");
        return front;
    }
    front = front.next;
    length--;
    return front;
}
```

---

## Is Empty — Check if queue is empty  
**_Method: `isQEmpty`_**  
*Returns true when length is zero.*

```java
public static boolean isQEmpty(){
    if(length == 0){
        return true;
    }
    return false;
}
```

---

## Size — Number of elements in queue  
**_Method: `sizeofQ`_**  
*Returns the maintained length counter.*

```java
public static int sizeofQ(){
    return length;
}
```

---

## Peek — View front element  
**_Method: `peekOfQ`_**  
*Returns front value or 0 if empty.*

```java
public static int peekOfQ(){
    if(isQEmpty()){
        return 0;
    }
    return front.value;
}
```

---

## Last — View back element  
**_Method: `lastOfQ`_**  
*Returns back value or 0 if empty.*

```java
public static int lastOfQ(){
    if(isQEmpty()){
        return 0;
    }
    return back.value;
}
```

---

## Display — Print the queue (FIFO order)  
**_Method: `printQueue`_**  
*Traverses from head/front and prints values.*

```java
public static void printQueue(Node head){
    Node temp = head;
    System.out.println("Here's The Queue");
    System.out.println("------------");
    while(temp != null){
        System.out.print(temp.value + " ");
        temp = temp.next;
    }
    System.out.println("\n------------");
}
```