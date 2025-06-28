import java.util.*;
public class Main{
    public static LinkedList handleLinkedLists(LinkedList head,Scanner sc){
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
            System.out.println("1. Insert at End");
            System.out.println("2. Insert at Beginning");
            System.out.println("3. Insert At the Kth Position From the Begininng");
            System.out.println("4. Reverse The Linked List");
            System.out.println("5. Print the Linked List");
            System.out.println("6. Back to Main Menu");
            System.out.println("You can Perform as Many Operations as you Wish any Number of Times.\nWhen your Done Just Press 6 to Go Back to the Menu");
            System.out.print("Enter your operation(Example-1) ");
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
            case 4:
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
            System.out.println("WAnna look at the List(Click 5)");
            break;
            case 5:
            LinkedList.printLinkedList(head);
            break;
            case 6:
            return head;
            default:
           System.out.println("Wrong choice");
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
            System.out.println("2. Stacks(Coming soon)");
            System.out.println("3. Queues(Coming soon)");
            System.out.println("4. Trees(Coming soon)");
            System.out.println("5. Graphs(Coming soon)");
            System.out.println("6. Exit");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                head=handleLinkedLists(head,sc);
                break;
                case 6:
                System.out.println("Exiting of....Thank youuuu");
                return;
            }
        }
        //sc.close();
    }
}