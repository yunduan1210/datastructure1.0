package com.yunduan.graph;

import org.junit.Test;

public class GraphTest {

     int n = 20;
     int m = 100;
     GraphTestHelper graphTestHelper = new GraphTestHelper();

     @Test
     public void TestGraph(){
         graphTestHelper.testDenseGraph(n,m);
         System.out.println();
         graphTestHelper.testSparseGraph(n,m);
     }


}
