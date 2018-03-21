package com.yunduan.graph;

import org.junit.Test;

public class GraphTest {

    int n = 20;
    int m = 100;
    GraphTestHelper graphTestHelper = new GraphTestHelper();
    ReadGraph readGraph = new ReadGraph();

    @Test
    public void TestGraph() {
        Graph denseGraph = graphTestHelper.createRandomDenseGraph(n, m);
        denseGraph.show();
        System.out.println();
        Graph sparseGraph = graphTestHelper.createRandomSparseGraph(n, m);
        sparseGraph.show();
    }

    @Test
    public void TestGraph2() {
        DenseGraph denseGraph = new DenseGraph(13, false);
        readGraph.readGraph(denseGraph, "/Users/hong/IdeaProjects/datastructure1.0/src/com/yunduan/graph/resource/testG1.txt");
        denseGraph.show();
        System.out.println();
        SparseGraph sparseGraph = new SparseGraph(6, false);
        readGraph.readGraph(sparseGraph, "/Users/hong/IdeaProjects/datastructure1.0/src/com/yunduan/graph/resource/testG2.txt");
        sparseGraph.show();
    }


}
