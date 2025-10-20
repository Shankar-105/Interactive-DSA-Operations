# MyStack.java — Method Codes (Menu Order)

---

## Push — Add element to top  
**_Method: `addNode`_**  
*Creates a node and pushes it on top; updates top and size.*

```java
public static Node addNode(int x){
    Node newNode = new Node(x);
    if(top == null){
        top = newNode;
        size++;
        return top;
    }
    newNode.next = top;
    top = newNode;
    size++;
    return top;
}
```

---

## Pop — Remove element from top  
**_Method: `removeNode`_**  
*Pops the top element, updates top pointer and size; prints when stack empty.*

```java
public static Node removeNode(){
    if(isEmpty()){
        System.out.println("Man The Stack's Empty Push Some Elements and Perform This Operation For a Better Experiance");
        top = null;
        return top;
    }
    top = top.next;
    size--;
    System.out.println("Removed it :)");
    return top;
}
```

---

## Size — Number of elements in stack  
**_Method: `sizeof`_**  
*Returns size counter.*

```java
public static int sizeof(){
    return size;
}
```

---

## Is Empty — Check if stack is empty  
**_Method: `isEmpty`_**  
*Returns true when size is zero.*

```java
public static boolean isEmpty(){
    if(size == 0){
        return true;
    }
    return false;
}
```

---

## Peek (Top) — View top element  
**_Method: `stackTop`_**  
*Returns top.value or 0 if empty.*

```java
public static int stackTop(){
    if(isEmpty()){
        return 0;
    }
    return top.value;
}
```

---

## Display — Print the stack (LIFO visual)  
**_Method: `printStack`_**  
*Traverses from top and prints each node to show top-first order.*

```java
public static void printStack(Node head){
    Node temp = head;
    System.out.println("Here's The Stack");
    System.out.println("------------");
    while(temp != null){
        System.out.println("     " + temp.value);
        temp = temp.next;
    }
    System.out.println("------------");
}
```

---

## Quick Example (main)  
**_Method: `main`_**  
*A placeholder included in the original file for quick manual testing.*

```java
public static void main(String[] args) {
    // optional quick tests can go here
}
```