# MySLL.java Method Codes

---

## Building the List
**_Method: `inputNodeValues`_**

*Reads integers from the user until -1 and builds a singly linked list from them.*

```java
public static MySLL inputNodeValues(Scanner sc, MySLL head) {
    while(true){
        int value = sc.nextInt();
        if(value == -1){
            break;
        }
        head = MySLL.createLinkedList(head, value);
    }
    return head;
}
```
---

## Inserting at the Head
**_Method: `insertAtHead`_**

*Inserts a new node at the beginning of the list.*

```java
public static MySLL insertAtHead(MySLL head, int newele) {
    MySLL newHead = new MySLL(newele, head);
    return newHead;
}
```

---

## Inserting at the Tail
**_Method: `insertAtTail`_**

*Appends a new node at the end of the linked list.*

```java
public static MySLL insertAtTail(MySLL head, int newele) {
    MySLL newTail = new MySLL(newele);
    if(head == null){
        return newTail;
    }
    MySLL temp = head;
    while(temp.next != null){
        temp = temp.next;
    }
    temp.next = newTail;
    return head;
}
```

---

## Inserting at a Given Position
**_Method: `insertAtK`_**

*Inserts a new node at the k-th position in the list.*

```java
public static MySLL insertAtK(MySLL head, int k, int newele) {
    if(head == null){
        if(k == 1){
            MySLL newNode = new MySLL(newele);
            return newNode;
        }
        return head;
    }
    if(k == 1){
        MySLL newNode = new MySLL(newele, head);
        return newNode;
    }
    MySLL temp = head;
    int cnt = 0;
    while(temp != null){
        cnt++;
        if(cnt == (k-1)){
            MySLL newNode = new MySLL(newele, temp.next);
            temp.next = newNode;
            break;
        }
        temp = temp.next;
    }
    return head;
}
```

---
---

## Deleting the Head Node
**_Method: `deleteHead`_**

*Deletes the head (first) node of the list.*

```java
public static MySLL deleteHead(MySLL head) {
    if(head == null || head.next == null){
        System.out.println("Oh Man there's no element after this operation the list is Empty");
        return null;
    }
    MySLL newHead = head.next;
    return newHead;
}
```

---

## Deleting the Tail Node
**_Method: `deleteTail`_**

*Deletes the tail (last) node of the list.*

```java
public static MySLL deleteTail(MySLL head) {
    if(head == null || head.next == null){
        System.out.println("Oh Man there will be no element after this operation the list goes empty(Insert and again perform these Deletions)");
        return null;
    }
    MySLL temp = head;
    while(temp.next.next != null){
        temp = temp.next;
    }
    temp.next = null;
    return head;
}
```

---

## Deleting at a Given Position
**_Method: `deleteAtK`_**

*Deletes the node at position k in the linked list.*

```java
public static MySLL deleteAtK(MySLL head, int k) {
    if(head == null){
        System.out.println("Oh Man there's no element after this operation the list is Empty");
        return head;
    }
    else if(k == 1){
        head = deleteHead(head);
        return head;
    }
    else{
        int cnt = 0;
        MySLL temp = head;
        while(temp != null){
            cnt++;
            if(cnt == (k-1)){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
    }
    return head;
}
```

---

## Deleting by Value
**_Method: `deleteNodeK`_**

*Deletes all nodes with the specified value from the list.*

```java
public static MySLL deleteNodeK(MySLL head, int val) {
    if (head == null){
        return null;
    }
    else if(head.next == null && head.data == val){
        return null;
    }
    else{
        MySLL temp = head;
        while(temp != null && temp.next != null){
            if(temp.next.data == val){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
    }
    return head;
}
```
---
## Rotating Clockwise
**_Method: `rotateClockwise`_**

*Rotates the linked list clockwise by k positions.*

```java
public static MySLL rotateClockwise(MySLL head, int k) {
    if (head == null || head.next == null || k == 0) {
        return head;
    }
    int size = listSize(head);
    k = k % size;
    if (k == 0){
        return head;
    }
    int stepsToNewTail = size - k;
    MySLL newTail = head;
    while(stepsToNewTail > 1){
        newTail = newTail.next;
        stepsToNewTail--;
    }
    MySLL newHead = newTail.next;
    newTail.next = null;
    MySLL tail = newHead;
    while(tail.next != null){
        tail = tail.next;
    }
    tail.next = head;
    return newHead;
}
```

---

## Rotating Anti-Clockwise
**_Method: `rotateAntiClockwise`_**

*Rotates the linked list anti-clockwise by k positions.*

```java
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
```

---