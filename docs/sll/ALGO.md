# MySLL.java — Algorithms (Menu Order)

---

## Creation

### Creating a List  
**_Method: `inputNodeValues`_**

**Algorithm:**
1. Start with an empty list (`head` is `null`).
2. Continuously read integer values from the user.
3. For each value:
    - If the value is `-1`, stop input.
    - Otherwise, add the value to the end of the linked list using `createLinkedList`.
4. Return the head of the constructed list.

**Time Complexity:** O(n)  
**Space Complexity:** O(1) (excluding input)

---

## Insertion

### Insert at the Beginning  
**_Method: `insertAtHead`_**

**Algorithm:**
1. Create a new node with the given value.
2. Set its next pointer to the current head.
3. Return the new node as the new head.

**Time Complexity:** O(1)  
**Space Complexity:** O(1)

---

### Insert at the End  
**_Method: `insertAtTail`_**

**Algorithm:**
1. Create a new node with the given value.
2. If the list is empty, return the new node as head.
3. Otherwise, traverse to the last node.
4. Set the last node's next pointer to the new node.
5. Return the head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Insert at the Kth Position  
**_Method: `insertAtK`_**

**Algorithm:**
1. If `k` is 1 and the list is empty, create a new node and return as head.
2. If `k` is 1, insert a new node at head.
3. Otherwise, traverse to the (k-1)th node.
4. Insert the new node after the (k-1)th node by updating pointers.
5. Return the head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Deletion

### Delete First Node  
**_Method: `deleteHead`_**

**Algorithm:**
1. If the list is empty or has a single node, return null.
2. Move head to the next node.
3. Return the new head.

**Time Complexity:** O(1)  
**Space Complexity:** O(1)

---

### Delete Last Node  
**_Method: `deleteTail`_**

**Algorithm:**
1. If the list is empty or has one node, return null.
2. Traverse to the second-last node.
3. Set its next pointer to null (removes last node).
4. Return head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Delete at Kth Position  
**_Method: `deleteAtK`_**

**Algorithm:**
1. If list is empty, return.
2. If `k` is 1, delete the head.
3. Traverse to the (k-1)th node.
4. Set its next pointer to skip the kth node.
5. Return head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Delete by Value  
**_Method: `deleteNodeK`_**

**Algorithm:**
1. If the list is empty, return null.
2. If only one node and its value matches, return null.
3. Traverse the list, for each node check if the next node's value matches the target:
    - If yes, link current node's next to next's next (skipping the matched node).
4. Continue traversal to remove all occurrences.
5. Return head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Friendly Operations

### Search for Value  
**_Method: `searchList`_**

**Algorithm:**
1. Start from head, initialize position to 0.
2. For each node:
    - Increment position.
    - If node's value matches, print position and return.
3. If end reached with no match, print "Not Found".

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Find Max/Min  
**_Method: `lgInList`_**

**Algorithm:**
1. Initialize max to smallest integer, min to largest integer.
2. Traverse the list:
    - For each node, update max and min if necessary.
3. Print max and min values.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Sum/Product  
**_Method: `sumPro`_**

**Algorithm:**
1. Initialize sum as 0, product as 1.
2. Traverse the list:
    - Add each value to sum, multiply into product.
3. Print sum and product.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Update Value at Index  
**_Method: `updateValue`_**

**Algorithm:**
1. Ask user for the position to update.
2. Traverse to that position.
3. Ask for the new value.
4. Update the node's value.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Shuffle List  
**_Method: `shuffleList`_**

**Algorithm (detailed for clarity):**
1. If the list is empty or has one node, return as is.
2. Traverse the list and store all nodes in an array/list.
3. Shuffle the array/list randomly (Fisher-Yates Shuffle).
4. Re-link the nodes by setting each node's `next` to the next in shuffled order.
5. Set the last node's `next` to null.
6. Return the new head (first node in shuffled list).

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

---

## Positional Operations

### Delete Middle Node  
**_Method: `deleteMiddleNode`_**

**Algorithm (detailed):**
1. If list is empty or has one node, return null.
2. Use two pointers: slow (moves one step), fast (moves two steps).
3. Track a pointer to the node before slow.
4. When fast pointer reaches end, slow is at middle.
5. Unlink the middle node by setting previous node's next to slow's next.
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
1. Traverse list, maintaining a position counter.
2. For each node, if value matches, record the position.
3. After traversal, print all positions found, or print "Not Found".

**Time Complexity:** O(n)  
**Space Complexity:** O(1) (O(n) if storing all positions)

---

## Advanced

### Reverse List  
**_Method: `reverseLinkedList`_**

**Algorithm (detailed):**
1. Initialize previous node as null, current node as head.
2. While current node is not null:
    - Save next node.
    - Point current's next to previous.
    - Move previous to current.
    - Move current to next node.
3. After loop, previous points to new head. Return it.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Sort List  
**_Method: `sortList`_**

**Algorithm (detailed merge sort):**
1. If list is empty or has one node, return head.
2. Use `nodeBeforeMiddle` to find middle and split list in two halves.
3. Recursively sort both halves.
4. Merge two sorted halves using `mergeTwoLists`.
5. Return merged head.

**Time Complexity:** O(n log n)  
**Space Complexity:** O(log n) (due to recursion stack)

---

### Rotate Right (Clockwise) by K  
**_Method: `rotateClockwise`_**

**Algorithm (detailed):**
1. If list is empty, one node, or k=0, return head.
2. Get the length of the list.
3. Compute k modulo length.
4. Find new tail at (length-k)th node.
5. Set new head as the next node of new tail.
6. Break the list at new tail.
7. Traverse to end of new list and link it to old head.
8. Return new head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Rotate Left (Anti-Clockwise) by K  
**_Method: `rotateAntiClockwise`_**

**Algorithm (detailed):**
1. If list is empty, one node, or k=0, return head.
2. Get the length of the list.
3. Compute k modulo length.
4. Find new tail at kth node.
5. Set new head as next node of new tail.
6. Break the list at new tail.
7. Traverse to end and link to old head.
8. Return new head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Split at Value K  
**_Method: `splitList`_**

**Algorithm (detailed):**
1. Ask user for value k.
2. Traverse list to find node with value k.
3. If not found, return head.
4. Print both halves for user to preview.
5. Ask user to choose which half to return (first, second, or random).
6. If first half, break list at k and return head.
7. If second half, break at k and return node after k.
8. If random, randomly choose between first and second half.

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

### Split Traversal (Preview)  
**_Method: `previewSplit`_**

**Algorithm:**
1. Ask user for split position.
2. Traverse to that position.
3. Print all nodes up to split position as first half.
4. Print remaining nodes as second half.
5. List remains unchanged.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Others

### Display List  
**_Methods: `printLinkedList`, `listSummary`_**

**Algorithm for `printLinkedList`:**
1. Traverse from head, print each node.
2. At end, print "[NULL]".
3. Print list summary.

**Algorithm for `listSummary`:**
1. Count nodes and find middle node.
2. Print length, middle node value, and if list is empty.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---