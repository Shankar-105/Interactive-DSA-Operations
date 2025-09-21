import java.util.*;
public class Main{
    public static void handleLinkedLists(Scanner sc){
        System.out.println("Select Any List");
        System.out.println("1. Singly Linked List");
        System.out.println("2. Doubly Linked List");
        System.out.println("3. Back to Main Menu");
        int choice =sc.nextInt();
        switch(choice){
            case 1:
            handleSLL(sc);
            break;
            case 2:
            handleDLL(sc);
            break;
            case 3:
            return;
            default:
            System.out.println("Range of Input Integer's Provided For Operation is [1-3]");
        }
    }
    private static void handleSLL(Scanner sc){
            MySLL head=null;
            System.out.println("Welcome to Linked List Operations");
            System.out.println("1.  Create a Singly Linked List");
            System.out.println("2.  Insertion Operations");
            System.out.println("3.  Deletion Operations");
            System.out.println("4.  Freindly Operations");
            System.out.println("5.  Positional Operations");
            System.out.println("6.  Advanced Operations");
            System.out.println("7.  Animated Traversals");
            System.out.println("10. Display the Singly Linked List");
            System.out.println("11. Reset The List");
            System.out.println("12. Back to Main Menu");
            while(true){
            System.out.println("Choose an Option From the List Menu");
            int op = sc.nextInt();
            switch(op){
            case 1:
            System.out.println("Enter the values of each Node in the Linked List(Enter -1 to Stop)");
            head=null;
            head=MySLL.inputNodeValues(sc,head);
            System.out.println("Singly Linked List Created");
            break;
            case 2:
            System.out.println("1. Insert at the Beginning");
            System.out.println("2. Insert at the End");
            System.out.println("3. Insert At the Kth Position From the Begininng");
            System.out.println("4. Back to List Menu");
            System.out.println("Choose an Option From the List's Insertion Menu");
            int insOp=sc.nextInt();
            switch(insOp){
            case 1:
            System.out.println("Enter the Value to be Inserted at the Beginning");
            int valSt=sc.nextInt();
            head=MySLL.insertAtHead(head,valSt);
            System.out.println("Successfully pushed at the Beginning:)");
            break;
            case 2:
            System.out.println("Enter the Value to be Inserted at the end");
            int valEnd=sc.nextInt();
            head=MySLL.insertAtTail(head,valEnd);
            System.out.println("Successfully appended:)");
            break;
            case 3:
            System.out.println("Enter the position K");
            int posK=sc.nextInt();
            System.err.println("Enter the Value");
            int valK=sc.nextInt();
            head=MySLL.insertAtK(head,posK,valK);
            System.out.println("Pushed in Between Nodes "+(posK-1)+" and "+(posK));
            System.out.println("Wanna look at the List(Click 10)");
            break;
            case 4:
            break;
            default:
            System.out.println("Choice Out of Insertion Menu Range [1-4]");
            }
            break;
            case 3:
            System.out.println("1.  Delete the First Node(Element)");
            System.out.println("2.  Delete the Last Node(Element)");
            System.out.println("3.  Delete the Node(Element) at Kth Position From the Begininng");
            System.out.println("4.  Delete the Node(Element) with the Value K");
            System.out.println("5.  Back to List Menu");
            System.out.println("Choose an Option From the List's Deletion Menu");
            int delOp=sc.nextInt();
            switch(delOp){
            case 1:
            head=MySLL.deleteHead(head);
            System.out.println("Deleted The Head.\nWanna See the Change(Click 10)");
            break;
            case 2:
            head=MySLL.deleteTail(head);
            System.out.println("Removed:)");
            break;
            case 3:
            System.out.println("Enter the position K");
            int delposK=sc.nextInt();
            head=MySLL.deleteAtK(head,delposK);
            System.out.println("The Node at position "+delposK+" is removed<<\nHave A Look at the List for Better Experiance.");
            break;
            case 4:
            System.out.println("Enter the Value of the Node to be deleted");
            int nodeVal=sc.nextInt();
            head=MySLL.deleteNodeK(head,nodeVal);
            System.out.println("Node With Value "+nodeVal+" is removed:)");
            break;
            case 5:
            break;
            default:
            System.out.println("Choice Out of Deletion Menu Range [1-5]");
            }
            break;
            case 4:
            System.out.println("1. Search for a Value in the List");
            System.out.println("2. Max and Min Values in the List");
            System.out.println("3. Sum and Product of the List");
            System.out.println("4. Update Value at an Index K");
            System.out.println("5. Shuffle the Nodes in the List");
            System.out.println("6. Back to List Menu");
            System.out.println("Choose an Option From the List's Freindly Menu");
            int freindlyOp=sc.nextInt();
            switch(freindlyOp){
                case 1:
                System.out.println("Enter the Value to Search for");
                int seaVal=sc.nextInt();
                MySLL.searchList(head, seaVal);
                break;
                case 2:
                MySLL.lgInList(head);
                break;
                case 3:
                MySLL.sumPro(head);
                break;
                case 4:
                MySLL.updateValue(head,sc);
                break;
                case 5:
                head=MySLL.shuffleList(head);
                break;
                case 6:
                break;
                default:
                System.out.println("Choice Out of Menu Range [1-6]"); 
              }
            break;
            case 5:
            System.out.println("1. Delete Middle Node in the List");
            System.out.println("2. Get the Nth Element in the List");
            System.out.println("3. All the Occurences of an Element in the List");
            System.out.println("4. Back to List Menu");
            System.out.println("Choose an Option From the List's Positional Menu");
            int posOps=sc.nextInt();
            switch(posOps){
                case 1:
                head=MySLL.deleteMiddleNode(head);
                System.out.println("Middle Node Deleted");
                break;
                case 2:
                MySLL.nThElement(head, sc);
                break;
                case 3:
                System.out.println("Enter a Value");
                int val=sc.nextInt();
                MySLL.allOccs(head,val);
                break;
                case 4:
                break;
                default:
                System.out.println("Choice Out of Menu Range [1-4]");
            }
            break;
            case 6:
            System.out.println("1. Reverse the List");
            System.out.println("2. Sort the List");
            System.out.println("3. Rotations on List");
            System.out.println("4. Split the List At a Value K");
            System.out.println("5. Back to List Menu");
            System.out.println("Choose an Option From the List's Advanced Menu");
            int advOp=sc.nextInt();
            switch(advOp){
                case 1:
                head=MySLL.reverseLinkedList(head);
                System.out.println("Oops You Just Performed the Reverse Operation...The List gets Changed Entirely have a look at it...");
                break;
                case 2:
                head=MySLL.sortList(head);
                System.out.println("List Sorted!");
                break;
                case 3:
                System.out.println("1. Rotate Right by K places (Clockwise Roatation)");
                System.out.println("2. Rotate Left by K places (Anti-ClockWise Roatation)");
                System.out.println("3. Back to List Menu");
                int roatateOp=sc.nextInt();
                switch(roatateOp){
                    case 1:
                    System.out.println("Enter number of ClockWise Roatations K");
                    int rotateRightByK=sc.nextInt();
                    head=MySLL.rotateClockwise(head, rotateRightByK);
                    System.out.println("Right Rotation Done!");
                    break;
                    case 2:
                    System.out.println("Enter number of Counter ClockWise Roatations K");
                    int rotateLeftByK=sc.nextInt();
                    head=MySLL.rotateClockwise(head, rotateLeftByK);
                    System.out.println("Left Rotation Done!");
                    break;
                    case 3:
                    break;
                    default:
                    System.out.println("Choice Out of Range [1-3]");
                }
                break;
                case 4:
                head=MySLL.splitList(sc, head);
                break;
                case 5:
                break;
                default:
                System.out.println("Choice Out of Menu Range [1-4]");
                System.out.println("Backing to List Menu");
            }
           break;
           case 7:
            System.out.println("1. Forward Animated Traversal");
            System.out.println("2. Animated Split Traversal");
            System.out.println("3. Back to List Menu");
            System.out.println("Select any of the Above");
            int traOp=sc.nextInt();
            switch(traOp){
                case 1:
                MySLL.animatedForwardTraversal(head);
                //animation cmg soon
                break;
                case 2:
                MySLL.previewSplit(sc,head);
                //animation cmg soon
                //split
                break;
                case 3:
                break;
                default:
                System.out.println("Range of Input Integer's Provided For Operation is [1-3]");
            }
            break;
           case 10:
            MySLL.printLinkedList(head);
            break;
            case 11:
            head=null;
            System.out.println("Reset Done!");
            break;
            case 12:
            return;
            default:
           System.out.println("Choice Out of Menu Range [1-12]");
           }
        }
        }
        private static void handleDLL(Scanner sc){
            MyDLL head=null;
            System.out.println("Welcome to Doubly Linked List Operations");
            System.out.println("1.  Create a Linked List");
            System.out.println("2.  Insertion Operations");
            System.out.println("3.  Deletion Operations");
            System.out.println("4.  Freindly Operations");
            System.out.println("5.  Positional Operations");
            System.out.println("6.  Advanced Operations");
            System.out.println("7.  Animated Traversals");
            System.out.println("10. Display the Linked List");
            System.out.println("11. Reset The List");
            System.out.println("12. Back to Main Menu");
            while (true) {
            System.out.println("Choose an Option From the DLL's Menu");
            int opt=sc.nextInt();
            switch(opt){
            case 1:
            System.out.println("Enter the values of each Node in the Linked List(Enter -1 to Stop)");
            head=null;
            head=MyDLL.inputNodes(sc,head);
            System.out.println("Doubly Linked List Created");
            break;
            case 2:
            System.out.println("1. Insert at the Beginning");
            System.out.println("2. Insert at the End");
            System.out.println("3. Insert At the Kth Position From the Begininng");
            System.out.println("4. Back to DLL Menu");
            System.out.println("Choose an Option From the DLL's Insertion Menu");
            int insOp=sc.nextInt();
            switch(insOp){
            case 1:
            System.out.println("Enter the Value to be Inserted at the beginning");
            int stVal=sc.nextInt();
            head=MyDLL.insertAtHead(head,stVal);
            System.out.println("Successfully pushed at the Beginning:)");
            break;
            case 2:
            System.out.println("Enter the Value to be Inserted at the end");
            int endVal=sc.nextInt();
            head=MyDLL.insertAtTail(head,endVal);
            System.out.println("Successfully appended:)");
            break;
            case 3:
            System.out.println("Enter the position K");
            int posK=sc.nextInt();
            System.err.println("Enter the Value");
            int valK=sc.nextInt();
            head=MyDLL.insertAtK(head,posK,valK);
            System.out.println("Pushed in Between Position's "+(posK-1)+" and "+(posK));
            System.out.println("Wanna look at the List(Click 9)");
            break;
            case 4:
            break;
            default:
            System.out.println("Range of Input Integer's Provided For Operation is [1-4]");
            }
            break;
            case 3:
            System.out.println("1.  Delete the First Node(Element)");
            System.out.println("2.  Delete the Last Node(Element)");
            System.out.println("3.  Delete the Node(Element) at Kth Position From the Begininng");
            System.out.println("4.  Delete the Node(Element) with the Value K From the Begininng");
            System.out.println("5.  Back to DLL menu");
            System.out.println("Choose an Option From the DLL's Deletion Menu");
            int delOp=sc.nextInt();
            switch(delOp){
            case 1:
            head=MyDLL.deleteHead(head);
            System.out.println("Deleted The Head.\nWanna See the Change(Click 9)");
            break;
            case 2:
            head=MyDLL.deleteTail(head);
            System.out.println("Removed:)");
            break;
            case 3:
            System.out.println("Enter the position K");
            int delposK=sc.nextInt();
            head=MyDLL.deleteAtK(head,delposK);
            System.out.println("The Node at position "+delposK+" is removed<<\nHave A Look at the List for Better Experiance.");
            break;
            case 4:
            System.out.println("Enter the Value of the Node to be deleted");
            int nodeVal=sc.nextInt();
            head=MyDLL.deleteNodeK(head,nodeVal);
            System.out.println("Node With Value "+nodeVal+" is removed:)");
            break;
            case 5:
            break;
            default:
            System.out.println("Range of Input Integer's Provided For Operation is [1-5]");
            }
            break;
            case 4:
            System.out.println("1. Search for a Value in the List");
            System.out.println("2. Max and Min Values in the List");
            System.out.println("3. Sum of All the Elements in the List");
            System.out.println("4. Update Node Value at Nth Position");
            System.out.println("5. Shuffle the List");
            System.out.println("6. Move to Next/Previous Node");
            System.out.println("7. Back to DLL Menu");
            System.out.println("Choose an Option From the DLL's Freindly Menu");
            int freindlyOps=sc.nextInt();
            switch(freindlyOps){
                case 1:
                System.out.println("Enter the Value to Search for");
                int seaVal=sc.nextInt();
                MyDLL.searchList(head, seaVal);
                break;
                case 2:
                MyDLL.lgInList(head);
                break;
                case 3:
                MyDLL.sumPro(head);
                break;
                case 4:
                MyDLL.updateValue(head, sc);
                break;
                case 5:
                head=MyDLL.shuffleList(head);
                break;
                case 6:
                MyDLL.prevNxtNodes(head,sc);
                break;
                case 7:
                break;
                default:
                System.out.println("Range of Input Integer's Provided For Operation is [1-4]");
            }
            break;
            case 5:
            System.out.println("1. Delete Middle Node in the List");
            System.out.println("2. Get the Nth Element in the List");
            System.out.println("3. All the Positions where an Element is Present in the List");
            System.out.println("4. Back to DLL Menu");
            System.out.println("Choose an Option From the DLL's Positional Menu");
            int posOps=sc.nextInt();
            switch(posOps){
                case 1:
                MyDLL.deleteMiddleNode(head);
                System.out.println("Middle Node Deleted");
                break;
                case 2:
                MyDLL.nThElement(head, sc);
                case 3:
                System.out.println("Enter a Value");
                int val=sc.nextInt();
                MyDLL.allOccs(head,val);
                break;
                case 4:
                break;
                default:
                System.out.println("Range of Input Integer's Provided For Operation is [1-4]");
            }
            break;
            case 6:
            System.out.println("1. Reverse the List");
            System.out.println("2. Sort the List");
            System.out.println("3. Rotations");
            System.out.println("4. Split the List At a Value");
            System.out.println("5. Back to DLL Menu");
            System.out.println("Choose an Option From the DLL's Advanced Menu");
            int advOp=sc.nextInt();
            switch(advOp){
                case 1:
                head=MyDLL.reverseLinkedList(head);
                System.out.println("Oops You Just Performed the Reverse Operation...The List gets Changed Entirely have a look at it...");
                break;
                case 2:
                head=MyDLL.sortList(head);
                System.out.println("List Sorted!");
                break;
                case 3:
                System.out.println("1. Rotate Right by K places (Clockwise Roatation)");
                System.out.println("2. Rotate Left by K places (Anti-ClockWise Roatation)");
                int roatateOp=sc.nextInt();
                switch(roatateOp){
                    case 1:
                    System.out.println("Enter number of ClockWise Roatations K");
                    int rotateRightByK=sc.nextInt();
                    head=MyDLL.rotateClockwise(head, rotateRightByK);
                    System.out.println("Right Rotation Done!");
                    break;
                    case 2:
                    System.out.println("Enter number of Counter ClockWise Roatations K");
                    int rotateLeftByK=sc.nextInt();
                    head=MyDLL.rotateClockwise(head, rotateLeftByK);
                    System.out.println("Left Rotation Done!");
                    break;
                }
                break;
                case 4:
                head=MyDLL.splitListDLL(sc, head);
                // split the list
                break;
                case 5:
                break;
                default:
                System.out.println("Range of Input Integer's Provided For Operation is [1-3]");
            }
            break;
            case 7:
            System.out.println("1. Forward Animated Traversal(Coming Soon)");
            System.out.println("2. Backward Animated Traversal(Coming Soon)");
            System.out.println("3. Zig Zag Animated Travresal(Coming Soon)");
            System.out.println("4. Animated Split Traversal");
            System.out.println("5. Back to Main Menu");
            System.out.println("Select any of the Above");
            int traOp=sc.nextInt();
            switch(traOp){
                case 1:
                MyDLL.animatedForwardTraversal(head);
                //animation cmg soon
                break;
                case 2:
                MyDLL.animatedBackwardTraversal(head);
                //animation cmg soon
                break;
                case 3:
                MyDLL.zigZagDisplay(head);
                System.out.println();
                //animation cmg soon
                break;
                case 4:
                MyDLL.previewSplit(sc, head);
                //split
                //animation cmg soon
                break;
                case 5:
                break;
            }
            break;
            case 10:
            MyDLL.printDLL(head);
            break;
            case 11:
            head=null;
            System.out.println("Reset Done!");
            break;
            case 12:
            return;
            default:
            System.out.println("Range of Input Integer's Provided For Operation is [1-12]");
            }
        }
    }
      private static void handleStacks(Scanner sc){
            Node stackHead=null;
            System.out.println("Welcome to Stack Operations---");
            System.out.println("1. Push an Element into the Stack");
            System.out.println("2. Remove an element from the Stack");
            System.out.println("3. Check if the stack is Empty or Not");
            System.out.println("4. Size of the Stack");
            System.out.println("5. Peek Element of the Stack)");
            System.out.println("6. Print the Stack");
            System.out.println("7. Reset the Stack");
            System.out.println("8. Back to Main Menu");
        while(true){
            System.out.println("Choose an Option From the Stack's Menu");
            int op=sc.nextInt();
            switch(op){
                case 1:
                System.out.println("Enter the Value to be Pushed into the Stack");
                int val=sc.nextInt();
                stackHead=MyStack.addNode(val);
                System.out.println("Pushed it");
                break;
                case 2:
                stackHead=MyStack.removeNode();
                break;
                case 4:
                System.out.println("Current Stack Size "+MyStack.sizeof());
                break;
                case 3:
                if(MyStack.isEmpty()){
                    System.out.println("Oh the Stack is Empty Push Elements");
                }
                else{System.out.println("No The Stack's Not Empty there are "+MyStack.sizeof()+" Elements in the Stack");}
                break;
                case 5:
                if(MyStack.stackTop()==0){
                    System.out.println("The Stack's Empty So There's No Top!");
                }
                else{
                System.out.println("The Top Element in the Stack is "+MyStack.stackTop());
                }
                break;
                case 6:
                MyStack.printStack(stackHead);
                System.out.println("No Surprise As the Stack Follows LIFO");
                break;
                case 7:
                stackHead=null;
                case 8:
                return;
                default:
                System.out.println("Range of Input Integer's Provided For Operation is [1-8]");
           }
            }
        }
      private static void handleQueues(Scanner sc){
            Node queueFront=null;
            System.out.println("Welcome to Queue Operations---");
            System.out.println("1. Push an Element into the Queue");
            System.out.println("2. Remove an element from the Queue");
            System.out.println("3. Check if the Queue is Empty or Not");
            System.out.println("4. Size of the Queue");
            System.out.println("5. Peek Element of the Queue");
            System.out.println("6. Last Element of the Queue");
            System.out.println("7. Print the Queue");
            System.out.println("8. Reset the Queue");
            System.out.println("9. Back to Main Menu");
        while(true){
            System.out.println("Choose an Option From the Queue's Menu");
            int op=sc.nextInt();
            switch(op){
                case 1:
                System.out.println("Enter the Value to be Pushed into the Queue");
                int val=sc.nextInt();
                queueFront=MyQueue.push(val);
                System.out.println("Pushed it :)");
                break;
                case 2:
                if(!MyQueue.isQEmpty()){
                System.out.println("Removed ;)");
                queueFront=MyQueue.pop();
                }
                else{queueFront=MyQueue.pop();}
                break;
                case 4:
                System.out.println("Current Stack Size "+MyQueue.sizeofQ());
                break;
                case 3:
                if(MyQueue.isQEmpty()){
                    System.out.println("Oh the Queue is Empty Push Elements");
                }
                else{System.out.println("No The Queue's Not Empty there are "+MyQueue.sizeofQ()+" Elements in the Queue");}
                break;
                case 5:
                if(MyQueue.peekOfQ()==0){
                    System.out.println("The Queue's Empty So There's No Peek or Last!");
                }
                else{
                System.out.println("The Peek Element in the Queue is "+MyQueue.peekOfQ());
                }
                break;
                case 6:
                if(MyQueue.lastOfQ()==0){
                    System.out.println("The Queue's Empty So There's No Last or Peek!");
                }
                else{
                System.out.println("The Last Element in the Queue is "+MyQueue.lastOfQ());
                }
                break;
                case 7:
                MyQueue.printQueue(queueFront);
                System.out.println("Queue Follows FIFO");
                break;
                case 8:
                queueFront=null;
                break;
                case 9:
                return;
                default:
                System.out.println("Range of Input Integer's Provided For Operation is [1-9]");
            }
        }
      }
      private static void handleTrees(Scanner sc){
                System.out.println("1. Binary Trees");
                System.out.println("2. Binary Search Trees (BST's)");
                System.out.println("3. Self Balancing BST's");
                System.out.println("4. Back to Main Menu");
                System.out.print("Choose an Option From the Tree' Menu  ");
                int treeChoice=sc.nextInt();
                switch(treeChoice){
                case 1:
                handleBinaryTrees(sc);
                break;
                case 2:
                handleBinarySearchTrees(sc);
                break;
                case 3:
                break;
                case 4:
                return;
                default:
                System.out.println("Range of Input Integer's Provided For Operation is [1-4]");
                }
      }
      private static void handleBinaryTrees(Scanner sc){
            MyTree root=null;
            List<Integer> nodes=new ArrayList<>();
            System.out.println("Welcome to Binary Tree Operations");
            System.out.println("1.  Create a Binary Tree");
            System.out.println("2.  Traverse the Binary Tree(BFS/DFS)");
            System.out.println("3.  Three Special Binary Tree Traversals (Zig Zag / Vertical / Boundary )");
            System.out.println("4.  Insert a Node into the Tree");
            System.out.println("5.  Search in the Binary Tree");
            System.out.println("6.  Diameter Of the Binary Tree");
            System.out.println("7.  Lowest Common Ancestor of Any Two Children");
            System.out.println("8.  Root to Any Node Path");
            System.out.println("9.  4 Side View of the Binary Tree (Top / Right / Bottom / Left )");
            System.out.println("10.  Mirror image of the Binary Tree");
            System.out.println("11. Display Binary Tree Structure");
            System.out.println("12. Reset Binary Tree");
            System.out.println("13. Leaf Nodes of the Binary Tree");
            System.out.println("14. Back to Main Menu");
            while(true){
                System.out.println("Choose an Option From the Tree's Menu");
                int op=sc.nextInt();
            switch(op){
                case 1:
                System.out.println("Enter the nodes (-1) to stop");
                root=MyTree.inputNodeValues(root,nodes,sc);
                System.out.println("Tree SuccessFully Built :)");
                break;
                case 2:
                System.out.println("Choose the traversal you like");
                System.out.println("1. BFS(Level Wise)");
                System.out.println("2. DFS(Depth Wise)");
                System.out.println("3. Back to Tree's Menu");
                int choice =sc.nextInt();
                switch(choice){
                    case 1:
                    List<List<Integer>> bfs=MyTree.bfsTraversal(root);
                    System.out.println("BFS a Level Wise Traversal Technique");
                    MyTree.assistPLOTraversal(bfs);
                    MyTree.printLevelOrderTraversals(bfs);
                    System.out.println("Level Order Traversal Done:)");
                    break;
                    case 2:
                    List<Integer> dfs=new ArrayList<>();
                    System.out.println("Choose a DFS Technique From the Below");
                    System.out.println("1. PreOrder Traversal");
                    System.out.println("2. InOrder Traversal");
                    System.out.println("3. PostOrder Traversal");
                    System.out.println("4. Back to Tree's Menu");
                    int dfsChoice=sc.nextInt();
                    switch(dfsChoice){
                        case 1:
                        MyTree.preOrderTraversal(root,dfs);
                        System.out.println("PreOrder Traversal ");
                        MyTree.printDFSTraversals(dfs);
                        break;
                        case 2:
                        MyTree.inOrderTraversal(root,dfs);
                        System.out.println("InOrder Traversal ");
                        MyTree.printDFSTraversals(dfs);
                        break;
                        case 3:
                        MyTree.postOrderTraversal(root,dfs);
                        System.out.println("PostOrder Traversal ");
                        MyTree.printDFSTraversals(dfs);
                        break;
                        case 4:
                        break;
                        default:
                System.out.println("Range of Input Integer's Provided For Operation is [1-3]");
                    }
                    break;
                    case 3:
                    break;
                    default:
                System.out.println("Range of Input Integer's Provided For Operation is [1-3]");
            }
                break;
                case 3:
                System.out.println("Choose a Special Traversal Technique From the Below");
                System.out.println("1. Zig Zag Traversal");
                System.out.println("2. Vertical Order Traversal");
                System.out.println("3. Boundary Traversal");
                System.out.println("4. Back to Tree's Menu");
                int specChoice=sc.nextInt();
                switch(specChoice){
                case 1:
                List<List<Integer>> res=MyTree.zigZagLevelOrder(root);
                System.out.println("A Level Order Traversal with a Zig Zag Traversing Nature");
                MyTree.assistPLOTraversal(res);
                res=MyTree.bfsTraversal(root);
                MyTree.printLevelOrderTraversals(res);
                break;
                case 2:
                List<List<Integer>> vOrd=MyTree.verticalTraversal(root);
                MyTree.displayVerticalOrder(vOrd);
                break;
                case 3:
                System.out.println("Boundary Traversal includes:");
                System.out.println("- Left boundary nodes (excluding leaves)");
                System.out.println("- All leaf nodes (left to right)");
                System.out.println("- Right boundary nodes (excluding leaves, in reverse)");
                List<List<Integer>> allBoundaries=new java.util.LinkedList<>();
                allBoundaries=MyTree.boundaryTraversal(root);
                System.out.println("Boundary Traversal:");
                List<Integer> boundaryTraversalList=allBoundaries.getLast();
                MyTree.printDFSTraversals(boundaryTraversalList);
                System.out.println();
                System.out.print("["+root.data);
                System.out.println("]"+"       ->"+"Root");
                System.out.print("[");
                MyTree.printDFSTraversals(allBoundaries.get(0));
                System.out.println("]"+"       ->"+"Left Boundary");
                System.out.print("[");
                MyTree.printDFSTraversals(allBoundaries.get(1));
                System.out.println("]"+"       ->"+"Leaf Nodes");
                System.out.print("[");
                MyTree.printDFSTraversals(allBoundaries.get(2));
                System.out.println("]"+"       ->"+"Right Boundary");
                break;
                case 4:
                default:
                System.out.println("Range of Input Integer's Provided For Operation is [1-4]");
                }
                break;
                case 4:
                System.out.println("Enter the Value to Insert into the Tree");
                int insVal=sc.nextInt();
                MyTree.insert(root, insVal);
                break;
                case 5:
                System.out.print("Enter the value to search: ");
                int target = sc.nextInt();
                MyTree.searchInTree(root, target);
                break;
                case 6:
                System.out.println("Diameter of the Binary Tree "+MyTree.computeDiameter(root));
                break;
                case 7:
                System.out.println("Enter the Two Nodes value: ");
                int val1 = sc.nextInt();
                MyTree node1=new MyTree(val1);
                int val2 = sc.nextInt();
                MyTree node2=new MyTree(val2);
                System.out.println("The Lowest Common Ancestor Of the Two Nodes "+val1+" and "+ val2 +" is "+MyTree.LowestCommonAncestor(root,node1,node2).data);
                break;
                case 8:
                System.out.println("Enter the Node value: ");
                int toNode = sc.nextInt();
                List<Integer> path=new java.util.LinkedList<>();
                MyTree.rootToNodePath(root,toNode,path);
                MyTree.printDFSTraversals(path);
                break;
                case 9:
                System.out.println("Choose any Tree View From the Below");
                System.out.println("1. Top View");
                System.out.println("2. Right View");
                System.out.println("3. Bottom View");
                System.out.println("4. Left View");
                System.out.println("5. All Sides View");
                System.out.println("6. Back to Tree's Menu");
                int view=sc.nextInt();
                List<Integer> tView = null;
                List<Integer> rView = null;
                List<Integer> bView = null;
                List<Integer> lView = null;
                switch(view){
                    case 1:
                    tView= MyTree.topView(root);
                    System.out.println("Top View shows the first visible nodes when you look at the tree from above.");
                    System.out.println("Top View of the Binary Tree");
                    MyTree.printDFSTraversals(tView);
                    break;
                    case 2:
                    rView= MyTree.rightSideView(root);
                    System.out.println("Right View shows the rightmost node at each level when looking from the right side.");
                    System.out.println("Right Side View Of the Binary Tree");
                    MyTree.printDFSTraversals(rView);
                    break;
                    case 3:
                    bView= MyTree.bottomView(root);
                    System.out.println("Bottom View shows the last visible node at each vertical column from bottom.");
                    System.out.println("Bottom View OF the Binary Tree");
                    MyTree.printDFSTraversals(bView);
                    break;
                    case 4:
                    lView= MyTree.leftSideView(root);
                    System.out.println("Left View shows the leftmost node at each level when looking from the left side.");
                    System.out.println("Left View OF the Binary Tree");
                    MyTree.printDFSTraversals(lView);
                    break;
                    case 5:
                    System.out.println("All 4 Sides View :)\n");
                    if (tView == null) tView = MyTree.topView(root);
                    if (rView == null) rView = MyTree.rightSideView(root);
                    if (bView == null) bView = MyTree.bottomView(root);
                    if (lView == null) lView = MyTree.leftSideView(root);
                    System.out.print(">Top View    ");
                    MyTree.printDFSTraversals(tView);
                    System.out.print(">Right View  ");
                    MyTree.printDFSTraversals(rView);
                    System.out.print(">Bottom View ");
                    MyTree.printDFSTraversals(bView);
                    System.out.print(">Left View   ");
                    MyTree.printDFSTraversals(lView);
                    break;
                    case 6:
                    break;
                    default:
                  System.out.println("Range of Input Integer's Provided For Operation is [1-6]");
                }
                break;
                case 10:
                System.out.println("Tree Actual Image");
                List<List<Integer>> resMir=MyTree.bfsTraversal(root);
                MyTree.printLevelOrderTraversals(resMir);
                System.out.println("Tree Mirror Image");
                List<List<Integer>> inverseRes=MyTree.invertTree(root);
                MyTree.printLevelOrderTraversals(inverseRes);
                break;
                case 11:
                System.out.println();
                System.out.println("== Current Tree SnapShot ==");
                MyTree.showTree(root,"",true);
                MyTree.treeSummary(root, nodes);
                break;
                case 12:
                root=null;
                nodes=null;
                System.out.println("Tree SuccessFully Reloaded");
                break;
                case 13:
                System.out.println("Leaf Nodes (Left to Right) ");
                List<Integer> leaves=new java.util.LinkedList<>();
                leaves=MyTree.leafNodes(root, leaves);
                System.out.println("Leaves in a Tree are Nodes Without Further Nodes");
                MyTree.printDFSTraversals(leaves);
                System.out.println();
                break;
                case 14:
                return;
                default:
                System.out.println("Range of Input Integer's Provided For Operation is [1-15]");
            }
            }
      }
      private static void handleBinarySearchTrees(Scanner sc){
            MyBST root=null;
            System.out.println("Welcome to BST Operations");
            System.out.println("1.  Create a Binary Search Tree");
            System.out.println("2.  Traverse the Binary Search Tree");
            System.out.println("9.  Insert a Node into BST");
            System.out.println("3.  Display BST");
            System.out.println("4.  Search for a value");
            System.out.println("5.  Minimum Value in the BST");
            System.out.println("6.  Maximum Value in the BST");
            System.out.println("7.  Delete a Value from BST");
            System.out.println("10. Back to Main Menu");
            while(true){
            System.out.print("Choose an Option From the BST's Menu  ");
            int bstOp=sc.nextInt();
                switch(bstOp){
                case 1:
                root=null;
                root=MyBST.buildBST(sc, root);
                break;
                case 2:
                System.out.println("Choose the traversal you like");
                System.out.println("1. BFS(Level Wise)");
                System.out.println("2. DFS(Depth Wise)");
                System.out.println("3. Back to Tree's Menu");
                int traOp=sc.nextInt();
                switch(traOp){
                    case 1:
                    List<List<Integer>> bfs=MyBST.bfsTraversal(root);
                    System.out.println("BFS a Level Wise Traversal Technique");
                    MyBST.printLevelOrderTraversals(bfs);
                    System.out.println("Level Order Traversal Done:)");
                    break;
                    case 2:
                    List<Integer> dfsNodes=new ArrayList<>();
                    System.out.println("Choose a DFS Technique From the Below");
                    System.out.println("1. PreOrder Traversal");
                    System.out.println("2. InOrder Traversal");
                    System.out.println("3. PostOrder Traversal");
                    int dfsOp=sc.nextInt();
                    switch(dfsOp){
                      case 1:
                      MyBST.preOrderTraversal(root,dfsNodes);
                      System.out.println("Pre Order Traversal ");
                      MyBST.printDFSTraversals(dfsNodes);
                      System.out.println();
                      break;
                      case 2:
                      MyBST.inOrderTraversal(root,dfsNodes);
                      System.out.println("In Order Traversal ");
                      MyBST.printDFSTraversals(dfsNodes);
                      System.out.println();
                      break;
                      case 3:
                      MyBST.postOrderTraversal(root,dfsNodes);
                      System.out.println("Post Order Traversal ");
                      MyBST.printDFSTraversals(dfsNodes);
                      System.out.println();
                      break;
                    }
                    break;
                }
                break;
                case 9:
                System.out.println("Enter Value to insert");
                int val=sc.nextInt();
                root=MyBST.insert(root,val);
                break;
                case 3:
                System.out.println("BST");
                MyBST.showTree(root, "", true);
                break;
                case 4:
                System.out.println("Enter the value to search for ");
                int searchVal=sc.nextInt();
                MyBST.search(root,searchVal);
                break;
                case 5:
                MyBST.minValueNode(root);
                break;
                case 6:
                MyBST.maxValueNode(root);
                break;
                case 7:
                System.out.println("Enter the Value to Delete ");
                int delete=sc.nextInt();
                MyBST.deleteNode(root,delete);
                break;
                case 10:
                return;
                default:
                System.out.println("Range of Input Integer's Provided For Operation is [1-2]");
                }
            }
      }
      public static void handleHeaps(Scanner sc){
        System.out.println("Select Any Heap");
        System.out.println("1. Min Heap");
        System.out.println("2. Max Heap");
        System.out.println("3. Back to Main Menu");
        int choice =sc.nextInt();
        switch(choice){
            case 1:
            handleMinHeap(sc);
            break;
            case 2:
            handleMaxHeap(sc);
            break;
            case 3:
            return;
            default:
            System.out.println("Range of Input Integer's Provided For Operation is [1-3]");
        }
    }
    public static void handleMinHeap(Scanner sc){
            List<Integer> minHeap=new ArrayList<>();
            System.out.println("Welcome to Min Heap Operations");
            System.out.println("1. Create a MinHeap");
            System.out.println("2. Insert a Value into the Min Heap");
            System.out.println("3. Peek Element in the MinHeap");
            System.out.println("4. Delete Element in the MinHeap");
            System.out.println("5. Display the Min Heap");
            System.out.println("6. Reset Min Heap");
            System.out.println("7. Back to Main Menu");
            while(true){
            System.out.print("Choose an Option From the Min Heap's Menu  ");
            int op=sc.nextInt();
                switch(op){
                case 1:
                MyMinHeap.buildMinHeap(sc,minHeap);
                break;
                case 2:
                System.out.println("Enter Value to insert");
                int val=sc.nextInt();
                MyMinHeap.heapifyUp(minHeap,val);
                break;
                case 3:
                MyMinHeap.top(minHeap);
                break;
                case 4:
                MyMinHeap.deleteMin(minHeap);
                break;
                case 5:
                System.out.println("Min Heap");
               // MyTree minHeapRoot=MyTree.buildTree(minHeap);
               // MyTree.showTree(minHeapRoot, "", true);
                break;
                case 6:
                minHeap=null;
                break;
                case 7:
                return;
                default:
                System.out.println("Choice Out of Input Range [1-7]");
                }
            }
    }
    public static void handleMaxHeap(Scanner sc){
            List<Integer> maxHeap=new ArrayList<>();
            System.out.println("Welcome to Max Heap Operations");
            System.out.println("1. Create a Max Heap");
            System.out.println("2. Insert a Value into the Max Heap");
            System.out.println("3. Peek Element in the Max Heap");
            System.out.println("4. Delete Element in the Max Heap");
            System.out.println("5. Display the Max Heap");
            System.out.println("6. Reset Max Heap");
            System.out.println("7. Back to Main Menu");
            while(true){
            System.out.print("Choose an Option From the Max Heap's Menu  ");
            int op=sc.nextInt();
            switch(op){
                case 1:
                MyMaxHeap.buildMaxHeap(sc,maxHeap);
                break;
                case 2:
                System.out.println("Enter Value to insert");
                int val=sc.nextInt();
                MyMaxHeap.heapifyUp(maxHeap,val);
                case 3:
                MyMaxHeap.top(maxHeap);
                break;
                case 4:
                MyMaxHeap.deleteMax(maxHeap);
                break;
                case 5:
                System.out.println("Max Heap");
              //  MyTree maxHeapRoot=MyTree.buildTree(maxHeap);
                //MyTree.showTree(maxHeapRoot, "", true);
                break;
                case 6:
                maxHeap=null;
                break;
                case 7:
                return;
                default:
                System.out.println("Choice Out of Input Range [1-7]");
            }
        }
    }
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to DSA Simulator");
        System.out.println("Choose a Data Structure");
        while(true){    
            System.out.println("1. Linked Lists");
            System.out.println("2. Stacks");
            System.out.println("3. Queues");
            System.out.println("4. Trees");
            System.out.println("5. Heaps");
            System.out.println("6. Graphs(Coming soon)");
            System.out.println("7. Exit");
            System.out.print("Choose an Option From the Menu  ");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                handleLinkedLists(sc);
                break;
                case 2:
                handleStacks(sc);
                break;
                case 3:
                handleQueues(sc);
                break;
                case 4:
                handleTrees(sc);
                break;
                case 5:
                handleHeaps(sc);
                break;
                case 6:
                System.out.println("Coming Soon....");
                break;
                case 7:
                System.out.println("Exiting Thankyou");
                return;
                default:
                System.out.println("Range of Input Integer's Provided For Operation is [1-7]");
           }
            }
        }
    }