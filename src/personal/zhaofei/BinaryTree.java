package personal.zhaofei;

/**
 * @author zf
 * @description 自实现一个二叉树
 */
public class BinaryTree {
    private int data;

    BinaryTree left; //左节点

    BinaryTree right; //右节点

    public BinaryTree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    //插入代码
    public void insert(BinaryTree binaryTree, int data){
        if(binaryTree.data < data){
            if(binaryTree.right == null){
                binaryTree.right = new BinaryTree(data);
            }else {
                insert(binaryTree.right,data);
            }
        }else {
            if(binaryTree.left == null){
                binaryTree.left = new BinaryTree(data);
            }else {
                insert(binaryTree.left,data);
            }
        }
    }

    //中序遍历 左 根 右
    public void in(BinaryTree binaryTree) {
        if(binaryTree != null){
            in(binaryTree.left);
            System.out.print(binaryTree.data+" ");
            in(binaryTree.right);
        }
    }

    //测试
    public static void main(String[] args) {
        int data[] = {3,5,7,0,8,9};
        BinaryTree binaryTree = new BinaryTree(data[0]); //初始化有一个根的二叉tree

        for (int i = 1; i < data.length; i++) {
            binaryTree.insert(binaryTree,data[i]);
        }

        System.out.println("--------");

        binaryTree.in(binaryTree);
    }
}
