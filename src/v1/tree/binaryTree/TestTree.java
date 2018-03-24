package v1.tree.binaryTree;

import java.util.Random;

public class TestTree {
    public static void main(String[] args) {
        Random random = new Random();

        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        for(int i =0;i<10;i++){
            binarySearchTree.insert(random.nextInt(30));
        }

        binarySearchTree.printTree();
    }
}
