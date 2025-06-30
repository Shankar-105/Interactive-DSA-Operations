import java.util.*;
public class Main{
    public static void handleLinkedLists(LinkedList head,Scanner sc){
        System.out.println("Welcome to Linked List Operations---Firstly Construct a Linked List");
        System.out.println("Enter the values of each Node in the Linked List(Enter -1 to Stop)");
        while(true){
            int value=sc.nextInt();
            if(value==-1){
                break;
            }
           head=LinkedList.createLinkedList(head,value);
        }
        System.out.println("Constructed Linked List...");
        LinkedList.printLinkedList(head);
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
            System.out.println("10. Back to Main Menu");
            System.out.println("You can Perform as Many Operations as you Wish any Number of Times.\nWhen your Done Just Press 10 to Go Back to the Menu");
            System.out.print("Enter The Index of the Operation (Example 1) ");
        while(true){
            int op = sc.nextInt();
           switch(op){
            case 1:
            System.out.println("Enter the Value to be Inserted at the end");
            int valEnd=sc.nextInt();
            head=LinkedList.insertAtTail(head,valEnd);
            System.out.println("Successfully appended:)");
            break;
            case 2:
            System.out.println("Enter the Value to be Inserted at the beginning");
            int valSt=sc.nextInt();
            head=LinkedList.insertAtHead(head,valSt);
            System.out.println("Successfully pushed at the Beginning:)");
            break;
            case 8:
           head=LinkedList.reverLinkedList(head);
           System.out.println("Oops You Just Performed the Reverse Operation...The List gets Changed Entirely have a look at it...");
           break;
            case 3:
            System.out.println("Enter the position K");
            int posK=sc.nextInt();
            System.err.println("Enter the Value");
            int valK=sc.nextInt();
            head=LinkedList.insertAtK(head,posK,valK);
            System.out.println("Pushed in Between Nodes "+(posK-1)+" and "+(posK));
            System.out.println("Wanna look at the List(Click 9)");
            break;
            case 9:
            LinkedList.printLinkedList(head);
            break;
            case 10:
            return;
            case 4:
            head=LinkedList.deleteHead(head);
            System.out.println("Deleted The Head.\nWanna See the Change(Click 9)");
            break;
            case 5:
            head=LinkedList.deleteTail(head);
            System.out.println("Removed:)");
            break;
            case 6:
            System.out.println("Enter the position K");
            int delposK=sc.nextInt();
            head=LinkedList.deleteAtK(head,delposK);
            System.out.println("The Node at position "+delposK+" is removed<<\nHave A Look at the List for Better Experiance.");
            break;
            case 7:
            System.out.println("Enter the Value of the Node to be deleted");
            int nodeVal=sc.nextInt();
            head=LinkedList.deleteNodeK(head,nodeVal);
            System.out.println("Node With Value "+nodeVal+" is removed:)");
            break;
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
            System.out.println("7. Back to Main Menu");
            System.out.print("Enter The Index of the Operation (Example 1) ");
        while(true){
            int op=sc.nextInt();
            switch(op){
                case 1:
                System.out.println("Enter the Value to be Pushed into the Stack");
                int val=sc.nextInt();
                stackHead=Stack.addNode(val);
                System.out.println("Pushed it---");
                break;
                case 2:
                stackHead=Stack.removeNode();
                break;
                case 4:
                System.out.println("Current Stack Size "+Stack.sizeof());
                break;
                case 3:
                if(Stack.isEmpty()){
                    System.out.println("Oh the Stack is Empty Push Elements");
                }
                else{System.out.println("No The Stack's Not Empty there are "+Stack.sizeof()+" Elements in the Stack");}
                break;
                case 5:
                if(Stack.stackTop()==0){
                    System.out.println("The Stack's Empty So There's No Top!");
                }
                else{
                System.out.println("The Top Element in the Stack is "+Stack.stackTop());
                }
                break;
                case 6:
                Stack.printStack(stackHead);
                System.out.println("No Surprise As the Stack Follows ---LIFO---");
                break;
                case 7:
                return;
                default:
                System.out.println("Range of Input Integer's Provided For Operation is [1-7]");
           }
            }
        }
      public static void handleQueue(Scanner sc){
            Node queueFront=null;
            System.out.println("Welcome to Queue Operations---");
            System.out.println("1. Push an Element into the Queue");
            System.out.println("2. Remove an element from the Queue");
            System.out.println("3. Check if the Queue is Empty or Not");
            System.out.println("4. Size of the Queue");
            System.out.println("5. Peek Element of the Queue)");
            System.out.println("6. Last Element of the Queue)");
            System.out.println("7. Print the Queue");
            System.out.println("8. Back to Main Menu");
            System.out.print("Enter The Index of the Operation (Example 1) ");
        while(true){
            int op=sc.nextInt();
            switch(op){
                case 1:
                System.out.println("Enter the Value to be Pushed into the Queue");
                int val=sc.nextInt();
                queueFront=Queue.push(val);
                System.out.println("Pushed it :)");
                break;
                case 2:
                if(!Queue.isQEmpty()){
                System.out.println("Removed ;)");
                queueFront=Queue.pop();
                }
                else{queueFront=Queue.pop();}
                break;
                case 4:
                System.out.println("Current Stack Size "+Queue.sizeofQ());
                break;
                case 3:
                if(Queue.isQEmpty()){
                    System.out.println("Oh the Queue is Empty Push Elements");
                }
                else{System.out.println("No The Queue's Not Empty there are "+Queue.sizeofQ()+" Elements in the Queue");}
                break;
                case 5:
                if(Queue.peekOfQ()==0){
                    System.out.println("The Queue's Empty So There's No Peek or Last!");
                }
                else{
                System.out.println("The Peek Element in the Queue is "+Queue.peekOfQ());
                }
                break;
                case 6:
                if(Queue.lastOfQ()==0){
                    System.out.println("The Queue's Empty So There's No Last or Peek!");
                }
                else{
                System.out.println("The Last Element in the Queue is "+Queue.lastOfQ());
                }
                break;
                case 7:
                Queue.printQueue(queueFront);
                System.out.println("Queue Follows ---FIFO---");
                break;
                case 8:
                return;
                default:
                System.out.println("Range of Input Integer's Provided For Operation is [1-8]");
            }
        }
      }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList head=null;
        System.out.println("Welcome to DSA Simulator");
        System.out.println("Choose a Data Structure");
        while(true){    
            System.out.println("1. Linked Lists");
            System.out.println("2. Stacks");
            System.out.println("3. Queues");
            System.out.println("4. Trees(Coming soon)");
            System.out.println("5. Graphs(Coming soon)");
            System.out.println("6. Exit");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                handleLinkedLists(head,sc);
                break;
                case 2:
                handleStacks(sc);
                break;
                case 3:
                handleQueue(sc);
                break;
                case 4:
                System.out.println("Coming Soon....");
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