package v1.tree.binaryTree;

import java.nio.BufferUnderflowException;

public class BinarySearchTree<T extends Comparable<? super T>> {
    private BinaryNode<T> binaryNode;

    private BinaryNode<T> root;

    public BinarySearchTree() {
        root = null;
    }

    public void makeEmpty() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean contains(T x) {
        return contains(x, root);
    }

    public T findMin() {
        if (isEmpty()) {
            throw new BufferUnderflowException();
        }
        return findMin(root).elem;
    }

    public T findMax() {
        if (isEmpty()) {
            throw new BufferUnderflowException();
        }
        return findMax(root).elem;
    }

    public void insert(T x) {
        root = insert(x, root);
    }

    public void remove(T x) {
        root = remove(x, root);
    }

    public void printTree(){
        preOrderPrintTree(root);
    }


    private boolean contains(T x, BinaryNode<T> t) {
        if (t == null) {
            return false;
        }
        int compareResult = x.compareTo(t.elem);
        if (compareResult < 0) {
            return contains(x, t.left);
        } else if (compareResult > 0) {
            return contains(x, t.right);
        } else {
            return true;
        }
    }

    private BinaryNode<T> findMin(BinaryNode<T> t) {
        if (t == null) {
            return null;
        } else if (t.left == null) {
            return t;
        } else {
            return findMin(t.left);
        }
    }

    private BinaryNode<T> findMax(BinaryNode<T> t) {
        if (t == null) {
            return null;
        } else if (t.right == null) {
            return t;
        } else {
            return findMax(t.right);
        }
    }

    private BinaryNode<T> insert(T x, BinaryNode t) {
        if (t == null) {
            return new BinaryNode<>(x, null, null);
        }
        int compareResult = x.compareTo((T) t.elem);
        if (compareResult < 0) {
            t.left = insert(x, t.left);
        } else if (compareResult > 0) {
            t.right = insert(x, t.right);
        } else
            t.elem = x;
        return t;
    }

    private BinaryNode<T> remove(T x, BinaryNode<T> t) {
        if (t == null) {
            return null;
        }

        int compareResult = x.compareTo(t.elem);

        if (compareResult < 0) {
            t.left = remove(x, t.left);
        } else if (compareResult > 0) {
            t.right = remove(x, t.right);
        } else if (t.left != null && t.right != null) {
            t.elem = findMin(t.right).elem;
            t.right = remove(x, t.right);
        } else {
            t = (t.left != null) ? t.left:t.right;
        }
        return t;
    }

    private void preOrderPrintTree(BinaryNode<T> t){
        if(t!=null) {
            System.out.println(t.elem);
            preOrderPrintTree(t.left);
            preOrderPrintTree(t.right);
        }
    }

    private void inOrderPrintTree(BinaryNode<T> t){
        if(t!=null) {
            inOrderPrintTree(t.left);
            System.out.println(t.elem);
            inOrderPrintTree(t.right);
        }
    }

    private void postOrderPrintTree(BinaryNode<T> t){
        if(t!=null) {
            preOrderPrintTree(t.left);
            preOrderPrintTree(t.right);
            System.out.println(t.elem);
        }
    }
}
