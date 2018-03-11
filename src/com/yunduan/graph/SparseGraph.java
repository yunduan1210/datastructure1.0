package com.yunduan.graph;


import java.util.ArrayList;
import java.util.List;

//邻接表实现稀疏图
public class SparseGraph {
    private int n;   //节点数
    private int m;   //边数
    private boolean directed;

    private ArrayList<ArrayList<Integer>> g;

    public SparseGraph(int n, boolean directed) {
        this.n = n;
        this.m = 0;
        this.directed = directed;
        this.g = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<Integer>());
        }
    }

    public int V() {
        return n;
    }

    public int E() {
        return m;
    }

    // 向图中添加一个边
    public void addEdge(int v, int w) {
        if (v < 0 && v >= n && w < 0 && w >= n) {
            throw new RuntimeException();
        }
        if (hasEdge(v, w)) {
            return;
        }
        g.get(v).add(w);
        if (!directed && v != w) {    //v!=w   自环边的情况
            g.get(w).add(v);
        }
    }

    // 验证图中是否有从v到w的边
    public boolean hasEdge(int v, int w) {
        for (int i = 0; i < g.get(v).size(); i++) {
            if (g.get(v).get(i) == w) {
                return true;
            }
        }
        return false;
    }

    public Iterable<Integer> adj(int v){
        if(v<0||v>=n){
            throw new RuntimeException();
        }

        List<Integer> adjV = new ArrayList<>();
        for(int i = 0;i<g.get(v).size();i++){
            adjV.add(g.get(v).get(i));
        }
        return adjV;
    }
}
