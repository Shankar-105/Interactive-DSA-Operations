# MyStack.java — Algorithms (Menu Order)

---

## Push — Add element to the top
**_Method: `addNode`_**

Algorithm:
1. Create a new node with the value.
2. If the stack is empty (top == null): set top to new node.
3. Otherwise: set newNode.next = top and update top = newNode.
4. Increment size and return updated top.

Time Complexity: O(1)  
Space Complexity: O(1)

Important note: The top pointer always points to the most recently added node (LIFO).

---

## Pop — Remove element from the top
**_Method: `removeNode`_**

Algorithm:
1. If stack is empty: print a message and return (top remains null).
2. Otherwise: set top = top.next and decrement size.
3. Return the updated top.

Time Complexity: O(1)  
Space Complexity: O(1)

Important note: After popping, top must point to the next node down the stack (or null if empty).

---

## Is Empty
**_Method: `isEmpty`_**

Algorithm:
1. Return true when size == 0, otherwise false.

Time Complexity: O(1)  
Space Complexity: O(1)

---

## Size
**_Method: `sizeof`_**

Algorithm:
1. Return the size counter.

Time Complexity: O(1)  
Space Complexity: O(1)

---

## Peek (Top)
**_Method: `stackTop`_**

Algorithm:
1. If stack is empty, return 0 (or an agreed indicator).
2. Otherwise return top.value.

Time Complexity: O(1)  
Space Complexity: O(1)

---

## Display Stack
**_Method: `printStack`_**

Algorithm:
1. Start from head = top.
2. Traverse down next pointers, printing each node to show top→bottom order.
3. End at null.

Time Complexity: O(n)  
Space Complexity: O(1)

---