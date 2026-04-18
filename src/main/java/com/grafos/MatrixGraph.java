package com.grafos;

public class MatrixGraph {

    private final int[][] matrix;
    private final int V;

    public MatrixGraph(int V) {
        this.V = V;
        matrix = new int[V][V];
    }

    public void addEdge(int u, int v) {
        matrix[u][v] = 1;
        matrix[v][u] = 1;
    }

    public int size() { return V; }

    public int[] neighbors(int u) {
        int[] temp = new int[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (matrix[u][i] == 1) {
                temp[count++] = i;
            }
        }

        return java.util.Arrays.copyOf(temp, count);
    }
}