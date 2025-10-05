# MyDLL.java — Algorithms (Menu Order)

---

## Creation

### Creating a Doubly Linked List  
**_Method: `inputNodes`_**

**Algorithm:**
1. Start with an empty list (`head` is `null`).
2. Continuously read integer values from the user.
3. For each value:
    - If the value is `-1`, stop input.
    - Otherwise, add the value to the end of the list using `createDLL`.
4. Return the head of the constructed list.

**Time Complexity:** O(n)  
**Space Complexity:** O(1) (excluding input)

---

## Insertion

### Insert at the Beginning  
**_Method: `insertAtHead`_**

**Algorithm:**
1. Create a new node with the given value.
2. Set its `next` to current head and `prev` to null.
3. If head is not null, set head's `prev` to the new node.
4. Return the new node as the new head.

**Time Complexity:** O(1)  
**Space Complexity:** O(1)

---

### Insert at the End  
**_Method: `insertAtTail`_**

**Algorithm:**
1. Create a new node with the value.
2. If the list is empty, return the new node as head.
3. Traverse to the last node.
4. Set last node's `next` to new node and new node's `prev` to last node.
5. Return head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Insert at the Kth Position  
**_Method: `insertAtK`_**

**Algorithm:**
1. If k is 1 and the list is empty, create and return new node as head.
2. If k is 1, insert at head (see above).
3. Otherwise, traverse to (k-1)th position.
4. Insert the new node maintaining both `next` and `prev` pointers.
5. Return head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Deletion

### Delete First Node  
**_Method: `deleteHead`_**

**Algorithm:**
1. If the list is empty or has one node, return null.
2. Move head to next node.
3. Set new head's `prev` to null.
4. Return new head.

**Time Complexity:** O(1)  
**Space Complexity:** O(1)

---

### Delete Last Node  
**_Method: `deleteTail`_**

**Algorithm:**
1. If the list is empty or has one node, return null.
2. Traverse to last node.
3. Set previous node's `next` to null.
4. Remove last node's `prev` pointer.
5. Return head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Delete at Kth Position  
**_Method: `deleteAtK`_**

**Algorithm:**
1. If list is empty, return null.
2. Traverse to kth node.
3. Adjust previous and next node pointers to skip kth node.
4. If kth node is head or tail, use deleteHead or deleteTail.
5. Return head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Delete by Value  
**_Method: `deleteNodeK`_**

**Algorithm:**
1. If the list is empty, return null.
2. If only one node and its value matches, return null.
3. Traverse to first node with matching value.
4. Adjust previous and next pointers to remove node.
5. If node is at head or tail, handle accordingly.
6. Return head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Friendly Operations

### Search for Value  
**_Method: `searchList`_**

**Algorithm:**
1. Traverse the list from head.
2. For each node, increment position.
3. If node's value matches, print position and return.
4. If not found, print "Not Found".

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Find Max/Min  
**_Method: `lgInList`_**

**Algorithm:**
1. Initialize max to smallest integer, min to largest integer.
2. Traverse the list, update max and min as needed.
3. Print max and min.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Sum/Product  
**_Method: `sumPro`_**

**Algorithm:**
1. Initialize sum as 0, product as 1.
2. Traverse the list, adding and multiplying node values.
3. Print sum and product.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Update Value at Position  
**_Method: `updateValue`_**

**Algorithm:**
1. Ask user for position.
2. Traverse to that position.
3. Ask for new value.
4. Update node's value.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Shuffle List  
**_Method: `shuffleList`_**

**Algorithm:**
1. If list is empty or one node, return as is.
2. Store all nodes in an array/list.
3. Shuffle the list randomly.
4. Re-link nodes' `next` and `prev` pointers based on new order.
5. Set `next` of last node to null and `prev` of first node to null.
6. Return new head.

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

---

### Show Previous/Next Node  
**_Method: `prevNxtNodes`_**

**Algorithm:**
1. Ask user for value to search.
2. Traverse to node with that value.
3. Print previous node's value (if exists), current node value, next node's value (if exists).
4. If not found, print "Node Not Found".

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Positional Operations

### Delete Middle Node  
**_Method: `deleteMiddleNode`_**

**Algorithm:**
1. If list is empty or one node, return null.
2. Use two pointers: slow (moves one), fast (moves two).
3. When fast reaches end, slow is at middle.
4. Set previous node's `next` to slow's `next` and next node's `prev` to slow's `prev`.
5. Remove slow's pointers.
6. Return head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Get Nth Element  
**_Method: `nThElement`_**

**Algorithm:**
1. Ask user for n.
2. Traverse list, counting nodes.
3. When at nth node, print its value.
4. If n is out of bounds, print error.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Find All Occurrences of a Value  
**_Method: `allOccs`_**

**Algorithm:**
1. Traverse list, maintaining position.
2. For each node, if value matches, record position.
3. Print all positions found, or "Not Found".

**Time Complexity:** O(n)  
**Space Complexity:** O(1) (O(n) if storing all positions)

---

## Advanced

### Reverse List  
**_Method: `reverseLinkedList`_**

**Algorithm:**
1. Initialize pointers: temp (current), prevNode (previous), afterNode (next).
2. For each node:
    - Swap `next` and `prev`.
    - Move to next node using the original `next`.
3. At the end, return the new head (last node processed).

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Sort List  
**_Method: `sortList`_**

**Algorithm:**
1. If empty or one node, return head.
2. Use `nodeBeforeMiddle` to split list in two halves.
3. Recursively sort both halves.
4. Merge sorted halves using `mergeTwoLists`.
5. Return merged head.

**Time Complexity:** O(n log n)  
**Space Complexity:** O(log n) (due to recursion stack)

---

### Rotate Right (Clockwise) by K  
**_Method: `rotateClockwise`_**

**Algorithm:**
1. If list is empty, one node, or k=0, return head.
2. Get size, compute k modulo size.
3. Find new tail at (size-k)th position.
4. Break list at new tail, set new head.
5. Link old tail to old head and update pointers.
6. Return new head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Rotate Left (Anti-Clockwise) by K  
**_Method: `rotateAntiClockwise`_**

**Algorithm:**
1. If list is empty, one node, or k=0, return head.
2. Get size, compute k modulo size.
3. Find new tail at kth position.
4. Break list at new tail, set new head.
5. Link old tail to old head and update pointers.
6. Return new head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Split at Value K  
**_Method: `splitListDLL`_**

**Algorithm:**
1. Ask user for value k.
2. Traverse list to node with value k.
3. If not found, return head.
4. Show both halves for preview.
5. Ask user which half to keep (first, second, or random).
6. Break and return chosen half, adjusting `prev` pointers as needed.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Animated Traversals (Preview)

### Forward Traversal  
**_Method: `animatedForwardTraversal`_**

**Algorithm:**
1. Traverse from head, print each node in "[data] <->" format.
2. At the end, print "[NULL]".

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Backward Traversal  
**_Method: `animatedBackwardTraversal`_**

**Algorithm:**
1. Traverse to tail.
2. From tail, print each node in "[data] <->" format using `prev`.
3. At the end, print "[NULL]".

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Zig-Zag Traversal  
**_Method: `zigZagDisplay`_**

**Algorithm:**
1. Use two pointers: one from head, one from tail.
2. Alternate printing values from head and tail, moving pointers inward.
3. Stop when both pointers meet.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Split Traversal (Preview)  
**_Method: `previewSplit`_**

**Algorithm:**
1. Ask user for split position.
2. Traverse to that position.
3. Print nodes before and after split separately.
4. List remains unchanged.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Show Previous/Next Node  
**_Method: `prevNxtNodes`_**

**Algorithm:**
1. Ask user for value.
2. Traverse to node with that value.
3. Print previous, current, and next node values.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Others

### Display List  
**_Method: `printDLL`_**

**Algorithm:**
1. Traverse from head, print each node.
2. At the end, print "[NULL]".
3. Print list summary.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### List Summary  
**_Method: `listSummary`_**

**Algorithm:**
1. Count nodes and find middle node.
2. Print length, middle node value, and if list is empty.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---