import java.util.*;
public class Main{
    public static void handleLinkedLists(Scanner sc){
        MyLinkedList head=null;
        System.out.println("Welcome to Linked List Operations---Firstly Construct a Linked List");
        System.out.println("Enter the values of each Node in the Linked List(Enter -1 to Stop)");
        while(true){
            int value=sc.nextInt();
            if(value==-1){
                break;
            }
           head=MyLinkedList.createLinkedList(head,value);
        }
        System.out.println("Constructed Linked List...");
        MyLinkedList.printLinkedList(head);
        System.out.println("Linked List Operations as follows");
            System.out.println("1. Insert at the End");
            System.out.println("2. Insert at the Beginning");
            System.out.println("3. Insert At the Kth Position From the Begininng");
            System.out.println("4. Delete the First Node(Element)");
            System.out.println("5. Delete the Last Node(Element)");
            System.out.println("6. Delete the Node(Element) at Kth Position From the Begininng");
            System.out.println("7. Delete the Node(Element) with the Value K From the Begininng");
            System.out.println("8. Reverse The Linked List");
            System.out.println("9. Print the Linked List");
            System.out.println("10. Reset The List");
            System.out.println("11. Back to Main Menu");
            System.out.println("You can Perform as Many Operations as you Wish any Number of Times.\nWhen your Done Just Press 10 to Go Back to the Menu");
            System.out.print("Enter The Index of the Operation (Example 1) ");
        while(true){
            int op = sc.nextInt();
           switch(op){
            case 1:
            System.out.println("Enter the Value to be Inserted at the end");
            int valEnd=sc.nextInt();
            head=MyLinkedList.insertAtTail(head,valEnd);
            System.out.println("Successfully appended:)");
            break;
            case 2:
            System.out.println("Enter the Value to be Inserted at the beginning");
            int valSt=sc.nextInt();
            head=MyLinkedList.insertAtHead(head,valSt);
            System.out.println("Successfully pushed at the Beginning:)");
            break;
            case 3:
            System.out.println("Enter the position K");
            int posK=sc.nextInt();
            System.err.println("Enter the Value");
            int valK=sc.nextInt();
            head=MyLinkedList.insertAtK(head,posK,valK);
            System.out.println("Pushed in Between Nodes "+(posK-1)+" and "+(posK));
            System.out.println("Wanna look at the List(Click 9)");
            break;
            case 4:
            head=MyLinkedList.deleteHead(head);
            System.out.println("Deleted The Head.\nWanna See the Change(Click 9)");
            break;
            case 5:
            head=MyLinkedList.deleteTail(head);
            System.out.println("Removed:)");
            break;
            case 6:
            System.out.println("Enter the position K");
            int delposK=sc.nextInt();
            head=MyLinkedList.deleteAtK(head,delposK);
            System.out.println("The Node at position "+delposK+" is removed<<\nHave A Look at the List for Better Experiance.");
            break;
            case 7:
            System.out.println("Enter the Value of the Node to be deleted");
            int nodeVal=sc.nextInt();
            head=MyLinkedList.deleteNodeK(head,nodeVal);
            System.out.println("Node With Value "+nodeVal+" is removed:)");
            break;
            case 8:
           head=MyLinkedList.reverLinkedList(head);
           System.out.println("Oops You Just Performed the Reverse Operation...The List gets Changed Entirely have a look at it...");
           break;
           case 9:
            MyLinkedList.printLinkedList(head);
            break;
            case 10:
            head=null;
            break;
            case 11:
            return;
            default:
           System.out.println("Range of Input Integer's Provided For Operation is [1-10]");
           }
        }
        }
      public static void handleStacks(Scanner sc){
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
            System.out.print("Enter The Index of the Operation (Example 1) ");
        while(true){
            int op=sc.nextInt();
            switch(op){
                case 1:
                System.out.println("Enter the Value to be Pushed into the Stack");
                int val=sc.nextInt();
                stackHead=MyStack.addNode(val);
                System.out.println("Pushed it---");
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
                System.out.println("No Surprise As the Stack Follows ---LIFO---");
                break;
                case 7:
                stackHead=null;
                case 8:
                return;
                default:
                System.out.println("Range of Input Integer's Provided For Operation is [1-7]");
           }
            }
        }
      public static void handleQueues(Scanner sc){
            Node queueFront=null;
            System.out.println("Welcome to Queue Operations---");
            System.out.println("1. Push an Element into the Queue");
            System.out.println("2. Remove an element from the Queue");
            System.out.println("3. Check if the Queue is Empty or Not");
            System.out.println("4. Size of the Queue");
            System.out.println("5. Peek Element of the Queue)");
            System.out.println("6. Last Element of the Queue)");
            System.out.println("7. Print the Queue");
            System.out.println("8. Reset the Queue");
            System.out.println("9. Back to Main Menu");
            System.out.print("Enter The Index of the Operation (Example 1) ");
        while(true){
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
                System.out.println("Queue Follows ---FIFO---");
                break;
                case 8:
                queueFront=null;
                case 9:
                return;
                default:
                System.out.println("Range of Input Integer's Provided For Operation is [1-8]");
            }
        }
      }
      public static void handleTrees(Scanner sc){
            MyTree root=null;
            List<Integer> nodes=null;
            System.out.println("---Welcome to Tree Operations---\n");
            System.out.println("1. Create a Binary Tree");
            System.out.println("2. Traverse the tree(BFS/DFS)");
            System.out.println("3. Zig Zag Traversal");
            System.out.println("4. Search");
            System.out.println("5. Diameter Of the Tree");
            System.out.println("6. Lowest Common Ancestor of Any Two Children");
            System.out.println("7. Show Tree");
            System.out.println("8. Reset the Tree");
            System.out.println("9. Vertical Order Traversal");
            System.out.println("10. Root to Any Node Path");
            System.out.println("11. 4 Side View of the Tree");
            System.out.println("12. Back to Main Menu");
            while(true){
                int op=sc.nextInt();
            switch(op){
                case 1:
                System.out.println("Enter the nodes level wise Enter -1 for null");
                nodes=MyTree.inputNodeValues(sc);
                root=MyTree.buildTree(nodes);
                System.out.println("Tree SuccessFully Built :)");
                break;
                case 2:
                System.out.println("Choose the traversal you like");
                System.out.println("1.BFS(Level Order)");
                System.out.println("2.DFS(Depth Wise)");
                int choice =sc.nextInt();
                switch(choice){
                    case 1:
                    List<List<Integer>> res=MyTree.bfsTraversal(root);
                    MyTree.printLevelOrderTraversals(res);
                    System.out.println("Level Order Traversal Done:)");
                    break;
                    case 2:
                    List<Integer> dfs=new ArrayList<>();
                    System.out.println("Choose any 1 DFS Technique From the Below Listed Travarsels");
                    System.out.println("1.PreOrder Traversal\n2.InOrder Traversal\n3.PostOrder Traversal");
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
                        default:
                System.out.println("Range of Input Integer's Provided For Operation is [1-3]");
                    }
                    break;
                    default:
                System.out.println("Range of Input Integer's Provided For Operation is [1-2]");
            }
                break;
                case 3:
                List<List<Integer>> res=MyTree.zigZagLevelOrder(root);
                MyTree.printLevelOrderTraversals(res);
                break;
                case 4:
                System.out.print("Enter the value to search: ");
                int target = sc.nextInt();
                MyTree.searchInTree(root, target);
                break;
                case 5:
                System.out.println("Diameter of the Binary Tree "+MyTree.computeDiameter(root));
                break;
                case 6:
                System.out.println("Enter the Two Nodes value: ");
                int val1 = sc.nextInt();
                MyTree node1=new MyTree(val1);
                int val2 = sc.nextInt();
                MyTree node2=new MyTree(val2);
                System.out.println("The Lowest Common Ancestor Of the Two Nodes "+val1+" and "+ val2 +" is "+MyTree.LowestCommonAncestor(root,node1,node2).data);
                break;
                case 7:
                System.out.println();
                System.out.println("== Current Tree SnapShot ==");
                MyTree.showTree(root,"",true);
                MyTree.treeSummary(root, nodes);
                break;
                case 8:
                root=null;
                nodes=null;
                System.out.println("Tree SuccessFully Reloaded");
                break;
                case 9:
                List<List<Integer>> vOrd=MyTree.verticalTraversal(root);
                MyTree.displayVerticalOrder(vOrd);
                break;
                case 10:
                System.out.println("Enter the Node value: ");
                int toNode = sc.nextInt();
                List<Integer> path=new java.util.LinkedList<>();
                MyTree.rootToNodePath(root,toNode,path);
                MyTree.printDFSTraversals(path);
                break;
                case 11:
                System.out.println("1. Top View");
                System.out.println("2. Right View");
                System.out.println("3. Bottom View");
                System.out.println("4. Left View");
                System.out.println("5. All Sides View");
                System.out.println("Choose anyy View");
                int view=sc.nextInt();
                switch(view){
                    case 1:
                    List<Integer> tView= MyTree.topView(root);
                  System.out.println("Top View OF the Binary Tree");
                    MyTree.printDFSTraversals(tView);
                    break;
                    case 2:
                    List<Integer> rView= MyTree.rightSideView(root);
                  System.out.println("Right Side View Of the Binary Tree");
                    MyTree.printDFSTraversals(rView);
                    break;
                    case 3:
                    List<Integer> bView= MyTree.topView(root);
                  System.out.println("Top View OF the Binary Tree");
                    MyTree.printDFSTraversals(bView);
                    break;
                    case 4:
                    List<Integer> lView= MyTree.rightSideView(root);
                  System.out.println("Top View OF the Binary Tree");
                    MyTree.printDFSTraversals(lView);
                    break;
                    case 5:
                    System.out.println("All Side View :)");
                    break;
                    default:
                  System.out.println("Range of Input Integer's Provided For Operation is [1-5]");
                }
                break;
                case 12:
                return;
                default:
                System.out.println("Range of Input Integer's Provided For Operation is [1-9]");
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
            System.out.println("4. Binary Trees");
            System.out.println("5. Graphs(Coming soon)");
            System.out.println("6. Exit");
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
                System.out.println("Coming Soon....");
                break;
                case 6:
                System.out.println("Exiting of....Thank youuuu");
                return;
                default:
                System.out.println("Range of Input Integer's Provided For Operation is [1-6]");
           }
            }
        }
        
    }