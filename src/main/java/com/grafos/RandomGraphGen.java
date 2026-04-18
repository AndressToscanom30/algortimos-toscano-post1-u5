package com.grafos;

import java.util.Random;

/**
 * Generador de grafos aleatorios para pruebas de rendimiento.
 */
public class RandomGraphGen {

    private static final Random rand = new Random();

    public static Graph<Integer> buildList(int V, int E) {
        Graph<Integer> g = new Graph<>();

        for (int i = 0; i < V; i++) g.addVertex(i);

        for (int i = 0; i < E; i++) {
            int u = rand.nextInt(V);
            int v = rand.nextInt(V);
            if (u != v) g.addEdge(u, v);
        }

        return g;
    }

    public static MatrixGraph buildMatrix(int V, int E) {
        MatrixGraph g = new MatrixGraph(V);

        for (int i = 0; i < E; i++) {
            int u = rand.nextInt(V);
            int v = rand.nextInt(V);
            if (u != v) g.addEdge(u, v);
        }

        return g;
    }
}