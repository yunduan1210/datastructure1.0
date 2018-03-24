package v1.tree.binaryTree;

public class BinaryNode<T> {
    T elem;
    BinaryNode<T> left;
    BinaryNode<T> right;

    public BinaryNode(T elem){
        this(elem,null,null);
    }

    public BinaryNode(T elem, BinaryNode<T> left, BinaryNode<T> right) {
        this.elem = elem;
        this.left = left;
        this.right = right;
    }
}
