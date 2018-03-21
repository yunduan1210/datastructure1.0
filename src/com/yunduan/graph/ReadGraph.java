package com.yunduan.graph;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadGraph {

    private Scanner scanner;

    public void readGraph(Graph graph, String fileName) {
        readFile(fileName);

        try {
            int v = scanner.nextInt();
            if (v < 0) {
                throw new IllegalArgumentException("number of vertices in a Graph must be nonnegative");
            }

            int e = scanner.nextInt();
            if (e < 0) {
                throw new IllegalArgumentException("number of edges in a Graph must be nonnegative");
            }

            for (int i = 0; i < e; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if (a >= 0 && a < v && b >= 0 && b < v) {
                    graph.addEdge(a, b);
                }
            }
        } catch (InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException("attempts to read an 'int' value from input stream, but the next token is \"" + token + "\"");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("attemps to read an 'int' value from input stream, but there are no more tokens available");
        }
    }


    private void readFile(String filename) {
        if (filename == null) {
            throw new RuntimeException();
        }

        try {
            File file = new File(filename);
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                scanner = new Scanner(new BufferedInputStream(fis), "UTF-8");
                scanner.useLocale(Locale.ENGLISH);
            }
            else
                throw new IllegalArgumentException(filename + "doesn't exist.");
        }
        catch (IOException ioe) {
            throw new IllegalArgumentException("Could not open " + filename, ioe);
        }
    }

}
