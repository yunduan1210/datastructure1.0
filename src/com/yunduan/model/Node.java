package com.yunduan.model;

public class Node {
    private int key;
    private int value;
    private Node left;
    private Node right;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
