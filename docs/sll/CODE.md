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