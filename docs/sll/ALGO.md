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
