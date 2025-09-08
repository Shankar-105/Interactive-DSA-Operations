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
        System.out.println("MinHeap is Empty");
        return;
        }
        System.out.println("The Top Element is "+minHeap.get(0));
    }
    public static void buildMinHeap(Scanner sc,List<Integer> minHeap){
    System.out.println("Enter Nodes");
    while(true){
            int nodeVal =sc.nextInt();
            if(nodeVal==-1) break;
            MyMinHeap.heapifyUp(minHeap, nodeVal);
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
    public static void deleteMin(List<Integer> minHeap) {
        if (minHeap.isEmpty()){
            System.out.println("Heap is Empty Insert Some Nodes!");
            return;
        }

        int min = minHeap.get(0);
        int last = minHeap.remove(minHeap.size() - 1);

        if (!minHeap.isEmpty()) {
            minHeap.set(0, last);
            heapifyDown(minHeap,0);
        }
        System.out.println("Deleted the Top Elem "+min);
    }

    // minHeapify down
    private static void heapifyDown(List<Integer> minHeap,int i) {
        int smallest = i;
        int left = left(i);
        int right = right(i);
        if (left < minHeap.size() && minHeap.get(left) < minHeap.get(smallest))
            smallest = left;
        if (right < minHeap.size() && minHeap.get(right) < minHeap.get(smallest))
            smallest = right;
        if (smallest != i) {
            swap(minHeap,i, smallest);
            heapifyDown(minHeap,smallest);
        }
    }
}