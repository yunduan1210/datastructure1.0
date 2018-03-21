package com.yunduan.graph;

public interface Graph {
    int V();            //返回顶点数

    int E();            //返回边数

    void addEdge(int v, int w);       //添加边

    boolean hasEdge(int v, int w);     //判断两个节点是否有边

    Iterable<Integer> adj(int n);   //遍历图

    void show();    //显示图信息
}
