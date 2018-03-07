package com.yunduan.tree;

import com.yunduan.model.Node;

import java.util.PriorityQueue;
import java.util.Queue;

public class BST {
    private Node root;
    private int count;

    public BST() {
        this.root = null;
        this.count = 0;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public void insert(int key, int value) {
        root = insert(root, key, value);
    }

    /**
     * 向以node为节点为根的二叉搜索树中，插入节点（key,value）
     * 返回插入新节点后的二叉搜索树的根
     *
     * @param node
     * @param key
     * @param value
     * @return
     */
    private Node insert(Node node, int key, int value) {

        if (node == null) {
            count++;
            return new Node(key, value);
        }

        if (key == node.getKey()) {
            node.setValue(value);
        } else if (key < node.getKey()) {
            node.setLeft(insert(node.getLeft(), key, value));
        } else if (key > node.getKey()) {
            node.setRight(insert(node.getRight(), key, value));
        }

        return node;
    }

    public boolean contain(int key) {
        return contain(key, this.root);
    }

    public Integer search(int key) {
        return search(key, root);
    }

    //前序遍历 根 左 右
    public void preOrder() {
        preOrder(root);
    }

    //中序遍历 左 根 右
    public void inOrder() {
        inOrder(root);
    }

    //后序遍历 左 右 根
    public void postOrder() {
        postOrder(root);
    }

    //层序遍历  ??????
    public void levelOrder() {
        Queue<Node> queue = new PriorityQueue<>();
        queue.add(root);
        while (!queue.isEmpty()) {

            System.out.print(root.getKey() + " ");

            if (root.getLeft() != null) {
                queue.add(root.getLeft());
            }
            if (root.getRight() != null) {
                queue.add(root.getRight());
            }
        }
    }

    /**
     *
     * @return 二叉树最小值
     */
    public Integer minimum() {
        if(count == 0){
            return null;
        }
        return Integer.valueOf(minimum(root).getKey());
    }

    /**
     *
     * @return 二叉树最大值
     */
    public Integer maximum(){
        if(count == 0){
            return null;
        }
        return Integer.valueOf(maximum(root).getKey());
    }

    /**
     *
     * @return
     */
    public void removeMin(){
        if(count == 0){
            return;
        }
        removeMin(root);
    }

    private Node removeMin(Node node){
        if(node.getLeft()==null){
            Node rightNode = node.getRight();
            count--;
            return rightNode;
        }
        node.setLeft(removeMin(root.getLeft()));
        return node;
    }

    private Node maximum(Node node){
        if(node.getRight()==null){
            return node;
        }
        return maximum(node.getRight());
    }

    private Node minimum(Node node) {
        if (node.getLeft() == null) {
            return node;
        }
        return minimum(node.getLeft());
    }

    private void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.getKey() + " ");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    private void inOrder(Node root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.print(root.getKey() + " ");
            inOrder(root.getRight());
        }
    }

    private void postOrder(Node root) {
        if (root != null) {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getKey() + " ");
        }
    }

    private boolean contain(int key, Node root) {
        if (root == null) {
            return false;
        }

        if (root.getKey() == key) {
            return true;
        } else if (root.getKey() > key) {
            return contain(key, root.getLeft());
        } else {
            return contain(key, root.getRight());
        }
    }

    private Integer search(int key, Node root) {

        if (root == null) {
            return null;
        }

        if (root.getKey() == key) {
            return Integer.valueOf(root.getValue());
        } else if (root.getKey() < key) {
            return search(key, root.getRight());
        } else {
            return search(key, root.getLeft());
        }
    }

    //非递归的写法
}
