package Top100;

import java.util.TreeMap;

public class VerticalSum {
    public static void main(String args[]){
        TreeNode root = createBinaryTree();
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        getVerticalSum(root, treeMap, 0);
        System.out.println(treeMap);
    }

    private static void getVerticalSum(TreeNode root, TreeMap<Integer, Integer> treeMap, int level) {
        if(root == null){
            return;
        }
        if(treeMap.containsKey(level)){
            treeMap.put(level, treeMap.get(level)+root.data);
        }
        else {
            treeMap.put(level,root.data);
        }
        getVerticalSum(root.left,treeMap,level-1);
        getVerticalSum(root.right,treeMap,level+1);
    }

    static TreeNode createBinaryTree(){
        TreeNode root =new TreeNode(40);
        root.left = new TreeNode(20);
        root.right = new TreeNode(60);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(30);
        root.left.right.left = new TreeNode(5);
        root.right.left = new TreeNode(50);
        root.right.left.right = new TreeNode(55);
        root.right.right = new TreeNode(70);
        return root;
    }
}
class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}