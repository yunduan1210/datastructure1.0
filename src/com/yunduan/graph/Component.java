package com.yunduan.graph;

//求无权图的联通分量
public class Component {
    private Graph g;

    private boolean[] visited;  //记录节点是否被访问过
    private int[] id;     //每个节点所对应的联通分量标记
    private int ccount;   //记录联通分量个数


    //图的深度优先遍历
    public void dfs(int v){

        visited[v] = true;
        id[v] = ccount;

        for(int i:g.adj(v)){
            if(!visited[i]){
                dfs(i);
            }
        }
    }
}
