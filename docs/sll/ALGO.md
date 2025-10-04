# MySLL.java Algorithms

---

## Building the List
**_Method: `inputNodeValues`_**

**Algorithm:**  
1. Continuously read integer input from the user until `-1` is entered.  
2. For each value, create a new node and add it to the linked list.  
3. Return the head of the list.

**Time Complexity:** O(n)  
**Space Complexity:** O(1) (excluding input list)

---
---

## Inserting at the Head
**_Method: `insertAtHead`_**

**Algorithm:**  
1. Create a new node with the given value.  
2. Set its next pointer to the current head.  
3. Return the new node as the new head.

**Time Complexity:** O(1)  
**Space Complexity:** O(1)

---

## Inserting at the Tail
**_Method: `insertAtTail`_**

**Algorithm:**  
1. Create a new node.  
2. If the list is empty, return new node as head.  
3. Otherwise, traverse to the end and append new node.  
4. Return the head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Inserting at a Given Position
**_Method: `insertAtK`_**

**Algorithm:**  
1. If the list is empty and k=1, return a new node as head.  
2. If k=1, insert node at head.  
3. Otherwise, traverse to (k-1)th node and insert the new node after it.  
4. Return the head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---
## Deleting the Head Node
**_Method: `deleteHead`_**

**Algorithm:**  
1. If the list is empty or has one node, return null.  
2. Otherwise, set head to head.next.  
3. Return new head.

**Time Complexity:** O(1)  
**Space Complexity:** O(1)

---

## Deleting the Tail Node
**_Method: `deleteTail`_**

**Algorithm:**  
1. If the list is empty or has one node, return null.  
2. Traverse to the second-last node.  
3. Set its next pointer to null.  
4. Return head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Deleting at a Given Position
**_Method: `deleteAtK`_**

**Algorithm:**  
1. If the list is empty, return.  
2. If k=1, call deleteHead.  
3. Otherwise, traverse to (k-1)th node and unlink the kth node.  
4. Return head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Deleting by Value
**_Method: `deleteNodeK`_**

**Algorithm:**  
1. If the list is empty, return null.  
2. If only one node and it matches value, return null.  
3. Otherwise, traverse and remove all nodes with the given value.  
4. Return head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---
## Rotating Clockwise
**_Method: `rotateClockwise`_**

**Algorithm:**  
1. If empty or k=0, return head.  
2. Find new tail at (size-k)th position.  
3. Break the list at new tail; link the end to the original head.  
4. Return new head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Rotating Anti-Clockwise
**_Method: `rotateAntiClockwise`_**

**Algorithm:**  
1. If empty or k=0, return head.  
2. Find new tail at kth position.  
3. Break list, link end to original head.  
4. Return new head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---