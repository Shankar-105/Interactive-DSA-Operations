# MyQueue.java — Algorithms (Menu Order)

---

## Enqueue — Add element to the back
**_Method: `push`_**

Algorithm:
1. Create a new node with the value.
2. If the queue is empty (back == null): set both front and back to the new node.
3. Otherwise: set back.next to the new node and update back to point to the new node.
4. Increment length and return the front pointer.

Time Complexity: O(1)  
Space Complexity: O(1)

Important note: Always update both front and back consistently; when queue transitions from empty to non-empty, both must point to the same node.

---

## Dequeue — Remove element from the front
**_Method: `pop`_**

Algorithm:
1. If the queue is empty: print a message and return null.
2. If the queue has one node (front == back): set front and back to null, set length to 0, and return null.
3. Otherwise: set front = front.next and decrement length.
4. Return the updated front pointer.

Time Complexity: O(1)  
Space Complexity: O(1)

Important note: When removing the last element, make sure to clear both front and back to maintain the empty state.

---

## Is Empty
**_Method: `isQEmpty`_**

Algorithm:
1. Return true when length == 0, otherwise return false.

Time Complexity: O(1)  
Space Complexity: O(1)

---

## Size
**_Method: `sizeofQ`_**

Algorithm:
1. Return the maintained length counter.

Time Complexity: O(1)  
Space Complexity: O(1)

---

## Peek (Front)
**_Method: `peekOfQ`_**

Algorithm:
1. If empty, return 0 (or an agreed indicator).
2. Otherwise return front.value.

Time Complexity: O(1)  
Space Complexity: O(1)

---

## Last (Back)
**_Method: `lastOfQ`_**

Algorithm:
1. If empty, return 0 (or an agreed indicator).
2. Otherwise return back.value.

Time Complexity: O(1)  
Space Complexity: O(1)

---

## Display Queue
**_Method: `printQueue`_**

Algorithm:
1. Start from head (front).
2. Traverse node by node, printing node.value until null.
3. End.

Time Complexity: O(n)  
Space Complexity: O(1)

---