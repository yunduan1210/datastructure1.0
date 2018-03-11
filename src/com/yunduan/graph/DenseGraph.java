package com.yunduan.graph;

import java.util.ArrayList;
import java.util.Iterator;

public class DenseGraph {
    private int n;
    private int m;

    private boolean directed;   //判断是有向图还是无向图

    private boolean[][] g;

    public DenseGraph(int n, boolean directed) {
        this.n = n;
        this.m = 0;

        // g初始化为n*n的布尔矩阵, 每一个g[i][j]均为false, 表示没有任和边
        // false为boolean型变量的默认值
        g = new boolean[n][n];

    }

    //节点数
    public int V() {
        return n;
    }

    //边数
    public int E() {
        return m;
    }

    public void addEdge(int v, int w) {
        if (hasEdge(v, w)) {
            return;
        }
        g[v][w] = true;

        //判断是不是有向图
        if (!directed) {
            g[w][v] = true;
        }
        m++;
    }

    public boolean hasEdge(int v, int w) {
        if (v < 0 || v >= n || w < 0 || w >= n) {
            throw new RuntimeException();
        }
        return g[v][w];
    }

    //遍历节点
    public Iterable<Integer> adj(int v){
        if(v<0||v>=n){
            throw new RuntimeException();
        }
        ArrayList<Integer> adjV = new ArrayList<>();
        for(int i = 0;i<n;i++){
            if(g[v][i] == true){
                adjV.add(i);
            }
        }
        return adjV;
    }
}

