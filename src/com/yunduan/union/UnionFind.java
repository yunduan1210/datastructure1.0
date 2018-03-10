package com.yunduan.union;

public class UnionFind {
    private int[] id;
    private int count;

    //初始化数组，每个都是单独的
    public UnionFind(int count) {
        this.id = new int[count];
        this.count = count;
        for(int i = 0;i<count;i++){
            id[i] = i;
        }
    }

    public int find(int p) {
        if (p < 0 && p >= count) {
            throw new RuntimeException();
        }
        return id[p];
    }

    public void union(int p, int q) {
        int pId = find(p);
        int qId = find(q);

        if (pId == qId) {
            return;
        }

        for (int i = 0; i < count; i++) {
            if (id[i] == pId)
                id[i] = qId;
        }
    }

    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }


}
