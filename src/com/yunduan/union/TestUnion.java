package com.yunduan.union;


import org.junit.Test;

public class TestUnion {

    @Test
    public void test() {


        int n = 100000;

        UnionTestHelper unionTestHelper = new UnionTestHelper();
//        unionTestHelper.testUnionFind(n);
//
//        unionTestHelper.testUnionFind2(n);

        unionTestHelper.testUnionFind3(n);

        unionTestHelper.testUnionFind4(n);

        unionTestHelper.testUnionFind5(n);
    }
}
