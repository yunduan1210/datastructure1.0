package com.yunduan.union;

//基于size的优化，将集合少的并到集合多的，减少层数，但是也有特殊情况，如UnionFind4
public class UnionFind3 {
    private int[] parent;
    private int count;
    private int[] sz; //添加了size

    public UnionFind3(int count) {
        this.parent = new int[count];
        this.sz = new int[count];
        this.count = count;
        for(int i = 0;i<count;i++){
            parent[i] = i;
            sz[i] = 1;
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
        if(sz[pRoot] < sz[qRoot]) {
            parent[pRoot] = qRoot;
            sz[qRoot] += sz[pRoot];
        }else {
            parent[qRoot] = pRoot;
            sz[pRoot] += sz[qRoot];
        }
    }

    public boolean isConnected(int p,int q){
        return find(p) == find(q);
    }
}
