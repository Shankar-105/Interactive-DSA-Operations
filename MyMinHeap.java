import java.util.List;
import java.util.Scanner;
public class MyMinHeap {
    private static int parent(int i){
    return (i-1)/2;
    }
    private static int left(int i){
    return 2*i+1;
    }
    private static int right(int i){
    return 2*i+2;
    }
    private static void swap(List<Integer> minHeap,int i,int j){
        int temp = minHeap.get(i);
        minHeap.set(i, minHeap.get(j));
        minHeap.set(j, temp);
    }
    public static void top(List<Integer> minHeap) {
        if (minHeap.isEmpty()){
        System.out.println("Heap is Empty");
        return;
        }
        System.out.println("The Top Element is"+minHeap.get(0));
    }
    public static void buildMinHeap(Scanner sc,List<Integer> minHeap){
    System.out.println("Enter Nodes");
    while(true){
            int nodeVal =sc.nextInt();
            if(nodeVal==-1) break;
            heapifyUp(minHeap, nodeVal);
        }
    }
    public static void heapifyUp(List<Integer> minHeap,int val) {
        minHeap.add(val);
        int i = minHeap.size() - 1;
        while (i > 0 && minHeap.get(i) < minHeap.get(parent(i))) {
            swap(minHeap,i,parent(i));
            i = parent(i);
        }
    }
}