package com.yunduan.union;

import java.util.Random;

public class UnionTestHelper {
    private static final int CLOCKS_PER_SEC = 1000;

    public void testUnionFind(int n){
        Random random = new Random();
        UnionFind uf  = new UnionFind(n);

        double start = System.currentTimeMillis();
        for(int i = 0;i<n;i++){
            int a = random.nextInt(n);
            int b = random.nextInt(n);

            uf.union(a,b);
        }

        for(int i = 0;i<n;i++){
            int a = random.nextInt(n);
            int b = random.nextInt(n);
            uf.isConnected(a,b);
        }
        double end = System.currentTimeMillis();

        System.out.println("UnionFind,"+2*n+"ops,"+(end-start)/CLOCKS_PER_SEC);
    }

    public void testUnionFind2(int n){
        Random random = new Random();
        UnionFind2 uf  = new UnionFind2(n);

        double start = System.currentTimeMillis();
        for(int i = 0;i<n;i++){
            int a = random.nextInt(n);
            int b = random.nextInt(n);

            uf.union(a,b);
        }

        for(int i = 0;i<n;i++){
            int a = random.nextInt(n);
            int b = random.nextInt(n);
            uf.isConnected(a,b);
        }
        double end = System.currentTimeMillis();

        System.out.println("UnionFind2,"+2*n+"ops,"+(end-start)/CLOCKS_PER_SEC);
    }

    public void testUnionFind3(int n){
        Random random = new Random();
        UnionFind3 uf  = new UnionFind3(n);

        double start = System.currentTimeMillis();
        for(int i = 0;i<n;i++){
            int a = random.nextInt(n);
            int b = random.nextInt(n);

            uf.union(a,b);
        }

        for(int i = 0;i<n;i++){
            int a = random.nextInt(n);
            int b = random.nextInt(n);
            uf.isConnected(a,b);
        }
        double end = System.currentTimeMillis();

        System.out.println("UnionFind3,"+2*n+"ops,"+(end-start)/CLOCKS_PER_SEC);
    }


    public void testUnionFind4(int n){
        Random random = new Random();
        UnionFind4 uf  = new UnionFind4(n);

        double start = System.currentTimeMillis();
        for(int i = 0;i<n;i++){
            int a = random.nextInt(n);
            int b = random.nextInt(n);

            uf.union(a,b);
        }

        for(int i = 0;i<n;i++){
            int a = random.nextInt(n);
            int b = random.nextInt(n);
            uf.isConnected(a,b);
        }
        double end = System.currentTimeMillis();

        System.out.println("UnionFind4,"+2*n+"ops,"+(end-start)/CLOCKS_PER_SEC);
    }

    public void testUnionFind5(int n){
        Random random = new Random();
        UnionFind5 uf  = new UnionFind5(n);

        double start = System.currentTimeMillis();
        for(int i = 0;i<n;i++){
            int a = random.nextInt(n);
            int b = random.nextInt(n);

            uf.union(a,b);
        }

        for(int i = 0;i<n;i++){
            int a = random.nextInt(n);
            int b = random.nextInt(n);
            uf.isConnected(a,b);
        }
        double end = System.currentTimeMillis();

        System.out.println("UnionFind5,"+2*n+"ops,"+(end-start)/CLOCKS_PER_SEC);
    }
}
