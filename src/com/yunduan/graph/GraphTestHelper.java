package com.yunduan.graph;


import java.util.Random;

public class GraphTestHelper {


    public void testDenseGraph(int n,int m){

        Random random = new Random();

        DenseGraph denseGraph = new DenseGraph(n,false);
        for(int i = 0;i<m;i++){
            int a = random.nextInt(n);
            int b = random.nextInt(n);
            denseGraph.addEdge(a,b);
        }

        for(int v = 0;v<n;v++){
            Iterable<Integer> denseGraphIterator = denseGraph.adj(v);
            System.out.print(v+": ");
            for(int a:denseGraphIterator){
                System.out.print(a+"  ");
            }
            System.out.println();
        }
    }

    public void testSparseGraph(int n,int m){

        Random random = new Random();

        SparseGraph sparseGraph = new SparseGraph(n,false);
        for(int i = 0;i<m;i++){
            int a = random.nextInt(n);
            int b = random.nextInt(n);
            sparseGraph.addEdge(a,b);
        }

        for(int v = 0;v<n;v++){
            Iterable<Integer> sparseGraphIterator = sparseGraph.adj(v);
            System.out.print(v+": ");
            for(int a:sparseGraphIterator){
                System.out.print(a+"  ");
            }
            System.out.println();
        }
    }
}
