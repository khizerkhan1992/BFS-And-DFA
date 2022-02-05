package com.company;

import java.util.*;

public class Graph {


    private List<Edge> nextVisitEdgeList = new ArrayList<>();
    private Map<Edge, Boolean> edgesHaveVisited = new HashMap<>();

    private Map<Edge, Boolean> dfsEdgesHaveVisited = new HashMap<>();

    public Boolean connectEdges(Edge edgeA, Edge edgeB, Vertices vertices){

        edgeA.getVertices().add(vertices);
        vertices.setEdge2(edgeB);
        vertices.setEdge1(edgeA);
        edgeB.getVertices().add(vertices);
        return true;
    }


    /*
    start: is an edge from where we need to start searching
    label: is the label of edge that we want to search
    */
    public Edge breathFirstSearchAlgorithm(Edge start, String label){

        edgesHaveVisited.put(start, Boolean.TRUE);

        if(nextVisitEdgeList.size() > 0)
            nextVisitEdgeList.remove(0);

        for(Vertices v: start.getVertices()){

            if (v.getEdge1().getLabel().equalsIgnoreCase(label))
                return v.getEdge1();
            if (v.getEdge2().getLabel().equalsIgnoreCase(label))
                return v.getEdge2();

            if(!edgesHaveVisited.containsKey(v.getEdge1()))
                if (!nextVisitEdgeList.contains(v.getEdge1()))
                        nextVisitEdgeList.add(v.getEdge1());

            if(!edgesHaveVisited.containsKey(v.getEdge2()) )
                if (!nextVisitEdgeList.contains(v.getEdge2()))
                        nextVisitEdgeList.add(v.getEdge2());
        }

        return breathFirstSearchAlgorithm(nextVisitEdgeList.get(0), label);
    }

    /*
    start: is an edge from where we need to start searching
    label: is the label of edge that we want to search
    */

    public Edge depthFirstSearch(Edge start, String label){

        for(Vertices currentVertices : start.getVertices()){

            Edge edgeA = currentVertices.getEdge1();
            Edge edgeB = currentVertices.getEdge2();
            dfsEdgesHaveVisited.put(edgeA, Boolean.TRUE);

            if(edgeB.getLabel().equalsIgnoreCase(label))
                return edgeB;

            else if(edgeA.getLabel().equalsIgnoreCase(label))
                return edgeA;

            else if(dfsEdgesHaveVisited.containsKey(edgeB)){
                continue;
            }
            else{
                dfsEdgesHaveVisited.put(edgeB, Boolean.TRUE);
                Edge desiredEdge = depthFirstSearch(edgeB, label);

                if(desiredEdge != null)
                    return desiredEdge;
            }
        }
        return null;
    }

}
