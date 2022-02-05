package com.company;

public class Main {

    public static void main(String[] args) {

        Vertices v1 = new Vertices(1);
        Vertices v2 = new Vertices(2);
        Vertices v3 = new Vertices(3);
        Vertices v4 = new Vertices(4);
        Vertices v5 = new Vertices(5);
        Vertices v6 = new Vertices(6);
        Vertices v7 = new Vertices(7);
        Vertices v8 = new Vertices(8);
        Vertices v9 = new Vertices(9);
        Vertices v10 = new Vertices(10);
        Vertices v11 = new Vertices(11);
        Vertices v12 = new Vertices(12);
        Vertices v13 = new Vertices(13);
        Vertices v14 = new Vertices(14);
        Vertices v15 = new Vertices(15);

        Graph graph = new Graph();

        Edge e0 =  new Edge("0");
        Edge e11 =  new Edge("11");
        Edge e9 =  new Edge("9");
        Edge e7 =  new Edge("7");
        Edge e8 =  new Edge("8");
        Edge e10 =  new Edge("10");
        Edge e1 =  new Edge("1");
        Edge e6 =  new Edge("6");
        Edge e5 =  new Edge("5");
        Edge e3 =  new Edge("3");
        Edge e4 =  new Edge("4");
        Edge e12 =  new Edge("12");
        Edge e2 =  new Edge("2");

        graph.connectEdges(e0, e11, v1);
        graph.connectEdges(e0, e9, v15);
        graph.connectEdges(e0, e7, v7);
        graph.connectEdges(e7, e6, v3);
        graph.connectEdges(e6, e5, v4);
        graph.connectEdges(e7, e3, v5);
        graph.connectEdges(e11, e7, v2);
        graph.connectEdges(e3, e4, v6);
        graph.connectEdges(e9, e10, v9);
        graph.connectEdges(e9, e8, v8);
        graph.connectEdges(e10, e1, v10);
        graph.connectEdges(e1, e8, v11);
        graph.connectEdges(e8, e12, v12);
        graph.connectEdges(e12, e2, v13);
        graph.connectEdges(e2, e3, v14);

        System.out.println("BFS " + graph.breathFirstSearchAlgorithm(e0, "2").getLabel());
        System.out.println("DFS " + graph.depthFirstSearch(e0, "12").getLabel());
    }
}
