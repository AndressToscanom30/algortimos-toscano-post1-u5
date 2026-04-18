package com.grafos;

import java.util.*;

public class BFSMatrix {

    public static int[] run(MatrixGraph g, int src) {
        int V = g.size();
        int[] dist = new int[V];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new ArrayDeque<>();
        dist[src] = 0;
        q.offer(src);

        while (!q.isEmpty()) {
            int u = q.poll();

            for (int v : g.neighbors(u)) {
                if (dist[v] == -1) {
                    dist[v] = dist[u] + 1;
                    q.offer(v);
                }
            }
        }

        return dist;
    }
}