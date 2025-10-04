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