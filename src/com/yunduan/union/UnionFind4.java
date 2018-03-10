package com.yunduan.union;

//基于rank的优化
public class UnionFind4 {
    private int[] parent;
    private int count;
    private int[] rank; //rank[i]表示以为根的集合所表示的树的层数

    public UnionFind4(int count) {
        this.parent = new int[count];
        this.rank = new int[count];
        this.count = count;
        for(int i = 0;i<count;i++){
            parent[i] = i;
            rank[i] = 1;
        }
    }

    public int find(int p){
        if(p<0&&p>=count){
            throw new RuntimeException();
        }
        while(p!=parent[p]){
            p=parent[p];
        }
        return p;
    }

    public void union(int p,int q){
        int pRoot = find(p);
        int qRoot = find(q);

        if(pRoot == qRoot){
            return;
        }
        if(rank[pRoot] < rank[qRoot]) {
            parent[pRoot] = qRoot;
        }else if(rank[qRoot]<rank[pRoot]){
            parent[qRoot] = pRoot;
        }else{    //rank[pRoot] == rank[qRoot]
            parent[pRoot] = qRoot;
            rank[qRoot] += 1;
        }
    }

    public boolean isConnected(int p,int q){
        return find(p) == find(q);
    }
}
