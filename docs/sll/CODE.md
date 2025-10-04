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
## Preview Splitting the List
**_Method: `previewSplit`_**

*Preview splits the list at a given position and displays both parts without changing the list.*

```java
public static void previewSplit(Scanner sc, MySLL head) {   
    if(head == null){
        System.out.println("List is Empty");
        return;
    }
    int size = listSize(head);
    System.out.println("Split Position need to Range in between [1 to List Size)");
    System.out.println("Current List Size:" + size);
    System.out.println("Enter Split Position");
    int splitAtK = sc.nextInt();
    MySLL temp = head;
    int cnt = 0;
    if(splitAtK >= size){
        System.out.println("Out of Bounds");
        return;
    }
    else{
        while(temp != null){
            cnt++;
            if(cnt == splitAtK){
                assistPreviewSplit(head, temp.next);
                break;
            }
            temp = temp.next;
        }
    }
    System.out.println("This is Only a Traversal List Remains the same as Before!");
}
```
---
## Splitting Helper for Preview
**_Method: `assistPreviewSplit` (private)_**

*Helper function to print the two halves of the list for previewSplit.*

```java
private static void assistPreviewSplit(MySLL head, MySLL newHead) {
    MySLL move = head;
    System.out.println("First Half");
    while(move.next != newHead){
        System.out.print("[" + move.data + "]" + " -> ");
        move = move.next;
    }
    System.out.println("[" + move.data + "]");
    System.out.println("Second Half");
    while(newHead.next != null){
        System.out.print("[" + newHead.data + "]" + " -> ");
        newHead = newHead.next;
    }
    System.out.println("[" + newHead.data + "]");
}
```
---
## Splitting the List by Value
**_Method: `splitList`_**

*Splits the list at a node with a specific value, and returns the chosen half.*

```java
public static MySLL splitList(Scanner sc, MySLL head) {   
    if (head == null) {
        System.out.println("List is Empty");
        return null;
    }
    System.out.println("Enter the Value to be Split at <<<");
    int splitAtK = sc.nextInt();
    MySLL temp = head;
    while (temp != null) {
        if (temp.data == splitAtK) {
            MySLL newHead = assistSplitList(head, temp, sc);
            return newHead;
        }
        temp = temp.next;
    }
    System.out.println("Value Of Partition not found!");
    return head;
}
```

---
## Splitting Helper for splitList
**_Method: `assistSplitList` (private)_**

*Helper for splitList to handle user’s choice and break the list.*

```java
private static MySLL assistSplitList(MySLL head, MySLL splitNode, Scanner sc) {
    System.out.println("First Half");
    MySLL move = head;
    while (move != splitNode) {
        System.out.print("[" + move.data + "] -> ");
        move = move.next;
    }
    System.out.println("[" + move.data + "]");
    System.out.println("Second Half");
    if (splitNode.next == null) { 
        System.out.println("[NULL]");
    } 
    else {
        MySLL secMover = splitNode.next;
        while (secMover.next != null) {
            System.out.print("[" + secMover.data + "] -> ");
            secMover = secMover.next;
        }
        System.out.println("[" + secMover.data + "]");
    }
    System.out.println("Choose any of the Two Halves");
    System.out.println("Enter f to choose the first Half");
    System.out.println("Enter s to choose the second Half");
    System.out.println("Enter r to choose a random Half");
    System.out.print("choose (f/s/r): ");
    String choice = sc.next();
    int r = 0;
    if (choice.equals("r")) {
        r = ThreadLocalRandom.current().nextInt(1, 3); // 1 or 2
    } 
    else if (choice.equals("f")) {
        r = 1;
    } 
    else {
        r = 2;
    }
    switch (r) {
        case 1:
            splitNode.next = null;
            return head;
        case 2:
            if (splitNode.next == null) {
                System.out.println("Second half is EMPTY, returning null!");
                return null;
            }
            MySLL temp = splitNode.next;
            splitNode.next = null;
            return temp;
    }
    return null;
}
```
---
## Merging Two Sorted Lists
**_Method: `mergeTwoLists` (private)_**

*Merges two sorted linked lists into one sorted list.*

```java
private static MySLL mergeTwoLists(MySLL list1, MySLL list2) {
    MySLL left = list1;
    MySLL right = list2;
    MySLL dummy = new MySLL(-1);
    MySLL current = dummy;
    while(left != null && right != null){
        if(left.data <= right.data){
            current.next = left;
            current = left;
            left = left.next;
        }
        else{
            current.next = right;
            current = right;
            right = right.next;
        }
    }
    if(left != null){
        current.next = left;
    }
    else{
        current.next = right;
    }
    return dummy.next;
}
```
---
## Shuffling the List
**_Method: `shuffleList`_**

*Shuffles the list randomly using Fisher-Yates shuffle and returns the new head.*

```java
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
```
---
## Deleting the Middle Node
**_Method: `deleteMiddleNode`_**

*Deletes the middle node of the linked list.*

```java
public static MySLL deleteMiddleNode(MySLL head) {
    if(head == null || head.next == null){
        return null;
    }
    MySLL nodeBeforeMiddle = null;
    MySLL slow = head;
    MySLL fast = head;
    while(fast != null && fast.next != null){
        nodeBeforeMiddle = slow;
        slow = slow.next;
        fast = fast.next.next;
    }
    nodeBeforeMiddle.next = slow.next;
    slow.next = null;
    return head;
}
```

---
## Finding Node Before Middle
**_Method: `nodeBeforeMiddle`_**

*Returns the node before the middle node in the list.*

```java
public static MySLL nodeBeforeMiddle(MySLL head) {
    if(head == null || head.next == null){
        return null;
    }
    MySLL nodeBeforeMiddle = null;
    MySLL slow = head;
    MySLL fast = head;
    while(fast != null && fast.next != null){
        nodeBeforeMiddle = slow;
        slow = slow.next;
        fast = fast.next.next;
    }
    return nodeBeforeMiddle;
}
```

---
## Locating the Middle Node
**_Method: `middleNode` (private)_**

*Finds and returns the middle node of the linked list.*

```java
private static MySLL middleNode(MySLL head) {
    if(head == null || head.next == null){
        return head;
    }
    MySLL slow = head;
    MySLL fast = head;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}
```

---
## Searching for a Value
**_Method: `searchList`_**

*Searches for a node by value and prints its position (if found).*

```java
public static void searchList(MySLL head, int val) {
    if(head == null){
        System.out.println("Empty List!");
    }
    int pos = 0;
    MySLL temp = head;
    while(temp != null){
        pos++;
        if(temp.data == val){
            System.out.println("Node " + val + " Found at Position " + pos);
            return;
        }
        temp = temp.next;
    }
    System.out.println("Node With Value " + val + " Not Found");
}
```

---

## Finding Maximum and Minimum
**_Method: `lgInList`_**

*Finds and prints the largest and smallest values in the list.*

```java
public static void lgInList(MySLL head) {
    if(head == null){
        System.out.println("Max and Min Not Found Empty List!");
        return;
    }
    int maxi = Integer.MIN_VALUE;
    int mini = Integer.MAX_VALUE;
    MySLL temp = head;
    while(temp != null){
        maxi = Math.max(maxi, temp.data);
        mini = Math.min(temp.data, mini);
        temp = temp.next;
    }
    System.out.println("Max Value " + maxi + " | " + "Min Value " + mini);
}
```

---

## Finding the n-th Element
**_Method: `nThElement`_**

*Prints the value of the n-th node in the list.*

```java
public static void nThElement(MySLL head, Scanner sc) {
    if(head == null){
        System.out.println("List is Empty");
        return;
    }
    System.out.println("Enter the Nth Position");
    int nThPos = sc.nextInt();
    if(nThPos > MySLL.listSize(head)){
        System.out.println("Unable To Fetch the Position,Out of List Bounds");
    }
    int cnt = 0;
    MySLL temp = head;
    while(temp != null){
        cnt++;
        if(cnt == nThPos){
            System.out.println("Element At Position " + nThPos + " is " + temp.data);
            return;
        }
        temp = temp.next;
    }
}
```

---

## Finding All Occurrences
**_Method: `allOccs`_**

*Finds and prints all positions where a given value appears in the list.*

```java
public static void allOccs(MySLL head, int val) {
    if(head == null){
        System.out.println("Empty List!");
    }
    List<Integer> allOcc = new LinkedList<>();
    int pos = 0;
    MySLL temp = head;
    while(temp != null){
        pos++;
        if(temp.data == val){
            allOcc.add(pos);
        }
        temp = temp.next;
    }
    if(!allOcc.isEmpty()){
        System.out.println("Found Value " + val + " at");
        for(int i = 0; i < allOcc.size(); i++){
            if(i != allOcc.size() - 1){
                System.out.print("Position " + allOcc.get(i) + " | ");
            }
            else{
                System.out.println("Position " + allOcc.get(i));
            }
        }
    }
    else{
        System.out.println("Element Not Found!");
    }
}
```
---
## Calculating Sum and Product
**_Method: `sumPro`_**

*Calculates and prints the sum and product of all node values.*

```java
public static void sumPro(MySLL head) {
    if(head == null){
        System.out.println("Empty List!");
        return;
    }
    MySLL temp = head;
    long sum = 0;
    long prod = 1;
    while(temp != null){
        sum += temp.data;
        prod *= temp.data;
        temp = temp.next;
    }
    System.out.println("Sum " + sum + " | Product " + prod);
}
```

---
## Updating Value at Position
**_Method: `updateValue`_**

*Updates the value of a node at a given position.*

```java
public static void updateValue(MySLL head, Scanner sc) {
    if(head == null){
        System.out.println("List is Empty!");
        return;
    }
    System.out.println("Enter the Position");
    int updPos = sc.nextInt();
    if(updPos > MySLL.listSize(head)){
        System.out.println("Unable To Fetch the Position,MayBe Out of List Bounds!");
    }
    else{
        System.out.println("Enter the New Value to be Updated");
        int updVal = sc.nextInt();
        MySLL temp = head;
        int pos = 0;
        while(temp != null){
            pos++;
            if(pos == updPos){
                temp.data = updVal;
                System.out.println("Value of Node at Position " + updPos + " Changed to " + updVal);
                return;
            }
            temp = temp.next;
        }
    }
}
```

---
## Sorting the List
**_Method: `sortList`_**

*Sorts the linked list using merge sort and returns the new head.*

```java
public static MySLL sortList(MySLL head) {
    if(head == null || head.next == null){
        return head;
    }
    MySLL nodeBeforeMiddle = nodeBeforeMiddle(head);
    MySLL leftHead = head;
    MySLL rightHead = nodeBeforeMiddle.next;
    nodeBeforeMiddle.next = null;
    leftHead = sortList(leftHead);
    rightHead = sortList(rightHead);
    return mergeTwoLists(leftHead, rightHead);
}
```

---