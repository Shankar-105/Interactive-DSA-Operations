import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
class Pair<U, V> {
    public final U first;
    public final V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }
}
public class MyTree {
    int data;
    MyTree left,right;
    MyTree(int val){
        this.data=val;
        this.left=this.right=null;
    }
    MyTree(int val,MyTree l,MyTree r){
        this.data=val;
        this.left=l;
        this.right=r;
    }
    //Storing Values into List
    public static List<Integer> inputNodeValues(Scanner sc){
        List<Integer> nodes=new LinkedList<Integer>();
        while(true){
            int nodeVal =sc.nextInt();
            if(nodeVal==-2) break;
            nodes.add(nodeVal);
        }
        return nodes;
    }
    public static void insert(MyTree root,int val) {
        MyTree newNode=new MyTree(val);
        if (root == null){
            root=newNode;
            return;
        }
        Queue<MyTree> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
                MyTree node = q.poll();
                if(node.left!=null){
                    q.offer(node.left);
                }
                else{
                    node.left=newNode;
                    break;
                }
                if(node.right!=null){
                    q.offer(node.left);
                }
                else{
                    node.right=newNode;
                    break;
                }
        }
    }
    //Consturcting Tree From User Input
    public static MyTree buildTree(List<Integer> nodes) {
    if (nodes == null || nodes.isEmpty() || nodes.get(0) == -1) return null;
    MyTree root = new MyTree(nodes.get(0));
    Queue<MyTree> q = new LinkedList<>();
    q.offer(root);
    int i = 1;
    while (i < nodes.size()) {
        MyTree current = q.poll();
        // Left child
        if (nodes.get(i) != -1) {
            current.left = new MyTree(nodes.get(i));
            q.offer(current.left);
        }
        i++;
        // Right child
        if (i < nodes.size() && nodes.get(i) != -1) {
            current.right = new MyTree(nodes.get(i));
            q.offer(current.right);
        }
        i++;
    }
    return root;
}
     // Breadth First Search
    public static List<List<Integer>> bfsTraversal(MyTree root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return null;
        Queue<MyTree> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                MyTree node = q.poll();
                level.add(node.data);
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            result.add(level);
        }
        return result;
    }
    // DFS PreOrder Traversal (ROOT->LEFT->RIGHT)
public static void preOrderTraversal(MyTree root,List<Integer> result){
 if (root == null){
    //result.add(-1);
    return;
 }
    result.add(root.data);
    preOrderTraversal(root.left, result);
    preOrderTraversal(root.right, result);
}
    // DFS InOrder Traversal (LEFT->ROOT->RIGHT)
public static void inOrderTraversal(MyTree root,List<Integer> result){
    if (root == null){
    //result.add(-1);
    return;
 }
    inOrderTraversal(root.left, result);
    result.add(root.data);
    inOrderTraversal(root.right, result);
}
   // DFS PostOrder Traversal (LEFT->RIGHT->ROOT)
public static void postOrderTraversal(MyTree root,List<Integer> result){
    if (root == null){
    return;
 }
    postOrderTraversal(root.left, result);
    postOrderTraversal(root.right, result);
    result.add(root.data);
}
  // Printing of the Stored DFS traversal
public static void printDFSTraversals(List<Integer> result){
for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
        if (i != result.size() - 1){
            System.out.print(" -> ");
        }
    }
    //System.out.println();
}
//Zig Zag Level Order Traversal
    public static List<List<Integer>> zigZagLevelOrder(MyTree root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<MyTree> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                MyTree node = queue.poll();
                if (leftToRight) {
                    level.add(node.data);
                } else {
                    // Add at the beginning for reverse order
                    level.add(0, node.data);
                }
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            result.add(level);
            leftToRight = !leftToRight; // Toggle direction
        }
        return result;
    }
    public static void assistPLOTraversal(List<List<Integer>> result){
        for(int i = 0; i < result.size(); i++) {
        List<Integer> eachLevel = result.get(i);
        int size = eachLevel.size();
        for (int j = 0; j < size; j++) {
                if(i!=result.size()-1 || j!=size-1){
                    System.out.print(eachLevel.get(j)+"->");
                }
                else{
                    System.out.println(eachLevel.get(j));
                }
            }
    }
    }
public static void printLevelOrderTraversals(List<List<Integer>> result){
    int level=0;
    while (level<result.size()) {
        List<Integer> eachLevel = result.get(level);
            int size = eachLevel.size();
            System.out.print("Level " + (level+1) + ":   ");
            for (int i = 0; i < size; i++) {
                System.out.print(eachLevel.get(i)+"  ");
            }
            System.out.println();
            level++;
        }
}
public static void showTree(MyTree node, String prefix, boolean isTail) {
        if (node == null){
            System.out.println("Tree Has Nothing to Show Input some Nodes");
            return;
        }
        System.out.println(prefix + (isTail ? "└── " : "├── ") + node.data);

        List<MyTree> children = new ArrayList<>();
        if (node.left != null) children.add(node.left);
        if (node.right != null) children.add(node.right);

        for (int i = 0; i < children.size() - 1; i++) {
            showTree(children.get(i), prefix + (isTail ? "    " : "│   "), false);
        }

        if (!children.isEmpty()) {
            showTree(children.get(children.size() - 1), prefix + (isTail ? "    " : "│   "), true);
        }
    }
    private static int treeHeight(MyTree root) {
    if (root == null) return 0;
    int leftHeight=treeHeight(root.left);
    int rightHeight=treeHeight(root.right);
    return 1 + Math.max(leftHeight,rightHeight);
}
public static void searchInTree(MyTree root,int target) {
        if (root == null){
            System.out.println("Tree is Emptyy");
            return;
        }
        Queue<MyTree> q = new LinkedList<>();
        int lvl=1;
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                MyTree node = q.poll();
                if(node.data==target){
                 System.out.println("Node " + target + " found at Level " + lvl);
                 return;
                }
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            lvl++;
        }
    System.out.println("Node " + target + " not found in the tree.");
    }
    private static int assistIsBalanced(MyTree root) {
        if(root==null){return 0;}
        int lh=assistIsBalanced(root.left);
        if(lh==-1) return -1;
        int rh=assistIsBalanced(root.right);
        if(rh==-1) return -1;
        if(Math.abs(rh-lh)>1) return -1;
        return 1+ Math.max(lh,rh);
    }
    public static String isBalanced(MyTree root){
        return (assistIsBalanced(root)!=-1)? "Yes" : "No" ;
    }
    public static void treeSummary(MyTree root,List<Integer> nodes){
        System.out.println("== Tree Summary ==");
        System.out.print("Root Node: "+root.data);
        System.out.print(" | Total Nodes:"+nodes.size());
        System.out.print(" | Balanced:"+isBalanced(root));
        System.out.println(" | Height:"+treeHeight(root));
    }
    private static int assistDiameter(MyTree root,int[] maxi){
      if(root==null) return 0;
      int leftHeight=assistDiameter(root.left, maxi);
      int rightHeight=assistDiameter(root.right, maxi);
      maxi[0]=Math.max(maxi[0], leftHeight+rightHeight);
      return 1+Math.max(leftHeight, rightHeight);
    }
    public static int computeDiameter(MyTree root){
        int[] maxi=new int[1];
        assistDiameter(root,maxi);
        return maxi[0];
    }
    public static MyTree LowestCommonAncestor(MyTree root, MyTree p, MyTree q) {
        if(root==null || root.data==p.data || root.data==q.data){
            return root;
        }
        MyTree left=LowestCommonAncestor(root.left, p, q);
        MyTree right=LowestCommonAncestor(root.right, p, q);
        if(left==null){
            return right;
        }
        else if(right==null){
            return left;
        }
        else{
            return root;
        }
    }
    public static List<List<Integer>> verticalTraversal(MyTree root) {
    TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> colRowMap = new TreeMap<>();
    Queue<Pair<MyTree, Pair<Integer, Integer>>> q = new LinkedList<>();
    q.offer(new Pair<>(root, new Pair<>(0, 0)));
    while (!q.isEmpty()) {
        Pair<MyTree, Pair<Integer, Integer>> randPair = q.poll();
        MyTree node = randPair.first;
        int col = randPair.second.first;
        int row = randPair.second.second;
        colRowMap.putIfAbsent(col, new TreeMap<>());
        colRowMap.get(col).putIfAbsent(row, new PriorityQueue<>());
        colRowMap.get(col).get(row).offer(node.data);
        if (node.left != null){
            q.offer(new Pair<>(node.left, new Pair<>(col - 1, row + 1)));
        }
        if (node.right != null){
            q.offer(new Pair<>(node.right, new Pair<>(col + 1, row + 1)));
            }
    }
    List<List<Integer>> result = new ArrayList<>();
    for (TreeMap<Integer, PriorityQueue<Integer>> col : colRowMap.values()) {
        List<Integer> colList = new ArrayList<>();
        for (PriorityQueue<Integer> pq : col.values()) {
            while (!pq.isEmpty()) {
                colList.add(pq.poll());
            }
        }
        result.add(colList);
    }
    return result;
}
private static List<Integer> assistVerticalOrder(List<List<Integer>> vOrd){
    List<Integer> colIndices=new LinkedList<>();
    int colNum = -1 * (vOrd.size() / 2);
    for(int i=0;i<vOrd.size();i++){
        colIndices.add(colNum);
        colNum++;
    }
    return colIndices;
}
public static void displayVerticalOrder(List<List<Integer>> vOrd){
 System.out.println("== Vertical Order Traversal ==");
   List<Integer> columnIndices=assistVerticalOrder(vOrd);
    for (int col : columnIndices) {
        System.out.printf("C%-4d", col); 
    }
    System.out.println();
    int maxHeight = 0;
    for (List<Integer> col : vOrd) {
        maxHeight = Math.max(maxHeight, col.size());
    }
    for (int row = 0; row < maxHeight; row++) {
        for (List<Integer> col : vOrd) {
            if (row < col.size()) {
                System.out.printf("%-6d", col.get(row));
            } else {
                System.out.printf("%-6s", ""); // print blank space
            }
        }
        System.out.println();
    }
}
public static boolean rootToNodePath(MyTree root,int toNode,List<Integer> path){
    if(root==null){
        return false;
    }
    path.add(root.data);
    if(root.data==toNode){
     return true;
    }
    if(rootToNodePath(root.left,toNode,path) || rootToNodePath(root.right,toNode,path) == true){
        return true;
    }
    path.removeLast();
    return false;
}
public static List<Integer> topView(MyTree root){
List<Integer> tView=new LinkedList<>();
TreeMap<Integer,Integer> nodes=new TreeMap<>();
Queue<Pair<MyTree,Integer>> q=new LinkedList<>();
q.offer(new Pair<>(root,0));
while(!q.isEmpty()){
    Pair<MyTree,Integer> randPair=q.poll();
    MyTree randNode=randPair.first;
    int col=randPair.second;
    if(!nodes.containsKey(col)){
        nodes.put(col, randNode.data);
    }
    if(randNode.left!=null){
        q.offer(new Pair<>(randNode.left, col-1));
    }
    if(randNode.right!=null){
        q.offer(new Pair<>(randNode.right, col+1));
    }
}
for(int it:nodes.values()){
    tView.add(it);
}
return tView;
}
private static void assistRightView(MyTree root,List<Integer> rView,int lvl){
   if(root==null){
    return;
   }
   if(rView.size()==lvl){
    rView.add(root.data);
   }
   assistRightView(root.right,rView,lvl+1);
   assistRightView(root.left,rView,lvl+1);
}
public static List<Integer> rightSideView(MyTree root){
        List<Integer> rView=new LinkedList<>();
        int lvl=0;
        assistRightView(root,rView,lvl);
        return rView;
}
public static List<Integer> bottomView(MyTree root){
List<Integer> bView=new LinkedList<>();
TreeMap<Integer,Integer> nodes=new TreeMap<>();
Queue<Pair<MyTree,Integer>> q=new LinkedList<>();
q.offer(new Pair<>(root,0));
while(!q.isEmpty()){
    Pair<MyTree,Integer> randPair=q.poll();
    MyTree randNode=randPair.first;
    int col=randPair.second;
    nodes.put(col, randNode.data);
    if(randNode.left!=null){
        q.offer(new Pair<>(randNode.left, col-1));
    }
    if(randNode.right!=null){
        q.offer(new Pair<>(randNode.right, col+1));
    }
}
for(int it:nodes.values()){
    bView.add(it);
}
return bView;
}
private static void assistLeftView(MyTree root,List<Integer> lView,int lvl){
   if(root==null){
    return;
   }
   if(lView.size()==lvl){
    lView.add(root.data);
   }
   assistRightView(root.left,lView,lvl+1);
   assistRightView(root.right,lView,lvl+1);
}
public static List<Integer> leftSideView(MyTree root){
        List<Integer> lView=new LinkedList<>();
        int lvl=0;
        assistLeftView(root,lView,lvl);
        return lView;
}
    public static List<List<Integer>> invertTree(MyTree root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return null;
        Queue<MyTree> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                MyTree node = q.poll();
                level.add(node.data);
                if (node.right != null) q.offer(node.right);
                if (node.left != null) q.offer(node.left);
            }
            result.add(level);
        }
        return result;
    }
    private static boolean isLeaf(MyTree node) {
        return node.left == null && node.right == null;
    }
    private static List<Integer> addLeftBoundary(MyTree node, List<Integer> res) {
        MyTree curNode = node.left;
        List<Integer> leftBoundary=new LinkedList<>();
        while (curNode != null) {
            if (!isLeaf(curNode)){
                res.add(curNode.data);
                leftBoundary.add(curNode.data);
            }
            if (curNode.left != null) curNode = curNode.left;
            else curNode = curNode.right;
        }
        return leftBoundary;
    }
    private static List<Integer> addRightBoundary(MyTree node, List<Integer> res) {
        MyTree curNode = node.right;
        List<Integer> rightBoundary=new LinkedList<>();
        Stack<Integer> temp = new Stack<>();
        while (curNode != null) {
            if (!isLeaf(curNode)) temp.push(curNode.data);
            if (curNode.right != null) curNode = curNode.right;
            else curNode = curNode.left;
        }
        while (!temp.isEmpty()) {
            int randVar=temp.pop();
            rightBoundary.add(randVar);
            res.add(randVar);
        }
        return rightBoundary;
    }
    private static void addLeaves(MyTree root,List<Integer> res,List<Integer> leaves) {
        if (root == null) return;
        if (isLeaf(root)) {
            res.add(root.data);
            leaves.add(root.data);
            return;
        }
        addLeaves(root.left,res,leaves);
        addLeaves(root.right,res,leaves);
    }
    public static List<List<Integer>> boundaryTraversal(MyTree root) {
        List<Integer> boundaryTraversalList = new LinkedList<>();
        List<List<Integer>> allBoundaries=new LinkedList<>();
        if (root == null) return allBoundaries;
        if (!isLeaf(root)) boundaryTraversalList.add(root.data);
        List<Integer> leftBoundary=addLeftBoundary(root,boundaryTraversalList);
        List<Integer> leafNodes=new LinkedList<>();
        addLeaves(root,boundaryTraversalList,leafNodes);
        List<Integer> rightBoundary=addRightBoundary(root, boundaryTraversalList);
        allBoundaries.add(leftBoundary);
        allBoundaries.add(leafNodes);
        allBoundaries.add(rightBoundary);
        allBoundaries.add(boundaryTraversalList);
        return allBoundaries;
    }
    public static List<Integer> leafNodes(MyTree root,List<Integer> leaves){
        if(root==null){
            return null;
        }
        if(isLeaf(root)){
            leaves.add(root.data);
            return null;
        }
        leafNodes(root.left,leaves);
        leafNodes(root.right, leaves);
        return leaves;
    }
}