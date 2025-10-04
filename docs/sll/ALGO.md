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

## Adding a Node to the End
**_Method: `createLinkedList` (private)_**

**Algorithm:**  
1. Create a new node with the given value.  
2. If the head node is null, set the new node as the head.  
3. Otherwise, traverse to the end of the list and add the new node.  
4. Return the head of the list.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Displaying the List
**_Method: `printLinkedList`_**

**Algorithm:**  
1. Traverse the list from head to tail, printing each node's value.  
2. At the end, print "[NULL]" to denote the end.  
3. Call `listSummary` for a summary.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Listing the Summary
**_Method: `listSummary` (private)_**

**Algorithm:**  
1. Count the nodes in the list.  
2. Find the middle node.  
3. Print the length, middle node value, and whether the list is empty.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Locating the Middle Node
**_Method: `middleNode` (private)_**

**Algorithm:**  
1. Use two pointers, slow and fast.  
2. Move slow by one and fast by two nodes each step.  
3. When fast reaches the end, slow is at the middle.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Counting the Nodes
**_Method: `listSize` (protected)_**

**Algorithm:**  
1. Traverse the list from head, incrementing a counter for each node.  
2. Return the count.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Reversing the List
**_Method: `reverseLinkedList`_**

**Algorithm:**  
1. Initialize previous node as null.  
2. Traverse the list, for each node:  
   - Save next node.  
   - Reverse the next pointer.  
   - Move previous to current.  
   - Move to next node.  
3. Return previous node as new head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

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

## Deleting the Middle Node
**_Method: `deleteMiddleNode`_**

**Algorithm:**  
1. Use slow and fast pointers to find the middle node.  
2. Keep track of the node before the middle.  
3. Unlink the middle node.  
4. Return head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Searching for a Value
**_Method: `searchList`_**

**Algorithm:**  
1. Traverse the list, incrementing position.  
2. If a node's value matches, print its position.  
3. If not found, print not found.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Finding Maximum and Minimum
**_Method: `lgInList`_**

**Algorithm:**  
1. Traverse the list, keeping track of min and max values.  
2. Print min and max values.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Finding the n-th Element
**_Method: `nThElement`_**

**Algorithm:**  
1. Ask user for nth position.  
2. Traverse to nth node.  
3. Print its value.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Finding All Occurrences
**_Method: `allOccs`_**

**Algorithm:**  
1. Traverse the list, storing positions where node value matches.  
2. Print all such positions.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Calculating Sum and Product
**_Method: `sumPro`_**

**Algorithm:**  
1. Traverse the list, summing and multiplying all values.  
2. Print the sum and product.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Finding Node Before Middle
**_Method: `nodeBeforeMiddle`_**

**Algorithm:**  
1. Use slow and fast pointers; keep track of node before slow.  
2. When fast reaches the end, return node before middle.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Sorting the List
**_Method: `sortList`_**

**Algorithm:**  
1. If list is empty or has one node, return.  
2. Find node before middle to split list.  
3. Recursively sort both halves.  
4. Merge the two sorted lists.

**Time Complexity:** O(n log n)  
**Space Complexity:** O(log n) (stack)

---

## Updating Value at Position
**_Method: `updateValue`_**

**Algorithm:**  
1. Ask user for position and new value.  
2. Traverse to desired node and update its value.

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

## Shuffling the List
**_Method: `shuffleList`_**

**Algorithm:**  
1. Store all nodes in a list.  
2. Shuffle the list randomly.  
3. Re-link nodes in new order.  
4. Return new head.

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

---

## Animated Forward Traversal
**_Method: `animatedForwardTraversal`_**

**Algorithm:**  
1. Traverse from head, printing each node in a special format.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Preview Splitting the List
**_Method: `previewSplit`_**

**Algorithm:**  
1. Ask user for split position.  
2. Traverse to split point.  
3. Print first and second half separately, but do not modify list.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Splitting the List by Value
**_Method: `splitList`_**

**Algorithm:**  
1. Ask user for value to split at.  
2. Traverse to node with that value.  
3. Offer choice to keep first or second half.  
4. Break and return chosen half.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---