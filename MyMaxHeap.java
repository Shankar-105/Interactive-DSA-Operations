import java.util.List;
import java.util.Scanner;
public class MyMaxHeap {
    private static int parent(int i){
    return (i-1)/2;
    }
    private static int left(int i){
    return 2*i+1;
    }
    private static int right(int i){
    return 2*i+2;
    }
    private static void swap(List<Integer> maxHeap,int i,int j){
        int temp = maxHeap.get(i);
        maxHeap.set(i, maxHeap.get(j));
        maxHeap.set(j, temp);
    }
    public static void buildMaxHeap(Scanner sc,List<Integer> maxHeap){
    System.out.println("Enter Nodes");
    while(true){
            int nodeVal =sc.nextInt();
            if(nodeVal==-1) break;
            MyMaxHeap.heapifyUp(maxHeap, nodeVal);
        }
    }
    public static void heapifyUp(List<Integer> maxHeap,int val) {
        maxHeap.add(val);
        int i = maxHeap.size() - 1;
        while (i > 0 && maxHeap.get(i) > maxHeap.get(parent(i))) {
            swap(maxHeap,i,parent(i));
            i = parent(i);
        }
    }
    public static void deleteMin(List<Integer> maxHeap) {
        if (maxHeap.isEmpty()){
            System.out.println("Heap is Empty Insert Some Nodes!");
            return;
        }
        int min = maxHeap.get(0);
        int last = maxHeap.remove(maxHeap.size() - 1);
        if (!maxHeap.isEmpty()) {
            maxHeap.set(0, last);
            heapifyDown(maxHeap,0);
        }
        System.out.println("Deleted the Top Elem "+min);
    }
    // Heapify down
    private static void heapifyDown(List<Integer> maxHeap,int i) {
        int largest = i;
        int left = left(i);
        int right = right(i);
        if (left < maxHeap.size() && maxHeap.get(left)>maxHeap.get(largest))
            largest = left;
        if (right < maxHeap.size() && maxHeap.get(right)>maxHeap.get(largest))
            largest = right;
        if (largest != i) {
            swap(maxHeap,i, largest);
            heapifyDown(maxHeap,largest);
        }
    }
}