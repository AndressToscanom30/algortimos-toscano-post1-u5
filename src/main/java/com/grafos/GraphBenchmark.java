package com.grafos;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class GraphBenchmark {

    @Param({"sparse", "medium", "dense"})
    public String density;

    Graph<Integer> listGraph;
    MatrixGraph matGraph;

    static final int V = 500;

    @Setup(Level.Trial)
    public void setup() {
        int E = switch (density) {
            case "sparse" -> V * 2;
            case "medium" -> V * 10;
            default -> V * V / 4;
        };

        listGraph = RandomGraphGen.buildList(V, E);
        matGraph = RandomGraphGen.buildMatrix(V, E);
    }

    @Benchmark
    public int[] bfsList() {
        return BFS.shortestDistances(listGraph, 0);
    }

    @Benchmark
    public int[] bfsMatrix() {
        return BFSMatrix.run(matGraph, 0);
    }
}