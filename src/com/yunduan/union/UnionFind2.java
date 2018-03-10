package com.yunduan.union;

public class UnionFind2 {
    private int[] parent;
    private int count;

    public UnionFind2(int count) {
        this.parent = new int[count];
        this.count = count;
        for(int i = 0;i<count;i++){
            parent[i] = i;
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
        parent[pRoot] = qRoot;
    }

    public boolean isConnected(int p,int q){
        return find(p) == find(q);
    }
}
