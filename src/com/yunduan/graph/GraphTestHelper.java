package com.yunduan.graph;


import java.util.Random;

public class GraphTestHelper {


    public Graph createRandomDenseGraph(int n,int m){

        Random random = new Random();

        DenseGraph denseGraph = new DenseGraph(n,false);
        for(int i = 0;i<m;i++){
            int a = random.nextInt(n);
            int b = random.nextInt(n);
            denseGraph.addEdge(a,b);
        }
        return denseGraph;
    }

    public Graph createRandomSparseGraph(int n,int m){

        Random random = new Random();

        SparseGraph sparseGraph = new SparseGraph(n,false);
        for(int i = 0;i<m;i++){
            int a = random.nextInt(n);
            int b = random.nextInt(n);
            sparseGraph.addEdge(a,b);
        }
        return sparseGraph;
    }
}
