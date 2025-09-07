import java.util.List;
import java.util.Scanner;
public class MyMaxHeap {
    private static int parent(int i){
    return (i-1)/2;
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
            heapifyUp(maxHeap, nodeVal);
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
}